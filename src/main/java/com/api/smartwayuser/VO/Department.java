package com.api.smartwayuser.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    private String createdBy;
    private Date createdDate;
    private String updatedBy;
    private Date updatedDate;
    private Boolean is_active;
}
