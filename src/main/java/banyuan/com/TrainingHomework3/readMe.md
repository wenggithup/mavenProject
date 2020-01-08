### Java中List<?>和List之间的区别是什么？Java中List和原始类型List之间的区别？
### 1. List<?>，只接收指定类型的数据，如果接收其它类型的数据会报错，将运行的错误提升到编译期；
### list，可以接收任何类型的数据，但是在数据转换时运行容易报错
### 2.没区别值一样List默认是Object类型的了，只是没明写泛型而已，会报个警告而已

### Java中synchronized 和 ReentrantLock 有什么不同？
##  1、ReentrantLock 是 API 级别的，synchronized 是 JVM 级别的
##  2、Lock锁需要手动解锁，synchronized锁执行完代码块后会自动释放
##  3、多线程时，ReentrantLock线程不阻塞，尝试得不到对象后会自动释放，synchronized
##  可能会造成死锁
##  4、synchronized锁无法判断当前对象是否获得锁，但是ReentrantLock锁可以判断


### 并发编程的三要素
##  1、原子性：即一个操作或者多个操作 要么全部执行并且执行的过程不会被任何因素打断，要么就都不执行。
##  2、可见性：可见性是指当多个线程访问同一个变量时，一个线程修改了这个变量的值，其他线程能够立即看得到修改的值
##  3、有序性：即程序执行的顺序按照代码的先后顺序执行

### CyclicBarrier和CountDownLatch的区别，CountDownLatch这个已经上过，要求自己学习CyclicBarrier并且写出代码
### CountDownLatch和CyclicBarrier都有让多个线程等待同步然后再开始下一步动作的意思，但是CountDownLatch的下一步的动作实施者
##是主线程，具有不可重复性；而CyclicBarrier的下一步动作实施者还是“其他线程”本身，具有往复多次实施动作的特点。
      
