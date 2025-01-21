package com.example.springboot_practice.domain.user.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1897946952L;

    public static final QUser user = new QUser("user");

    public final com.example.springboot_practice.global.entity.QBaseIdEntity _super = new com.example.springboot_practice.global.entity.QBaseIdEntity(this);

    public final StringPath accountId = createString("accountId");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath introduction = createString("introduction");

    public final StringPath password = createString("password");

    public final EnumPath<com.example.springboot_practice.domain.user.domain.enums.Role> role = createEnum("role", com.example.springboot_practice.domain.user.domain.enums.Role.class);

    public final StringPath userName = createString("userName");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

