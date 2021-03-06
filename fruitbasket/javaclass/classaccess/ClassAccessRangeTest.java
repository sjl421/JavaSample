package fruitbasket.javaclass.classaccess;

public class ClassAccessRangeTest {

	private static final ClassAccessRangeTest instance=new ClassAccessRangeTest();
	
	private ClassAccessRangeTest(){}
	
	public ClassAccessRangeTest getInstance(){
		return instance;
	}
	
	/**
	 * 类和构造函数访问范围测试
	 */
	public static void test1(){
		/*
		 * 能import fruitbasket.test.TestClass1，但是不能构造对象
		 */
		//TestClass1 testClass1=new TestClass1();
		
		/*
		 * 不能 import fruitbasket.test.TestClass2
		 */
		//TestClass2 testClass2=new TestClass2();
		
		/*
		 * 不能 import fruitbasket.test.TestClass3.InnerClass1
		 */
		//TestClass3.InnerClass1 class1;
		
		/*
		 * 能import fruitbasket.test.TestClass3.InnerClass2，但是不能构造对象
		 */
		//TestClass3.InnerClass2 class2=new TestClass3.InnerClass2();
	}
}
