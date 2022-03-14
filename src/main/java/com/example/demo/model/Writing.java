/**
 * 
 */
package com.example.demo.model;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * @author 2ndco
 *
 */

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="writing_type", 
discriminatorType = DiscriminatorType.INTEGER)
public class Writing {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String content;
	@OneToMany(mappedBy="writing")
	private List<Stock> stocks;
	//(Optional) Whether the association is optional. If set to false then a non-null relationship must always exist.
	@ManyToOne(optional=false)
	private Account account;
}
