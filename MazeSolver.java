
public class MazeSolver {

	Maze m1;
	
	int steps;
	
	public MazeSolver(){
		
	m1 = new Maze();
		
	}
	
	public MazeSolver(char [] [] maze, int start, int end){
		
		m1 = new Maze(maze, start, end);
		
	}
	

	
	public void solve(){
		
		int st = m1.getStart();
		
		m1.print();
		
		if(solvereq(st, 0) == true)
		{
		
			System.out.println("\nSolved");
			
			System.out.println("Your Maze\n");
			m1.print();
			
			System.out.printf("Path took %d steps.\n\n", steps);
			
		}
		else
		{
			System.out.println("Not Solved\n");
		
			m1.print();
		}
	
		
		
		
	}
	
	
	public boolean solvereq(int y, int x){
		
		if(x<0 || y<0)
		{
			return false;
		}
		if(m1.getValue(y, x) != '.'){
			return false;
			
		}
		
		m1.changevalue(y, x, 'x');
		
		steps ++;
		
		
		if(x == m1.getWidth()-1 && y == m1.getEnd()){
				return true;}
	
		
		
		if( solvereq(y, x +1) ){
				
			return true;
		}
		
		if(solvereq(y, x-1) ){
			return true;
		}
		if( solvereq(y+1,x)){
			return true;
		}
		if(solvereq(y -1, x)){
			return true;
		}
		
		steps--;
		m1.changevalue(y, x, '.');
		return false;
			
	
	}
}
