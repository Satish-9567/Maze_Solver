import java.util.List;

public class DepthFirst {
    public static boolean Search_Path(int [][]maze, int x, int y, List<Integer> path){
        if(maze[x][y]==9){
            path.add(x);
            path.add(y);
            return true;
        }
        if(maze[x][y]==0){
            maze[x][y]=2;
            int dx=-1;
            int dy=0;
            if(Search_Path(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=1;
            dy=0;
            if(Search_Path(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=-1;
            if(Search_Path(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
            dx=0;
            dy=1;
            if(Search_Path(maze,x+dx,y+dy,path)){
                path.add(x);
                path.add(y);
                return true;
            }
        }
        return false;
    }
}
