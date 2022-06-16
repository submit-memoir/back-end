package com.min56.backend.entity.memoir;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Memoir {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 30, nullable = false)
    private String title;

    @Column(length = 50)
    private String goal;

    @Column(length = 3000, nullable = false)
    private String learned;

    @Column(length = 100)
    private String felt;

    @Column(length = 50, nullable = false)
    private String nextGoal;

    @Column(length = 15, nullable = false)
    private String userId;

    @CreatedDate
    private static LocalDate createdAt;

    public static Memoir createMemoir(String title, String goal, String learned, String felt, String nextGoal, String userId) {
        Memoir memoir = new Memoir();
        memoir.title = title; // Memoir객체안에 title값을 넣는다..?
        memoir.goal = goal;
        memoir.learned = learned;
        memoir.felt = felt;
        memoir.nextGoal = nextGoal;
        memoir.userId = userId;
        return memoir;
    }
}
