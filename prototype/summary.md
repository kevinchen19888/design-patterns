# 原型模式
## 定义
通过一个原型对象,来克隆大量重复的对象;

## 使用步骤
1. 让需要被clone 的原型类对象实现Cloneable接口;
2. 需被clone的原型类对象重写clone()方法;
3. 客户端调用原型类对象的clone()方法进行clone并获取返回的clone对象;

## 优点
- 可以在创建大量重复的对象同时保证性能;
- 在需要创建大量重复对象时,可以简化对象的创建过程;

## 缺点
- 需要额外提供clone方法,且克隆的逻辑在方法内部,当类的属性发生改变时,需要修改克隆
的代码逻辑,违背了开闭原则;