import java.util.Stack;


public class ExpressionWithBrackets {
	public boolean isExpressionCorrect(String expression){
		Stack<Character> openingBrackets = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++){
			char c = expression.charAt(i);
			if( c == ')' && openingBrackets.isEmpty()){
				return false;
			}
			if( c == '('){
				openingBrackets.add(c);
			}
			if( c == ')'){
				if(openingBrackets.isEmpty()){
					return false;
				}
				else{
					openingBrackets.pop();
				}
			}
		}
		if(openingBrackets.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}
}
