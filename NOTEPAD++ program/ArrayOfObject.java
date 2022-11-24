class ArrayOfObject
 {
	public static void main(String[] args) 
	{
		Object[] elements = new Object[4];
		elements[0] = "Apple";
		elements[1] = 20;
		elements[2] = new StringBuilder("ABC");
		elements[3] = 9.4;
		for (Object e : elements) 
		{
			System.out.println(e);
		}
	}
}