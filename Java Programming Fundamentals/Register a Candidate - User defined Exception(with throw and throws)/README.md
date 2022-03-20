Geneva Technologies is planning to conduct a Walk-in interview. The interview has 4 levels. To attend the interview, the candidates need to register the following information:
Name, Gender and Expected salary.

Help him do this by writing a java program.

Partial code is provided.

You are provided with a public class Candidate with private attributes :

                        String name

                        String gender

                        double expectedSalary

            Appropriate getter and setters are provided.

            You are provided with a public class Main.

Write a method getCandidateDetails as –

            public static Candidate getCandidateDetails() – This method should get the candidate details, create the Candidate object using those details and return that object.

If the candidate’s expected salary is less than 10000

               ·   throw a user defined exception as InvalidSalaryException with the message “Registration Failed. Salary cannot be less than 10000.” and return null.

               ·    this method should throw / propagate InvalidSalaryException.

