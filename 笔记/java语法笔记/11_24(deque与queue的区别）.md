## deque与queue的区别

![海贼王封面](../../images/%E6%B5%B7%E8%B4%BC%E7%8E%8B%E5%B0%81%E9%9D%A2.png)

- **Queue（队列）**：
  - 队列是一种先进先出（FIFO）的数据结构，它类似于现实生活中排队等待的概念。
  - 在队列中，新元素被添加到队尾，而最早添加的元素则位于队头。队列中的元素按照添加的顺序进行处理，先添加的元素先被移除。
- **Deque（双端队列）**：
  - 双端队列是一种允许在两端进行插入和删除操作的队列。
  - 它既可以从队头也可以从队尾添加或移除元素，提供了比队列更灵活的操作方式。

### 二、操作特性

- **Queue（队列）**：
  - 队列的主要操作包括：入队（在队尾添加元素）、出队（从队头移除元素）、查看队头元素（不移除）等。
  - 队列不支持在队头插入元素或在队尾删除元素。
- **Deque（双端队列）**：
  - 双端队列除了支持队列的所有操作外，还允许在队头插入元素和在队尾删除元素。
  - 它提供了更丰富的操作接口，如`addFirst()`、`addLast()`、`removeFirst()`、`removeLast()`等。



Queue（队列）和Deque（双端队列）在编程中的使用方法可以通过具体的代码示例来展示。以下是基于Java语言的示例，展示了如何使用Queue和Deque进行基本操作。

### Queue（队列）使用方法举例

在Java中，Queue是一个接口，它定义了队列的基本操作。LinkedList是Queue的一个常用实现类。以下是使用Queue接口和LinkedList类进行基本操作的示例：

```java
import java.util.LinkedList;
import java.util.Queue;
 
public class QueueExample {
    public static void main(String[] args) {
        // 创建一个Queue对象
        Queue<String> queue = new LinkedList<>();
 
        // 入队操作
        queue.offer("元素A");
        queue.offer("元素B");
        queue.offer("元素C");
 
        // 查看队头元素（不移除）
        String firstElement = queue.peek();
        System.out.println("队头元素（不移除）：" + firstElement);
 
        // 出队操作
        String removedElement = queue.poll();
        System.out.println("出队元素：" + removedElement);
 
        // 查看队头元素（不移除）
        firstElement = queue.peek();
        System.out.println("新的队头元素（不移除）：" + firstElement);
 
        // 遍历队列
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("遍历元素：" + element);
        }
    }
}
```

### Deque（双端队列）使用方法举例

Deque也是一个接口，它扩展了Queue接口，并增加了在队列两端进行插入和删除操作的方法。LinkedList同样实现了Deque接口。以下是使用Deque接口和LinkedList类进行基本操作的示例：

```java
import java.util.LinkedList;
import java.util.Deque;
 
public class DequeExample {
    public static void main(String[] args) {
        // 创建一个Deque对象
        Deque<String> deque = new LinkedList<>();
 
        // 在队尾添加元素
        deque.offer("元素A");
        deque.offer("元素B");
        deque.offer("元素C");
 
        // 查看队头元素（不移除）
        String firstElement = deque.peek();
        System.out.println("队头元素（不移除）：" + firstElement);
 
        // 在队头添加元素
        deque.offerFirst("元素0");
 
        // 遍历Deque
        while (!deque.isEmpty()) {
            String element = deque.poll();
            System.out.println("遍历元素：" + element);
        }
 
        // 清空Deque后重新添加元素
        deque.offer("元素A");
        deque.offer("元素B");
        deque.offer("元素C");
 
        // 在队尾删除元素
        deque.pollLast();
 
        // 查看并移除队头元素
        firstElement = deque.poll();
        System.out.println("移除的队头元素：" + firstElement);
 
        // 查看队头元素（不移除）
        firstElement = deque.peek();
        System.out.println("新的队头元素（不移除）：" + firstElement);
    }
}
```

### 三、应用场景

- **Queue（队列）**：
  - 队列适用于需要保持元素有序性的场景，如任务调度、消息传递、缓冲区管理等。
  - 在这些场景中，通常按照元素添加的顺序进行处理。
- **Deque（双端队列）**：
  - 双端队列的应用场景更为广泛，它既可以作为队列使用，也可以作为栈使用（在队头进行插入和删除操作）。
  - 由于双端队列在两端都可以进行插入和删除操作，因此它适用于需要频繁在两端进行元素操作的场景。