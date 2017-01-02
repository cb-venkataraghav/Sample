abstract class temp{

        abstract String name();
        abstract int remainingCharge();

}


class outer{

        String name;
        int remainingCharge;
        String name(){
                return name;
        }
        int remainingCharge(){
                return remainingCharge;
        }
        void display(temp o){
                System.out.println("Name: "+o.name());
                System.out.println("Remaining Charge: "+o.remainingCharge());
                System.out.println();
        }

}

class w1d5e1{
        public static void main(String[] args){

                outer o = new outer();

                o.display(new temp() {

                        String name(){

                                return "M123";
                        }

                        int remainingCharge(){

                                return 12;
                        }



                });

		o.display(new temp() {

                        String name(){

                                return "C456";
                        }

                        int remainingCharge(){

                                return 67;
                        }



                });

        }


}

