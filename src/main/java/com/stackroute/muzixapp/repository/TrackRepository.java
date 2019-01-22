package com.stackroute.muzixapp.repository;

import com.mongodb.Mongo;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.muzixapp.domain.Track;

@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {

}