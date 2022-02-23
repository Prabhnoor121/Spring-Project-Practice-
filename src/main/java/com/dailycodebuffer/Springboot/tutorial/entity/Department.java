package com.dailycodebuffer.Springboot.tutorial.entity;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data   // all getters, setters, to_string etc included
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)   // setting primary key i.e. dept ID
    private Long departmentId;

    @NotBlank(message = "Please Add Department Name")
    private String departmentName;
//    @Length(max=5,min=1)
//    @Size(max=10, min=1)
    private String departmentAddress;
    private String departmentCode;

//    public Long getDepartmentId() {
//        return departmentId;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public String getDepartmentCode() {
//        return departmentCode;
//    }
//
//    public void setDepartmentId(Long departmentId) {
//        this.departmentId = departmentId;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public void setDepartmentCode(String departmentCode) {
//        this.departmentCode = departmentCode;
//    }
//    public Department() {
//    }
//
//    public Department(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
//        this.departmentId = departmentId;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.departmentCode = departmentCode;
//    }
//    @Override
//    public String toString() {
//        return "Department{" +
//                "departmentId=" + departmentId +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                ", departmentCode='" + departmentCode + '\'' +
//                '}';
//    }
}
