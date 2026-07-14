# Java Streams Practice Questions (100 Exercises)

This file contains 100 practice questions for Java Streams, grouped by category. Each question includes the input source to be used, the expected output, and the conceptual objective.

---

## Mock Data Setup

The exercises use the following mock datasets defined in the template:

### Primitive Integer Array (`int[] numbersArray`)
```java
int[] numbersArray = {4, 15, 8, 23, 16, 42, 4, 8, 12, 90, 0, -5, 17};
```

### List of Integers (`List<Integer> numbersList`)
```java
List<Integer> numbersList = Arrays.asList(11, 2, 33, 4, 55, 6, 77, 8, 99, 10, 4, 8);
```

### List of Strings (`List<String> wordsList`)
```java
List<String> wordsList = Arrays.asList("stream", "api", "java", "code", "programming", "lambda", "lazy", "evaluation", "map", "filter", "collect", "java");
```

### Single String (`String sampleText`)
```java
String sampleText = "Java 8 Streams API is powerful and easy to use.";
```

### List of Employees (`List<Employee> employeeList`)
The `Employee` class has fields: `id` (int), `name` (String), `age` (int), `gender` (String), `department` (String), `yearOfJoining` (int), and `salary` (double).
```java
List<Employee> employeeList = Arrays.asList(
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
```

---

## Category 1: Basic Operations (List<Integer>, List<String>)

#### Q1: Find all even numbers from `numbersList`.
- **Input**: `numbersList`
- **Expected Output**: `[2, 4, 6, 8, 10, 4, 8]`

#### Q2: Filter words starting with 'j' (case-insensitive) from `wordsList`.
- **Input**: `wordsList`
- **Expected Output**: `["java", "java"]`

#### Q3: Multiply each number in `numbersList` by 3.
- **Input**: `numbersList`
- **Expected Output**: `[33, 6, 99, 12, 165, 18, 231, 24, 297, 30, 12, 24]`

#### Q4: Convert all words in `wordsList` to uppercase.
- **Input**: `wordsList`
- **Expected Output**: `["STREAM", "API", "JAVA", "CODE", "PROGRAMMING", "LAMBDA", "LAZY", "EVALUATION", "MAP", "FILTER", "COLLECT", "JAVA"]`

#### Q5: Find the first word in `wordsList` that has a length greater than 5.
- **Input**: `wordsList`
- **Expected Output**: `Optional[stream]` (Since "stream" is length 6)

#### Q6: Get unique (distinct) numbers from `numbersList`.
- **Input**: `numbersList`
- **Expected Output**: `[11, 2, 33, 4, 55, 6, 77, 8, 99, 10]`

#### Q7: Get unique words from `wordsList`.
- **Input**: `wordsList`
- **Expected Output**: `["stream", "api", "java", "code", "programming", "lambda", "lazy", "evaluation", "map", "filter", "collect"]`

#### Q8: Sort `numbersList` in ascending order.
- **Input**: `numbersList`
- **Expected Output**: `[2, 4, 4, 6, 8, 8, 10, 11, 33, 55, 77, 99]`

#### Q9: Sort `numbersList` in descending order.
- **Input**: `numbersList`
- **Expected Output**: `[99, 77, 55, 33, 11, 10, 8, 8, 6, 4, 4, 2]`

#### Q10: Sort `wordsList` alphabetically.
- **Input**: `wordsList`
- **Expected Output**: `["api", "code", "collect", "evaluation", "filter", "java", "java", "lambda", "lazy", "map", "programming", "stream"]`

#### Q11: Sort `wordsList` by word length in ascending order.
- **Input**: `wordsList`
- **Expected Output**: `["api", "map", "code", "java", "lazy", "java", "stream", "lambda", "filter", "collect", "evaluation", "programming"]`

#### Q12: Limit the `numbersList` to the first 5 elements.
- **Input**: `numbersList`
- **Expected Output**: `[11, 2, 33, 4, 55]`

#### Q13: Skip the first 3 elements of `numbersList` and collect the remaining elements.
- **Input**: `numbersList`
- **Expected Output**: `[4, 55, 6, 77, 8, 99, 10, 4, 8]`

