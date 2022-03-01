package study.tgbot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

/**
 * @author WangChen
 * @date 2022/3/1 17:35
 * @description
 */
public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "raninbot";
    }

    @Override
    public String getBotToken() {
        return "5208611051:AAFPH66uAbQxPYCSPMK2feVZu5BP40DoYCw";
    }

    @Override
    public void onUpdateReceived(Update update) {
// We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Create a SendMessage object with mandatory fields
            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            try {
                // Call method to send the message
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }
}
