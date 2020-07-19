package com.kevin.builder;

/**
 * 角色建造器:具体建造者(英雄)
 *
 * @author kevin
 */
public class HeroActorBuilder extends ActorBuilder {

    public ActorBuilder buildType() {
        actor.setType("heroActorType");
        return this;
    }

    public ActorBuilder buildSex() {
        actor.setSex("heroActorSex");
        return this;
    }

    public ActorBuilder buildFace() {
        actor.setFace("heroActorFace");
        return this;
    }

    public ActorBuilder buildHairStyle() {
        actor.setHairStyle("heroActorHairStyle");
        return this;
    }

}
