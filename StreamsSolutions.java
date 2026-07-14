import java.util.*;
import java.util.stream.*;

/**
 * Solutions class containing completed Java Streams pipelines for all 100 exercises.
 */
public class StreamsSolutions {

    // ==========================================
    // MOCK DATA SETUP
    // ==========================================
    public static final int[] numbersArray = {4, 15, 8, 23, 16, 42, 4, 8, 12, 90, 0, -5, 17};
    
    public static final List<Integer> numbersList = Arrays.asList(11, 2, 33, 4, 55, 6, 77, 8, 99, 10, 4, 8);
    
    public static final List<String> wordsList = Arrays.asList("stream", "api", "java", "code", "programming", "lambda", "lazy", "evaluation", "map", "filter", "collect", "java");
    
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
        new Employee(10, "Kiran", 38, "Male", "HR", 2012, 62000.0)
    );

    // Helper method for prime checks
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .allMatch(n -> number % n != 0);
    }

    // ==========================================
    // CATEGORY 1: Basic Operations (Q1 - Q20)
    // ==========================================

    // Q1: Find all even numbers from numbersList.
    public static List<Integer> q1() {
        return numbersList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    // Q2: Filter words starting with 'j' (case-insensitive) from wordsList.
    public static List<String> q2() {
        return wordsList.stream()
                .filter(w -> w.toLowerCase().startsWith("j"))
                .collect(Collectors.toList());
    }

    // Q3: Multiply each number in numbersList by 3.
    public static List<Integer> q3() {
        return numbersList.stream()
                .map(n -> n * 3)
                .collect(Collectors.toList());
    }

    // Q4: Convert all words in wordsList to uppercase.
    public static List<String> q4() {
        return wordsList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    // Q5: Find the first word in wordsList that has length greater than 5.
    public static Optional<String> q5() {
        return wordsList.stream()
                .filter(w -> w.length() > 5)
                .findFirst();
    }

    // Q6: Get unique (distinct) numbers from numbersList.
    public static List<Integer> q6() {
        return numbersList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // Q7: Get unique words from wordsList.
    public static List<String> q7() {
        return wordsList.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // Q8: Sort numbersList in ascending order.
    public static List<Integer> q8() {
        return numbersList.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // Q9: Sort numbersList in descending order.
    public static List<Integer> q9() {
        return numbersList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    // Q10: Sort wordsList alphabetically.
    public static List<String> q10() {
        return wordsList.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // Q11: Sort wordsList by word length in ascending order.
    public static List<String> q11() {
        return wordsList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    // Q12: Limit the numbersList to the first 5 elements.
    public static List<Integer> q12() {
        return numbersList.stream()
                .limit(5)
                .collect(Collectors.toList());
    }

    // Q13: Skip the first 3 elements of numbersList and collect the remaining elements.
    public static List<Integer> q13() {
        return numbersList.stream()
                .skip(3)
                .collect(Collectors.toList());
    }

    // Q14: Check if any number in numbersList is greater than 90.
    public static boolean q14() {
        return numbersList.stream()
                .anyMatch(n -> n > 90);
    }

    // Q15: Check if all words in wordsList have length >= 3.
    public static boolean q15() {
        return wordsList.stream()
                .allMatch(w -> w.length() >= 3);
    }

    // Q16: Check if no number in numbersList is negative.
    public static boolean q16() {
        return numbersList.stream()
                .noneMatch(n -> n < 0);
    }

    // Q17: Find any element from numbersList.
    public static Optional<Integer> q17() {
        return numbersList.stream()
                .findAny();
    }

    // Q18: Map each word in wordsList to its length.
    public static List<Integer> q18() {
        return wordsList.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    // Q19: Count the number of elements in numbersList that are greater than 10.
    public static long q19() {
        return numbersList.stream()
                .filter(n -> n > 10)
                .count();
    }

    // Q20: Concatenate all words in wordsList with a comma separator.
    public static String q20() {
        return wordsList.stream()
                .collect(Collectors.joining(", "));
    }

    // ==========================================
    // CATEGORY 2: Numeric Streams & Array Processing (Q21 - Q40)
    // ==========================================

    // Q21: Calculate the sum of elements in numbersArray.
    public static int q21() {
        return Arrays.stream(numbersArray).sum();
    }

    // Q22: Calculate the average of elements in numbersArray.
    public static OptionalDouble q22() {
        return Arrays.stream(numbersArray).average();
    }

    // Q23: Find the maximum value in numbersArray.
    public static OptionalInt q23() {
        return Arrays.stream(numbersArray).max();
    }

    // Q24: Find the minimum value in numbersArray.
    public static OptionalInt q24() {
        return Arrays.stream(numbersArray).min();
    }

    // Q25: Count the occurrences of the number 4 in numbersArray.
    public static long q25() {
        return Arrays.stream(numbersArray)
                .filter(n -> n == 4)
                .count();
    }

    // Q26: Convert the primitive numbersArray to a List<Integer>.
    public static List<Integer> q26() {
        return Arrays.stream(numbersArray)
                .boxed()
                .collect(Collectors.toList());
    }

    // Q27: Find the second largest number in numbersArray.
    public static OptionalInt q27() {
        return Arrays.stream(numbersArray)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToInt(Integer::intValue)
                .findFirst();
    }

    // Q28: Find the second smallest number in numbersArray (excluding duplicates).
    public static OptionalInt q28() {
        return Arrays.stream(numbersArray)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
    }

    // Q29: Filter numbers in numbersArray that are between 10 and 30 (inclusive) and return as List<Integer>.
    public static List<Integer> q29() {
        return Arrays.stream(numbersArray)
                .filter(n -> n >= 10 && n <= 30)
                .boxed()
                .collect(Collectors.toList());
    }

    // Q30: Calculate the sum of squares of all numbers in numbersArray.
    public static int q30() {
        return Arrays.stream(numbersArray)
                .map(n -> n * n)
                .sum();
    }

    // Q31: Get the first 3 odd numbers from numbersArray.
    public static List<Integer> q31() {
        return Arrays.stream(numbersArray)
                .filter(n -> n % 2 != 0)
                .limit(3)
                .boxed()
                .collect(Collectors.toList());
    }

    // Q32: Find the product of all elements in numbersList using reduce.
    public static Optional<Integer> q32() {
        return numbersList.stream()
                .reduce((a, b) -> a * b);
    }

    // Q33: Generate an IntStream from 1 to 10 (inclusive) and calculate its sum.
    public static int q33() {
        return IntStream.rangeClosed(1, 10).sum();
    }

    // Q34: Find the range (difference between max and min) of numbersArray.
    public static int q34() {
        int max = Arrays.stream(numbersArray).max().orElse(0);
        int min = Arrays.stream(numbersArray).min().orElse(0);
        return max - min;
    }

    // Q35: Check if numbersArray contains the number 23.
    public static boolean q35() {
        return Arrays.stream(numbersArray)
                .anyMatch(n -> n == 23);
    }

    // Q36: Remove duplicates from numbersArray and return as a new int[].
    public static int[] q36() {
        return Arrays.stream(numbersArray)
                .distinct()
                .toArray();
    }

    // Q37: Merge numbersArray and another array {100, 200} and sort the merged array.
    public static int[] q37(int[] extra) {
        return IntStream.concat(Arrays.stream(numbersArray), Arrays.stream(extra))
                .sorted()
                .toArray();
    }

    // Q38: Find the count of numbers in numbersArray that are divisible by both 2 and 3.
    public static long q38() {
        return Arrays.stream(numbersArray)
                .filter(n -> n % 2 == 0 && n % 3 == 0)
                .count();
    }

    // Q39: Get summary statistics (min, max, sum, average, count) for numbersArray.
    public static IntSummaryStatistics q39() {
        return Arrays.stream(numbersArray).summaryStatistics();
    }

    // Q40: Find the index of the first occurrence of 16 in numbersArray. Return -1 if not found.
    public static int q40() {
        return IntStream.range(0, numbersArray.length)
                .filter(i -> numbersArray[i] == 16)
                .findFirst()
                .orElse(-1);
    }

    // ==========================================
    // CATEGORY 3: String Manipulation (Q41 - Q55)
    // ==========================================

    // Q41: Count the number of vowels in sampleText.
    public static long q41() {
        return sampleText.chars()
                .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
                .count();
    }

    // Q42: Count the number of consonants in sampleText (excluding spaces, digits, and punctuation).
    public static long q42() {
        return sampleText.chars()
                .filter(Character::isLetter)
                .filter(c -> "aeiouAEIOU".indexOf(c) == -1)
                .count();
    }

    // Q43: Remove all whitespace from sampleText using streams.
    public static String q43() {
        return sampleText.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    // Q44: Split sampleText into words and count the total number of words.
    public static long q44() {
        return Arrays.stream(sampleText.split("\\s+")).count();
    }

    // Q45: Find the first non-repeated character in sampleText (case-insensitive).
    public static Optional<Character> q45() {
        return sampleText.chars()
                .mapToObj(c -> (char) Character.toLowerCase(c))
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    // Q46: Find the first repeated character in sampleText (case-insensitive).
    public static Optional<Character> q46() {
        return sampleText.chars()
                .mapToObj(c -> (char) Character.toLowerCase(c))
                .filter(Character::isLetterOrDigit)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    // Q47: Count occurrences of each character in sampleText (excluding spaces).
    public static Map<Character, Long> q47() {
        return sampleText.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }

    // Q48: Sort characters of sampleText (excluding spaces) alphabetically and join them.
    public static String q48() {
        return sampleText.chars()
                .filter(c -> !Character.isWhitespace(c))
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    // Q49: Check if sampleText contains only digits.
    public static boolean q49() {
        return sampleText.chars()
                .allMatch(Character::isDigit);
    }

    // Q50: Reverse sampleText using streams.
    public static String q50() {
        return IntStream.range(0, sampleText.length())
                .map(i -> sampleText.charAt(sampleText.length() - 1 - i))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    // Q51: Find the longest word in sampleText.
    public static Optional<String> q51() {
        return Arrays.stream(sampleText.split("[^a-zA-Z0-9]+"))
                .max(Comparator.comparingInt(String::length));
    }

    // Q52: Check if two strings str1 and str2 are anagrams using streams.
    public static boolean q52(String str1, String str2) {
        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
        String s2 = str2.replaceAll("\\s+", "").toLowerCase();
        if (s1.length() != s2.length()) return false;
        
        List<Character> list1 = s1.chars().sorted().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> list2 = s2.chars().sorted().mapToObj(c -> (char)c).collect(Collectors.toList());
        return list1.equals(list2);
    }

    // Q53: Filter words in a list that are palindromes.
    public static List<String> q53(List<String> list) {
        return list.stream()
                .filter(w -> w.equalsIgnoreCase(new StringBuilder(w).reverse().toString()))
                .collect(Collectors.toList());
    }

    // Q54: Extract only the uppercase letters from sampleText.
    public static String q54() {
        return sampleText.chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
    }

    // Q55: Convert all words in wordsList into a single string with each word in title case, separated by spaces.
    public static String q55() {
        return wordsList.stream()
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }

    // ==========================================
    // CATEGORY 4: Employee Object Processing - Intermediate (Q56 - Q75)
    // ==========================================

    // Q56: Get list of names of all employees.
    public static List<String> q56() {
        return employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    // Q57: Get list of distinct departments.
    public static List<String> q57() {
        return employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .collect(Collectors.toList());
    }

    // Q58: Filter employees who joined after 2015.
    public static List<Employee> q58() {
        return employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .collect(Collectors.toList());
    }

    // Q59: Filter female employees whose age is greater than 25.
    public static List<Employee> q59() {
        return employeeList.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female") && e.getAge() > 25)
                .collect(Collectors.toList());
    }

    // Q60: Find the employee with the highest salary.
    public static Optional<Employee> q60() {
        return employeeList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
    }

    // Q61: Find the employee with the lowest salary.
    public static Optional<Employee> q61() {
        return employeeList.stream()
                .min(Comparator.comparingDouble(Employee::getSalary));
    }

    // Q62: Sort employees by their salary in ascending order.
    public static List<Employee> q62() {
        return employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .collect(Collectors.toList());
    }

    // Q63: Sort employees by salary in descending order.
    public static List<Employee> q63() {
        return employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }

    // Q64: Sort employees by department (alphabetical) then by salary descending.
    public static List<Employee> q64() {
        return employeeList.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary, Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }

    // Q65: Get the names of the top 3 highest paid employees.
    public static List<String> q65() {
        return employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    // Q66: Get the names of all employees who joined the IT department.
    public static List<String> q66() {
        return employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }

    // Q67: Check if any employee is older than 40.
    public static boolean q67() {
        return employeeList.stream()
                .anyMatch(e -> e.getAge() > 40);
    }

    // Q68: Check if all employees earn more than 30,000.
    public static boolean q68() {
        return employeeList.stream()
                .allMatch(e -> e.getSalary() > 30000);
    }

    // Q69: Find the oldest employee.
    public static Optional<Employee> q69() {
        return employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge));
    }

    // Q70: Find the youngest female employee.
    public static Optional<Employee> q70() {
        return employeeList.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Female"))
                .min(Comparator.comparingInt(Employee::getAge));
    }

    // Q71: Increment the salary of all IT employees by 10% and return a list of their names and new salaries (format: "Name: NewSalary").
    public static List<String> q71() {
        return employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .map(e -> e.getName() + ": " + (e.getSalary() * 1.1))
                .collect(Collectors.toList());
    }

    // Q72: Find the sum of salaries of all IT employees.
    public static double q72() {
        return employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    // Q73: Calculate the average age of all employees.
    public static double q73() {
        return employeeList.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);
    }

    // Q74: Count the total number of employees in the HR department.
    public static long q74() {
        return employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("HR"))
                .count();
    }

    // Q75: Get the name and age of the employee who joined most recently.
    public static String q75() {
        return employeeList.stream()
                .max(Comparator.comparingInt(Employee::getYearOfJoining))
                .map(e -> e.getName() + " (" + e.getAge() + ")")
                .orElse("");
    }

    // ==========================================
    // CATEGORY 5: Employee Object Processing - Advanced (Q76 - Q90)
    // ==========================================

    // Q76: Group employees by department.
    public static Map<String, List<Employee>> q76() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    // Q77: Group employee names by department.
    public static Map<String, List<String>> q77() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));
    }

    // Q78: Group employees by gender.
    public static Map<String, List<Employee>> q78() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender));
    }

    // Q79: Count the number of employees in each department.
    public static Map<String, Long> q79() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    }

    // Q80: Calculate the average salary of each department.
    public static Map<String, Double> q80() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
    }

    // Q81: Find the maximum salary in each department.
    public static Map<String, Optional<Double>> q81() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary, Collectors.maxBy(Double::compare))
                ));
    }

    // Q82: Find the employee with the highest salary in each department.
    public static Map<String, Optional<Employee>> q82() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                ));
    }

    // Q83: Get summary statistics of salaries for the IT department.
    public static DoubleSummaryStatistics q83() {
        return employeeList.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
                .collect(Collectors.summarizingDouble(Employee::getSalary));
    }

    // Q84: Partition employees into those earning > 70,000 and those earning <= 70,000.
    public static Map<Boolean, List<Employee>> q84() {
        return employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getSalary() > 70000));
    }

    // Q85: Partition employees into male and female, and find the average salary of each group.
    public static Map<String, Double> q85() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
    }

    // Q86: Create a Map where key is employee ID and value is the Employee object.
    public static Map<Integer, Employee> q86() {
        return employeeList.stream()
                .collect(Collectors.toMap(Employee::getId, e -> e));
    }

    // Q87: Group employees by age ranges (e.g., "Under 30", "30-40", "Over 40").
    public static Map<String, List<Employee>> q87() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(e -> {
                    if (e.getAge() < 30) return "Under 30";
                    else if (e.getAge() <= 40) return "30-40";
                    else return "Over 40";
                }));
    }

    // Q88: Find the department that has the highest number of employees.
    public static Optional<String> q88() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    // Q89: Find the average age of male and female employees.
    public static Map<String, Double> q89() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getGender,
                        Collectors.averagingDouble(Employee::getAge)
                ));
    }

    // Q90: Find the names of employees in each department, concatenated by a comma.
    public static Map<String, String> q90() {
        return employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.joining(", "))
                ));
    }

    // ==========================================
    // CATEGORY 6: Advanced Stream Techniques (Q91 - Q100)
    // ==========================================

    // Q91: Flatten a list of lists of strings into a single sorted list.
    public static List<String> q91(List<List<String>> list) {
        return list.stream()
                .flatMap(List::stream)
                .sorted()
                .collect(Collectors.toList());
    }

    // Q92: Find the Cartesian product of two lists of strings.
    public static List<String> q92(List<String> list1, List<String> list2) {
        return list1.stream()
                .flatMap(s1 -> list2.stream().map(s2 -> s1 + s2))
                .collect(Collectors.toList());
    }

    // Q93: Find the sum of the first 10 prime numbers using infinite streams.
    public static int q93() {
        return IntStream.iterate(2, i -> i + 1)
                .filter(StreamsSolutions::isPrime)
                .limit(10)
                .sum();
    }

    // Q94: Generate Fibonacci sequence up to 10 terms using Stream.iterate.
    public static List<Integer> q94() {
        return Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0])
                .collect(Collectors.toList());
    }

    // Q95: Find the intersection (common elements) of two lists of integers using streams.
    public static List<Integer> q95(List<Integer> list1, List<Integer> list2) {
        return list1.stream()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());
    }

    // Q96: Group a list of words by their length and count them.
    public static Map<Integer, Long> q96() {
        return wordsList.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }

    // Q97: Find the frequency of each word in a list of sentences (case-insensitive).
    public static Map<String, Long> q97(List<String> sentences) {
        return sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(w -> w, Collectors.counting()));
    }

    // Q98: Custom Collector: Concatenate names of employees with a custom delimiter "[", " - ", "]".
    public static String q98() {
        return employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(" - ", "[", "]"));
    }

    // Q99: Compute sum of squares of first 1,000,000 numbers in parallel and return the sum.
    public static long q99() {
        return LongStream.rangeClosed(1, 1000000)
                .parallel()
                .map(n -> n * n)
                .sum();
    }

    // Q100: Partition numbers 1 to 20 into prime and non-prime.
    public static Map<Boolean, List<Integer>> q100() {
        return IntStream.rangeClosed(1, 20)
                .boxed()
                .collect(Collectors.partitioningBy(StreamsSolutions::isPrime));
    }

    // ==========================================
    // MAIN METHOD FOR RUNNING VERIFICATION
    // ==========================================
    public static void main(String[] args) {
        System.out.println("Running Solutions Verification...");
        
        System.out.println("Q1: " + q1());
        System.out.println("Q2: " + q2());
        System.out.println("Q5: " + q5().orElse("none"));
        System.out.println("Q20: " + q20());
        System.out.println("Q21 Sum: " + q21());
        System.out.println("Q22 Avg: " + q22());
        System.out.println("Q27 2nd Max: " + q27());
        System.out.println("Q28 2nd Min: " + q28());
        System.out.println("Q45 First Non-Repeated: " + q45());
        System.out.println("Q46 First Repeated: " + q46());
        System.out.println("Q51 Longest Word: " + q51());
        System.out.println("Q55 Title Case: " + q55());
        System.out.println("Q75 Most Recent: " + q75());
        System.out.println("Q80 Avg Salaries: " + q80());
        System.out.println("Q88 Max Employees Dept: " + q88());
        System.out.println("Q93 Prime Sum: " + q93());
        System.out.println("Q94 Fibonacci: " + q94());
        System.out.println("Q100 Partition Primes: " + q100());
        
        System.out.println("Solutions verification complete!");
    }
}
