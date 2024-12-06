package org.technogies.chess.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {
    private ChessBoard chessBoard;

    @BeforeEach
    public void beforeEach(){
        chessBoard = new ChessBoard(8, 8);
    }

    @Test
    public void testTotalBlocks(){
        assertEquals(64, chessBoard.totalBlocks());
    }

    @Test
    public void testEmptyChessBoard(){
        assertTrue(chessBoard.isEmpty());
    }

    @Test
    public void testPlacePeice(){

    }
}