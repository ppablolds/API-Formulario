package br.com.PabloSilva.formulario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailSendController {

    @Autowired
    private EmailSendService emailSendService;

    public EmailSendController(EmailSendService emailSendService) {
        this.emailSendService = emailSendService;
    }

    @PostMapping("/send")
    public String sendEmail(@RequestBody EmailSend emailSend) {
        emailSendService.sendEmail(emailSend.to(), emailSend.subject(), emailSend.body());
        return "Email sent successfully";
    }
}
