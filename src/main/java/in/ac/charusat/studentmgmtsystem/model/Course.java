package in.ac.charusat.studentmgmtsystem.model;

public class Course {
    private  Integer id;
    private String  courseId;
    private Integer courseName;

    public Course() {
    }
    public Integer getId() {
        return id;
    }

    public String getCourseId() {
        return courseId;
    }

    public Integer getCourseName() {
        return courseName;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(Integer courseName) {
        this.courseName = courseName;
    }





    public void setId(Integer id) {
        this.id = id;
    }

}
