package org.fastcampus.student_management.domain;

import org.fastcampus.student_management.application.course.dto.*;

public class Course {
  private final Student student;
  private final String courseName;
  private CourseFee fee;
  private final DayOfWeek dayOfWeek;
  private final Long courseTime;

  public Course(Student student, CourseInfoDto courseInfo) {
    if (student == null) {
      throw new IllegalArgumentException("학생은 필수 입력값입니다.");
    }

    this.student = student;
    this.courseName = courseInfo.getCourseName();
    this.fee = new CourseFee(courseInfo.getFee());
    this.dayOfWeek = courseInfo.getDayOfWeek();
    this.courseTime = courseInfo.getCourseTime();
  }

  public void changeFee(int fee) {
    this.fee.changeFee(fee);
  }

  public String getCourseName() {
    return courseName;
  }

  public boolean isSameDay(DayOfWeek dayOfWeek) {
    return this.dayOfWeek.equals(dayOfWeek);
  }

  public boolean isActivateUser() {
    return student.isActivate();
  }

  public String getStudentName() {
    return student.getName();
  }

  public int getFee() {
    return this.fee.getFee();
  }

  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public Long getCourseTime() {
    return courseTime;
  }
}
