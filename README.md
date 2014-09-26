Add the ConnectionPool and modify the code structure for Login and Register functions.

改进方案：

1.DBmanager 应该改成单例模式

2.对于每一个action都会建立一个DBmanager,每个manager都会建立20个，所以是错误的

3.connection应该改成静态变量，只有一个，查一下java 静态变量的使用方法
