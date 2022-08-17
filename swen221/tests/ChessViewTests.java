package swen221.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

//import org.junit.Test;

import org.junit.jupiter.api.Test;
import swen221.chessview.Board;
import swen221.chessview.ChessGame;

public class ChessViewTests {

	// ================================================
	// Default Valid Tests
	// ================================================

	@Test
	public void testValid_01() {
		String input =
			"a2-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_02() {
		String input =
			"a2-a3 b7-b6\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|p|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|P|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_03() {
		String input =
			"a2-a4 b7-b5\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|_|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|p|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_04() {
		String input =
			"d2-d4 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|P|p|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_05() {
		String input =
			"d2-d3 d7-d5\n" +
			"e2-e4 d5xe4\n" +
			"d3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_06() {
		String input =
			"Nb1-c3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|N|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_07() {
		String input =
			"Nb1-a3\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|N|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|P|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_08() {
		String input =
			"d2-d4 Nb8-c6\n" +
			"e2-e4 Nc6xd4\n" +
			"";
		String output =
			"8|r|_|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|n|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|_|_|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_09() {
		String input =
			"Nb1-c3 e7-e5\n" +
			"e2-e3 e5-e4\n" +
			"Nc3xe4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|N|_|_|_|\n" +
			"3|_|_|_|_|P|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|P|\n" +
			"1|R|_|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_10() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|B|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_11() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5-h4\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|B|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_12() {
		String input =
			"d2-d3 d7-d5\n" +
			"Bc1-g5 Bc8-g4\n" +
			"Bg5xe7\n" +
			"";
		String output =
			"8|r|n|_|q|k|b|n|r|\n" +
			"7|p|p|p|_|B|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|p|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|b|_|\n" +
			"3|_|_|_|P|_|_|_|_|\n" +
			"2|P|P|P|_|P|P|P|P|\n" +
			"1|R|N|_|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_13() {
		String input =
			"e2-e4 e7-e5\n" +
			"Qd1-g4 Qd8-h4\n" +
			"Qg4-f4 Qh4-h6\n" +
			"Qf4-f6 Qh6xh2\n" +
			"";
		String output =
			"8|r|n|b|_|k|b|n|r|\n" +
			"7|p|p|p|p|_|p|p|p|\n" +
			"6|_|_|_|_|_|Q|_|_|\n" +
			"5|_|_|_|_|p|_|_|_|\n" +
			"4|_|_|_|_|P|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|P|P|P|P|_|P|P|q|\n" +
			"1|R|N|B|_|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testValid_14() {
		String input =
			"a2-a4 h7-h5\n" +
			"Ra1-a3 Rh8-h6\n" +
			"Ra3-d3 Rh6-g6\n" +
			"Rd3xd7\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|_|\n" +
			"7|p|p|p|R|p|p|p|_|\n" +
			"6|_|_|_|_|_|_|r|_|\n" +
			"5|_|_|_|_|_|_|_|p|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|_|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}


	@Test public void testValid_15() {
		String input =
				"h2-h3\n" +
						"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|_|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|P|\n" +
			"2|P|P|P|P|P|P|P|_|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}

	// ================================================
	// Valid Tests: Pawn Moves
	// ================================================

	// ================================================
	// Valid Tests: King Moves
	// ================================================

	//King forward move
	@Test
	public void testValid_King_01() {
		String input =
				"e2-e3 h7-h6\n" +
						"Ke1-e2\n" +
						"";

		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|P|_|_|_|\n" +
						"2|P|P|P|P|K|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//King back move
	@Test
	public void testValid_King_02() {
		String input =
						"e2-e3 h7-h6\n" +
						"Ke1-e2 h6-h5\n" +
						"Ke2-e1\n" +
						"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|p|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|P|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//King diagonal move left up
	@Test
	public void testValid_King_03() {
		String input =
						"d2-d3 h7-h6\n" +
						"Ke1-d2\n" +
						"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|P|_|_|_|_|\n" +
						"2|P|P|P|K|P|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//King diagonal move right up
	@Test
	public void testValid_King_04() {
		String input =
						"d2-d3 h7-h6\n" +
						"Ke1-d2 h6-h5\n" +
						"Kd2-e3\n" +
						"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|p|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|P|K|_|_|_|\n" +
						"2|P|P|P|_|P|P|P|P|\n" +
						"1|R|N|B|Q|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Black King move left
	@Test public void testValid_King_05() {
		String input =
				"e2-e4 e7-e5\n" +
						"Qd1-g4 Qd8-h4\n" +
						"Qg4-f4 Qh4-h6\n" +
						"Qf4-f6 Qh6xh2\n" +
						"a2-a3 Ke8-d8\n" +
						"";
		String output =
				"8|r|n|b|k|_|b|n|r|\n" +
						"7|p|p|p|p|_|p|p|p|\n" +
						"6|_|_|_|_|_|Q|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|P|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|_|P|P|q|\n" +
						"1|R|N|B|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//White King move left
	@Test public void testValid_King_06() {
		String input =
						"e2-e4 e7-e5\n" +
						"Qd1-g4 Qd8-h4\n" +
						"Qg4-f4 Qh4-h6\n" +
						"Qf4-f6 Qh6xh2\n" +
						"Ke1-d1\n" +
						"";
		String output =
						"8|r|n|b|_|k|b|n|r|\n" +
						"7|p|p|p|p|_|p|p|p|\n" +
						"6|_|_|_|_|_|Q|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|_|_|_|_|P|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|_|P|P|q|\n" +
						"1|R|N|B|K|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	// ================================================
	// Valid Tests: Queen Moves
	// ================================================

	// ================================================
	// Valid Tests: Knight Moves
	// ================================================
	@Test
	public void testValid_Knight_01() {
		String input =
				"Nb1-a3\n" +
						"";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|N|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|_|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test
	public void testValid_Knight_02() {
		String input =
				"Nb1-c3\n" +
						"";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|N|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|_|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test
	public void testValid_Knight_03() {
		String input =
						"Nb1-c3 h7-h6\n" +
						"Nc3-b1\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test
	public void testValid_Knight_04() {
		String input =
						"Nb1-a3 h7-h6\n" +
						"Na3-b1\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	// ================================================
	// Valid Tests: Rook Moves
	// ================================================

	// ================================================
	// Valid Tests: Bishop Moves
	// ================================================

	// ================================================
	// Valid Tests: Pawn Promotion
	// ================================================

	// ================================================
	// Valid Tests: Castling
	// ================================================

	//Castling Check White Queen Side
	@Test
	public void testValid_Castling_01() {
		String input =
						"a2-a3 h7-h6\n" +
						"Nb1-c3 h6-h5\n" +
						"Nc3-d5 h5-h4\n" +
						"d2-d3 g7-g6\n" +
						"Qd1-d2 g6-g5\n" +
						"b2-b3 f7-f6\n" +
						"Bc1-b2 f6-f5\n" +
						"O-O-O\n" +
						"";

		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|_|_|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|N|_|p|p|_|\n" +
						"4|_|_|_|_|_|_|_|p|\n" +
						"3|P|P|_|P|_|_|_|_|\n" +
						"2|_|B|P|Q|P|P|P|P|\n" +
						"1|_|_|K|R|_|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Castling Check White Queen Side
	@Test
	public void testValid_Castling_02() {
		String input =
				"a2-a3 h7-h6\n" +
						"Nb1-c3 h6-h5\n" +
						"Nc3-d5 h5-h4\n" +
						"d2-d3 g7-g6\n" +
						"Qd1-d2 g6-g5\n" +
						"b2-b3 f7-f6\n" +
						"Bc1-b2 f6-f5\n" +
						"e2-e3 a7-a6\n" +
						"Bf1-e2 a6-a5\n" +
						"Ng1-f3 b7-b6\n" +
						"O-O\n" +
						"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|_|_|p|p|p|_|_|_|\n" +
						"6|_|p|_|_|_|_|_|_|\n" +
						"5|p|_|_|N|_|p|p|_|\n" +
						"4|_|_|_|_|_|_|_|p|\n" +
						"3|P|P|_|P|P|N|_|_|\n" +
						"2|_|B|P|Q|B|P|P|P|\n" +
						"1|R|_|_|_|_|R|K|_|\n" +
						"  a b c d e f g h";

		check(input,output);
	}



	// ================================================
	// Valid Tests: Check
	// ================================================

	// ================================================
	// Valid Tests: EnPassant
	// ================================================

	@Test
	public void testValid_EnPassant_01() {
		String input =
				"a2-a4 h7-h6\n" +
				"a4-a5 b7-b5\n" +
				"a5xb6ep\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|_|p|p|p|p|p|_|\n" +
						"6|_|P|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}









	//Pawn takes pawn
	@Test public void testValid_16() {
		String input =
				"h2-h4 g7-g5\n" +
						"h4xg5\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|_|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|P|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}



	@Test public void testValid_19() {
		String input =
						"e2-e4 e7-e5\n" +
						"Qd1-g4 Qd8-h4\n" +
						"Qg4-f4 Qh4-h6\n" +
						"Qf4-f6 Qh6xh2\n" +
						"a2-a3 d7-d6\n" +
						"a3-a4 d6-d5\n" +
						"e4xd5 h7-h6\n" +
						"d5-d6 h6-h5\n" +
						"d6-d7 h5-h4\n" +
						"";

		String output =
						"8|r|n|b|_|k|b|n|r|\n" +
						"7|p|p|p|P|_|p|p|_|\n" +
						"6|_|_|_|_|_|Q|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|P|_|_|_|_|_|_|p|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|_|P|P|q|\n" +
						"1|R|N|B|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Check
	@Test public void testValid_20() {
		String input =
				"e2-e4 e7-e5\n" +
						"Qd1-g4 Qd8-h4\n" +
						"Qg4-f4 Qh4-h6\n" +
						"Qf4-f6 Qh6xh2\n" +
						"a2-a3 d7-d6\n" +
						"a3-a4 d6-d5\n" +
						"e4xd5 h7-h6\n" +
						"d5-d6 h6-h5\n" +
						"d6-d7 h5-h4\n" +
						"d7-e8+\n" +
						"";

		String output =
						"8|r|n|b|_|k|b|n|r|\n" +
						"7|p|p|p|P|_|p|p|_|\n" +
						"6|_|_|_|_|_|Q|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|P|_|_|_|_|_|_|p|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|_|P|P|q|\n" +
						"1|R|N|B|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}






	//Pawn Promotion
	@Test public void testValid_21() {
		String input =
						"e2-e4 e7-e5\n" +
						"Qd1-g4 Qd8-h4\n" +
						"Qg4-f4 Qh4-h6\n" +
						"Qf4-f6 Qh6xh2\n" +
						"a2-a3 d7-d6\n" +
						"a3-a4 d6-d5\n" +
						"e4xd5 h7-h6\n" +
						"d5-d6 h6-h5\n" +
						"d6-d7 h5-h4\n" +
						"d7-d8=N\n" +
						"";

		String output =
						"8|r|n|b|N|k|b|n|r|\n" +
						"7|p|p|p|_|_|p|p|_|\n" +
						"6|_|_|_|_|_|Q|_|_|\n" +
						"5|_|_|_|_|p|_|_|_|\n" +
						"4|P|_|_|_|_|_|_|p|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|_|P|P|q|\n" +
						"1|R|N|B|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}




	//Pawn Promotion Queen
	@Test public void testValid_23() {
		String input =
						"b2-b4 a7-a5\n" +
						"b4xa5 Ra8-a6\n" +
						"h2-h3 Ra6-b6\n" +
						"a5-a6 Rb6-c6\n" +
						"a6-a7 Rc6-d6\n" +
						"a7-a8=Q\n" +
						"";
		String output =
						"8|Q|n|b|q|k|b|n|r|\n" +
						"7|_|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|r|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|P|\n" +
						"2|P|_|P|P|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Pawn promotion Knight
	@Test public void testValid_24() {
		String input =
						"b2-b4 a7-a5\n" +
						"b4xa5 Ra8-a6\n" +
						"h2-h3 Ra6-b6\n" +
						"a5-a6 Rb6-c6\n" +
						"a6-a7 Rc6-d6\n" +
						"a7-a8=N\n" +
						"";
		String output =
						"8|N|n|b|q|k|b|n|r|\n" +
						"7|_|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|r|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|P|\n" +
						"2|P|_|P|P|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Pawn promotion Bishop
	@Test public void testValid_25() {
		String input =
						"b2-b4 a7-a5\n" +
						"b4xa5 Ra8-a6\n" +
						"h2-h3 Ra6-b6\n" +
						"a5-a6 Rb6-c6\n" +
						"a6-a7 Rc6-d6\n" +
						"a7-a8=B\n" +
						"";
		String output =
						"8|B|n|b|q|k|b|n|r|\n" +
						"7|_|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|r|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|P|\n" +
						"2|P|_|P|P|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Pawn promotion Rook
	@Test public void testValid_26() {
		String input =
						"b2-b4 a7-a5\n" +
						"b4xa5 Ra8-a6\n" +
						"h2-h3 Ra6-b6\n" +
						"a5-a6 Rb6-c6\n" +
						"a6-a7 Rc6-d6\n" +
						"a7-a8=R\n" +
						"";
		String output =
						"8|R|n|b|q|k|b|n|r|\n" +
						"7|_|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|r|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|P|\n" +
						"2|P|_|P|P|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Pawn promotion King
	@Test public void testValid_27() {
		String input =
				"b2-b4 a7-a5\n" +
						"b4xa5 Ra8-a6\n" +
						"h2-h3 Ra6-b6\n" +
						"a5-a6 Rb6-c6\n" +
						"a6-a7 Rc6-d6\n" +
						"a7-a8=K\n" +
						"";
		String output =
						"8|K|n|b|q|k|b|n|r|\n" +
						"7|_|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|r|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|P|\n" +
						"2|P|_|P|P|P|P|P|_|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}










	//King Moves





	// ================================================
	// Invalid Tests
	// ================================================

	@Test public void testInvalid_01() {
		String input =
			"a2-a4 a7-a4\n" +
			"";
		String output =
			"8|r|n|b|q|k|b|n|r|\n" +
			"7|p|p|p|p|p|p|p|p|\n" +
			"6|_|_|_|_|_|_|_|_|\n" +
			"5|_|_|_|_|_|_|_|_|\n" +
			"4|P|_|_|_|_|_|_|_|\n" +
			"3|_|_|_|_|_|_|_|_|\n" +
			"2|_|P|P|P|P|P|P|P|\n" +
			"1|R|N|B|Q|K|B|N|R|\n" +
			"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInvalid_02() {
		String input =
				"a2-a4 h7-h6\n" +
				"a4-a6\n" +
					"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|_|\n" +
						"6|_|_|_|_|_|_|_|p|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|P|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|_|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInvalid_03() {
		String input =	"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInvalid_04() {
		String input = "h7-h6\n" +
						"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInvalid_05() {
		String input =
				"e1-f1\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}
	@Test public void testInvalid_06() {
		String input =
				"a2-a5\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInvalid_07() {
		String input =
				"a7-a6\n" +
						"";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInvalid_08() {
		String input =
						"\0";
		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	@Test public void testInvalid_09() {
		String input =
				"";
		String output =
				"8|r|n|b|q|k|b|n|r|\n" +
						"7|p|p|p|p|p|p|p|p|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|_|_|_|_|_|_|_|_|\n" +
						"4|_|_|_|_|_|_|_|_|\n" +
						"3|_|_|_|_|_|_|_|_|\n" +
						"2|P|P|P|P|P|P|P|P|\n" +
						"1|R|N|B|Q|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}



	// ================================================
	// Invalid Tests: Castling
	// ================================================

	//Attempt to Castle after King has moved
	@Test
	public void testInvalid_Castling_01() {
		String input =
						"a2-a3 h7-h6\n" +
						"Nb1-c3 h6-h5\n" +
						"Nc3-d5 h5-h4\n" +
						"d2-d3 g7-g6\n" +
						"Qd1-d2 g6-g5\n" +
						"b2-b3 f7-f6\n" +
						"Bc1-b2 f6-f5\n" +
						"Ke1-d1 a7-a6\n" +
						"Kd1-e1 a6-a5\n" +
						"O-O-O\n" +
						"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|_|p|p|p|p|_|_|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|p|_|_|N|_|p|p|_|\n" +
						"4|_|_|_|_|_|_|_|p|\n" +
						"3|P|P|_|P|_|_|_|_|\n" +
						"2|_|B|P|Q|P|P|P|P|\n" +
						"1|R|_|_|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}

	//Attempt to Castle after left Rook has moved
	@Test
	public void testInvalid_Castling_02() {
		String input =
						"a2-a3 h7-h6\n" +
						"Nb1-c3 h6-h5\n" +
						"Nc3-d5 h5-h4\n" +
						"d2-d3 g7-g6\n" +
						"Qd1-d2 g6-g5\n" +
						"b2-b3 f7-f6\n" +
						"Bc1-b2 f6-f5\n" +
						"Ra1-b1 a7-a6\n" +
						"Rb1-a1 a6-a5\n" +
						"O-O-O\n" +
						"";

		String output =
						"8|r|n|b|q|k|b|n|r|\n" +
						"7|_|p|p|p|p|_|_|_|\n" +
						"6|_|_|_|_|_|_|_|_|\n" +
						"5|p|_|_|N|_|p|p|_|\n" +
						"4|_|_|_|_|_|_|_|p|\n" +
						"3|P|P|_|P|_|_|_|_|\n" +
						"2|_|B|P|Q|P|P|P|P|\n" +
						"1|R|_|_|_|K|B|N|R|\n" +
						"  a b c d e f g h";

		check(input,output);
	}


	// The following provides a simple helper method for all tests.
	public static void check(String input, String expectedOutput) {
		try {
			ChessGame game = new ChessGame(input);
			List<Board> boards = game.boards();
			if (boards.isEmpty()) {
				fail("test failed with insufficient boards on input: " + input);
			}
			String actualOutput = boards.get(boards.size() - 1).toString();
			assertEquals(expectedOutput, actualOutput);
		} catch (Exception e) {
			fail("test failed because of exception on input: " + input + " Exception: " + e);

		}
	}
}

