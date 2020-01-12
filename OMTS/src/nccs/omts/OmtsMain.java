package nccs.omts;


import nccs.omts.view.*;

public class OmtsMain {

	  public static void main(String[] args) throws Exception {
                ViewPage vp =new ViewPage();
                if(vp.bookticket()){   
                     vp.firstPage();
                }
	  }

}
