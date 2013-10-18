package Serie_2;

public class Diamon {

	private char[][] field;
	private int dimension;

	public static void main(String[] args) {
		new Diamon(9);
	}

	public Diamon(int dim) {
		this.dimension = dim;
		initializeField();
		drawDiamon();
		printField();
	}

	private void initializeField() {
		this.field = new char[dimension][dimension];
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				field[i][j] = ' ';
			}
		}
	}

	private void printField() {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if (j + 1 == field[i].length) {
					System.out.print(field[i][j]);
				} else {
					System.out.print(field[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}

	private void drawDiamon() {
		int mi = (field.length - 1)/2;
		for (int i = 0; i < mi; i++) {
				field[i] [mi - i] = '*';
				field[i] [mi + i] = '*';
		}
		for (int i = 0; i < field.length; i++){
			field[mi] [i] = '*';
		}
		for (int i = mi + 1; i < field.length; i++){
			field[i] [i - mi] = '*';
			field[i] [field.length - 1 - (i - mi)] = '*';
		}
	}
}
