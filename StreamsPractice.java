import java.util.*;
import java.util.stream.*;

/**
 * Practice class containing 100 method stubs for learning Java Streams.
 * Fill in the implementation for each method.
 */
public class StreamsPractice {

    // ==========================================
    // MOCK DATA SETUP
    // ==========================================
    public static final int[] numbersArray = { 4, 15, 8, 23, 16, 42, 4, 8, 12, 90, 0, -5, 17 };

    public static final List<Integer> numbersList = Arrays.asList(11, 2, 33, 4, 55, 6, 77, 8, 99, 10, 4, 8);

    public static final List<String> wordsList = Arrays.asList("stream", "api", "java", "code", "programming", "lambda",
            "lazy", "evaluation", "map", "filter", "collect", "java");

    public static final String sampleText = "Java 8 Streams API is powerful and easy to use.";

    public static final List<Employee> employeeList = Arrays.asList(
            new Employee(1, "Jhansi", 32, "Female", "HR", 2015, 45000.0),
            new Employee(2, "Ram", 28, "Male", "IT", 2019, 75000.0),
            new Employee(3, "Subhash", 40, "Male", "Finance", 2011, 110000.0),
            new Employee(4, "Latha", 25, "Female", "IT", 2021, 60000.0),
            new Employee(5, "David", 35, "Male", "HR", 2014, 50000.0),
            new Employee(6, "Nisha", 29, "Female", "Marketing", 2018, 55000.0),
            new Employee(7, "Vikram", 45, "Male", "IT", 2008, 140000.0),
            new Employee(8, "Priya", 31, "Female", "Finance", 2016, 85000.0),
            new Employee(9, "Joseph", 24, "Male", "Marketing", 2022, 48000.0),
            new Employee(10, "Kiran", 38, "Male", "HR", 2012, 62000.0));

    // ==========================================
    // CATEGORY 1: Basic Operations (Q1 - Q20)
    // ==========================================

    // Q1: Find all even numbers from numbersList.
    public static List<Integer> q1() {
        // TODO: Implement stream here
       return Arrays.stream(numbersArray)
                .filter(x -> x % 2 == 0)
                .boxed()
                .toList()
              //  .forEach(System.out::println);
         ;
    }

    // Q2: Filter words starting with 'j' (case-insensitive) from wordsList.
    public static List<String> q2() {
        // TODO: Implement stream here
        return wordsList.stream()
        .filter(x -> x.toLowerCase().startsWith("j"))
        .toList();
    }

    // Q3: Multiply each number in numbersList by 3.
    public static List<Integer> q3() {
        // TODO: Implement stream here
        return numbersList.stream()
        .map(x -> x*3)
        .toList();
    }

    // Q4: Convert all words in wordsList to uppercase.
    public static List<String> q4() {
        // TODO: Implement stream here
        return wordsList.stream()
        .map(x -> x.toUpperCase())
        .toList();
    }

    // Q5: Find the first word in wordsList that has length greater than 5.
    public static Optional<String> q5() {
        // TODO: Implement stream here
        return wordsList.stream()
        .filter(x -> x.length() > 5)
        .findFirst();
    }

    // Q6: Get unique (distinct) numbers from numbersList.
    public static List<Integer> q6() {
        // TODO: Implement stream here
        return numbersList.stream()
        .distinct()
        .toList();
    }

    // Q7: Get unique words from wordsList.
    public static List<String> q7() {
        // TODO: Implement stream here
        return wordsList.stream()
        .distinct()
        .toList();
    }

    // Q8: Sort numbersList in ascending order.
    public static List<Integer> q8() {
        // TODO: Implement stream here
        return numbersList.stream()
        .sorted()
        .toList();
    }

    // Q9: Sort numbersList in descending order.
    public static List<Integer> q9() {
        // TODO: Implement stream here
        return numbersList.stream()
        .sorted(Comparator.reverseOrder())
        .toList();
    }

    // Q10: Sort wordsList alphabetically.
    public static List<String> q10() {
        // TODO: Implement stream here
        return wordsList.stream()
        .sorted()
        .toList();
    }

