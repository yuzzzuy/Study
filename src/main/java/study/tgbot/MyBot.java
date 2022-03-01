package study.tgbot;

import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;
import org.telegram.telegrambots.meta.generics.BotOptions;
import org.telegram.telegrambots.meta.generics.LongPollingBot;

/**
 * @author WangChen
 * @date 2022/3/1 17:39
 * @description
 */
public class MyBot implements LongPollingBot {


    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public BotOptions getOptions() {
        return null;
    }

    @Override
    public void clearWebhook() throws TelegramApiRequestException {

    }

    @Override
    public String getBotUsername() {
        return null;
    }

    @Override
    public String getBotToken() {
        return null;
    }
}