import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
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

    public int n = 0;

    @Override
    public void onUpdateReceived(Update update) {
        addFiles();
        int size = links.size();
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
                KeyboardRow keyboardRow3 = new KeyboardRow();    //second row

                //First row buttons
                KeyboardButton button1 = new KeyboardButton();
                button1.setText("Отримати покликання\uD83D\uDD17");

                KeyboardButton button2 = new KeyboardButton();
                button2.setText("Додати канал\uD83D\uDCE9");


                KeyboardButton button3 = new KeyboardButton();
                button3.setText("Статистика\uD83D\uDE80");

                keyboardRow.add(button1);
                keyboardRow.add(button2);

                keyboardRow3.add(button3);
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
                keyboardRows.add(keyboardRow3);


                replyKeyboardMarkup.setResizeKeyboard(true);
                replyKeyboardMarkup.setKeyboard(keyboardRows);
                message.setReplyMarkup(replyKeyboardMarkup);


                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getMessage().getText().equals("Отримати покликання\uD83D\uDD17") || update.getMessage().getText().equals("/link")) {
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
                    execute(message1); // лінк
                    execute(message); // текст
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (update.getMessage().getText().equals("Додати канал\uD83D\uDCE9") || update.getMessage().getText().equals("/addC")) {
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
            if (update.getMessage().getText().equals("Інформація\uD83D\uDC68\u200D\uD83D\uDCBB") || update.getMessage().getText().equals("/info")) {
//                String welcome = "\uD83D\uDD25Данний бот був зроблений для швидкого та массового блокування россійських ресурсів, котрі поширюють дезінформацію, поки їх війська вбивають наших військових та цивільних людей. Сподіваюся, що всі чати та канали котрі знаходяться в базі бота раз і назавжди зникнуть!\n" +
//                        "⚡️ІНСТРУКЦІЯ З КОРИСТУВАННЯ⚡️: 1.Перед початком блокування каналів, отримайте текст скарг котрі ви будете відсилати, це зроблено для вашої зручності та швидкості роботи.\n" +
//                        "2.Після отримання та копіювання тексту, натискаєте на кнопку меню з отримання лінку на канал ворога." +
//                        "\n3.Переходите в канал і одразу блокуєте його. (Рекомендую від себе навіть не починати поглиблюватися в суть того що там буде)" +
//                        "\n4.Після успішного блокування повертайтеся до бота та наискайте відповідну кнопку. Дякую всім небайдужим за співпрацю, Слава Україні! Ми вистоїмо, ми переможемо!";
                String welcome = "\uD83D\uDD0DІнформаційний розділ.\uD83D\uDD0D" +
                        "\nЗробив його для того, щоб відповісти на основні питання які можуть у вас виникнути\n" +
                        "✏️Для продовження оберіть відповідний пункт меню: ";

                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText(welcome);
                InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
                List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
                List<InlineKeyboardButton> rowInline = new ArrayList<>();
                List<InlineKeyboardButton> rowInline2 = new ArrayList<>();

                InlineKeyboardButton in = new InlineKeyboardButton();
                in.setText("️️⚡ІНСТРУКЦІЯ З КОРИСТУВАННЯ⚡");
                in.setCallbackData("update_msg_text_info");
                rowInline.add(in);

                InlineKeyboardButton in2 = new InlineKeyboardButton();
                in2.setText("️️\uD83D\uDCCCПРО ПРОЕКТ\uD83D\uDCCC");
                in2.setCallbackData("update_msg_text_about");
                rowInline2.add(in2);
                // Set the keyboard to the markup
                rowsInline.add(rowInline);
                rowsInline.add(rowInline2);
                // Add it to the message
                markupInline.setKeyboard(rowsInline);
                message.setReplyMarkup(markupInline);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (update.getMessage().getText().equals("Отримати текст скарги\uD83D\uDCC3")) {
                String welcome = "Канал підриває цілісність української держави. Поширення фейкових новин, введення в оману людей. Дуже багато постів із погрозами на адресу українців та українських солдатів. Заблокуйте його якнайшвидше!";
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText(welcome);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
            if (update.getMessage().getText().equals("Статистика\uD83D\uDE80") || update.getMessage().getText().equals("/stat")) {
                String welcome = "\uD83C\uDDFA\uD83C\uDDE6❤️\u200D\uD83E\uDE79Статистика по боту: \n" +
                        "Даний розділ був зроблений для того, аби ви побачили кількість ресурсів на які ви подали скарги.\n" +
                        "⚡Заблоковано вами каналів: " + n;
                SendMessage message = new SendMessage();
                message.setChatId(String.valueOf(chat_id));
                message.setText(welcome);
                try {
                    execute(message);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

        } else if (update.hasCallbackQuery()) {
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
                    n++;
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (call_data.equals("update_msg_text_info")) {
                String answer = "⚡ІНСТРУКЦІЯ З КОРИСТУВАННЯ⚡\n" +
                        " 1.Перед початком блокування каналів, отримайте текст скарг котрі ви будете відсилати, це зроблено для вашої зручності та швидкості роботи.\n" +
                        "2.Після отримання та копіювання тексту, натискаєте на кнопку меню з отримання лінку на канал ворога.\n" +
                        "3.Переходите в канал і одразу блокуєте його. (Рекомендую від себе навіть не починати поглиблюватися в суть того що там буде)\n" +
                        "4.Після успішного блокування повертайтеся до бота та наискайте відповідну кнопку. Дякую всім небайдужим за співпрацю, Слава Україні! Ми вистоїмо, ми переможемо!";
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
            if (call_data.equals("update_msg_text_about")) {
                String answer = "\uD83D\uDCCCПРО ПРОЕКТ\uD83D\uDCCC\n" +
                        "Данний бот був зроблений для швидкого та массового блокування россійських ресурсів, котрі поширюють дезінформацію, поки їх війська вбивають наших військових та цивільних людей. Сподіваюся, що всі чати та канали котрі знаходяться в базі бота раз і назавжди зникнуть!";
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
        links.add("t.me/makslorannn");
        links.add("t.me/Krymchanin_Z");
        links.add("t.me/R15ru");
        links.add("t.me/russica2");
        links.add("t.me/rossia8");
        links.add("t.me/makslorannn");
        links.add("t.me/makslorannn");
        links.add("t.me/rossia8");
        links.add("t.me/utopiyaproject");
        links.add("t.me/russica2");
        links.add("t.me/R15ru");
        links.add("t.me/Krymchanin_Z");
        links.add("https://t.me/ostashkonews");
        links.add("https://t.me/zheltyeslivy");

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
