// // class  Parent{  
// //    void PrintData() {  
// //       System.out.println("method of parent class");  
// //    }  
// // }  
  
// // class Child extends Parent {  
// //    void PrintData() {  
// //       System.out.println("method of child class");  
// //       //super.PrintData();
// //    }  
// //    void hello()
// //    {
// //     System.out.println("bye bye bye ");  
// //    }
// // } 

// // class FirstProg
// // {
// //     public static void main(String args[])
// //     {
// //         Parent s = new Child();
// //          Child c = (Child) s;
// //         // s.PrintData();
// //         // c.PrintData();
// //         // s.hello();
// //         System.out.println(c instanceof Parent);
// //         // s.hello();
// //     }
// // }

// // import java.util.Scanner;
// // class FirstProg
// // {
// //     public static void main(String args[])
// //     {

// //     Scanner fi = new Scanner(System.in);
// //     int arr[] = new int[5];
// //     System.out.println("Enter element s in array");
// //     for(int i=0;i<5;i++)
// //     {
// //         arr[i] = fi.nextInt();
// //     }

// //     for(int i=0;i<5;i++)
// //     {
// //          System.out.println("elemets in array is " + arr[i]);
// //     }
// // }
// // }

// // class FirstProg
// // {
// //     String name;
// //     int age;

// //     FirstProg()
// //     {
// //         this.name="   ";
// //         this.age=0;
// //     }

// //     FirstProg(String name, int age)
// //     {
// //         this.name=name;
// //         this.age=age;
// //     }

// //     public String toString()
// //     {
// //             return name + "  " + age;
// //     }


// //     public static void main(String args[])
// //     {
// //         FirstProg obj[] = new FirstProg[5];
// //         obj[0] = new FirstProg("Rohaan" ,19);
// //         obj[1] = new FirstProg("Roha" ,139);
// //         obj[2] = new FirstProg("Roh" ,1129);
// //         obj[3] = new FirstProg("Raan" ,149);
// //         obj[4] = new FirstProg("Ran" ,195);

// //         for (int i=0;i<obj.length;i++)
// //         {
// //             System.out.println(obj[i]);
// //         }

// //     }
// // }


// class prog{
//     void run()
//     {
//         System.out.println("Fist prog");
//     }
// }

// class employee extends prog{
//     void run()
//     {
//         System.out.println("employee");
//     }
//     }

// class lecturer extends employee{
//     void run()
//     {
//         System.out.println("lecturer");
//     }
//     }

// class staff extends lecturer
// {
//     void run()
//     {
//         System.out.println("satafff");
//     }
// }

// //  public String toString()
// //  {
// //  } 

// class FirstProg{


// public static void main(String args[])
// {
//         prog obj=  new employee();
//         prog obj1=  new lecturer();
//         prog obj2=  new staff();



//         obj.run();
//         obj1.run();
//         obj2.run();


//         prog o[] = {obj,obj1,obj2};
//         for (int i=0;i<o.length;i++)
//         {
//             System.out.println(o[i] instanceof prog);
//         }

//          for (int i=0;i<o.length;i++)
//         {
//             System.out.println(o[i]);
//         }

// }
// }

class FirstProg
{
    public static void main(String args[])
    {
        System.out.println("HEllo");
    }
}