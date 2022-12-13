package ir.maktab;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class StudentCourseRatingId implements Serializable {
    private Student student;
    private Course course;
}
