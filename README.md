# study

我的学习记录仓库。用来留存学习过程中动手敲的代码，以及每个阶段的笔记。

这是一个**学习日志**，不是作品集 —— 内容以课程练习为主，因此文件命名保留了
学习时的原始形态（`Demo1`、`Demo2`…）。我更在意的是**进度看得见**，而不是把
练习包装成项目。

## 学习日志

| 阶段 | 内容 | 状态 |
|---|---|---|
| Java 基础 | 变量、运算、流程控制、数组、方法、内存模型 | 进行中（71 个练习） |
| Java 面向对象 | 封装、继承、多态、接口、集合框架 | 计划中 |
| Java 进阶 | 异常、泛型、IO、多线程、JVM | 计划中 |
| 数据库 | MySQL、JDBC、索引与 SQL 优化 | 计划中 |
| Web 后端 | Spring Boot、MyBatis、REST API | 计划中 |
| 前端 | HTML / CSS / JavaScript | 计划中 |
| Python | 语法、数据处理、自动化脚本 | 有实践 |
| AI | 机器学习基础、模型调用与集成 | 计划中 |

进度会随学习推进更新。

## 目录结构

```
study/
└── java-basics/            # Java 基础阶段
    ├── basic-code.iml      # IDEA 模块定义
    └── src/com/aust/       # 按知识点分包的练习
```

## java-basics 知识点分布

| 包 | 文件数 | 知识点 |
|---|---|---|
| variable | 9 | 变量与数据类型 |
| litrral | 1 | 字面量 |
| operate | 4 | 运算符（算术、比较、逻辑） |
| ifDemo | 3 | if / else 分支 |
| switchDemo | 1 | switch |
| forDemo | 5 | for 循环 |
| whileDemo | 6 | while 与 do-while |
| controlloop | 7 | break / continue |
| infiniteloop | 1 | 无限循环 |
| loopoop | 2 | 嵌套循环与图形打印 |
| method | 10 | 方法、参数、返回值、重载 |
| arry | 16 | 数组：遍历、查找、排序、统计 |
| Memory | 2 | JVM 内存模型：栈与堆 |
| Test | 4 | 综合练习 |
| **合计** | **71** | |

## 运行方式

环境：**JDK 25**（见 `java-basics/basic-code.iml`）。每个文件都带 `main` 方法，
可以用 IDEA 直接运行单个文件，也可以在命令行里编译并运行：

```bash
cd java-basics
javac -d out src/com/aust/variable/variableDemo2.java
java -cp out com.aust.variable.variableDemo2
```

> 提示：源文件是 UTF-8 编码，编译器加 `-encoding UTF-8` 更保险：
> `javac -encoding UTF-8 -d out <file.java>`

## 说明

- 所有代码都是学习过程中的练习，覆盖同一个知识点的多个文件是刻意保留的
- 全部 71 个文件均已通过 `javac -encoding UTF-8` 编译验证（JDK 25）
- 编译产物（`out/`、`*.class`）与 IDE 本地配置（`.idea/`）已通过 `.gitignore` 排除
- 本仓库不含任何账号、密码或私有数据
