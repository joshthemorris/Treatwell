package Box;

public class BoxTest {

//  -----
//  SOLUTIONS
    private static String w3h3 = BoxDraw.topLeft+BoxDraw.hMid+BoxDraw.topRight+"\n"+
                                    BoxDraw.vMidLeft+BoxDraw.cMid+BoxDraw.vMidRight+"\n"+
                                    BoxDraw.botLeft+BoxDraw.hMid+BoxDraw.botRight;
    private static String w5h2 = BoxDraw.topLeft+BoxDraw.hMid+BoxDraw.hMid+BoxDraw.hMid+BoxDraw.topRight+"\n"+
                                    BoxDraw.botLeft+BoxDraw.hMid+BoxDraw.hMid+BoxDraw.hMid+BoxDraw.botRight;
    private static String w2h6 = BoxDraw.topLeft+BoxDraw.topRight+"\n"+
                                    BoxDraw.vMidLeft+BoxDraw.vMidRight+"\n"+
                                    BoxDraw.vMidLeft+BoxDraw.vMidRight+"\n"+
                                    BoxDraw.vMidLeft+BoxDraw.vMidRight+"\n"+
                                    BoxDraw.vMidLeft+BoxDraw.vMidRight+"\n"+
                                    BoxDraw.botLeft+BoxDraw.botRight;
    private static String wN1h3 = "ERROR"; //N here means negative
    private static String w8h1  = "ERROR";
//  -----

    private static String error = " incorrect.\nCorrect solution as follows:\n";

    public static void main (String[] args){

        //test for draw(3,3)
        test(3,3,w3h3);

        //test for draw(5,2)
        test(5,2,w5h2);

        //test for draw(2,6)
        test(2,6,w2h6);

        //test for draw(-1,3)
        test(-1,3,wN1h3);

        //test for draw(8,1)
        test(8,1,w8h1);

        System.out.println("ALL TESTS COMPLETED SUCCESSFULLY");

    }

    /*
    Have tested using if statements as it is simple and means the assessor doesn't
    have to install extra packages (JUnit for example) or run the class with any flags.
     */
    static void test(int w, int h, String solution){
        String result = BoxDraw.draw(w,h);
        if (result.equals(solution)){
            System.out.println("draw("+w+","+h+") correct\n");
        } else {
            throw new AssertionError("draw("+w+","+h+")"+error+solution);
        }
    }
}
