package MiddleController;
import java.util.ArrayList;

import MiddleView.MiddleView;
import MiddleView.MiddleViewAllDelete;
import MiddleView.MiddleViewBring;
import MiddleView.MiddleViewDelete;
import MiddleView.MiddleViewEnd;
import MiddleView.MiddleViewIndex;
import MiddleView.MiddleViewMenu;
import MiddleView.MiddleViewSearch;
import MiddleView.MiddleViewUpdate;
import MiddleView.MiddleViewinsert;
import MiddlePro.PhoneInfo;

public class R {
	public static int choice;
	public static PhoneInfo pInfo;
	
	
	public static ArrayList<PhoneInfo> aList;
	
	
	public static final MiddleView vView = new MiddleView();
	public static final MiddleView vBring = new MiddleViewBring();
	public static final MiddleView vDel = new MiddleViewDelete();
	public static final MiddleView vIdx = new MiddleViewIndex();
	public static final MiddleView vInput = new MiddleViewinsert();
	public static final MiddleView vMenu = new MiddleViewMenu();
	public static final MiddleView vAllDelete = new MiddleViewAllDelete();
	public static final MiddleView vSearch = new MiddleViewSearch();
	public static final MiddleView vUpdate = new MiddleViewUpdate();
	public static final MiddleView vEnd = new MiddleViewEnd();
	public static final Control pstart = new Control();
	
}
