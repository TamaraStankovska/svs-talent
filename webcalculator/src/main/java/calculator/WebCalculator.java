package calculator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Calculate")
public class WebCalculator extends HttpServlet {


    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("com.seavus.calendar.CalendarServlet.doGet");
        printOperation(req, res);

    }


    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("com.seavus.calendar.CalendarServlet.doPost");
        printOperation(req, res);

    }

    private void printOperation(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String number1 = req.getParameter("num1");
        int num1 = Integer.parseInt(number1);


        String number2 = req.getParameter("num2");
        int num2 = Integer.parseInt(number2);

        String entry = req.getParameter("operator");
        int result = 0;


        switch (entry) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;


        }
    }
}