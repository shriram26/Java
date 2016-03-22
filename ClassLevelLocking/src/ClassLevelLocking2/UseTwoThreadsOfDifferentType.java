package ClassLevelLocking2;


public class UseTwoThreadsOfDifferentType{


	public static void main(String[] args) {
		Avinash obj1 = new Avinash();
		Shriram obj2 = new Shriram();
		obj1.start();
		obj1.start();
	}
}
class Avinash extends Thread
{
	@Override
	public void run() {
		TestNonStaticLocking2.testSyncMethod();//Call any one at a time
		TestNonStaticLocking2.testSyncBlockThis();
		TestNonStaticLocking2.testSyncBlockByLockObject();//This also object level lock
		TestNonStaticLocking2.testSyncBlockByLockClass();
	}
}

class Shriram extends Thread
{
	TestNonStaticLocking2 obj = new TestNonStaticLocking2();
	@Override
	public void run() {
		obj.testSyncMethod();//object level locking for testSyncMethod

		TestNonStaticLocking2.testSyncMethod();//ClassLevelLocking for testSyncMethod
		TestNonStaticLocking2.testSyncBlockThis();
		TestNonStaticLocking2.testSyncBlockByLockObject();//this also object level lock
		TestNonStaticLocking2.testSyncBlockByLockClass();
	}
// combinations will be one call from Avinash and another from Shriram
}

class TestNonStaticLocking2
{
	final static MyLockingClass2 cObj = new MyLockingClass2(); 
	public static synchronized void testSyncMethod(){
		System.out.println("inside testSyncMethod"+Thread.currentThread().getName());

		try {

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		System.out.println("exit testSyncMethod"+Thread.currentThread().getName());
	}

	public static void testSyncBlockThis(){
		System.out.println("inside testSyncBlockThis"+Thread.currentThread().getName());

		synchronized(TestNonStaticLocking2.class){
			System.out.println("locked by this"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("exit testSyncBlockThis"+Thread.currentThread().getName());
	}



	//	public void testSyncBlockByLockLocal(){
	//	System.out.println("inside testSyncBlockByLockLocal"+Thread.currentThread().getName());
	//	MyLockingClass obj = new MyLockingClass(); 
	//	synchronized(obj){
	//	System.out.println("locked by MyLockingClass local level object"+Thread.currentThread().getName());
	//	try {
	//	Thread.sleep(2000);
	//	} catch (InterruptedException e) {
	//	e.printStackTrace();
	//	}
	//	}
	//	System.out.println("exit testSyncBlockByLockLocal"+Thread.currentThread().getName());
	//	}

	public static void testSyncBlockByLockObject(){
		System.out.println("inside testSyncBlockByLockClass"+Thread.currentThread().getName());
		synchronized(cObj){
			System.out.println("locked by MyLockingClass class level object"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			}
		System.out.println("exit testSyncBlockByLockClass"+Thread.currentThread().getName());
	}



	public static void testSyncBlockByLockClass(){
		System.out.println("inside testSyncBlockByLockClass"+Thread.currentThread().getName());
		synchronized(cObj){
			System.out.println("locked by MyLockingClass class level object"+Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			}
		System.out.println("exit testSyncBlockByLockClass"+Thread.currentThread().getName());
	}
}
class MyLockingClass2
{
	private int lockId;
}
