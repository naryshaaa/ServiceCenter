package controllers;

import com.google.gson.Gson;
import models.objProductModel;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.download;
import views.html.faq;
import views.html.index;
import views.html.tutorial;

import java.util.ArrayList;

public class Application extends Controller {

    public Result home(){
        return redirect("/us_en/Help");
    }

    public Result index(String region) {
        //return ok(index.render("Your new application is ready."));
        if(region == null){
            region = "us_en";
        }
        ArrayList productList = new ArrayList<objProductModel>();
        for(int i=0; i < ProductResource.PRODUCT_NAMES.length; i++){
            if(!ProductResource.isRegionProductMatch(region, ProductResource.PRODUCT_NAMES[i])){
                continue;
            }
            objProductModel productModel = new objProductModel();
            productModel.productCode = ProductResource.PRODUCTS[i];
            productModel.productName = ProductResource.PRODUCT_NAMES[i];
            productModel.productType = ProductResource.PRODUCT_TYPES[i];
            productList.add(productModel);
        }

        Gson gson = new Gson();
        System.out.println(gson.toJson(productList));


        //------------- TEST WS REQUEST ---- START --------- //
        //WSClient ws;
        //------------- TEST WS REQUEST ---- END --------- //

        return ok(index.render(gson.toJson(productList)));
    }

    public Result faq() {

        return ok(faq.render(""));
    }

    public Result tutorial() {

        return ok(tutorial.render(""));
    }
    public Result download() {

        return ok(download.render(""));
    }
}
