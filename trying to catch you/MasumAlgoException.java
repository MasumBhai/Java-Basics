
public class MasumAlgoException extends Throwable {

	public MasumAlgoException(String message) {
		super(message);
	}
//we can also do that without creating constructor here , cause MasumAlgoExcedption is a class & we can do whatever we want
//	public String getMessage()
//	{
//		String error =  "you fool,error occured and you know that";
//		return error;
//	}
}
