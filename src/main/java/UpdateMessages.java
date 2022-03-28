import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.toIntExact;

public class UpdateMessages extends TelegramLongPollingBot {
    List<String> links = new ArrayList<>();
    public int n = 1;
    @Override
    public void onUpdateReceived(Update update) {
addFiles();
//            if (message_text.equals("/start")) {
//                String welcome = "Вітаю\uD83C\uDDFA\uD83C\uDDE6️," +
//                        "Цей бот як і багато інших мають одну функцію - знищити россійське дезінформаційне поле." +
//                        "\n Що робить цей бот?" +
//                        " - Цей бот створений аби ви блокували канали, які поширюють інформацю щодо українського війська, та вторгнення росіїї в Україну." +
//                        "Для продовження оберіть відповідний пунк меню:";
//                SendMessage message = new SendMessage();
//                message.setChatId(String.valueOf(chatId));
//                message.setText(welcome);
//
//
////                //Keyboard rows
//                ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//                List<KeyboardRow> keyboardRows = new ArrayList<>(); //array of rows
//
//                KeyboardRow keyboardRow = new KeyboardRow(); //first row
//                KeyboardRow keyboardRow2 = new KeyboardRow();    //second row
//
//                //First row buttons
//                KeyboardButton button1 = new KeyboardButton();
//                button1.setText("Отримати покликання\uD83D\uDD17");
//
//                KeyboardButton button2 = new KeyboardButton();
//                button2.setText("Додати канал\uD83D\uDCE9");
//
//
//                keyboardRow.add(button1);
//                keyboardRow.add(button2);
//
//                //Second row buttons
//                KeyboardButton button11 = new KeyboardButton();
//                button11.setText("Інформація\uD83D\uDC68\u200D\uD83D\uDCBB");
//
//                KeyboardButton button22 = new KeyboardButton();
//                button22.setText("Статистика\uD83C\uDFC6");
//
//                //Adding rows
//                keyboardRow2.add(button11);
//                keyboardRow2.add(button22);
//                //Adding a keyboard
//                keyboardRows.add(keyboardRow);
//                keyboardRows.add(keyboardRow2);
//
//
//                replyKeyboardMarkup.setResizeKeyboard(true);
//                replyKeyboardMarkup.setKeyboard(keyboardRows);
//                message.setReplyMarkup(replyKeyboardMarkup);
//
//
//                try {
//                    execute(message);
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//            } else if (message_text.equals("Отримати покликання\uD83D\uDD17")
//                    || message_text.equals("/link")) {
//                SendMessage message = new SendMessage();
//                message.setChatId(String.valueOf(chatId));
//                message.setText("\uD83D\uDD17Лінк на блокування, який поширює неправдиву інформацію про українське військо: ");
//
//                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
//                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
//                List<InlineKeyboardButton> rowInline = new ArrayList<>();
//                InlineKeyboardButton in = new InlineKeyboardButton();
//                in.setText("Отримати текст скарги\uD83D\uDCC3");
//                in.setCallbackData("update_msg_text");
//                rowInline.add(in);
//
//                // Set the keyboard to the markup
//                rowsInline.add(rowInline);
//                // Add it to the message
//                markupInline.setKeyboard(rowsInline);
//                message.setReplyMarkup(markupInline);
//
//                SendMessage message1 = new SendMessage();
//                message1.setChatId(String.valueOf(chatId));
//                message1.setText(links.get(n));
//
//
//                try {
//                    execute(message);
//                    execute(message1);
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//            }
//
//
//        }

        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            if (message_text.equals("/start")) {
                String welcome = "Вітаю\uD83C\uDDFA\uD83C\uDDE6️," +
                        "Цей бот як і багато інших мають одну функцію - знищити россійське дезінформаційне поле." +
                        "\n Що робить цей бот?" +
                        " - Цей бот створений аби ви блокували канали, які поширюють інформацю щодо українського війська, та вторгнення росіїї в Україну." +
                        "Для продовження оберіть відповідний пунк меню:";
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText(welcome);


//                //Keyboard rows
                ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
                List<KeyboardRow> keyboardRows = new ArrayList<>(); //array of rows

                KeyboardRow keyboardRow = new KeyboardRow(); //first row
                KeyboardRow keyboardRow2 = new KeyboardRow();    //second row

                //First row buttons
                KeyboardButton button1 = new KeyboardButton();
                button1.setText("Отримати покликання\uD83D\uDD17");

                KeyboardButton button2 = new KeyboardButton();
                button2.setText("Додати канал\uD83D\uDCE9");


                keyboardRow.add(button1);
                keyboardRow.add(button2);

                //Second row buttons
                KeyboardButton button11 = new KeyboardButton();
                button11.setText("Інформація\uD83D\uDC68\u200D\uD83D\uDCBB");

                KeyboardButton button22 = new KeyboardButton();
                button22.setText("Отримати текст скарги\uD83D\uDCC3");

                //Adding rows
                keyboardRow2.add(button11);
                keyboardRow2.add(button22);
                //Adding a keyboard
                keyboardRows.add(keyboardRow);
                keyboardRows.add(keyboardRow2);


                replyKeyboardMarkup.setResizeKeyboard(true);
                replyKeyboardMarkup.setKeyboard(keyboardRows);
                message.setReplyMarkup(replyKeyboardMarkup);


                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
//            } else if (message_text.equals("Отримати покликання\uD83D\uDD17")
//                    || message_text.equals("/link")) {
//                SendMessage message = new SendMessage();
//                message.setChatId(String.valueOf(chat_id));
//                message.setText("\uD83D\uDD17Лінк на блокування, який поширює неправдиву інформацію про українське військо: ");
//
//                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
//                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
//                List<InlineKeyboardButton> rowInline = new ArrayList<>();
//                InlineKeyboardButton in = new InlineKeyboardButton();
//                in.setText("Отримати текст скарги\uD83D\uDCC3");
//                in.setCallbackData("update_msg_text");
//                rowInline.add(in);
//
//                // Set the keyboard to the markup
//                rowsInline.add(rowInline);
//                // Add it to the message
//                markupInline.setKeyboard(rowsInline);
//                message.setReplyMarkup(markupInline);
//
//                SendMessage message1 = new SendMessage();
//                message1.setChatId(String.valueOf(chat_id));
//                message1.setText(links.get(n));
//
//
//                try {
//                    execute(message);
//                    execute(message1);
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//            }

            }
            if (update.getMessage().getText().equals("Отримати покликання\uD83D\uDD17")||update.getMessage().getText().equals("/link")) {
                SendMessage message = new SendMessage();

                message.setChatId(String.valueOf(chat_id));
                message.setText("\uD83D\uDD17Лінк на блокування, який поширює неправдиву інформацію про українське військо: ");
                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
                List<InlineKeyboardButton> rowInline = new ArrayList<>();
                InlineKeyboardButton in = new InlineKeyboardButton();
                in.setText("Виконав✅");
                in.setCallbackData("update_msg_text");
                rowInline.add(in);
                // Set the keyboard to the markup
                rowsInline.add(rowInline);
                // Add it to the message
                markupInline.setKeyboard(rowsInline);
                message.setReplyMarkup(markupInline);


                Random rd = new Random();
                SendMessage message1 = new SendMessage();
                message1.setChatId(String.valueOf(chat_id));
                message1.setText(links.get(rd.nextInt(links.size())));
                try {
                    execute(message); // текст
                   execute(message1); // лінк
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getMessage().getText().equals("Додати канал\uD83D\uDCE9")||update.getMessage().getText().equals("/addC")){
                String welcome = "Для відправки лінк на канал, пишіть мені: https://t.me/crim3ss \n ❗️Пам'ятайте, за дезінформацю кров за наших побратимів буде лежати також на ваших ладонях!";
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText(welcome);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (update.getMessage().getText().equals("Інформація\uD83D\uDC68\u200D\uD83D\uDCBB")||update.getMessage().getText().equals("/info")){
                String welcome = "\uD83D\uDD25Данний бот був зроблений для швидкого та массового блокування россійських ресурсів, котрі поширюють дезінформацію, поки їх війська вбивають наших військових та цивільних людей. Сподіваюся, що всі чати та канали котрі знаходяться в базі бота раз і назавжди зникнуть!\n" +
                        "⚡️ІНСТРУКЦІЯ З КОРИСТУВАННЯ⚡️: 1.Перед початком блокування каналів, отримайте текст скарг котрі ви будете відсилати, це зроблено для вашої зручності та швидкості роботи.\n" +
                        "2.Після отримання та копіювання тексту, натискаєте на кнопку меню з отримання лінку на канал ворога." +
                        "\n3.Переходите в канал і одразу блокуєте його. (Рекомендую від себе навіть не починати поглиблюватися в суть того що там буде)" +
                        "\n4.Після успішного блокування повертайтеся до бота та наискайте відповідну кнопку. Дякую всім небайдужим за співпрацю, Слава Україні! Ми вистоїмо, ми переможемо!";
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText(welcome);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (update.getMessage().getText().equals("Отримати текст скарги\uD83D\uDCC3")){
                String welcome ="Даний канал розповсюджує неправдиву інформацію стосовно війни в Україні, та пригнічує суверенність України та його народу. #StopWar";
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText(welcome);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }

        }
        else if (update.hasCallbackQuery()) {
            // Set variables
            String call_data = update.getCallbackQuery().getData();
            long message_id = update.getCallbackQuery().getMessage().getMessageId();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals("update_msg_text")) {
                String answer = "Дякуємо! Разом ми сильні!\uD83C\uDDFA\uD83C\uDDE6❤️\u200D\uD83E\uDE79";
                EditMessageText new_message = new EditMessageText();
                new_message.setChatId(String.valueOf(chat_id));
                new_message.setMessageId(toIntExact(message_id));
                new_message.setText(answer);
                try {
                    execute(new_message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    private void addFiles() {
        links.add("https://t.me/news_dnr");
        links.add("https://t.me/chp_donetsk_dnr");
        links.add("https://t.me/torez");
        links.add("https://t.me/shahtersk");
        links.add("https://t.me/chatdokuchaevsk");
        links.add("https://t.me/dnrtg");
        links.add("https://t.me/Donbass_obshenie");
        links.add("https://t.me/itsdonetsk");
        links.add("https://t.me/dontel");
        links.add("https://t.me/Doninside");
        links.add("https://t.me/dnronline");
        links.add("https://t.me/nm_dnr");
        links.add("https://t.me/online_dnr_sckk");
        links.add("https://t.me/granicaRF2DPR");
        links.add("https://t.me/shtabDNR");
        links.add("https://t.me/Batman_DNR");
        links.add("https://t.me/s/swodki");
        links.add("https://t.me/dnronline");
        links.add("https://t.me/TRO_DPR");
        links.add("https://t.me/znrznr");
        links.add("https://t.me/aupch_dnr");
        links.add("https://t.me/maydnr");
        links.add("https://t.me/millnr");
        links.add("https://t.me/LPR_JCCC");
        links.add("https://t.me/mid_lnr");
        links.add("https://t.me/s/vv_volodin/311");
        links.add("https://t.me/LPR_JCCC");
        links.add("https://t.me/s/luganskallnews");
        links.add("https://t.me/s/od_les_lnr");
        links.add("https://t.me/postLNR");
        links.add("https://t.me/MID_LNR_BOT");
        links.add("https://t.me/opoveshenie");
        links.add("https://t.me/narodnoe_opolchenie");
        links.add("https://t.me/s/Chp_donetsk");
        links.add("https://t.me/s/kulemzin_donetsk");
        links.add("https://t.me/s/vmakeevke");
        links.add("https://t.me/s/juul_dn");
        links.add("https://t.me/mojlugansk");
        links.add("https://t.me/rybar");
       links.add("https://t.me/voenkorKotenok");
       links.add("https://t.me/DmitriySteshin");
       links.add("https://t.me/neoficialniybezsonov");
       links.add("https://t.me/vysokygovorit");
       links.add("https://t.me/milinfolive");
       links.add("https://t.me/politavr1");
    }

    @Override
    public String getBotUsername() {
        return "Stop Russian Fake";
    }

    @Override
    public String getBotToken() {
        return "5253699674:AAGdYeE673cmOnxOjzhveRvSRg9vQ1PzqGQ";
    }
}