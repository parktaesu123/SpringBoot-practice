package com.example.springboot_practice.domain.heart.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHeart is a Querydsl query type for Heart
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHeart extends EntityPathBase<Heart> {

    private static final long serialVersionUID = 1899292970L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHeart heart = new QHeart("heart");

    public final com.example.springboot_practice.global.entity.QBaseIdEntity _super = new com.example.springboot_practice.global.entity.QBaseIdEntity(this);

    public final com.example.springboot_practice.domain.feed.domain.QFeed feed;

    public final NumberPath<Integer> heartCounts = createNumber("heartCounts", Integer.class);

    public final BooleanPath heartStatus = createBoolean("heartStatus");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final com.example.springboot_practice.domain.user.domain.QUser user;

    public QHeart(String variable) {
        this(Heart.class, forVariable(variable), INITS);
    }

    public QHeart(Path<? extends Heart> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHeart(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHeart(PathMetadata metadata, PathInits inits) {
        this(Heart.class, metadata, inits);
    }

    public QHeart(Class<? extends Heart> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.feed = inits.isInitialized("feed") ? new com.example.springboot_practice.domain.feed.domain.QFeed(forProperty("feed"), inits.get("feed")) : null;
        this.user = inits.isInitialized("user") ? new com.example.springboot_practice.domain.user.domain.QUser(forProperty("user")) : null;
    }

}

