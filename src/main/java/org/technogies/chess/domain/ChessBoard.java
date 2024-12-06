package org.technogies.chess.domain;

import java.util.Arrays;
import java.util.Objects;

public class ChessBoard {
   Block blocks [][];

   public ChessBoard(int rows, int cols){
       blocks =  new Block[rows][cols];
   }

    public int totalBlocks() {
        return (int)Arrays.stream(blocks).flatMap(b -> Arrays.stream(b)).count();
    }

    public boolean isEmpty() {
        return Arrays.stream(blocks)
                .flatMap(blockRow -> Arrays.stream(blockRow))
                .allMatch(Objects::isNull);
    }
}
