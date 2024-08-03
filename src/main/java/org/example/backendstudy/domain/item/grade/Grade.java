package org.example.backendstudy.domain.item.grade;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import org.example.backendstudy.domain.item.Item;

@Entity
@Table
@Data
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Grade {
    @EmbeddedId
    private GradeId id; // 복합 키, 엔티티와 다르게 선언한 후 클래스로 가져와야 한다

    private int gradeScore; // 별점 5점 중 몇 점
    private String gradeComment; // 상세한 평가

    @ManyToOne(fetch = FetchType.LAZY) // one item -> many grade
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    @JsonBackReference // many 에게 붙는 어노테이션, 순환 루프 방지
    private Item item;

    public void connectItem(Item item) {
        this.item = item;
    }

    @Builder
    public Grade(GradeId id, int gradeScore, String gradeComment) {
        this.id = id;
        this.gradeScore = gradeScore;
        this.gradeComment = gradeComment;
    }
}
