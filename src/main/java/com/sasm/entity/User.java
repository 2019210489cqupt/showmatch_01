package com.sasm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NotNull
    private String user_name;
    private Integer user_id;
    @Length(min =6,max = 15)
    private String password;
    private List<Match> user_matchs;
    private List<Team> user_teams;
    @Email
    private Email user_email;

}
