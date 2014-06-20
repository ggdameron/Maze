import java.util.Random;

public class Maze {

	char maze[][];
	
	int end;
	
	int start;

	public Maze(char pm [] [], int prestart, int preend){
	
		maze = pm;
		
		end = preend;
		
		start = prestart;
	
	
	}
	
	public Maze(){ //Generate random maze
		
		Random rand = new Random();
		
		int length = rand.nextInt(7)+6;
		int width = rand.nextInt(7)+6;
		
		maze = new char[length ] [width];
		
		
		
		for(int x = 0; x < length; x++){ // steps through end and first columns and initializes them
			maze[x][0] = '#';
			maze[x][width-1] = '#';
		}
		
		for(int x = 0; x < width; x++){ // steps through end and first rows and initializes them
			maze[0][x] = '#';
			maze[length-1][x] = '#';
		}
		
		start = rand.nextInt(length -2)+1; //sets start 
		
		maze[start][0] = '.';
		
		end = rand.nextInt(length -2)+1; //sets end
		
		maze[end][width -1] = '.';
		
		
		for(int x = 1; x < length-1; x++){		//fills maze
			for(int y  = 1; y < width-1; y ++){
				
				if(rand.nextInt(3) == 0){
					maze[x][y] = '#';
				}
				else
					maze[x][y] = '.';
			}
		}

	
		
		
		
		
	}
		
	public void changevalue(int y, int x, char c){
		
		maze[y][x] = c;
		
	
	
	}
	
	public char getValue(int y, int x){
		
		return maze[y][x];
		
		
	}
	
	public  int getStart(){
		return start;
	}
	
	public int getEnd(){
		

		
		return end;
	}
	
	public int getLength(){
		
		int length = maze.length;
		
		return length;
	}
	
	public int getWidth(){
		
		int width = maze[0].length;
		
		return width;
		
	}
	
	public void print(){
		
		for(int x = 0; x < maze.length; x++){
			for(int y = 0; y < maze[0].length; y++){
				System.out.print(maze[x][y]);
				
			}
			System.out.print("\n");
		}
		
	}
	
	
	
	
	
}
