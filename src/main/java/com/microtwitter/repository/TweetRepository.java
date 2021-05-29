package com.microtwitter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microtwitter.repository.dto.TweetEntity;

public interface TweetRepository extends JpaRepository<TweetEntity, Long>{

}
