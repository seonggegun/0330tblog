// /sbootblog/src/main/java/com/sg/kim/domain/User.java

package com.sg.kim.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	private int id;
	private String username;
	private String password;
	private String email;
}