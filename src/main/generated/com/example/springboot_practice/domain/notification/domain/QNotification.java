package com.example.springboot_practice.domain.notification.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QNotification is a Querydsl query type for Notification
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QNotification extends EntityPathBase<Notification> {

    private static final long serialVersionUID = -1326651400L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QNotification notification = new QNotification("notification");

    public final com.example.springboot_practice.global.entity.QBaseCreateTimeIdEntity _super = new com.example.springboot_practice.global.entity.QBaseCreateTimeIdEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final BooleanPath isRead = createBoolean("isRead");

    public final StringPath message = createString("message");

    public final com.example.springboot_practice.domain.user.domain.QUser receiveUser;

    public final EnumPath<com.example.springboot_practice.domain.notification.domain.enums.NotificationType> type = createEnum("type", com.example.springboot_practice.domain.notification.domain.enums.NotificationType.class);

    public QNotification(String variable) {
        this(Notification.class, forVariable(variable), INITS);
    }

    public QNotification(Path<? extends Notification> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QNotification(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QNotification(PathMetadata metadata, PathInits inits) {
        this(Notification.class, metadata, inits);
    }

    public QNotification(Class<? extends Notification> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.receiveUser = inits.isInitialized("receiveUser") ? new com.example.springboot_practice.domain.user.domain.QUser(forProperty("receiveUser")) : null;
    }

}

