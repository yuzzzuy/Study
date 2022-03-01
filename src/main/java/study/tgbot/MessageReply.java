//package study.tgbot;
//
//import com.pengrad.telegrambot.TelegramBot;
//import com.pengrad.telegrambot.UpdatesListener;
//import com.pengrad.telegrambot.model.CallbackQuery;
//import com.pengrad.telegrambot.model.ChosenInlineResult;
//import com.pengrad.telegrambot.model.InlineQuery;
//import com.pengrad.telegrambot.model.Update;
//import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
//import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
//import com.pengrad.telegrambot.request.GetUpdates;
//import com.pengrad.telegrambot.request.SendMessage;
//import com.pengrad.telegrambot.response.GetUpdatesResponse;
//import lombok.extern.slf4j.Slf4j;
//
//import java.util.List;
//
///**
// * @author WangChen
// * @date 2022/3/1 11:20
// * @description
// */
//@Slf4j
//public class MessageReply {
//
//
//    public static void main(String[] args) {
//        System.out.println("!11");
//        TelegramBot bot = new TelegramBot("5208611051:AAFHaIaqXLUJfw4LbFufkeq7-bLMgl8fzI8");
//
//
////        SendSticker sticker = new SendSticker(1494627839L, "https://img0.baidu.com/it/u=857510153,4267238650&fm=253&fmt=auto&app=120&f=JPEG?w=1200&h=675");
////
////
////        InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(new InlineKeyboardButton[]{new InlineKeyboardButton("google").switchInlineQueryCurrentChat("google"), new InlineKeyboardButton("callback_data").callbackData("callback"), new InlineKeyboardButton("Switch!").callbackData("switch")});
////        sticker.replyMarkup(inlineKeyboard);
////
////        SendResponse execute = bot.execute(sticker);
//
//
//        bot.setUpdatesListener(updates -> {
//            GetUpdatesResponse updatesResponse = bot.execute(new GetUpdates());
//            List<Update> updatesList = updatesResponse.updates();
//            InlineQuery inlineQuery = updatesList.get(0).inlineQuery();
//            ChosenInlineResult chosenInlineResult = updatesList.get(0).chosenInlineResult();
//            CallbackQuery callbackQuery = updatesList.get(0).callbackQuery();
//
//
//            for (Update update : updates) {
//                if (update.callbackQuery() != null) {
//                    SendMessage sn = new SendMessage(1494627839L, "1");
//                    InlineKeyboardMarkup inlineKeyboard2 = new InlineKeyboardMarkup(new InlineKeyboardButton[]{new InlineKeyboardButton("baidu").switchInlineQuery("11"), new InlineKeyboardButton("callback_data").callbackData("callback"), new InlineKeyboardButton("Switch!").callbackData("switch")});
//                    sn.replyMarkup(inlineKeyboard2);
//                    bot.execute(sn);
//                    continue;
//                }
//
//                if (update.message() != null) {
//                    long chatId = update.message().chat().id();
//                    SendMessage textMessage = new SendMessage(chatId, "TEXT");
//                    InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(
//                            new InlineKeyboardButton[]{
//                                    new InlineKeyboardButton("google").callbackData("google"),
//                                    new InlineKeyboardButton("callback_data").callbackData("callback"),
//                                    new InlineKeyboardButton("Switch!").callbackData("switch")
//                            });
//                    textMessage.replyMarkup(inlineKeyboard);
//                    bot.execute(textMessage);
//                    continue;
//                }
//
//
//                //普通文本
////                SendMessage textMessage = new SendMessage(chatId, "TEXT");
//
//
//                //发送消息后 的 强制回复 和 移除回复 (直接引用)
////                Keyboard forceReply = new ForceReply(); // or just new ForceReply();
////                Keyboard replyKeyboardRemove = new ReplyKeyboardRemove(); // new ReplyKeyboardRemove(isSelective)
////                textMessage.replyMarkup(forceReply);
////                textMessage.replyMarkup(replyKeyboardRemove);
//
//                //键盘按钮
////                Keyboard keyboard = new ReplyKeyboardMarkup(
////                        new KeyboardButton[]{
////                                new KeyboardButton("text"),
////                                new KeyboardButton("contact").requestContact(true),
////                                new KeyboardButton("location").requestLocation(true)
////                        }
////                );
////                textMessage.replyMarkup(keyboard);
//
//
////                //内联回复
////                InlineKeyboardMarkup inlineKeyboard = new InlineKeyboardMarkup(
////                        new InlineKeyboardButton[]{
////                                new InlineKeyboardButton("google").callbackData("google"),
////                                new InlineKeyboardButton("callback_data").callbackData("callback"),
////                                new InlineKeyboardButton("Switch!").callbackData("switch")
////                        });
////
////
////
////                textMessage.replyMarkup(inlineKeyboard);
////
////                bot.execute(textMessage);
////
////
////
////                InlineQueryResult r1 = new InlineQueryResultPhoto("id", "photoUrl", "thumbUrl");
////                InlineQueryResult r2 = new InlineQueryResultArticle("id", "title", "message text").thumbUrl("url");
////                InlineQueryResult r3 = new InlineQueryResultGif("id", "gifUrl", "thumbUrl");
////                InlineQueryResult r4 = new InlineQueryResultMpeg4Gif("id", "mpeg4Url", "thumbUrl");
////
////                InlineQueryResult r5 = new InlineQueryResultVideo(
////                        "id", "videoUrl", InlineQueryResultVideo.MIME_VIDEO_MP4, "message", "thumbUrl", "video title")
////                        .inputMessageContent(new InputLocationMessageContent(21.03f, 105.83f));
////
////                bot.execute(new AnswerInlineQuery("google", r1, r2, r3, r4, r5));
//
//            }
//
//            return UpdatesListener.CONFIRMED_UPDATES_ALL;
//        });
//
//    }
//}