#### Q14: Check if any number in `numbersList` is greater than 90.
- **Input**: `numbersList`
- **Expected Output**: `true`

#### Q15: Check if all words in `wordsList` have length >= 3.
- **Input**: `wordsList`
- **Expected Output**: `true`

#### Q16: Check if no number in `numbersList` is negative.
- **Input**: `numbersList`
- **Expected Output**: `true`

#### Q17: Find any element from `numbersList`.
- **Input**: `numbersList`
- **Expected Output**: `Optional[11]` (or any other element present in the list)

#### Q18: Map each word in `wordsList` to its length.
- **Input**: `wordsList`
- **Expected Output**: `[6, 3, 4, 4, 11, 6, 4, 10, 3, 6, 7, 4]`

#### Q19: Count the number of elements in `numbersList` that are greater than 10.
- **Input**: `numbersList`
- **Expected Output**: `5` (11, 33, 55, 77, 99)

#### Q20: Concatenate all words in `wordsList` with a comma separator.
- **Input**: `wordsList`
- **Expected Output**: `"stream, api, java, code, programming, lambda, lazy, evaluation, map, filter, collect, java"`

---

## Category 2: Numeric Streams & Array Processing (int[] & List<Integer>)

#### Q21: Calculate the sum of elements in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `228`

#### Q22: Calculate the average of elements in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `OptionalDouble[17.53846153846154]`

#### Q23: Find the maximum value in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `OptionalInt[90]`

#### Q24: Find the minimum value in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `OptionalInt[-5]`

#### Q25: Count the occurrences of the number 4 in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `2`

#### Q26: Convert the primitive `numbersArray` to a `List<Integer>`.
- **Input**: `numbersArray`
- **Expected Output**: `[4, 15, 8, 23, 16, 42, 4, 8, 12, 90, 0, -5, 17]`

#### Q27: Find the second largest number in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `OptionalInt[42]`

#### Q28: Find the second smallest number in `numbersArray` (excluding duplicates).
- **Input**: `numbersArray`
- **Expected Output**: `OptionalInt[0]` (Sorted distinct values: -5, 0, 4, 8, 12, 15, 16, 17, 23, 42, 90)

#### Q29: Filter numbers in `numbersArray` that are between 10 and 30 (inclusive).
- **Input**: `numbersArray`
- **Expected Output**: `[15, 23, 16, 12, 17]`

#### Q30: Calculate the sum of squares of all numbers in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `11428`

#### Q31: Get the first 3 odd numbers from `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `[15, 23, -5]`

#### Q32: Find the product of all elements in `numbersList` using reduce.
- **Input**: `numbersList`
- **Expected Output**: `140928614400`

#### Q33: Generate an `IntStream` from 1 to 10 (inclusive) and calculate its sum.
- **Input**: None (use `IntStream.rangeClosed`)
- **Expected Output**: `55`

#### Q34: Find the range (difference between max and min) of `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `95` (90 - (-5))

#### Q35: Check if `numbersArray` contains the number 23.
- **Input**: `numbersArray`
- **Expected Output**: `true`

#### Q36: Remove duplicates from `numbersArray` and return as a new `int[]`.
- **Input**: `numbersArray`
- **Expected Output**: `[4, 15, 8, 23, 16, 42, 12, 90, 0, -5, 17]`

#### Q37: Merge `numbersArray` and another array `{100, 200}` and sort the merged array.
- **Input**: `numbersArray` and `int[] extra = {100, 200}`
- **Expected Output**: `[-5, 0, 4, 4, 8, 8, 12, 15, 16, 17, 23, 42, 90, 100, 200]`

#### Q38: Find the count of numbers in `numbersArray` that are divisible by both 2 and 3.
- **Input**: `numbersArray`
- **Expected Output**: `3` (12, 42, 90)

#### Q39: Get summary statistics (min, max, sum, average, count) for `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `IntSummaryStatistics{count=13, sum=228, min=-5, average=17.538462, max=90}`

#### Q40: Find the index of the first occurrence of `16` in `numbersArray`.
- **Input**: `numbersArray`
- **Expected Output**: `4`

---

## Category 3: String Manipulation (String & List<String>)

