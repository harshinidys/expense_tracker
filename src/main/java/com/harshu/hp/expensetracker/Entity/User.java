package com.harshu.hp.expensetracker.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_EMAIL")
    private String userEmail;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user")
    private Set<Category> categories;
}
