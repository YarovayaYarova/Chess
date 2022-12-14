import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;

public class PlayerTest {

    private static ArrayList<Player> players;
    private static HashMap<String, Piece> pieceHashMap;

    @BeforeAll
    public static void setUp() {
        ChessMain main = new ChessMain();
        players = main.createPlayers();
        pieceHashMap = new HashMap<>();
    }
    @BeforeEach
    public void beforeEach (){
        System.out.println("Running before each");
    }
    @AfterEach
    public void afterEach (){
        System.out.println("Running after each");
    }

    @AfterAll
    public static void tearDown (){
        System.out.println("Running after all");
    }

    @Test
    public void validMoveTest (){
        players.get(0).movePiece(pieceHashMap.get("white_king"), new Spot("h", 8) );

        Assertions.assertEquals(8, pieceHashMap.get("white_king").getSpot().getY() );
    }
    @Test
    public void test (){

    }

}
