package com.social.media.repository;

import com.social.media.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<SocialUser,Long> {
}
