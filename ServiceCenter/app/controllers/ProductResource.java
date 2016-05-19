package controllers;

import play.mvc.Controller;

/**
 * Created by PB5N0097 on 4/28/2016.
 */
public class ProductResource extends Controller {
    static String[] PRODUCTS = { "dvpro3in1", "foodprinter", "scanner", "dvpro", "dv10jrw", "dv10jr", "dv11plus", "nb10", "f10aio", "f20a", "f10a", "f20", "f10", "filament", "spare_parts", "bolide" };
    static String[] PRODUCT_NAMES = {   "da Vinci 1.0 Pro 3 in 1", "3D Food Printer", "3D Scanner", "da Vinci 1.0 Pro", "da Vinci Jr. 1.0w",
            "da Vinci 1.0 Junior", "da Vinci 1.1 Plus", "Nobel 1.0","da Vinci 1.0 AiO",
            "da Vinci 2.0A Duo", "da Vinci 1.0A", "da Vinci 2.0 Duo", "da Vinci 1.0",
            "faqProductFilament", "faqProductSpareParts", "Bolide"};
    static String[] PRODUCT_TYPES = { "supportHelp3dPrinter", "supportHelp3dPrinter", "", "supportHelp3dPrinter", "supportHelp3dPrinter",
            "supportHelp3dPrinter", "supportHelp3dPrinter", "supportHelp3dPrinter", "supportHelp3dPrinter",
            "supportHelp3dPrinter", "supportHelp3dPrinter", "supportHelp3dPrinter", "supportHelp3dPrinter",
            " ", " ", "supportHelpRobot"};

    static boolean isRegionProductMatch(String region, String productName) {
        if (productName.equals("da Vinci 2.0 Duo")) {
            if (region.toLowerCase().startsWith("eu") || region.toLowerCase().startsWith("kr") || region.toLowerCase().startsWith("global_en") || region.toLowerCase().startsWith("la") || region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0")) {
            if (region.toLowerCase().startsWith("eu") || region.toLowerCase().startsWith("kr") || region.toLowerCase().startsWith("la") || region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0A")) {
            if (!region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("cn")
                    && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("global") && !region.toLowerCase().startsWith("la")
                    && !region.toLowerCase().startsWith("th") && !region.toLowerCase().startsWith("jp"))  {
                return false;
            }
        }
        if (productName.equals("da Vinci 2.0A Duo")) {
            if (!region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("global") && !region.toLowerCase().startsWith("la")
                    && !region.toLowerCase().startsWith("th") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0 AiO")) {
            if (region.equals("global_zh_hk")) {
                return false;
            }
        }
        if (productName.equals("Nobel 1.0")) {
            if (!region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("eu")
                    && !region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("global_zh_hk")
                    && !region.toLowerCase().startsWith("la") && !region.toLowerCase().startsWith("th") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.1 Plus")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0 Junior")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("eu")
                    && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("global")&& !region.toLowerCase().startsWith("kr")
                    && !region.toLowerCase().startsWith("la") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("da Vinci Jr. 1.0w")) {
            if (!region.toLowerCase().startsWith("jp") && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("kr")
                    && !region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("eu") && !region.equalsIgnoreCase("jp")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0 Pro")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("eu")
                    && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("jp") && !region.toLowerCase().startsWith("kr")) {
                return false;
            }
        }
        if (productName.equals("3D Scanner")) {
            if (!region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("jp") && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("kr")
                    && !region.toLowerCase().startsWith("global_zh_hk")) {
                return false;
            }
        }
        if (productName.equals("3D Food Printer")) {
            if (!region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("tw")) {
                return false;
            }
        }
        if (productName.equals("XYZmaker(Beta)")) {
            if (!region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("tw")
                    && !region.equalsIgnoreCase("eu_en") && !region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("filament")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("cn")) {
                return false;
            }
        }
        if (productName.equals("Bolide")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("jp")
                    && !region.toLowerCase().startsWith("eu")) {
                return false;
            }
        }

        if(productName.equals("da Vinci 1.0 Pro 3 in 1")){
            if (!region.toLowerCase().startsWith("cn") && !region.startsWith("jp")) {
                return false;
            }
        }

        /*
        if (productName.equals("Service Robot")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")) {
                return false;
            }
        }
        */


        return true;
    }
    static boolean isRegionProductWarrantyMatch(String region, String productName) {

        if (productName.equals("da Vinci 1.0")) {
            if (region.toLowerCase().startsWith("eu") || region.toLowerCase().startsWith("kr") || region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 2.0 Duo")) {
            if (region.toLowerCase().startsWith("eu") || region.toLowerCase().startsWith("kr") || region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0A")) {
            if (!region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("jp_ja")
                    && !region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 2.0A Duo")) {
            if (!region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("kr")
                    && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("jp_ja")
                    && !region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0 AiO")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("cn")
                    && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("jp_ja")
                    && !region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("Nobel 1.0")) {
            if (!region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("us")
                    && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("jp_ja")
                    && !region.toLowerCase().startsWith("th")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.1 Plus")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("cn")
                    && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("da Vinci 1.0 Junior")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("cn")
                    && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("da Vinci Jr. 1.0w")) {
            if (!region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("kr")
                    && !region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }

        if (productName.equals("da Vinci 1.0 Pro")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("eu")
                    && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("jp") && !region.toLowerCase().startsWith("kr")) {
                return false;
            }
        }
        if (productName.equals("3D Scanner")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw") && !region.toLowerCase().startsWith("eu")
                    && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("kr") && !region.toLowerCase().startsWith("jp")) {
                return false;
            }
        }
        if (productName.equals("3D Food Printer")) {
            return false;
        }
        if (productName.equals("filament")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("eu") && !region.toLowerCase().startsWith("cn")) {
                return false;
            }
        }

        if (productName.equals("Bolide")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")
                    && !region.toLowerCase().startsWith("cn") && !region.toLowerCase().startsWith("jp")
                    && !region.toLowerCase().startsWith("eu")) {
                return false;
            }
        }

        if (productName.equals("da Vinci 1.0 Pro 3 in 1")) {
            if (!region.toLowerCase().startsWith("cn")) {
                return false;
            }
        }
        /*
        if (productName.equals("Service Robot")) {
            if (!region.toLowerCase().startsWith("us") && !region.toLowerCase().startsWith("tw")) {
                return false;
            }
        }
        */

        return true;
    }

}
