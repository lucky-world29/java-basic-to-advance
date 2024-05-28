import java.util.*;
class Hello {

public static void main(String arg[]){
	
	
	convert();
	
	
  //System.out.println("Hello");
  Scanner sc =  new Scanner(System.in);
  //System.out.println("Enter a name");
  //String name = sc.nextLine();
  
  //Char ch = sc.nextchar();
  
  /*int a = 'a';
  System.out.println(a);
  int aa  =  a-32;
  char b = (char)aa; 
  System.out.println(b);
  
  
  System.out.println(a-32);
  */
  //String[] namestr = new String[name.length];
  
  //for(int 
  //System.out.println("My name is :"+ name.toUpperCase());
  
  //System.out.println("enter the size of string array");
  //int x = sc.nextInt();

  //String[] str = new String[4];
  //str[0] = {"lucky"};
  
  /*for(int i =0;i<str.length;i++){
	  str[0] = "lucky";
	  str[1] = "Abi";
	  str[2] = "hi";
	  str[3] = "hello";
  }
  
  for(int i =0;i<str.length;i++){
	  System.out.println(str[i]);
  }*/
  
  
  
  
  
  

}

  static void convert(){
  String[] st = new String[5];
  for(int i =0 ; i<st.length;i++){
	  
	  st[0]="l";
	  st[1]="u";
	  st[2]="c";
	  st[3]="k";
	  st[4]="y";
	  //st[i]={"lucky"};
  }
  
  for(int i=0;i<st.length;i++){
	  if(st[i]=="l"){
		  System.out.println("L");
	  }
	  if(st[i]=="u"){
		  System.out.println("U");
	  }
	  if(st[i]=="c"){
		  System.out.println("C");
	  }
	  if(st[i]=="k"){
		  System.out.println("K");
	  }
	  if(st[i]=="y"){
		  System.out.println("Y");
	  }
  }
  
  for(int i =0; i<st.length;i++){
	  //System.out.println(st[i]-32);
  }
  
  
  }

}