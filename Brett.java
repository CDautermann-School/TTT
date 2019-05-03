public class Brett
{
    byte[] brett = new byte[9];

    public Brett(String pInitString){
        this.toBrett(pInitString);
    }

    public void print(String s){
        System.out.println(s);
    }

    private void toBrett(String pString){
        if(pString.length() != 9){
            print("Invalid init String.");
            return;
        }
        for (int i = 0; i < pString.length(); i++){
            char c = pString.charAt(i);        

            switch(c){
                case '-':
                this.brett[i] = (byte) 0;
                break; 
                case 'X':
                this.brett[i] = (byte) -1;
                break;
                case 'O':
                this.brett[i] = (byte) 1;
                break;
                default:
                print("String not parsable. Illegal char " + c + " at position " + i);
                return;
            }
        }
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        String buffer = "";
        String row1 = "";
        String row2 = "";
        String row3 = "";

        for (byte sign:this.brett){
            buffer = buffer + Byte.toString(sign) + "|";
        }
        buffer = buffer.replaceAll("-1", "X").replaceAll("0", "-").replaceAll("1", "O");

        for (int i = 0; i < buffer.length(); i++){
            switch(i){
                case 5:
                row1 = buffer.substring(0, 5) + "\n";
                break;

                case 11:
                row2 = buffer.substring(6, 11) + "\n";
                break;

                case 17:
                row3 = buffer.substring(12, 17);
                break;
            }
        }

        return row1 + row2 + row3;
    }

    public boolean brettVoll(){
        for(byte sign:this.brett){
            switch(sign){
                case 0:
                return false;
                case 1:
                break;
                case -1:
                break;
            }
        }
        return true;
    }
    
    public boolean zugLegal(byte zug){
        if(this.brett[zug] == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public byte amZug(String pString){
        for (int i = 0; i < pString.length(); i++){
            char c = pString.charAt(i);   
            

            switch(c){
                case '-':
                this.brett[i] = (byte) 0;
                a == a;
                break; 
                case 'X':
                this.brett[i] = (byte) -1;
                a == a -;
                break;
                case 'O':
                this.brett[i] = (byte) 1;
                a == a +;
                break;
                default:
                
               
            }
        }
    }
}
