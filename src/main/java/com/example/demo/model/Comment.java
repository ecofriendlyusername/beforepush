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
@DiscriminatorValue("2")
public class Comment extends Writing {

}
