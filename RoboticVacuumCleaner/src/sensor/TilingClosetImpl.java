package sensor;

public class TilingClosetImpl implements Tiling{
	private int fromX;
	private int toX;
	private int fromY;
	private int toY;
	public TilingClosetImpl(int tX, int fX, int tY, int fY){
		toX = tX;
		fromX = fX;;
		fromY = fY;
		toY = tY;
	}
	public int getFromX() {
		return fromX; 
	}

	public int getToX() {
		return toX;
	}
	public String getType() {
		return "closet";
	}
	public int getFromY() {
		return fromY;
	}
	public int getToY() {
		return toY;
	}
	public Obstacle getDoors() {
		// TODO Auto-generated method stub
		return null;
	}
}