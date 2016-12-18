package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.Main;

public class InputHandler implements KeyListener{
	public InputHandler(Main main) {
		main.addKeyListener(this);
	}

	public class Key {
		private int numTimesPressed = 0;
		private boolean pressed = false;

		public boolean isPressed() {
			return pressed;
		}

		public void toggle(boolean isPressed) {
			pressed = isPressed;
			if (pressed) {
				numTimesPressed++;
			}
		}

		public int getNumTimesPressed() {
			return numTimesPressed;
		}

	}

	public Key up = new Key();
	public Key down = new Key();
	public Key left = new Key();
	public Key right = new Key();

	public void keyPressed(KeyEvent e) {
		toggleKey(e.getKeyCode(), true);
	}

	public void keyReleased(KeyEvent e) {
		toggleKey(e.getKeyCode(), false);
	}

	public void keyTyped(KeyEvent arg0) {

	}

	public void toggleKey(int keyCode, boolean isPressed) {
		// TODO maybe arrow keys too KeyEvent.VK_UP
		if (keyCode == KeyEvent.VK_W) {
			up.toggle(isPressed);
		}
		if (keyCode == KeyEvent.VK_S) {
			down.toggle(isPressed);
		}
		if (keyCode == KeyEvent.VK_A) {
			left.toggle(isPressed);
		}
		if (keyCode == KeyEvent.VK_D) {
			right.toggle(isPressed);
		}
	}
}
