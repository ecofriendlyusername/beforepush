/**
 * 
 */
package com.example.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;

/**
 * @author 2ndco
 *
 */
@Data
@Entity
@DiscriminatorValue("1")
public class Post extends Writing {
}
