package com.myibatis.model;


import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;
    private String name;
    private String mobileNumber;


}