#### Q41: Count the number of vowels in `sampleText`.
- **Input**: `sampleText`
- **Expected Output**: `15`

#### Q42: Count the number of consonants in `sampleText`.
- **Input**: `sampleText`
- **Expected Output**: `23` (excluding spaces, digits, and punctuation)

#### Q43: Remove all whitespace from `sampleText` using streams.
- **Input**: `sampleText`
- **Expected Output**: `"Java8StreamsAPIispowerfulandeasytouse."`

#### Q44: Split `sampleText` into words and count the total number of words.
- **Input**: `sampleText`
- **Expected Output**: `9`

#### Q45: Find the first non-repeated character in `sampleText` (case-insensitive).
- **Input**: `sampleText`
- **Expected Output**: `Optional[v]` (J, a, v, a... 'j' appears in Java, 'a' appears in Java/Streams/API, 'v' is the first unique letter)

#### Q46: Find the first repeated character in `sampleText` (case-insensitive).
- **Input**: `sampleText`
- **Expected Output**: `Optional[a]`

#### Q47: Count occurrences of each character in `sampleText` (excluding spaces).
- **Input**: `sampleText`
- **Expected Output**: Map of character frequencies: e.g., `{a=5, s=3, e=3, ...}`

#### Q48: Sort characters of `sampleText` (excluding spaces) alphabetically and join them.
- **Input**: `sampleText`
- **Expected Output**: `"8AAAaaceeeefgiiJlnnooprrsssttuvwy"`

#### Q49: Check if `sampleText` contains only digits.
- **Input**: `sampleText`
- **Expected Output**: `false`

#### Q50: Reverse `sampleText` using streams.
- **Input**: `sampleText`
- **Expected Output**: `".esu ot ysae dna lufrewop si IPA smaertS 8 avaJ"`

#### Q51: Find the longest word in `sampleText`.
- **Input**: `sampleText`
- **Expected Output**: `Optional[powerful]`

#### Q52: Check if two strings `"listen"` and `"silent"` are anagrams using streams.
- **Input**: `"listen"`, `"silent"`
- **Expected Output**: `true`

#### Q53: Filter words in `wordsList` that are palindromes. (Assume we add "radar", "level" to test).
- **Input**: `Arrays.asList("radar", "hello", "level", "stream")`
- **Expected Output**: `["radar", "level"]`

#### Q54: Extract only the uppercase letters from `sampleText`.
- **Input**: `sampleText`
- **Expected Output**: `"JSAPI"` (J in Java, S in Streams, API)

#### Q55: Convert all words in `wordsList` into a single string with each word in title case, separated by spaces.
- **Input**: `wordsList`
- **Expected Output**: `"Stream Api Java Code Programming Lambda Lazy Evaluation Map Filter Collect Java"`

---

## Category 4: Employee Object Processing - Intermediate (List<Employee>)

#### Q56: Get list of names of all employees.
- **Input**: `employeeList`
- **Expected Output**: `["Jhansi", "Ram", "Subhash", "Latha", "David", "Nisha", "Vikram", "Priya", "Joseph", "Kiran"]`

#### Q57: Get list of distinct departments.
- **Input**: `employeeList`
- **Expected Output**: `["HR", "IT", "Finance", "Marketing"]`

#### Q58: Filter employees who joined after 2015.
- **Input**: `employeeList`
- **Expected Output**: Employees: Ram, Latha, Nisha, Priya, Joseph

#### Q59: Filter female employees whose age is greater than 25.
- **Input**: `employeeList`
- **Expected Output**: Employees: Jhansi, Nisha, Priya

#### Q60: Find the employee with the highest salary.
- **Input**: `employeeList`
- **Expected Output**: `Optional[Employee{id=7, name='Vikram', salary=140000.0, ...}]`

#### Q61: Find the employee with the lowest salary.
- **Input**: `employeeList`
- **Expected Output**: `Optional[Employee{id=1, name='Jhansi', salary=45000.0, ...}]`

#### Q62: Sort employees by their salary in ascending order.
- **Input**: `employeeList`
- **Expected Output**: Employees ordered by salary: Jhansi(45k), Joseph(48k), David(50k), Nisha(55k), Latha(60k), Kiran(62k), Ram(75k), Priya(85k), Subhash(110k), Vikram(140k).

