package com.example.springboot_practice.global.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseCreateTimeIdEntity is a Querydsl query type for BaseCreateTimeIdEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QBaseCreateTimeIdEntity extends EntityPathBase<BaseCreateTimeIdEntity> {

    private static final long serialVersionUID = -162998788L;

    public static final QBaseCreateTimeIdEntity baseCreateTimeIdEntity = new QBaseCreateTimeIdEntity("baseCreateTimeIdEntity");

    public final QBaseIdEntity _super = new QBaseIdEntity(this);

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public QBaseCreateTimeIdEntity(String variable) {
        super(BaseCreateTimeIdEntity.class, forVariable(variable));
    }

    public QBaseCreateTimeIdEntity(Path<? extends BaseCreateTimeIdEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseCreateTimeIdEntity(PathMetadata metadata) {
        super(BaseCreateTimeIdEntity.class, metadata);
    }

}