    // Q11: Sort wordsList by word length in ascending order.
    public static List<String> q11() {
        // TODO: Implement stream here
        return wordsList.stream()
        .sorted(Comparator.comparingInt(String::length))
        .toList();
    }

    // Q12: Limit the numbersList to the first 5 elements.
    public static List<Integer> q12() {
        // TODO: Implement stream here
        return numbersList.stream()
        .limit(5)
        .toList();
    }

    // Q13: Skip the first 3 elements of numbersList and collect the remaining
    // elements.
    public static List<Integer> q13() {
        // TODO: Implement stream here
        return numbersList.stream()
        .skip(3)
        .toList();
    }

    // Q14: Check if any number in numbersList is greater than 90.
    public static boolean q14() {
        // TODO: Implement stream here
        return numbersList.stream()
        .anyMatch(x -> x > 90);
    }

    // Q15: Check if all words in wordsList have length >= 3.
    public static boolean q15() {
        // TODO: Implement stream here
        return wordsList.stream()
        .allMatch(x -> x.length() >= 3);
    }

    // Q16: Check if no number in numbersList is negative.
    public static boolean q16() {
        // TODO: Implement stream here
        return numbersList.stream()
        .noneMatch(x -> x < 0);
    }

    // Q17: Find any element from numbersList.
    public static Optional<Integer> q17() {
        // TODO: Implement stream here
        return numbersList.stream()
        .findAny();
    }

    // Q18: Map each word in wordsList to its length.
    public static List<Integer> q18() {
        // TODO: Implement stream here
        return wordsList.stream()
            .map(x -> x.length())
            .toList();
    }

    // Q19: Count the number of elements in numbersList that are greater than 10.
    public static long q19() {
        // TODO: Implement stream here
        return numbersList.stream()
        .filter(x -> x > 10)
        .count();
    }

    // Q20: Concatenate all words in wordsList with a comma separator.
    public static String q20() {
        // TODO: Implement stream here
        return wordsList.stream()
        .collect(Collectors.joining(
            ", "
        ));
    }

    // ==========================================
    // CATEGORY 2: Numeric Streams & Array Processing (Q21 - Q40)
    // ==========================================

