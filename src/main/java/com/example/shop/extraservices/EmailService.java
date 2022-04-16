package com.example.shop.extraservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
@Transactional
public class EmailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Async
    public void sendEmail() {

        SimpleMailMessage message = new SimpleMailMessage();
        // Необходимо указать адрес электронной почты отправителя
          message.setFrom("microsoftcraft@mail.ru");

        // Необходимо указать адрес электронной почты получателя
        message.setTo("microsoftcraft@mail.ru");

        // Установить тему: поле заголовка
        message.setSubject("Flowers-Shop( Max-Shop )");

        //  сообщение
        message.setText("Спасибо, что выбрали нас ");
        javaMailSender.send(message);


    }
}