class NegativeProcessor extends Processor  
{  
    public NegativeProcessor(Processor processor){ 
        super(processor); 
        System.out.println("I am called  as a constructor of negative value!!!");  
    } 
  
    public void process(Number request)  
    {  
        if (request.getNumber() < 0)  
        {  
            System.out.println("NegativeProcessor : " + request.getNumber());  
        }  
        else
        {  
     
        	System.out.println("As the value is not negative I am called"); // STEP5
            super.process(request);  
        }  
    }  
}  