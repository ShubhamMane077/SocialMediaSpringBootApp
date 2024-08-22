package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @OneToOne(mappedBy = "socialProfile")
    //@JoinColumn(name = "social_user")
    private SocialUser socialUser;

    public void setSocialUser(SocialUser socialUser){
        this.socialUser = socialUser;
        if(socialUser.getSocialProfile() != this)
            socialUser.setSocialProfile(this);
    }
}
