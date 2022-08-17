package swen221.chessview.moves;

import swen221.chessview.*;
import swen221.chessview.pieces.*;

/**
 * This represents a "check move". Note that, a check move can only be made up
 * from an underlying simple move; that is, we can't check a check move.
 *
 * @author djp
 *
 */
public class PawnPromotion implements MultiPieceMove {
	private Piece promotion;
	private SinglePieceMove move;

	public PawnPromotion(SinglePieceMove move, Piece promotion) {
		this.promotion = promotion;
		this.move = move;
	}

	@Override
	public boolean isWhite() {
		return move.isWhite();
	}

	@Override
	public boolean isValid(Board board) {
		int row = isWhite() ? 8 : 1;
		return move.isValid(board) && move.piece() instanceof Pawn
				&& move.newPosition.row() == row;
	}

	@Override
	public void apply(Board board) {
		if (isValid(board)) {
			move.apply(board);
			board.setPieceAt(move.newPosition(), promotion);
		}
	}

	//@Override
	//public String toString() {
	//	return super.toString() + "=" + SinglePieceMove.pieceChar(promotion);
	//}

	@Override
	public String toString() {
		System.out.println(move.toString() + "=" + promotion.toString());
		return move.toString() + "=" + promotion.toString();
	}


}
