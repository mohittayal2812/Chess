package Chess;

public class Bishop extends Piece{
	
	 public Bishop(boolean white) 
	    { 
	        super(white); 
	    } 
	  
	    @Override
	    public boolean canMove(Board board, Spot start,  
	                                            Spot end) 
	    { 
	        if (end.getPiece().isWhite() == this.isWhite()) { 
	            return false; 
	        } 
	  
	        int x = Math.abs(start.getX() - end.getX()); 
	        int y = Math.abs(start.getY() - end.getY()); 
	        return x == y; 
	    } 
	    
	    @Override
	    public String toString() {
	    	if(this.isWhite()) {
				return "wB";
			}
			else {
				return "bB";
			}
	    }


}
