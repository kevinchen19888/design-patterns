### 装饰者模式

动态地给一个对象添加一些额外的职责，就增加功能来说，装饰模式比生成子类更为灵活

#### 模式结构

装饰器模式主要包含以下角色。

1. 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
1. 具体构件（ConcreteComponent）角色：实现抽象构件，通过装饰角色为其添加一些职责。
1. 抽象装饰（Decorator）角色：(非必要)继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
1. 具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。

#### 类图

![装饰者类图](/doc/img/decorator.png)