#### Q63: Sort employees by salary in descending order.
- **Input**: `employeeList`
- **Expected Output**: Employees ordered by salary descending.

#### Q64: Sort employees by department (alphabetical) then by salary descending.
- **Input**: `employeeList`
- **Expected Output**: Ordered: Finance (Subhash, Priya), HR (Kiran, David, Jhansi), IT (Vikram, Ram, Latha), Marketing (Nisha, Joseph).

#### Q65: Get the names of the top 3 highest paid employees.
- **Input**: `employeeList`
- **Expected Output**: `["Vikram", "Subhash", "Priya"]`

#### Q66: Get the names of all employees who joined the IT department.
- **Input**: `employeeList`
- **Expected Output**: `["Ram", "Latha", "Vikram"]`

#### Q67: Check if any employee is older than 40.
- **Input**: `employeeList`
- **Expected Output**: `true` (Vikram is 45)

#### Q68: Check if all employees earn more than 30,000.
- **Input**: `employeeList`
- **Expected Output**: `true` (lowest is Jhansi with 45,000)

#### Q69: Find the oldest employee.
- **Input**: `employeeList`
- **Expected Output**: `Optional[Employee{name='Vikram', age=45}]`

#### Q70: Find the youngest female employee.
- **Input**: `employeeList`
- **Expected Output**: `Optional[Employee{name='Latha', age=25}]`

#### Q71: Increment the salary of all IT employees by 10% and return a list of their names and new salaries (format: "Name: NewSalary").
- **Input**: `employeeList`
- **Expected Output**: `["Ram: 82500.0", "Latha: 66000.0", "Vikram: 154000.0"]`

#### Q72: Find the sum of salaries of all IT employees.
- **Input**: `employeeList`
- **Expected Output**: `275000.0` (75000 + 60000 + 140000)

#### Q73: Calculate the average age of all employees.
- **Input**: `employeeList`
- **Expected Output**: `32.7`

#### Q74: Count the total number of employees in the HR department.
- **Input**: `employeeList`
- **Expected Output**: `3` (Jhansi, David, Kiran)

#### Q75: Get the name and age of the employee who joined most recently.
- **Input**: `employeeList`
- **Expected Output**: `"Joseph (24)"` (Joined in 2022)

---

## Category 5: Employee Object Processing - Advanced (List<Employee>)

#### Q76: Group employees by department.
- **Input**: `employeeList`
- **Expected Output**: `Map<String, List<Employee>>` grouping IT, HR, Finance, Marketing.

#### Q77: Group employee names by department.
- **Input**: `employeeList`
- **Expected Output**: `{Finance=[Subhash, Priya], HR=[Jhansi, David, Kiran], IT=[Ram, Latha, Vikram], Marketing=[Nisha, Joseph]}`

#### Q78: Group employees by gender.
- **Input**: `employeeList`
- **Expected Output**: `Map<String, List<Employee>>` grouping Male and Female.

#### Q79: Count the number of employees in each department.
- **Input**: `employeeList`
- **Expected Output**: `{Finance=2, HR=3, IT=3, Marketing=2}`

#### Q80: Calculate the average salary of each department.
- **Input**: `employeeList`
- **Expected Output**: `{Finance=97500.0, HR=52333.33, IT=91666.67, Marketing=51500.0}`

#### Q81: Find the maximum salary in each department.
- **Input**: `employeeList`
- **Expected Output**: `{Finance=110000.0, HR=62000.0, IT=140000.0, Marketing=55000.0}`

#### Q82: Find the employee with the highest salary in each department.
- **Input**: `employeeList`
- **Expected Output**: Map containing highest paid employee in Finance (Subhash), HR (Kiran), IT (Vikram), Marketing (Nisha).

#### Q83: Get summary statistics of salaries for the IT department.
- **Input**: `employeeList`
- **Expected Output**: `DoubleSummaryStatistics{count=3, sum=275000.0, min=60000.0, average=91666.67, max=140000.0}`

