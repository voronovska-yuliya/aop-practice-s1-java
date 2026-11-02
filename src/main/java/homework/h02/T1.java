package homework.h02;

// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
public class T1 {
  public static double average(int[] salary) {
    int minimumSalary = salary[0];
    int maximumSalary = salary[0];
    int totalSalary = 0;
    for (int salaryAmount : salary) {
      totalSalary += salaryAmount;
      if (salaryAmount < minimumSalary) {
        minimumSalary = salaryAmount;
      }
      if (salaryAmount > maximumSalary) {
        maximumSalary = salaryAmount;
      }
    }
    return (double) (totalSalary - minimumSalary - maximumSalary) / (salary.length - 2);
  }
}
