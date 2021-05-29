package com.microtwitter.repository.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class TweetEntity with the tweet information in BBDD
 * @author jesus
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tweets")
public class TweetEntity  implements Serializable{
	
	private static final long serialVersionUID = 119905176102490981L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String user;
	private String text;
	private String localization;
	private Boolean validate;
}
