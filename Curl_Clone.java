import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class Curl_Clone{

  //Get(オプション無し)
  public void Get(){
    
  }
}

public void WriteTextFile() {
  try {
      //出力先を作成する
      FileWriter fw = new FileWriter("Text"); 
      fw.write("Text");
      fw.close();

  } catch (IOException ex) {
      //例外時処理
      ex.printStackTrace();
  }
}

class Main{
    public static void main(String args[]){
      Curl_Clone Curl = new Curl_Clone();
      int i;
        
      if(args.length == 0){
        Curl.Get()

      }
      else if(args.length != 0){
        for(i = 0;  i < args.length; i++){
          if(args[i].equals("-o")){
            
          }
          if(args[i].equals("-o")){
            
          } 
          if(args[i].equals("-o")){
            
          } 
          if(args[i].equals("-o")){
            
          } 
        }
      }
    }
  }