    // Q21: Calculate the sum of elements in numbersArray.
    public static int q21() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .sum();
    }

    // Q22: Calculate the average of elements in numbersArray.
    public static OptionalDouble q22() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .average();
    }

    // Q23: Find the maximum value in numbersArray.
    public static OptionalInt q23() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
       .max();
    }

    // Q24: Find the minimum value in numbersArray.
    public static OptionalInt q24() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
       .min();
    }

    // Q25: Count the occurrences of the number 4 in numbersArray.
    public static long q25() {
        // TODO: Implement stream here
     return  Arrays.stream(numbersArray)
       .filter(x -> x == 4)
       .count();

    }

    // Q26: Convert the primitive numbersArray to a List<Integer>.
    public static List<Integer> q26() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .boxed()
        .toList();
    }

    // Q27: Find the second largest number in numbersArray.
    public static OptionalInt q27() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .boxed()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .mapToInt(x -> x)
        .findFirst();
    }

    // Q28: Find the second smallest number in numbersArray (excluding duplicates).
    public static OptionalInt q28() {
        // TODO: Implement stream here
        return  Arrays.stream(numbersArray)
        .boxed()
        .sorted(Comparator.naturalOrder())
        .skip(1)
        .mapToInt(x -> x)
        .findFirst();
    }

    // Q29: Filter numbers in numbersArray that are between 10 and 30 (inclusive)
    // and return as List<Integer>.
    public static List<Integer> q29() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .filter(x -> x > 10 &&  x < 30)
        .boxed()
        .toList();
    }

    // Q30: Calculate the sum of squares of all numbers in numbersArray.
    public static int q30() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .map(x -> x*x)
        .sum()
        ;
    }

    // Q31: Get the first 3 odd numbers from numbersArray.
    public static List<Integer> q31() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .filter( x -> x % 2 != 0)
        .limit(3)
        .boxed()
        .toList();
    }

    // Q32: Find the product of all elements in numbersList using reduce.
    public static Optional<Integer> q32() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q33: Generate an IntStream from 1 to 10 (inclusive) and calculate its sum.
    public static int q33() {
        // TODO: Implement stream here
       
        return  IntStream.rangeClosed(1,10)
        .sum();
    }

    // Q34: Find the range (difference between max and min) of numbersArray.
    public static int q34() {
        // TODO: Implement stream here
        return 0;
    }

    // Q35: Check if numbersArray contains the number 23.
    public static boolean q35() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .anyMatch(x -> x == 23);
    }

    // Q36: Remove duplicates from numbersArray and return as a new int[].
    public static int[] q36() {
        // TODO: Implement stream here
        return Arrays.stream(numbersArray)
        .boxed()
       .distinct()
       .mapToInt(x->x)
       .toArray();
    }

    // Q37: Merge numbersArray and another array {100, 200} and sort the merged
    // array.
    public static int[] q37(int[] extra) {
        // TODO: Implement stream here
        return IntStream.concat(Arrays.stream(numbersArray), Arrays.stream(extra))
        .sorted()
        .toArray();
    }

    // Q38: Find the count of numbers in numbersArray that are divisible by both 2
    // and 3.
    public static long q38() {
        // TODO: Implement stream here
        return Arrays.stream(
            numbersArray
        ).filter(x -> x%2 == 0)
        .count();
    }

    // Q39: Get summary statistics (min, max, sum, average, count) for numbersArray.
    public static IntSummaryStatistics q39() {
        // TODO: Implement stream here
        return null;
    }

    // Q40: Find the index of the first occurrence of 16 in numbersArray. Return -1
    // if not found.
    public static int q40() {
        // TODO: Implement stream here
     return  IntStream.range(0, numbersArray.length)
       .filter(x -> numbersArray[x] == 16)
       .findFirst()
       .orElse(-1);    
    }

    // ==========================================
    // CATEGORY 3: String Manipulation (Q41 - Q55)
    // ==========================================

    // Q41: Count the number of vowels in sampleText.
    public static long q41() {
        // TODO: Implement stream here
        return sampleText.chars().mapToObj(x -> (char) x)
        .filter(x -> "aeiouAeiou".indexOf(x) != -1)
        .count();
    }

    // Q42: Count the number of consonants in sampleText (excluding spaces, digits,
    // and punctuation).
    public static long q42() {
        // TODO: Implement stream here

        return sampleText.chars().mapToObj(x -> (char) x)
        .filter(x -> "aeiouAEIOU".indexOf(x) == -1)
        .cont();
    }

    // Q43: Remove all whitespace from sampleText using streams.
    public static String q43() {
        // TODO: Implement stream here
        return Arrays.stream(sampleText.replace(" ",""));
    }

    // Q44: Split sampleText into words and count the total number of words.
    public static long q44() {
        // TODO: Implement stream here
        return 0;
    }

    // Q45: Find the first non-repeated character in sampleText (case-insensitive).
    public static Optional<Character> q45() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q46: Find the first repeated character in sampleText (case-insensitive).
    public static Optional<Character> q46() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q47: Count occurrences of each character in sampleText (excluding spaces).
    public static Map<Character, Long> q47() {
        // TODO: Implement stream here
        return null;
    }

    // Q48: Sort characters of sampleText (excluding spaces) alphabetically and join
    // them.
    public static String q48() {
        // TODO: Implement stream here
        return null;
    }

    // Q49: Check if sampleText contains only digits.
    public static boolean q49() {
        // TODO: Implement stream here
        return false;
    }

    // Q50: Reverse sampleText using streams.
    public static String q50() {
        // TODO: Implement stream here
        return null;
    }

    // Q51: Find the longest word in sampleText.
    public static Optional<String> q51() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q52: Check if two strings str1 and str2 are anagrams using streams.
    public static boolean q52(String str1, String str2) {
        // TODO: Implement stream here
        return false;
    }

    // Q53: Filter words in a list that are palindromes.
    public static List<String> q53(List<String> list) {
        // TODO: Implement stream here
        return null;
    }

    // Q54: Extract only the uppercase letters from sampleText.
    public static String q54() {
        // TODO: Implement stream here
        return null;
    }

    // Q55: Convert all words in wordsList into a single string with each word in
    // title case, separated by spaces.
    public static String q55() {
        // TODO: Implement stream here
        return null;
    }

    // ==========================================
    // CATEGORY 4: Employee Object Processing - Intermediate (Q56 - Q75)
    // ==========================================

    // Q56: Get list of names of all employees.
    public static List<String> q56() {
        // TODO: Implement stream here
        return null;
    }

    // Q57: Get list of distinct departments.
    public static List<String> q57() {
        // TODO: Implement stream here
        return null;
    }

    // Q58: Filter employees who joined after 2015.
    public static List<Employee> q58() {
        // TODO: Implement stream here
        return null;
    }

    // Q59: Filter female employees whose age is greater than 25.
    public static List<Employee> q59() {
        // TODO: Implement stream here
        return null;
    }

    // Q60: Find the employee with the highest salary.
    public static Optional<Employee> q60() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q61: Find the employee with the lowest salary.
    public static Optional<Employee> q61() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q62: Sort employees by their salary in ascending order.
    public static List<Employee> q62() {
        // TODO: Implement stream here
        return null;
    }

    // Q63: Sort employees by salary in descending order.
    public static List<Employee> q63() {
        // TODO: Implement stream here
        return null;
    }

    // Q64: Sort employees by department (alphabetical) then by salary descending.
    public static List<Employee> q64() {
        // TODO: Implement stream here
        return null;
    }

    // Q65: Get the names of the top 3 highest paid employees.
    public static List<String> q65() {
        // TODO: Implement stream here
        return null;
    }

    // Q66: Get the names of all employees who joined the IT department.
    public static List<String> q66() {
        // TODO: Implement stream here
        return null;
    }

    // Q67: Check if any employee is older than 40.
    public static boolean q67() {
        // TODO: Implement stream here
        return false;
    }

    // Q68: Check if all employees earn more than 30,000.
    public static boolean q68() {
        // TODO: Implement stream here
        return false;
    }

    // Q69: Find the oldest employee.
    public static Optional<Employee> q69() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q70: Find the youngest female employee.
    public static Optional<Employee> q70() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q71: Increment the salary of all IT employees by 10% and return a list of
    // their names and new salaries (format: "Name: NewSalary").
    public static List<String> q71() {
        // TODO: Implement stream here
        return null;
    }

    // Q72: Find the sum of salaries of all IT employees.
    public static double q72() {
        // TODO: Implement stream here
        return 0.0;
    }

    // Q73: Calculate the average age of all employees.
    public static double q73() {
        // TODO: Implement stream here
        return 0.0;
    }

    // Q74: Count the total number of employees in the HR department.
    public static long q74() {
        // TODO: Implement stream here
        return 0;
    }

    // Q75: Get the name and age of the employee who joined most recently.
    public static String q75() {
        // TODO: Implement stream here
        return null;
    }

    // ==========================================
    // CATEGORY 5: Employee Object Processing - Advanced (Q76 - Q90)
    // ==========================================

    // Q76: Group employees by department.
    public static Map<String, List<Employee>> q76() {
        // TODO: Implement stream here
        return null;
    }

    // Q77: Group employee names by department.
    public static Map<String, List<String>> q77() {
        // TODO: Implement stream here
        return null;
    }

    // Q78: Group employees by gender.
    public static Map<String, List<Employee>> q78() {
        // TODO: Implement stream here
        return null;
    }

    // Q79: Count the number of employees in each department.
    public static Map<String, Long> q79() {
        // TODO: Implement stream here
        return null;
    }

    // Q80: Calculate the average salary of each department.
    public static Map<String, Double> q80() {
        // TODO: Implement stream here
        return null;
    }

    // Q81: Find the maximum salary in each department.
    public static Map<String, Optional<Double>> q81() {
        // TODO: Implement stream here
        return null;
    }

    // Q82: Find the employee with the highest salary in each department.
    public static Map<String, Optional<Employee>> q82() {
        // TODO: Implement stream here
        return null;
    }

    // Q83: Get summary statistics of salaries for the IT department.
    public static DoubleSummaryStatistics q83() {
        // TODO: Implement stream here
        return null;
    }

    // Q84: Partition employees into those earning > 70,000 and those earning <=
    // 70,000.
    public static Map<Boolean, List<Employee>> q84() {
        // TODO: Implement stream here
        return null;
    }

    // Q85: Partition employees into male and female, and find the average salary of
    // each group.
    public static Map<String, Double> q85() {
        // TODO: Implement stream here
        return null;
    }

    // Q86: Create a Map where key is employee ID and value is the Employee object.
    public static Map<Integer, Employee> q86() {
        // TODO: Implement stream here
        return null;
    }

    // Q87: Group employees by age ranges (e.g., "Under 30", "30-40", "Over 40").
    public static Map<String, List<Employee>> q87() {
        // TODO: Implement stream here
        return null;
    }

    // Q88: Find the department that has the highest number of employees.
    public static Optional<String> q88() {
        // TODO: Implement stream here
        return Optional.empty();
    }

    // Q89: Find the average age of male and female employees.
    public static Map<String, Double> q89() {
        // TODO: Implement stream here
        return null;
    }

    // Q90: Find the names of employees in each department, concatenated by a comma.
    public static Map<String, String> q90() {
        // TODO: Implement stream here
        return null;
    }

    // ==========================================
    // CATEGORY 6: Advanced Stream Techniques (Q91 - Q100)
    // ==========================================

    // Q91: Flatten a list of lists of strings into a single sorted list.
    public static List<String> q91(List<List<String>> list) {
        // TODO: Implement stream here
        return null;
    }

    // Q92: Find the Cartesian product of two lists of strings.
    public static List<String> q92(List<String> list1, List<String> list2) {
        // TODO: Implement stream here
        return null;
    }

    // Q93: Find the sum of the first 10 prime numbers using infinite streams.
    public static int q93() {
        // TODO: Implement stream here
        return 0;
    }

    // Q94: Generate Fibonacci sequence up to 10 terms using Stream.iterate.
    public static List<Integer> q94() {
        // TODO: Implement stream here
        return null;
    }

    // Q95: Find the intersection (common elements) of two lists of integers using
    // streams.
    public static List<Integer> q95(List<Integer> list1, List<Integer> list2) {
        // TODO: Implement stream here
        return null;
    }

    // Q96: Group a list of words by their length and count them.
    public static Map<Integer, Long> q96() {
        // TODO: Implement stream here
        return null;
    }

    // Q97: Find the frequency of each word in a list of sentences
    // (case-insensitive).
    public static Map<String, Long> q97(List<String> sentences) {
        // TODO: Implement stream here
        return null;
    }

    // Q98: Custom Collector: Concatenate names of employees with a custom delimiter
    // "[", " - ", "]".
    public static String q98() {
        // TODO: Implement stream here
        return null;
    }

    // Q99: Compute sum of squares of first 1,000,000 numbers in parallel and return
    // the sum.
    public static long q99() {
        // TODO: Implement stream here
        return 0;
    }

    // Q100: Partition numbers 1 to 20 into prime and non-prime.
    public static Map<Boolean, List<Integer>> q100() {
        // TODO: Implement stream here
        return null;
    }

    // ==========================================
    // MAIN METHOD FOR RUNNING PRACTICE EXERCISES
    // ==========================================
    public static void main(String[] args) {
        System.out.println("Running StreamsPractice Exercises...");

        System.out.println("Q1: " + q1());
        System.out.println("Q2: " + q2());
        System.out.println("Q3: " + q3());
        System.out.println("Q4: " + q4());
        System.out.println("Q5: " + q5());
        System.out.println("Q6: " + q6());
        System.out.println("Q7: " + q7());
        System.out.println("Q8: " + q8());
        System.out.println("Q9: " + q9());
        System.out.println("Q10: " + q10());
        System.out.println("Q11: " + q11());
        System.out.println("Q12: " + q12());
        System.out.println("Q13: " + q13());
        System.out.println("Q14: " + q14());
        System.out.println("Q15: " + q15());
        System.out.println("Q16: " + q16());
        System.out.println("Q17: " + q17());
        System.out.println("Q18: " + q18());
        System.out.println("Q19: " + q19());
        System.out.println("Q20: " + q20());
        System.out.println("Q21: " + q21());
        System.out.println("Q22: " + q22());
        System.out.println("Q23: " + q23());
        System.out.println("Q24: " + q24());
        System.out.println("Q25: " + q25());
        System.out.println("Q26: " + q26());
        System.out.println("Q27: " + q27());
        System.out.println("Q28: " + q28());
        System.out.println("Q29: " + q29());
        System.out.println("Q30: " + q30());
        System.out.println("Q31: " + q31());
        System.out.println("Q32: " + q32());
        System.out.println("Q33: " + q33());
        System.out.println("Q34: " + q34());
        System.out.println("Q35: " + q35());
        System.out.println("Q36: " + Arrays.toString(q36()));
        System.out.println("Q37: " + Arrays.toString(q37(new int[]{100, 200})));
        System.out.println("Q38: " + q38());
        System.out.println("Q39: " + q39());
        System.out.println("Q40: " + q40());
        System.out.println("Q41: " + q41());
        System.out.println("Q42: " + q42());
        System.out.println("Q43: " + q43());
        System.out.println("Q44: " + q44());
        System.out.println("Q45: " + q45());
        System.out.println("Q46: " + q46());
        System.out.println("Q47: " + q47());
        System.out.println("Q48: " + q48());
        System.out.println("Q49: " + q49());
        System.out.println("Q50: " + q50());
        System.out.println("Q51: " + q51());
        System.out.println("Q52 (listen, silent): " + q52("listen", "silent"));
        System.out.println("Q53 (palindromes): " + q53(Arrays.asList("radar", "hello", "level", "world")));
        System.out.println("Q54: " + q54());
        System.out.println("Q55: " + q55());
        System.out.println("Q56: " + q56());
        System.out.println("Q57: " + q57());
        System.out.println("Q58: " + q58());
        System.out.println("Q59: " + q59());
        System.out.println("Q60: " + q60());
        System.out.println("Q61: " + q61());
        System.out.println("Q62: " + q62());
        System.out.println("Q63: " + q63());
        System.out.println("Q64: " + q64());
        System.out.println("Q65: " + q65());
        System.out.println("Q66: " + q66());
        System.out.println("Q67: " + q67());
        System.out.println("Q68: " + q68());
        System.out.println("Q69: " + q69());
        System.out.println("Q70: " + q70());
        System.out.println("Q71: " + q71());
        System.out.println("Q72: " + q72());
        System.out.println("Q73: " + q73());
        System.out.println("Q74: " + q74());
        System.out.println("Q75: " + q75());
        System.out.println("Q76: " + q76());
        System.out.println("Q77: " + q77());
        System.out.println("Q78: " + q78());
        System.out.println("Q79: " + q79());
        System.out.println("Q80: " + q80());
        System.out.println("Q81: " + q81());
        System.out.println("Q82: " + q82());
        System.out.println("Q83: " + q83());
        System.out.println("Q84: " + q84());
        System.out.println("Q85: " + q85());
        System.out.println("Q86: " + q86());
        System.out.println("Q87: " + q87());
        System.out.println("Q88: " + q88());
        System.out.println("Q89: " + q89());
        System.out.println("Q90: " + q90());
        System.out.println("Q91: " + q91(Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"))));
        System.out.println("Q92: " + q92(Arrays.asList("A", "B"), Arrays.asList("1", "2")));
        System.out.println("Q93: " + q93());
        System.out.println("Q94: " + q94());
        System.out.println("Q95: " + q95(Arrays.asList(1, 2, 3), Arrays.asList(2, 3, 4)));
        System.out.println("Q96: " + q96());
        System.out.println("Q97: " + q97(Arrays.asList("Java stream API", "is easy to use")));
        System.out.println("Q98: " + q98());
        System.out.println("Q99: " + q99());
        System.out.println("Q100: " + q100());

        System.out.println("Practice runs complete!");
    }
}
