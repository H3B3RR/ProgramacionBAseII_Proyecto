// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: lexer.flex

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;


@SuppressWarnings("fallthrough")
public class Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\2\3\1\2\22\0\1\1\1\4"+
    "\1\5\1\6\1\0\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\12\22\1\23"+
    "\1\0\1\24\1\25\1\26\2\0\5\27\1\30\7\27"+
    "\1\31\5\27\1\32\6\27\1\33\1\34\1\35\1\36"+
    "\1\27\1\0\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\47\1\27\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\27\1\56\1\57\1\60\1\61\1\27"+
    "\1\62\1\63\1\64\1\27\1\65\1\66\1\67\1\70"+
    "\6\0\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\1"+
    "\4\6\1\1\20\6\3\0\3\6\1\0\1\6\1\7"+
    "\10\6\1\7\12\6\1\0\1\5\1\0\2\6\1\0"+
    "\20\6\3\0\11\6\3\0\7\6\67\0\1\10\5\0"+
    "\1\11\67\0\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[219];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\71\0\162\0\71\0\253\0\344\0\u011d\0\u0156"+
    "\0\u018f\0\u01c8\0\u0201\0\u023a\0\u0273\0\u02ac\0\u02e5\0\u031e"+
    "\0\u0357\0\u0390\0\u03c9\0\u0402\0\u043b\0\u0474\0\u04ad\0\u04e6"+
    "\0\u051f\0\u0558\0\u0591\0\u05ca\0\u0603\0\u063c\0\u0675\0\u06ae"+
    "\0\u06e7\0\u0720\0\u0759\0\u0792\0\u07cb\0\u0804\0\u083d\0\u0876"+
    "\0\u08af\0\u08e8\0\u0921\0\u095a\0\u0993\0\u09cc\0\u018f\0\u0a05"+
    "\0\u0a3e\0\u0a77\0\u0ab0\0\u0ae9\0\u0b22\0\u0b5b\0\u0b94\0\u0bcd"+
    "\0\u0c06\0\u0c3f\0\u0675\0\u0c78\0\u0cb1\0\u0cea\0\u0d23\0\u0d5c"+
    "\0\u0d95\0\u0dce\0\u0e07\0\u0e40\0\u0e79\0\u0eb2\0\u0eeb\0\u0f24"+
    "\0\u0f5d\0\u0f96\0\u0fcf\0\u1008\0\u1041\0\u107a\0\u10b3\0\u10ec"+
    "\0\u1125\0\u115e\0\u1197\0\u11d0\0\u1209\0\u1242\0\u127b\0\u12b4"+
    "\0\u12ed\0\u1326\0\u135f\0\u1398\0\u13d1\0\u140a\0\u1443\0\u147c"+
    "\0\u14b5\0\u14ee\0\u1527\0\u1560\0\u1599\0\u15d2\0\u160b\0\u1644"+
    "\0\u167d\0\u16b6\0\u16ef\0\u1728\0\u1761\0\u179a\0\u17d3\0\u180c"+
    "\0\u1845\0\u187e\0\u18b7\0\u18f0\0\u1929\0\u1962\0\u199b\0\u19d4"+
    "\0\u1a0d\0\u1a46\0\u1a7f\0\u1ab8\0\u1af1\0\u1b2a\0\u1b63\0\u1b9c"+
    "\0\u1bd5\0\u1c0e\0\u1c47\0\u1c80\0\u1cb9\0\u1cf2\0\u1d2b\0\u1d64"+
    "\0\u1d9d\0\u1dd6\0\u1e0f\0\u1e48\0\u1e81\0\u1eba\0\u1ef3\0\u1f2c"+
    "\0\u1f65\0\u1f9e\0\u1fd7\0\u2010\0\u2049\0\u2082\0\u20bb\0\u20f4"+
    "\0\u212d\0\u2166\0\u219f\0\u21d8\0\71\0\u2211\0\u224a\0\u2283"+
    "\0\u22bc\0\u22f5\0\71\0\u232e\0\u2367\0\u23a0\0\u23d9\0\u2412"+
    "\0\u244b\0\u2484\0\u24bd\0\u24f6\0\u252f\0\u2568\0\u25a1\0\u25da"+
    "\0\u2613\0\u264c\0\u2685\0\u26be\0\u26f7\0\u2730\0\u2769\0\u27a2"+
    "\0\u27db\0\u2814\0\u284d\0\u2886\0\u28bf\0\u28f8\0\u2931\0\u296a"+
    "\0\u29a3\0\u29dc\0\u2a15\0\u2a4e\0\u2a87\0\u2ac0\0\u2af9\0\u2b32"+
    "\0\u2b6b\0\u2ba4\0\u2bdd\0\u2c16\0\u2c4f\0\u2c88\0\u2cc1\0\u2cfa"+
    "\0\u2d33\0\u2d6c\0\u2da5\0\u2dde\0\u2e17\0\u2e50\0\u2e89\0\u2ec2"+
    "\0\u2efb\0\u2f34\0\71";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[219];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\4\1\2\1\5\1\6\13\2\1\7"+
    "\1\10\3\2\1\11\1\12\1\13\1\14\1\2\1\15"+
    "\2\2\1\16\1\17\1\20\1\21\1\22\1\23\1\24"+
    "\1\11\1\25\1\11\1\26\1\11\1\27\1\30\1\31"+
    "\1\32\1\11\1\33\1\11\1\34\1\11\1\35\4\2"+
    "\72\0\2\3\100\0\1\36\56\0\2\6\2\0\65\6"+
    "\20\0\1\37\1\0\1\7\134\0\1\40\24\0\1\11"+
    "\4\0\4\11\4\0\26\11\26\0\1\11\4\0\4\11"+
    "\4\0\1\41\25\11\26\0\1\11\4\0\4\11\4\0"+
    "\15\11\1\42\10\11\26\0\1\11\4\0\4\11\4\0"+
    "\17\11\1\43\6\11\21\0\1\44\75\0\1\11\4\0"+
    "\4\11\4\0\14\11\1\45\3\11\1\46\5\11\26\0"+
    "\1\11\4\0\4\11\4\0\17\11\1\47\6\11\26\0"+
    "\1\11\4\0\4\11\4\0\12\11\1\31\2\11\1\50"+
    "\10\11\26\0\1\11\4\0\4\11\4\0\4\11\1\51"+
    "\21\11\26\0\1\11\4\0\4\11\4\0\12\11\1\52"+
    "\11\11\1\53\1\11\26\0\1\11\4\0\4\11\4\0"+
    "\10\11\1\54\4\11\1\30\1\11\1\55\6\11\26\0"+
    "\1\11\4\0\4\11\4\0\12\11\1\56\13\11\26\0"+
    "\1\11\4\0\4\11\4\0\5\11\1\57\5\11\1\60"+
    "\1\57\3\11\1\57\5\11\26\0\1\11\4\0\4\11"+
    "\4\0\1\61\25\11\26\0\1\11\4\0\4\11\4\0"+
    "\15\11\1\62\10\11\26\0\1\11\4\0\4\11\4\0"+
    "\17\11\1\57\6\11\26\0\1\11\4\0\4\11\4\0"+
    "\1\63\25\11\26\0\1\11\4\0\4\11\4\0\1\64"+
    "\3\11\1\65\21\11\26\0\1\11\4\0\4\11\4\0"+
    "\17\11\1\66\6\11\26\0\1\11\4\0\4\11\4\0"+
    "\7\11\1\67\1\70\15\11\26\0\1\11\4\0\4\11"+
    "\4\0\10\11\1\71\15\11\37\0\1\72\57\0\1\73"+
    "\64\0\1\74\74\0\1\11\4\0\4\11\4\0\12\11"+
    "\1\75\13\11\26\0\1\11\4\0\4\11\4\0\14\11"+
    "\1\76\11\11\26\0\1\11\4\0\4\11\4\0\22\11"+
    "\1\76\3\11\72\0\1\77\24\0\1\11\4\0\4\11"+
    "\4\0\3\11\1\57\22\11\26\0\1\11\4\0\4\11"+
    "\4\0\20\11\1\100\5\11\26\0\1\11\4\0\4\11"+
    "\4\0\4\11\1\101\21\11\26\0\1\11\4\0\4\11"+
    "\4\0\14\11\1\102\11\11\26\0\1\11\4\0\4\11"+
    "\4\0\5\11\1\57\4\11\1\57\13\11\26\0\1\11"+
    "\4\0\4\11\4\0\10\11\1\103\7\11\1\76\5\11"+
    "\26\0\1\11\4\0\4\11\4\0\2\11\1\104\23\11"+
    "\26\0\1\11\4\0\4\11\4\0\14\11\1\105\11\11"+
    "\26\0\1\11\4\0\4\11\4\0\15\11\1\106\10\11"+
    "\26\0\1\11\4\0\4\11\4\0\15\11\1\107\10\11"+
    "\26\0\1\11\4\0\4\11\4\0\16\11\1\110\7\11"+
    "\26\0\1\11\4\0\4\11\4\0\13\11\1\111\12\11"+
    "\26\0\1\11\4\0\4\11\4\0\14\11\1\112\4\11"+
    "\1\57\4\11\26\0\1\11\4\0\4\11\4\0\20\11"+
    "\1\113\5\11\26\0\1\11\4\0\4\11\4\0\10\11"+
    "\1\75\15\11\26\0\1\11\4\0\4\11\4\0\21\11"+
    "\1\114\4\11\26\0\1\11\4\0\4\11\4\0\25\11"+
    "\1\57\26\0\1\11\4\0\4\11\4\0\10\11\1\115"+
    "\15\11\26\0\1\11\4\0\4\11\4\0\21\11\1\116"+
    "\4\11\26\0\1\11\4\0\4\11\4\0\4\11\1\117"+
    "\21\11\42\0\1\120\120\0\1\121\24\0\1\11\4\0"+
    "\4\11\4\0\20\11\1\76\5\11\26\0\1\11\4\0"+
    "\4\11\4\0\4\11\1\57\21\11\23\0\1\122\73\0"+
    "\1\11\4\0\4\11\4\0\4\11\1\123\21\11\26\0"+
    "\1\11\4\0\4\11\4\0\1\124\25\11\26\0\1\11"+
    "\4\0\4\11\4\0\21\11\1\125\4\11\26\0\1\11"+
    "\4\0\4\11\4\0\5\11\1\57\20\11\26\0\1\11"+
    "\4\0\4\11\4\0\4\11\1\126\21\11\26\0\1\11"+
    "\4\0\4\11\4\0\1\127\25\11\26\0\1\11\4\0"+
    "\4\11\4\0\13\11\1\57\12\11\26\0\1\11\4\0"+
    "\4\11\4\0\1\11\1\130\24\11\26\0\1\11\4\0"+
    "\4\11\4\0\15\11\1\123\10\11\26\0\1\11\4\0"+
    "\4\11\4\0\1\11\1\131\24\11\26\0\1\11\4\0"+
    "\4\11\4\0\12\11\1\132\13\11\26\0\1\11\4\0"+
    "\4\11\4\0\20\11\1\57\5\11\26\0\1\11\4\0"+
    "\4\11\4\0\22\11\1\133\3\11\26\0\1\11\4\0"+
    "\4\11\4\0\12\11\1\76\13\11\26\0\1\11\4\0"+
    "\4\11\4\0\7\11\1\57\16\11\26\0\1\11\4\0"+
    "\4\11\4\0\12\11\1\45\13\11\11\0\1\134\117\0"+
    "\1\135\122\0\1\136\24\0\1\11\4\0\4\11\4\0"+
    "\17\11\1\137\6\11\26\0\1\11\4\0\4\11\4\0"+
    "\11\11\1\57\14\11\26\0\1\11\4\0\4\11\4\0"+
    "\10\11\1\140\15\11\26\0\1\11\4\0\4\11\4\0"+
    "\16\11\1\137\7\11\26\0\1\11\4\0\4\11\4\0"+
    "\12\11\1\141\13\11\26\0\1\11\4\0\4\11\4\0"+
    "\1\142\25\11\26\0\1\11\4\0\4\11\4\0\3\11"+
    "\1\143\22\11\26\0\1\11\4\0\4\11\4\0\15\11"+
    "\1\144\10\11\26\0\1\11\4\0\4\11\4\0\17\11"+
    "\1\145\6\11\40\0\1\146\46\0\1\147\112\0\1\150"+
    "\56\0\1\11\4\0\4\11\4\0\21\11\1\57\4\11"+
    "\26\0\1\11\4\0\4\11\4\0\14\11\1\43\11\11"+
    "\26\0\1\11\4\0\4\11\4\0\12\11\1\66\13\11"+
    "\26\0\1\11\4\0\4\11\4\0\12\11\1\57\13\11"+
    "\26\0\1\11\4\0\4\11\4\0\1\57\25\11\26\0"+
    "\1\11\4\0\4\11\4\0\2\11\1\130\23\11\26\0"+
    "\1\11\4\0\4\11\4\0\14\11\1\57\11\11\41\0"+
    "\1\151\121\0\1\152\16\0\1\153\142\0\1\154\36\0"+
    "\1\155\70\0\1\156\70\0\1\157\47\0\1\160\71\0"+
    "\1\161\74\0\1\162\136\0\1\163\70\0\1\164\15\0"+
    "\1\165\111\0\1\166\70\0\1\167\50\0\1\170\107\0"+
    "\1\171\51\0\1\172\61\0\1\173\151\0\1\174\70\0"+
    "\1\175\70\0\1\176\36\0\1\177\55\0\1\200\60\0"+
    "\1\201\114\0\1\202\54\0\1\203\61\0\1\204\144\0"+
    "\1\205\70\0\1\206\35\0\1\207\71\0\1\210\55\0"+
    "\1\211\105\0\1\212\117\0\1\213\71\0\1\214\13\0"+
    "\1\215\145\0\1\216\11\0\1\217\115\0\1\220\70\0"+
    "\1\221\122\0\1\222\37\0\1\223\122\0\1\224\26\0"+
    "\1\225\131\0\1\226\70\0\1\227\27\0\1\230\77\0"+
    "\1\231\70\0\1\232\122\0\1\233\22\0\1\234\70\0"+
    "\1\235\54\0\1\236\77\0\1\237\102\0\1\240\57\0"+
    "\1\241\142\0\1\242\13\0\1\243\103\0\1\244\71\0"+
    "\1\245\131\0\1\246\30\0\1\247\67\0\1\250\131\0"+
    "\1\251\26\0\1\252\132\0\1\253\30\0\1\254\130\0"+
    "\1\255\27\0\1\256\131\0\1\257\36\0\1\260\51\0"+
    "\1\261\100\0\1\262\131\0\1\263\21\0\1\264\76\0"+
    "\1\265\131\0\1\266\36\0\1\267\50\0\1\270\101\0"+
    "\1\271\131\0\1\272\23\0\1\273\74\0\1\274\131\0"+
    "\1\275\23\0\1\276\70\0\1\277\74\0\1\300\131\0"+
    "\1\301\11\0\1\302\106\0\1\303\131\0\1\304\36\0"+
    "\1\305\72\0\1\306\120\0\1\307\36\0\1\310\122\0"+
    "\1\311\36\0\1\312\122\0\1\313\70\0\1\314\12\0"+
    "\1\315\70\0\1\316\146\0\1\317\12\0\1\320\146\0"+
    "\1\321\72\0\1\322\66\0\1\323\26\0\1\324\70\0"+
    "\1\325\132\0\1\326\30\0\1\327\70\0\1\330\130\0"+
    "\1\331\36\0\1\332\54\0\1\333\50\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[12141];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\31\1\3\0\3\1\1\0"+
    "\25\1\1\0\1\1\1\0\2\1\1\0\20\1\3\0"+
    "\11\1\3\0\7\1\67\0\1\11\5\0\1\11\67\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[219];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private BufferedWriter writer;

    public Lexer(Reader in, BufferedWriter writer){
        this.zzReader = in;
        this.writer = writer;
    }

    public boolean isEOF() {
        return zzAtEOF;
    }

    private void escribeToken(String lexema, String token) {
        try {
            writer.write(token + ": " + lexema + "\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { escribeToken(yytext(), "TEXTO NO RECONOCIDO");
            }
          // fall through
          case 11: break;
          case 2:
            { /* Ignorar espacios */
            }
          // fall through
          case 12: break;
          case 3:
            { System.out.print(yytext());
            }
          // fall through
          case 13: break;
          case 4:
            { /* Ignorar comentarios de línea */
            }
          // fall through
          case 14: break;
          case 5:
            { escribeToken(yytext(), "NÚMERO");
            }
          // fall through
          case 15: break;
          case 6:
            { escribeToken(yytext(), "IDENTIFICADOR");
            }
          // fall through
          case 16: break;
          case 7:
            { escribeToken(yytext(), "PALABRA_CLAVE");
            }
          // fall through
          case 17: break;
          case 8:
            { escribeToken(yytext(), "DELIMITADOR");
            }
          // fall through
          case 18: break;
          case 9:
            { escribeToken(yytext(), "LITERAL");
            }
          // fall through
          case 19: break;
          case 10:
            { escribeToken(yytext(), "OPERADOR");
            }
          // fall through
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        java.io.FileInputStream stream = null;
        java.io.Reader reader = null;
        try {
          stream = new java.io.FileInputStream(argv[i]);
          reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
        finally {
          if (reader != null) {
            try {
              reader.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
          if (stream != null) {
            try {
              stream.close();
            }
            catch (java.io.IOException e) {
              System.out.println("IO error closing file \""+argv[i]+"\"");
              System.out.println(e);
            }
          }
        }
      }
    }
  }


}
