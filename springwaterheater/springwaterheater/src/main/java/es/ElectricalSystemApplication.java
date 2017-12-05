package es;

        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.context.ApplicationContext;
        import es.powerbutton.PowerButton;
        import org.springframework.boot.*;

@SpringBootApplication
public class ElectricalSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(ElectricalSystemApplication.class,args);

        ApplicationContext ctx=SpringApplication.run(ElectricalSystemApplication.class,args);
        ctx.getBean(PowerButton.class).click();

        //  Lamp es.lamp = new Lamp();
        // PowerButton lampButton = new PowerButton(new es.PowerButtonLampAdapte(es.lamp));
        //  lampButton.click();

        // Fan es.fan = new Fan();
        //  PowerButton fanButton = new PowerButton(new es.PowerButtonFanAdapter(es.fan));
        // fanButton.click();
    }
}