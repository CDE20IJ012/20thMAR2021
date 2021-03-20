public class Chain 
{ 
Processor chain; 
  
public Chain(){ 
    buildChain();   // STEP2
    System.out.println("The constructor which is calling buildChain"); // STEP3  
} 
  
private void buildChain(){ 
    chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));  //STEP2 Continues
           //   STEP2C                      STEP2B                 STEP2A

} 
  
public void process(Number request) { 
    chain.process(request); 
} 
  
} 