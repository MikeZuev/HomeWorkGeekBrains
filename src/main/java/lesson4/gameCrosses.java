package lesson4;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class gameCrosses {

    private static final char DOT_EMPTY = '*';
    private static final char DOT_PLAYER = 'X';
    private static final char DOT_COMPUTER = '0';

    private static int lastRowTurn = 0;
    private static int lastColumnTurn = 0;

    private static int moveCounter = 0;
    private static int winningSum;


    private static int SIZE = 1000;

    private static final String HEADER_FIRST_SYMBOL = "#";
    public static final String SPACE_FIELD = " ";
    private static char[][] gameField = new char[SIZE][SIZE];


    private static Random random = new Random();
    private static Scanner in = new Scanner(System.in);


    public static void turnGame() {
        do {
            System.out.println("\n\nThe start of the Game!");
            init();
            initMap();
            printGameField();
            playGame();
        } while (true);
    }

    private static void init() {
        moveCounter = 0;

        System.out.println("Choose the size of the field\n");

        System.out.println("Enter the size of the field: ");
        int a = in.nextInt();

        chooseSizeField(a);
        initMap();
    }

    private static int chooseSizeField(int a) {
        SIZE = a;
        return SIZE;
    }

    private static void printGameField() {
        printGameFieldHeader();
        printGameFieldBody();

    }

    private static void printGameFieldHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_FIELD);
        for (int i = 0; i < SIZE; i++) {
            printGameFieldNumbers(i);
        }
        System.out.println();
    }

    private static void printGameFieldBody() {
        for (int i = 0; i < SIZE; i++) {
            printGameFieldNumbers(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(gameField[i][j] + SPACE_FIELD);
            }
            System.out.println();

        }
    }

    private static void printGameFieldNumbers(int i) {
        System.out.print(i + 1 + SPACE_FIELD);
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                gameField[i][j] = DOT_EMPTY;
            }

        }
    }

    private static void playGame() {
        while (true) {
            playerTurn();
            printGameField();
            if (endCheck(DOT_PLAYER)) {
                break;
            }

            computerTurn();
            printGameField();
            if (endCheck(DOT_COMPUTER)) {
                break;
            }


        }
    }

    private static void playerTurn() {
        System.out.println("Player's move");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.println("Enter the coordinate of row: ");
            rowNumber = in.nextInt() - 1;
            System.out.println("Enter the coordinate of column: ");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)) break;
            System.out.printf("The cell with coordinate: %d:%d is occupied%n%n", rowNumber + 1, columnNumber + 1);


        }

        gameField[rowNumber][columnNumber] = DOT_PLAYER;
        moveCounter++;

        lastMoveCoordinate(rowNumber, columnNumber);


    }

    private static void computerTurn() {
        System.out.println("Computer's move");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);


        } while (!isCellFree(rowNumber, columnNumber));


        gameField[rowNumber][columnNumber] = DOT_COMPUTER;
        moveCounter++;

        lastMoveCoordinate(rowNumber, columnNumber);


    }

    private static boolean endCheck(char symbol) {

        if (checkWin(symbol)) {
            if (symbol == DOT_PLAYER) {
                System.out.println("You won!!!");
                return true;
            } else {
                System.out.println("Rise of Machines is coming. Computer won again!");
            }

        }
        if (checkDraw()) {
            System.out.println("Draw!");
        }


        return false;

    }

    private static boolean checkDraw() {
        return moveCounter >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {
        if (checkRowWin(symbol) == true) {
            return true;
        } else if (checkColumnWin(symbol) == true) {
            return true;

        } else if (checkRightDiagonalWin(symbol) == true) {
            return true;
        }
        return false;


    }

    private static boolean checkColumnWin(char Symbol) {
        winningSum = 0;
        int i;

        for (i = lastRowTurn; i < SIZE; i++) {
            if (gameField[i][lastColumnTurn] == Symbol) {
                winningSum += 1;
            } else if (gameField[i][lastColumnTurn] == DOT_EMPTY) {
                break;
            }
        }
        if (winningSumChecker(SIZE) == true) {
            return true;
        }
        ;

        winningSum = 0;

        for (int j = i; j >= 0; j--) {
            if (gameField[j][lastColumnTurn] == Symbol) {
                winningSum += 1;
            }
        }
        if (winningSumChecker(SIZE) == true) {
            return true;
        }
        return false;

    }

    private static boolean checkRowWin(char symbol) {
        winningSum = 0;
        int i;


        for (i = lastColumnTurn; i < SIZE; i++) {
            if (gameField[lastRowTurn][i] == symbol) {
                winningSum += 1;

            } else if (gameField[lastRowTurn][i] == DOT_EMPTY) {
                break;
            }
        }
        if (winningSumChecker(SIZE) == true) {
            return true;
        }
        ;
        winningSum = 0;

        for (int j = i; j >= 0; j--) {
            if (gameField[lastRowTurn][j] == symbol) {
                winningSum += 1;
            }
        }
        if (winningSumChecker(SIZE) == true) {
            return true;
        }

        return false;
    }

    public static boolean checkRightDiagonalWin(char symbol) {
        if (lastRowTurn >= 2 || lastColumnTurn >= 2) {
            winningSum = 0;
            if (lastRowTurn == 0) {
                int i;
                int j = lastColumnTurn;
                for (i = lastRowTurn; i < SIZE; i++) {
                    if (gameField[i][j] == symbol) {
                        if(j == 0){
                            break;
                        }else{
                            j--;
                        }
                        winningSum += 1;

                    } else if (gameField[i][j] == DOT_EMPTY) {
                        break;
                    }
                }
                if (winningSumChecker(SIZE) == true) {
                    return true;
                }
            }
            winningSum = 0;
            if (lastColumnTurn == 0) {
                int i;
                int j = lastColumnTurn;
                for (i = lastRowTurn; i >= 0; i--) {
                    if (gameField[i][j] == symbol) {
                        winningSum += 1;
                        j++;
                    } else if (gameField[i][j] == DOT_EMPTY) {
                        break;
                    }

                }
                if (winningSumChecker(SIZE) == true) {
                    return true;
                }
            }

            winningSum = 0;


            int i;
            int j = lastColumnTurn;


            for (i = lastRowTurn; i < SIZE; i++) {

                if (gameField[i][j] == symbol) {
                    if(j == 0){
                        break;
                    }else{
                        j--;
                    }
                    winningSum +=1;

                } else if (gameField[i][j] == DOT_EMPTY) {
                    break;
                }
            }

            if (winningSumChecker(SIZE) == true) {
                return true;
            }

            winningSum = 0;
            int k = lastColumnTurn;
            for (i = lastRowTurn; i >= 0; i--) {
                if (gameField[i][k] == symbol) {
                    winningSum += 1;
                    k++;
                } else if (gameField[i][k] == DOT_EMPTY) {
                    break;
                }
            }
            if (winningSumChecker(SIZE) == true) {
                return true;
            }

        }

        return false;

    }

        private static boolean winningSumChecker ( int SIZE){
            if (SIZE >= 3 && SIZE <= 6 && winningSum == 3) {
                return true;
            } else if (SIZE >= 7 && SIZE <= 10 && winningSum == 4) {
                return true;
            } else if (SIZE > 10 && winningSum == 5) {
                return true;
            }
            return false;

        }

        private static void lastMoveCoordinate ( int rowNumber, int columnNumber){
            if (moveCounter >= 3) {
                lastRowTurn = rowNumber;
                lastColumnTurn = columnNumber;
                System.out.println(lastRowTurn + " last row coordinate is here");
                System.out.println(lastColumnTurn + " last column coordinate is here");


            }
        }


        private static boolean isCellFree ( int rowNumber, int columnNumber){
            if (gameField[rowNumber][columnNumber] == DOT_EMPTY) {
                return true;
            }
            return false;
        }


    }

