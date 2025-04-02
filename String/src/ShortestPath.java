
public class ShortestPath {
	public static float getShortestPath(String path) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < path.length(); i++) {
			char dir = path.charAt(i);
			// South
			if (dir == 'S')
				y--;
			else if (dir == 'N')
				y++;
			else if (dir == 'W')
				x--;
			else
				x++;
		}
		int X = x * x;
		int Y = y * y;

		return (float) Math.sqrt(X + Y);

	}

	public static void main(String[] args) {
		String str = "WNEENESENNN";
		System.out.println(getShortestPath(str));

	}

}
