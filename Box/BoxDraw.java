package Box;

public class BoxDraw {

    //Box components
    static String topLeft   = "┌ ";
    static String topRight  = " ┐";
    static String botLeft   = "└ ";
    static String botRight  = " ┘";
    static String vMidLeft  = "| ";
    static String vMidRight = " |";
    static String hMid      = " - ";
    static String cMid      = "   ";


    public static String draw(int w, int h){

        /*
        Input validation
        Can't have box with width or height smaller than 2
        */
        if ((w < 2) || (h < 2)) {
            System.out.println("ERROR: Your box must have a height and width of at least 2");
            return "ERROR";
        }

        //first components to be added to lines
        String top = topLeft;
        String mid = vMidLeft;
        String bot = botLeft;

        //fill middle of lines (based on width provided)
        for (int i = 0; i<w-2; i++){
            top += hMid;
            mid += cMid;
            bot += hMid;
        }

        //finish lines with last components
        top += topRight;
        mid += vMidRight;
        bot += botRight;

        //concatenate strings with appropriate number of middle lines (based on height provided)
        String finalBox = top+"\n";
        for (int i = 0; i<h-2; i++) {
            finalBox += mid+"\n";
        }
        finalBox +=bot;

        //Draw box and return result
        System.out.println(finalBox);
        return finalBox;

        //Time complexity of O(n)
    }
}
