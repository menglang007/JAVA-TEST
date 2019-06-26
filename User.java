package com.offcn.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "tb_user")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name",length = 200,nullable = true)
    private String name;

    @Column(name="age",length = 3,nullable = true)
    private Integer age;

	//ÃüÁîÐÐ  ÐÞ¸ÄÊôÐÔ
	private String address;
	
	public void edit(){
		system.out.prientln("仓库中改");
	}

}
