package com.moneview.employeePortal.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employees")
public class EmployeeEntity {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;

    @Column(name = "name")
    private String name;

    @Column(name = "date_of_birth")
    private String dob;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "slack_url")
    private String slackUrl;

    @Column(name = "photo_link")
    private String photoLink;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private ManagerEntity managerEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private DepartmentEntity departmentEntity;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_communities",
            joinColumns = { @JoinColumn(name = "employee_id") },
            inverseJoinColumns = { @JoinColumn(name = "community_id") }
    )
    private List<CommunityEntity> communities;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "employee_tags",
            joinColumns = { @JoinColumn(name = "employee_id") },
            inverseJoinColumns = { @JoinColumn(name = "tag_id") }
    )
    private List<TagsEntity> tags;
}
