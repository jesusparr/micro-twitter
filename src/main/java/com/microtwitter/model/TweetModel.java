package com.microtwitter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class TweetModel with the tweet information
 * @author jesus
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TweetModel {

	private Long id;
	private String user;
	private String text;
	private String localization;
	private Boolean validate;
}
