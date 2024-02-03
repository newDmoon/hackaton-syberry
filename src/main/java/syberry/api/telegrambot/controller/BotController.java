package syberry.api.telegrambot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import syberry.api.telegrambot.Bot;

@RestController
@CrossOrigin
public class BotController {

    @Autowired
    private Bot bot;

    @GetMapping("")
    public ResponseEntity<?> getBotName() {
        return ResponseEntity.ok(bot.getBotUsername() + " " + bot.getBotToken());
    }
}
