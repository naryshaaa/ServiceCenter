package controllers;

import play.*;
import play.mvc.*;
import play.i18n.Messages;

import views.html.*;

public class Application extends Controller {

    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public Result faq() {

        return ok(faq.render(""));
    }

    public Result tutorial() {

        return ok(tutorial.render(""));
    }
}
