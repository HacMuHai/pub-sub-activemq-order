//package vn.edu.iuh.fit.activemq;
//
//import com.google.gson.Gson;
//import org.springframework.jms.annotation.JmsListener;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Component;
//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.TextMessage;
//import java.util.Map;
//@Component
//public class ProductOrderListener {
//    @JmsListener(destination = "order_products")
//    public void receiveMessage(final Message jsonMessage) throws JMSException {
//        String messageData = null;
//        String response = null;
//        if(jsonMessage instanceof TextMessage) {
////1. read message data
////2. ==> decode
////3. check for quantity
////4. make order or reject
////5. send email
//        }
//    }
//}
