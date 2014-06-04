
public class ReduceFilePath {
	public String reducePath(String path){
		String [] parts = path.split("/");
		String result = "";
		for (int i = 0; i < parts.length-1; i++) {
			if( !parts[i].equals("..") && !parts[i+1].equals("..")
					&& !parts[i].equals(".") && !parts[i].equals("")){
				result = result + "/" + parts[i];
			}
		}
		return result;
	}

	public static void main( String [] args){
		ReduceFilePath s = new ReduceFilePath();
		s.reducePath("/home//radorado/code/./hackbulgaria/week0/../");
	}
}


