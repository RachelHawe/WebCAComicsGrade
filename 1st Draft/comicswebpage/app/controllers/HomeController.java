package controllers;

import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render());
    }

    public Result aboutus() {
        return ok (aboutus.render());
    }

    public Result newreleases(){
        return ok (newreleases.render());
    }

    public Result events(){
        return ok (events.render());
    }

    public Result lgn(){
        return ok (lgn.render());
    }

    public Result sgn(){
        return ok (sgn.render());
    }

}
