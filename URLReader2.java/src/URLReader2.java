import java.net.*;
import java.io.*;
public class URLReader2 {
    public static void main(String[] args)  {
        try {
            URL oracle = new URL("https://www.bcit.ca/");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
            in.close();
        } catch(Exception ex) { }
    }
}
