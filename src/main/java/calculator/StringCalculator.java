package calculator;

class StringCalculator {

    public int add(String input) {
        
        String [] numbers = input.split(",|\n");
        
        if(input.isEmpty()){
         reurn 0;               
        } else if(numbers.length > 1){
         return getSum(numbers);   
        }else
         return stringToInt(input);   
        }
    }

private int getSum(String[] numbers){
    int sum = 0;
    for(String currentNumber:numbers){
        if (stringToInt(currentNumber) > 1000){
            continue;
        }
    sum += stringToInt(currentNumber);
}
    return sum;
}

private int stringToInt(String number){
    int num = Integer.parseInt(number);
    if(num < 0){
     throw new IllegalArgumentException("negatives not allowed");   
    } else {
        return num;
    }
}
}


