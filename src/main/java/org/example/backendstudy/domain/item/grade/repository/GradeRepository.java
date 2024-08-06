package org.example.backendstudy.domain.item.grade.repository;

import org.example.backendstudy.domain.item.grade.Grade;
import org.example.backendstudy.domain.item.grade.GradeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, GradeId> {
}
