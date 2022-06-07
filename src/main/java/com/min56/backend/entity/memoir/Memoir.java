package com.min56.backend.entity.memoir;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
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

    public static Memoir createMemoir(String title, String goal, String learned, String felt, String nextGoal, String userId) {
        Memoir memoir = new Memoir();
        memoir.title = title;
        memoir.goal = goal;
        memoir.learned = learned;
        memoir.felt = felt;
        memoir.nextGoal = nextGoal;
        memoir.userId = userId;

        return memoir;
    }
}
