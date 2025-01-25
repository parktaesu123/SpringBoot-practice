package com.example.springboot_practice.domain.connection.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QConnection is a Querydsl query type for Connection
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QConnection extends EntityPathBase<Connection> {

    private static final long serialVersionUID = -921942562L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QConnection connection = new QConnection("connection");

    public final com.example.springboot_practice.global.entity.QBaseIdEntity _super = new com.example.springboot_practice.global.entity.QBaseIdEntity(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.time.LocalDateTime> matchedAt = createDateTime("matchedAt", java.time.LocalDateTime.class);

    public final com.example.springboot_practice.domain.user.domain.QUser targetUser;

    public final com.example.springboot_practice.domain.user.domain.QUser user;

    public QConnection(String variable) {
        this(Connection.class, forVariable(variable), INITS);
    }

    public QConnection(Path<? extends Connection> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QConnection(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QConnection(PathMetadata metadata, PathInits inits) {
        this(Connection.class, metadata, inits);
    }

    public QConnection(Class<? extends Connection> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.targetUser = inits.isInitialized("targetUser") ? new com.example.springboot_practice.domain.user.domain.QUser(forProperty("targetUser")) : null;
        this.user = inits.isInitialized("user") ? new com.example.springboot_practice.domain.user.domain.QUser(forProperty("user")) : null;
    }

}

