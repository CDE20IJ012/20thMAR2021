class PositiveProcessor extends Processor  
{  
  
    public PositiveProcessor(Processor processor){ 
        super(processor); 
        System.out.println("I am called  as a constructor of positive value!!!");
    } 
  
    public void process(Number request)  
    {  
        if (request.getNumber() > 0)  
        {  
        	System.out.println("I am called at last as the value is positive");
            System.out.println("PositiveProcessor : " + request.getNumber());  
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}  