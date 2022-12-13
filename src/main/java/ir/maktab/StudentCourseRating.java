package ir.maktab;

import jdk.jfr.Timestamp;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
@Entity
@IdClass(StudentCourseRatingId.class)
public class StudentCourseRating {
    @Id
    @ManyToOne
    private Student student;

    @Id
    @ManyToOne
    private Course course;


    private Double rating;
    private String comment;
    @Timestamp
    private Date date;
}
