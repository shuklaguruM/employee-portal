package com.moneview.employeePortal.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "communities")
public class CommunityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "community_id")
    private Long communityId;

    @Column(name = "community_name")
    private String communityName;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "communities")
    private List<EmployeeEntity> employees;
}