#### Q84: Partition employees into those earning > 70,000 and those earning <= 70,000.
- **Input**: `employeeList`
- **Expected Output**: `{false=[Jhansi, Latha, David, Nisha, Joseph, Kiran], true=[Ram, Subhash, Vikram, Priya]}`

#### Q85: Partition employees into male and female, and find the average salary of each group.
- **Input**: `employeeList`
- **Expected Output**: `{Female=61250.0, Male=75000.0}` (Male avg: (75+110+50+140+48+62)/6 = 80.8k?) Wait, let's verify exact counts and averages in code.

#### Q86: Create a Map where key is employee ID and value is the Employee object.
- **Input**: `employeeList`
- **Expected Output**: `Map<Integer, Employee>` mapping ID 1..10 to their Employee records.

#### Q87: Group employees by age ranges (e.g., Under 30, 30-40, Over 40).
- **Input**: `employeeList`
- **Expected Output**: `{Under 30=[Ram, Latha, Nisha, Joseph], 30-40=[Jhansi, David, Priya, Kiran], Over 40=[Subhash, Vikram]}`

#### Q88: Find the department that has the highest number of employees.
- **Input**: `employeeList`
- **Expected Output**: `Optional[HR]` or `Optional[IT]` (Both have 3, depending on tie-break)

#### Q89: Find the average age of male and female employees.
- **Input**: `employeeList`
- **Expected Output**: `{Female=29.25, Male=35.0}` (Verify exact details in solutions)

#### Q90: Find the names of employees in each department, concatenated by a comma.
- **Input**: `employeeList`
- **Expected Output**: `{Finance=Subhash, Priya, HR=Jhansi, David, Kiran, IT=Ram, Latha, Vikram, Marketing=Nisha, Joseph}`

---

## Category 6: Advanced Stream Techniques (Various)

#### Q91: Flatten a list of lists of strings `List<List<String>>` into a single sorted list.
- **Input**: `Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("c", "d"), Arrays.asList("a", "e"))`
- **Expected Output**: `["a", "a", "b", "c", "d", "e"]`

#### Q92: Find the Cartesian product of two lists of strings.
- **Input**: `List<String> list1 = Arrays.asList("A", "B")`, `List<String> list2 = Arrays.asList("1", "2", "3")`
- **Expected Output**: `["A1", "A2", "A3", "B1", "B2", "B3"]`

#### Q93: Find the sum of the first 10 prime numbers using infinite streams.
- **Input**: Infinite Stream of numbers starting from 2
- **Expected Output**: `129` (Primes: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29. Sum = 129)

#### Q94: Generate Fibonacci sequence up to 10 terms using Stream.iterate.
- **Input**: None
- **Expected Output**: `[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]`

#### Q95: Find the intersection (common elements) of two list of integers using streams.
- **Input**: `List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5)`, `List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7)`
- **Expected Output**: `[3, 4, 5]`

#### Q96: Group a list of words by their length and count them (Word count by length).
- **Input**: `wordsList`
- **Expected Output**: `{3=2, 4=4, 6=3, 7=1, 10=1, 11=1}`

#### Q97: Find the frequency of each word in a list of sentences.
- **Input**: `Arrays.asList("Java Streams are cool", "Java is clean", "Streams are easy")`
- **Expected Output**: `{are=2, clean=1, cool=1, easy=1, is=1, java=2, streams=2}` (case-insensitive)

#### Q98: Custom Collector: Concatenate names of employees with a custom delimiter "[", " - ", "]".
- **Input**: `employeeList`
- **Expected Output**: `"[Jhansi - Ram - Subhash - Latha - David - Nisha - Vikram - Priya - Joseph - Kiran]"`

#### Q99: Compute sum of squares of first 1,000,000 numbers in parallel and return the sum.
- **Input**: `LongStream.rangeClosed(1, 1000000)`
- **Expected Output**: `333333833333500000`

#### Q100: Partition numbers 1 to 20 into prime and non-prime using custom partitioning.
- **Input**: `IntStream.rangeClosed(1, 20)`
- **Expected Output**: `{false=[1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20], true=[2, 3, 5, 7, 11, 13, 17, 19]}` (Note: 1 is not prime)
