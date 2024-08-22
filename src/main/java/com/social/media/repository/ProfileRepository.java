package com.social.media.repository;

import com.social.media.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<SocialProfile,Long> {
}
