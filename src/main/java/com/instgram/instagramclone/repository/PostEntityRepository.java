package com.instgram.instagramclone.repository;

import com.instgram.instagramclone.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostEntityRepository extends JpaRepository<PostEntity,String> {

}
