package project.test;

import java.util.ArrayList;

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar = new ArrayList();
		ar.add("red");
		ar.add("blue");
		ar.add("green");
		ar.add("orange");
		ar.add("black");
		ar.add("white");
		System.out.println(ar);
		System.out.println(ar.get(3));//retrieve a item
		System.out.println("The size of the arraylist:"+ar.size());//arrayList size
		for(int i=0;i<=(ar.size()-1);i++)//iteration
		{
			System.out.println(ar.get(i));
		}

		ar.remove(2);//remove the 3rd item
		System.out.println("The size of the arraylist afer removing a item:"+ar.size());
		System.out.println("Does the arraylist contains colour blue:"+ar.contains("blue"));//search an element
		System.out.println("Does the arraylist contains colour yellow:"+ar.contains("yellow"));//search an element
		
	}

}
