
public class User_defined_Exception{

    public static void main(String[] args) {

        int i,j;
        i = 8;
        j = 9;
        try{
            int k = i/j;
            if(k==0)
                throw new MasumAlgoException("code red,code red");
            System.out.println("output of data is : " + k);
        }catch (MasumAlgoException e)//e stands for error
        {
           // System.out.println("Error occurred : "+ e); //it will print Error occurred : com.PractiseWithYouTube.MasumAlgoException
                                                        //that means,it will print project name . our exception    but we want to print message here,let's see
            System.out.println(e.getMessage());


        }
    }
}
