package pl.itacademy.model;

import java.time.LocalDate;

public class Group {

  private Integer groupId;
  private String groupNumber;
  private String subject;
  private LocalDate startedYear;

  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public String getGroupNumber() {
    return groupNumber;
  }

  public void setGroupNumber(String groupNumber) {
    this.groupNumber = groupNumber;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public LocalDate getStartedYear() {
    return startedYear;
  }

  public void setStartedYear(LocalDate startedYear) {
    this.startedYear = startedYear;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Group group = (Group) o;

    if (groupId != null ? !groupId.equals(group.groupId) : group.groupId != null) {
      return false;
    }
    if (groupNumber != null ? !groupNumber.equals(group.groupNumber) : group.groupNumber != null) {
      return false;
    }
    if (subject != null ? !subject.equals(group.subject) : group.subject != null) {
      return false;
    }
    return startedYear != null ? startedYear.equals(group.startedYear) : group.startedYear == null;
  }

  @Override
  public int hashCode() {
    int result = groupId != null ? groupId.hashCode() : 0;
    result = 31 * result + (groupNumber != null ? groupNumber.hashCode() : 0);
    result = 31 * result + (subject != null ? subject.hashCode() : 0);
    result = 31 * result + (startedYear != null ? startedYear.hashCode() : 0);
    return result;
  }

  //  private List<Student> students;

}
