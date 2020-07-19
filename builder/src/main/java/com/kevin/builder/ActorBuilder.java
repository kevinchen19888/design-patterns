package com.kevin.builder;

/**
 * 角色建造器: 抽象建造者
 *
 * @author kevin
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract ActorBuilder buildType();

    public abstract ActorBuilder buildSex();

    public abstract ActorBuilder buildFace();

    public abstract ActorBuilder buildHairStyle();

    public Actor createActor() {
        return actor;
    }

}
