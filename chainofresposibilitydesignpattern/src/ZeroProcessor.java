class ZeroProcessor extends Processor  
{  
    public ZeroProcessor(Processor processor){ 
        super(processor); 
        System.out.println("I am called  as a constructor of zero  value!!!");
    } 
  
    public void process(Number request)  
    {  
        if (request.getNumber() == 0)  
        {  
            System.out.println("ZeroProcessor : " + request.getNumber());  
        }  
        else
        {  
        	System.out.println("As the value is not zero I am called");
            super.process(request);  
        }  
    }  
}  