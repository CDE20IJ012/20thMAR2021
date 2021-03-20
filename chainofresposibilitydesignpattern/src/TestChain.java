class TestChain  
{  
    public static void main(String[] args) {  
        Chain chain = new Chain(); //------- STEP1
          
        //Calling chain of responsibility  
        chain.process(new Number(0));   // STEP4 
       // chain.process(new Number(-50));  
       // chain.process(new Number(0));  
       // chain.process(new Number(91));  
    }  
}  