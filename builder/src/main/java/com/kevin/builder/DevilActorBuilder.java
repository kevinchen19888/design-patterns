package com.kevin.builder;

/**角色建造器:具体建造者(恶魔)
 * @author kevin
 */
public  class DevilActorBuilder extends ActorBuilder{

    public ActorBuilder buildType() {
        actor.setType("devilActorType");
        return this;
    }   
    
    public ActorBuilder buildSex() {
        actor.setSex("devilActorSex");
        return this;
    }
    
    public ActorBuilder buildFace() {
        actor.setFace("devilActorFace");
        return this;
    }
    
    public ActorBuilder buildHairStyle() {
        actor.setHairStyle("devilActorHairStyle");
        return this;
    }

}
