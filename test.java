 class exception_handling 
    {
        public static void main(String args[]) 
        {
            try {
             System.out.print("Starting up ");
             throw new Exception();
         } catch (Exception e) {
             System.out.print("Problem ");
             System.exit(0);
         } finally {
             System.out.print("Shutting down ");
         }
        }
    }