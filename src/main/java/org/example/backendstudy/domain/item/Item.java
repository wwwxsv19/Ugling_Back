package org.example.backendstudy.domain.item;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.backendstudy.domain.item.grade.Grade;
import org.example.backendstudy.domain.item.types.Category;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    private String itemName; // 상품명
    private Long itemPrice; // 상품 가격
    private int itemCount; // 상품 재고 수량
    private int itemWeight; // 상품 무게
    private int itemCalory; // 상품 칼로리
    private String itemIngre; // 상품 영양성분
    private String itemWarn; // 상품 주의사항
    private Category itemCategory; // 상품 카테고리

    @OneToMany(
            mappedBy = "grade",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JsonManagedReference
    private List<Grade> itemGradeList = new ArrayList<>();

    // add()
    public void addGrade(Grade grade) {
        grade.connectItem(this);
        itemGradeList.add(grade);
    }
}
