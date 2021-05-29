package com.microtwitter.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microtwitter.model.TweetModel;
import com.microtwitter.service.ITwitterService;

@RestController
public class TwitterController {

	@Autowired
	private ITwitterService twitterService;
	
	//Metodo que devuelve la lista de tweets que hay en BBDD
	@GetMapping("/tweets")
	public List<TweetModel> tweetList(){
		return twitterService.tweetList();
	}
	
//	@GetMapping("/ver/{id}")
//	public Producto detalle(@PathVariable Long id){
//		return productoService.findById(id);
//	}
}
