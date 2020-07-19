package com.kevin.builder;

/**
 * 客户端使用示例
 *
 * @author kevin
 */
public class Client {
    public static void main(String[] args) {
        HeroActorBuilder heroBuilder = new HeroActorBuilder();
        Actor heroActor = heroBuilder.buildFace()
                .buildSex().buildType().buildHairStyle().createActor();

        DevilActorBuilder devilActorBuilder = new DevilActorBuilder();
        Actor devilActor = devilActorBuilder.buildFace().buildType().buildHairStyle().createActor();

        System.out.println(heroActor);
        System.out.println(devilActor);
    }

}
