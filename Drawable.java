import java.awt.Graphics;

public interface Drawable {
	public default void draw(Graphics g) {
		// This is ultimately overridden by the type of shape's respective draw method
	}
}
