package cn.com.car.entry;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_role")
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id" )
	private long id;//自增;主键;唯一标识
	@Column(name = "rolename" )
	private String rolename;//名称
	@Column(name = "description" )
	private String description;//详情
	@Column(name = "isdefault" )
	private short isdefault;//默认角色不可修改
	
	
}
