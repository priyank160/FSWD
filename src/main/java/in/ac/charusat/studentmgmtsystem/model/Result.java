package in.ac.charusat.studentmgmtsystem.model;

public class Result {
    private  Integer id;
    private String  courseId;
    private Integer marks;

    public Result() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Integer getId() {
        return id;
    }

    public String getCourseId() {
        return courseId;
    }

    public Integer getMarks() {
        return marks;
    }
}
