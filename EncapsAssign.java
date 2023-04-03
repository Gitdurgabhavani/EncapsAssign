1.What is Encapsulation in java? Why is it called Data hiding?
Ans.Binding of data and methods into a single unit is called Encapsulation.

2.What are the importat features of Ecapsulation?
Ans. Enhancement becomes easy
    Maintainibility ad modularisation becomes easy.


3.What are getter ad setter methods in Java Explain with an example
Ans. class Employee
     {
         private String name;
         private integer id;
        
         public void setName(String name){
                   this.name=name;
      }
         public void setId(integer id){
                    this.id=id;
      }
         public Integer getID(){
                  return id;
      } 
         public String getName(){
                  return name;
      }
      }
     public class Demo{
          public static void main (String[] args){
             Employee emp=new Employee();
             emp.setId(10);
             emp.setName("sachin");
           
             System.out.println(Id is :: "+emp.getId());
             System.out.println("Name is ::"+emp.getName());
      }
      }    

4.What is the use of ths keyword in java.
Ans.If both local and instance variable having the same name inside the method the it
would result in a name clash to solve this problem we need to use "this" keyword.

5.What is the advantage of Encapsulation?
Ans.We can achieve security.
    Enhancement becomes easy
    Maintainibility ad modularisation becomes easy.

6.How to achieve encapsulation in java? Give an example. 
Ans.In any java class follows data hiding and abstraction then such class is
reffered as "Encapsulation"
    Encapsulation=Data Hiding + abstraction.