//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  //1. Develop a program that takes the weight (in kilograms) and height (in meters)
  // as input and calculates the BMI, then prints it.
  // • Input: Weight (kg) = 70, Height (m) = 1.75
  //• Expected Output: BMI = 22.86
 Scanner sc= new Scanner (System.in);
 System.out.println("Please enter your weight (in kilograms):");
   double weight= sc.nextDouble();
 System.out.println("Please enter your height (in meters):");
   double height= sc.nextDouble();

    double BMI= weight/(height*height);
   System.out.println("BMI = "+BMI);


  //2.  Write a program that takes the obtained marks and total marks as input and
  //  calculates the percentage, then prints it.
  //• Input: Obtained Marks = 85, Total Marks = 100
  //• Expected Output: Percentage = 85.0%

   System.out.println("Please enter the obtained mark:");
   double obtainedMark= sc.nextDouble();
   System.out.println("Enter the total mark:");
   double totalMark= sc.nextDouble();
   double percentage= (obtainedMark/totalMark)*100;

    System.out.println("Percentage = "+percentage +"%");

  //3. Create a program that takes an amount in one currency and an exchange rate
  //as input, then converts and prints the amount in another currency.
  //• Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
  //• Expected Output: Amount in EUR = 85.0
   System.out.println("Enter amount to convert: ");
   double amount = sc.nextDouble();
   System.out.println("Enter the exchange rate: ");
   double exchRate = sc.nextDouble();
    double convertedAmount= amount*exchRate;
    System.out.println("Amount in EUR = "+ convertedAmount);

  //4. Create a program that takes a string as input, calculates its length, and then
  //reverses the string using the StringBuilder class, finally printing both the length and
  //reversed string.
  //• Input: "Hello, World!"
  //• Expected Output: Length of the string: 13 And Reversed string: "!dlroW
  //,olleH"

    System.out.println("Write the statment: ");
    String statment= sc.nextLine();
    int lenStatment= statment.length();

    StringBuilder sb= new StringBuilder(statment);
    String reversedStatment= sb.reverse().toString();
    System.out.println("Length of the string: "+lenStatment+" And Reversed string: "+reversedStatment );



    //5. Develop a program that takes a sentence as input and extracts a substring from
    //it, then prints the extracted substring.
    //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
    //= 10, End Index = 20
    //• Expected Output: "brown fox"

    System.out.println("Write a sentence: ");
    String sentence= sc.nextLine();
    System.out.println("Enter the start index: ");
    int startIdx= sc.nextInt();
    System.out.println("Enter the end index: ");
    int endIdx= sc.nextInt();

    System.out.println(sentence.substring(startIdx,endIdx));


    //6. Write a program that takes a sentence and a keyword as input, then check if
    //the keyword is present in the sentence and prints the result.
    //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
    //"jumps"
    //• Expected Output: Keyword "jumps" is present in the sentence.

    System.out.println("Please write a sentence: ");
    String sentence2= sc.nextLine();
    System.out.println("Please write a keyword: ");
    String keyword= sc.next();

     //  للتنويه:أستاذة طلبتينا ما نستخدم عبارة if فحسيت مو منطقي أكتب نفس ال output المطلوب في السؤال إذا كانت ترجع false
    // boolean isPresent = sentence2.contains(keyword);
    //System.out.println("Keyword \""+ keyword +"\"is present in the sentence. ");
    System.out.println(sentence2.contains(keyword));

    //7. Develop a program that takes a sentence and a word to replace as input, then
    //replace all occurrences of the word with another word and prints the modified
    //sentence.
    //• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
    //Replace = "fox", Replacement Word = "cat"
    //• Expected Output: "The quick brown cat jumps over the lazy dog"

    System.out.println("Enter a statment: ");
    String statment2= sc.nextLine();

    System.out.println("Enter the word to replace: ");
    String oldWord=sc.next();

    System.out.println("Enter the replacment word: ");
    String newWord=sc.next();

    System.out.println(statment2.replace(oldWord,newWord));




    //8. Write a program that takes two strings as input and check if they are equal,
    //ignoring the case, then prints whether they are equal or not.
    //• Input: String 1 = "Hello", String 2 = "hello"
    //• Expected Output: Strings are equal (ignoring case).

    System.out.println("Enter first word: ");
    String str1= sc.next();
    System.out.println("Enter second word: ");
    String str2= sc.next();

    System.out.println(str1.equalsIgnoreCase(str2));


}

