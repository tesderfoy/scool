package com.example.scool.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "marks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @Column(name = "value")
    private int value;


    @Override
    public String toString() {
        return "Mark{" +
                "id=" + id +
                ", subject=" + subject +
                ", student=" + student +
                ", teacher=" + teacher +
                ", value=" + value +
                '}';
    }
}