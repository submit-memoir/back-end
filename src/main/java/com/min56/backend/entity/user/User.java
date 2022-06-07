package com.min56.backend.entity.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {

    @Id
    @Column(length = 15)
    private String id;

    @Column(length = 8, nullable = false, unique = true)
    private String nickname;

    @Column(columnDefinition = "char(60)", nullable = false)
    private String password;

    @Column(length = 50, nullable = false)
    private String introduce;

    public static User createUser(String id, String nickname, String password) {
        User user = new User();
        user.id = id;
        user.nickname = nickname;
        user.password = password;
        user.introduce = "";

        return user;
    }
}
