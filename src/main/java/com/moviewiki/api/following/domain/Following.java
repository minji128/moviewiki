package com.moviewiki.api.following.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.moviewiki.api.user.domain.User;

@Entity
@Data
@NoArgsConstructor
@IdClass(FollowingPK.class)
@Table(name="FOLLOWINGS")
public class Following {

    @Id
    @ManyToOne
    @JoinColumn(name="FROMUSER")
    private User fromUser;

    @Id
    @ManyToOne
    @JoinColumn(name="TOUSER")
    private User toUser;

    @Builder
    public Following(User fromUser, User toUser) {
        this.fromUser = fromUser;
        this.toUser = toUser;
    }
}