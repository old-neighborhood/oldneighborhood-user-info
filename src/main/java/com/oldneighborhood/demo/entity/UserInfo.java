package com.oldneighborhood.demo.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name="user")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
public class UserInfo implements Serializable{
	
	@Id
	private String u_ID;
	@NonNull
	private String u_name;
	@NonNull
	private String u_password;
	@NonNull
	private String u_image;
	private Integer u_score;
	@NonNull
	private String u_tele;
	@NonNull
	private String u_email;
	@NonNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date u_birthday;
	@NonNull
	private String u_signature;
	
	private Timestamp u_date;

}
