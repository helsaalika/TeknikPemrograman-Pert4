package kasus3;

public class KelasSatu {
	{
		System.out.println(11); //dioutputkan pada baris 3 dan 5
	}
	
	static
	{
		System.out.println(2); //dioutputkan pada baris 2
	}
	
	public KelasSatu(int i)
	{
		System.out.println(3); //dioutputkan pada baris 6
	}
	
	public KelasSatu()
	{
		System.out.println(4); //dioutputkan pada baris 4
	}


}
