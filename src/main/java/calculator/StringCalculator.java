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

  
    
}
