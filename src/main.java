

import java.io.IOException;
import java.util.*;

public class main{


    public  static userDataController U = new userDataController();
    public static productController p = new productController();
    public  static StoreController S = new StoreController();
    public  static brandController B = new brandController();
    public  static VC V  = new VC();

    public void NormalUserMain() {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have an account ?");
        System.out.println("1) Sign-in :");
        System.out.println("2) Register :");
        int choice = input.nextInt();
        if (choice == 1) {
            String verify = U.Signin(1);
            if (verify!=null) {
                while (true) {
                    System.out.println("1) Buy Product" + "\n" + "2) Explore Product" + "\n" + "3) Suggest a Product"+ "\n" + "4) Explore and Buy VC" + "\n" + "5) SignOut");
                    int function = input.nextInt();
                    if (function == 1) {
                        p.buyProduct(verify);
                    } else if (function == 2) {
                        p.exploreProducts();
                    } else if (function == 3) {
                        p.SuggestProduct();
                    }
                    else if (function == 4) {
                        p.viewVCs(verify);
                    }

                    else if (function == 5) {
                        break;
                    }
                }

            } else {
                System.out.println("Error, Try again later on! ");
                NormalUserMain();
            }
        } else if (choice == 2) {
            if (U.register(1) == false) {
                System.out.println("SIGN IN NOW: ");
                String verify = U.Signin(1);
                if (verify!=null) {
                    while (true) {
                        System.out.println("1) Buy Product" + "\n" + "2) Explore Product" + "\n" + "3) Suggest a Product" + "\n" + "4) SignOut");
                        int function = input.nextInt();
                        if (function == 1) {
                            p.buyProduct(verify);
                        } else if (function == 2) {
                            p.exploreProducts();
                        } else if (function == 3) {
                            p.SuggestProduct();
                        } else if (function == 4) {
                            break;
                        }
                    }

                }
            }
        }

    }

    public void StoreOwnerMain() {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have an account ?");
        System.out.println("1) Sign-in :");
        System.out.println("2) Register :");
        int choice = input.nextInt();
        if (choice == 1) {
            String verify = U.Signin(2);
            if (verify!=null) {
                while (true) {
                    System.out.println(
                            "1-Add Product to the store" + "\n"
                                    + "2-Suggest Product" + "\n"
                                    + "3-Explore Product" + "\n"
                                    + "4-View Specific Product Details" + "\n"
                                    + "5-Explore Number Of Views to each product" + "\n"
                                    + "6-Get most Viewed product in a store" + "\n" +
                                    "7-Add Store" +
                                    "8-Delete product"+"\n"+"8-SignOut");
                    int function = input.nextInt();


                    if(function ==1){

                        p.AddProduct_Store(verify);

                    }
                    else if (function == 2) {
                        p.SuggestProduct();

                    } else if (function == 3) {
                        p.exploreProducts();
                    }

                    else if (function == 4) {
                        p.View_Specific_Product();
                    }

                    else if (function == 5) {
                        p.ExploreNumberOfViews();
                    }
                    else if(function == 6){
                        p.View_Most_Viwed_Product();
                    }
                    else if (function == 7) {
                        S.AddStore(verify);
                    }
                    else if (function==8)
                    {
                        p.deleteProduct();
                    }
                    else if (function == 9) {
                        break;
                    }
                }

            } else {
                System.out.println("Error, Try again later on! ");
                NormalUserMain();
            }
        } else if (choice == 2) {
            if (U.register(2) == false) {
                System.out.println("SIGN IN NOW: ");
                String verify = U.Signin(2);
                if (verify!=null) {
                    while (true) {
                        System.out.println(
                                "1-Add Product to the store" + "\n"
                                        + "2-Suggest Product" + "\n"
                                        + "3-Explore Product" + "\n"
                                        + "4-View Specific Product Details" + "\n"
                                        + "5-Explore Number Of Views to each product" + "\n"
                                        + "6-Get most Viewed product in a store" + "\n" +
                                        "7-Add Store" + "\n"+"8-SignOut");
                        int function = input.nextInt();


                        if(function ==1){

                            p.AddProduct_Store(verify);

                        }
                        else if (function == 2) {
                            p.SuggestProduct();

                        } else if (function == 3) {
                            p.exploreProducts();
                        } else if (function == 4) {
                            p.View_Specific_Product();
                        }
                        else if(function == 5){
                            p.View_Most_Viwed_Product();
                        }
                        else if (function == 7) {
                            S.AddStore(verify);
                        } else if (function == 8) {
                            break;
                        }
                    }

                }
            }
        }

    }

    public void AdministratorMain() {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you have an account ?");
        System.out.println("1) Sign-in :");
        System.out.println("2) Register :");
        int choice = input.nextInt();
        if (choice == 1) {
            String verify = U.Signin(3);
            if (verify!=null) {
                while (true) {
                    System.out.println("1-Add Brand to the system" + "\n" + "2-Add Product to the system" + "\n" + "3-Add VC" +"4- Explore Products"+"5- View Specific product Details"+ "\n" + "6-SignOut");
                    int function = input.nextInt();
                    if (function == 1) {
                        B.addBrand();
                    }
                    else if (function == 2) {
                        p.addProductAdmin();
                    }
                    else if (function == 3) {
                        V.addVC();
                    }
                    else if (function == 4) {
                        p.exploreProducts();
                    }
                    else if (function == 5) {
                        p.View_Specific_Product();
                    }


                    else if (function == 6) {
                        break;
                    }
                }

            } else {
                System.out.println("Error, Try again later on! ");
                NormalUserMain();
            }
        } else if (choice == 2) {
            if (U.register(3) == false) {
                System.out.println("SIGN IN NOW: ");
                String verify = U.Signin(3);
                if (verify!=null) {
                    while (true) {
                        System.out.println("1-Add Brand to the system" + "\n" + "2-Add Product to the system" + "\n" + "3-Provide VC" +"4- Explore Products"+"5- View Specific product Details"+ "\n" + "6-SignOut");
                        int function = input.nextInt();
                        if (function == 1) {
                            B.addBrand();
                        }
                        else if (function == 2) {
                            p.addProductAdmin();
                        }
                        else if (function == 3) {
                            V.addVC();
                        }
                        else if (function == 4) {
                            p.exploreProducts();
                        }
                        else if (function == 5) {
                            p.View_Specific_Product();
                        }


                        else if (function == 6) {
                            break;
                        }
                    }

                }
            }
        }

    }




    public static void main(String[] args) throws IOException {
        main M=new main();

        Scanner input = new Scanner(System.in);


        while(true) {
            System.out.println("Enter your type...");
            System.out.println("1) User");
            System.out.println("2) StoreOwner");
            System.out.println("3) Admin");
            System.out.println("4) Exit");
            int choice = input.nextInt();
            if (choice == 1)
                M.NormalUserMain();
            else if (choice == 2)
                M.StoreOwnerMain(); //TODO StoreOwnerMain
            else if (choice == 3)
                M.AdministratorMain(); //TODO AdminOwnerMain
            else
                break;
        }


    }
}