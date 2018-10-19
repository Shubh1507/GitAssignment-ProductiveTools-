class Student
{
   private int roll;
   private String name;
   private int age;

   public int getroll()
   {
      return roll;
   }
   public String getName()
   {
      return name;
   }

   public int getAge()
   {
      return age;
   }
  
   public void setroll( int roll)
   {
      this.roll = roll;
   }
   public void setName(String name)
   {
      this.name = name;
   }

   public void setAge( int age)
   {
      this.age = age;
   }
  
}

public class school
{
    public static void main(String args[])
    {
      Student stu = new Student();
      Student stu2 = new Student();
      Student stu3 = new Student();


      stu.setroll(101);
      stu.setName("ABC");
      stu.setAge(20);

      stu2.setroll(102);
      stu2.setName("EFG");
      stu2.setAge(15);

      stu3.setroll(103);
      stu3.setName("PQR");
      stu3.setAge(22);
     

      System.out.println("Student Roll No. : "+stu.getroll() + "\nName : " + stu.getName() + "\nAge : " + stu.getAge());
      System.out.println("\nStudent Roll No. : "+stu2.getroll() + "\nName : " + stu2.getName() + "\nAge : " + stu2.getAge());
      System.out.println("\nStudent Roll No. : "+stu3.getroll() + "\nName : " + stu3.getName() + "\nAge : " + stu3.getAge());


   }
}