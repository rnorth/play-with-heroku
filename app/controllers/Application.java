package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
		Logger.info("Request received!");
		Visitor visitor = new Visitor();
		visitor.save();
		
		long visitorCount = Visitor.count();
		
        render(visitorCount);
    }

}