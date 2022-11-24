class TestGarbage
{
	 
	 public static void main(String arg[])
	 {
		 TestGarbage T1=new TestGarbage();
		 TestGarbage T2=new TestGarbage();
		 T1=null;
		 T2=null;
		 System.gc();
		 
	 }
	 public void finalize()
	 {
		System.out.println("objected collected by garbage collector");
	 }
}