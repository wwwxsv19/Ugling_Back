package org.example.backendstudy.domain.item.grade;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GradeId implements Serializable {
    private Long itemId;
    private Long gradeId;

    @Builder
    public GradeId(Long itemId, Long gradeId) {
        this.itemId = itemId;
        this.gradeId = gradeId;
    }
}