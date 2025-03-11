package org.fastcampus.student_management.application.course.Interface;

import org.fastcampus.student_management.domain.Course;

public interface CourseCommandRepository {
    void save(Course course);
}
