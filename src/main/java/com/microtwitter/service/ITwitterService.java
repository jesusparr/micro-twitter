package com.microtwitter.service;

import java.util.List;

import com.microtwitter.model.TweetModel;

public interface ITwitterService {

	public List<TweetModel> tweetList();
}