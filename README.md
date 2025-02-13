# test 1 - abstract class in Java

Design a class  hierarchy rooted in the class [Employee](https://github.com/adelorobets/test/blob/main/Employee.java) that includes > subclasses for [HourlyEmployee](https://github.com/adelorobets/test/blob/main/HourlyEmployee.java) and [SalaryEmployee](https://github.com/adelorobets/test/blob/main/SalaryEmployee.java). 
The attributes > shared in common by these classes include the name and job title of > the employee, 
plus the assessor and mutator methods needed by the > attributes. 
The salaried employees need an attribute for weekly > salary, and the corresponding methods for accessing and changing this > variable. The hourly employees should have a pay rate and an > hours-worked variable. 
There should be an abstract method called > calculatePay( ), defined abstractly in the superclass and > implemented in the subclasses. The salaried worker's pay is just the > weekly salary. 
Pay for an hourly employee is simply hours worked times > pay rate.
