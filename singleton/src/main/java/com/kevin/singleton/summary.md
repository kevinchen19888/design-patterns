# 单例模式总结
## 主要特点
- 构造器私有化;
- 实例变量引用私有化;
- 共享获取实例方法;

## 优缺点
### 优点:
- 提供了对唯一对象实例的控制访问
- 节约了系统资源
- 允许可变数量的实例  
### 缺点:
- 没有抽象层,难以扩展;
- 职责过重,某种程度上违背了单一职责的原则;
- 可能会因GC被销毁回收,重建对象时导致对象状态丢失;