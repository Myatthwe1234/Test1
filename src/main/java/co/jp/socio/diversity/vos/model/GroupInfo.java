package co.jp.socio.diversity.vos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(value = "group_info")
public class GroupInfo {
	@Id
    @GeneratedValue
	private int groupId;
	
	@Column(nullable = false)
	private String groupName;
}
