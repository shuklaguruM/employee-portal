package com.moneview.employeePortal.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {
    private Long empId;
    private String name;
    private String dob;
    private String email;
    private String username;
    private String password;
    private String slackUrl;
    private String photoLink;
    private ManagerDto managerDto;
    private DepartmentDto departmentDto;
    private List<CommunityDto> communityDto;
    private List<TagsDto> tags;
}
