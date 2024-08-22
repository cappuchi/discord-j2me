package language;

public class tr implements Language {
    public tr() {}
    public String[] getStrings() { return strings; }

    static final String[] strings = {
        // Translation notes:
        // - Any line that begins with a "//" is a comment and is ignored.
        //   In this file, comments are used for explaining each string.
        // - Write your translated string inside the two quotation marks.
        // - If you need to use a quotation mark inside any of your translated
        //   strings, write it as \" instead.
        // - If the original string has any special formatting
        //   (e.g. space at the beginning or end), keep the formatting the same.
        // - If you want the English text to be shown for a specific string,
        //   replace the string with null (without any quotation marks).
        // - For any Discord-specific terminology (e.g. servers), use the same
        //   translated term that Discord officially uses for your language.

        // Notes about softkey command labels:
        // - Each softkey label has two variations, a short and a long one.
        // - In this translation file, the short labels are listed above the long ones.
        // - Short labels are used in places where there is limited screen space.
        // - Keep short labels as short as possible, ideally below 10 characters.
        //   If needed, you may use abbreviations.
        // - If a long label is short enough to where it could be used as a
        //   short label, use the same string for both labels.

        // Placeholder file name shown when the name of an attachment in the attachment view screen could not be loaded.
        "İsimsiz dosya",

        // Title text for the attachment picker (native file picker) screen.
        "Dosya seçin",

        // Softkey labels for going back to the previous screen.
        "Geri",
        "Geri",

        // Softkey label for closing a menu.
        // Currently used in the attachment picker for closing the whole picker (because there is also a "Back" softkey for going back one directory)
        "Kapat",
        "Kapat",

        // Title text for attachment view screen.
        "Ekli dosyalar",

        // Softkey labels for refetching contents of channel view or attachment view.
        "Yenile",
        "Yenile",

        // Softkey labels used in channel or DM list for marking the selected channel or DM as read.
        "Okndu olr iş",
        "Okundu olarak işaretle",

        // Softkey labels used in channel and DM lists for marking every DM or every channel in the currently shown server as read.
        "Hepsini okndu iş",
        "Hepsini okundu işaretle",

        // Generic "Select" softkey labels.
        "Seç",
        "Seç",

        // Softkey labels for sending a message in the currently open channel.
        "Gönder",
        "Mesaj gönder",

        // Softkey labels for sending a reply to the selected message.
        "Yanıtla",
        "Yanıtla",

        // Softkey labels for sending an attachment in the currently open channel.
        "Yükle",
        "Dosya yükle",

        // Softkey labels for copying the text content of the selected message.
        "Kopyala",
        "Mesajı kopyala",

        // Softkey labels for editing the selected message.
        "Düzenle",
        "Düzenle",

        // Softkey labels for deleting the selected message.
        "Sil",
        "Sil",

        // Softkey labels for selecting an URL in the selected message. This opens a screen where each URL found in the message is listed, and one can be selected to be opened in the device's browser.
        "URL\\i aç",
        "URL\\i aç",

        // Channel view title suffix when reading older messages.
        " (eski)",

        // Text shown at the center of the channel view when it is empty (no messages).
        "Burada mesaj yok",

        // Channel view banner text shown when reading older messages and a new message arrives via the gateway.
        "Yeni mesajlar için yenileyin",

        // Channel view banner text shown when a gateway disconnect occurred and an automatic reconnect is in progress.
        "Yeniden bağlanıyor",

        // Channel view banner shown when a message is being sent by the client.
        "Mesaj gönderiliyor",

        // Channel view banner shown when a message is being edited by the client.
        "Mesajı düzenle",

        // Channel view banner shown when a message is being deleted by the client.
        "Mesaj siliniyor",

        // Channel view banner shown when messages are being loaded, e.g. during a refresh or after a message was sent by the client.
        "Mesajlar yükleniyor",

        // Suffix for channel view banner text when one person is typing.
        // Example: "aa is typing"
        " yazıyor",

        // Suffix for channel view banner text when two or three people are typing.
        // Example: "aa, bb, cc are typing"
        " yazıyor",

        // Suffix for channel view banner text when more than three people are typing.
        // Example: "4 people are typing"
        " kişi yazıyor",

        // Comma separator used to separate usernames in the channel view banner text shown when people are typing.
        ", ",

        // Error messages shown when trying to upload a file, delete a message, or edit a message, and the current proxy server is a direct HTTPS-HTTP proxy (and not a Discord J2ME specific proxy)
        "Bu proxy dosya yüklemeyi desteklemiyor",
        "Bu proxy mesaj silmeyi desteklemiyor",
        "Bu proxy mesaj düzenlemeyi desteklemiyor",

        // Error message shown when trying to open the native file picker and the device does not support the J2ME FileConnection API.
        "FileConnection API desteklenmiyor",

        // Button labels for navigating between pages of messages in the channel view. Try to keep these as long as (or shorter than) the English strings.
        // In the old channel view, these are shown as softkey labels (these strings are short and long variations of each)
        "Eski",
        "Eski mesajları gör",
        "Yeni",
        "Yeni mesajları gör",

        // Parts of the button label for viewing attachments of a message.
        // Examples: "View 1 attachment", "View 2 attachments"
        "Görüntüle",
        " dosya",
        " dosya",

        // Title for confirmation screen shown when deleting a message.
        "Sil",

        // Body text for confirmation screen shown when deleting a message.
        "Bu mesaj silinsin mi?",

        // Generic softkey labels.
        "Evet",
        "Evet",
        "Hayır",
        "Hayır",
        "Tm",
        "Tamam",

        // Placeholder name shown when fetching the name of an item (e.g. message author or DM) failed.
        "(bilinmiyor)",

        // Placeholder shown when the recipient message of a reply does not have any text content.
        "(içerik yok)",

        // Placeholder message content shown when a message does not have any content that is supported by Discord J2ME.
        "(desteklenmeyen mesaj)",

        // Message content shown for a message that has been deleted.
        "(mesaj silinmiş)",

        // Title text for direct message search screen.
        "DM ara",

        // Guide text for text field in direct message search and "insert mention" screens.
        "Kullanıcı adı girin",

        // Error message shown when the searched user was not found in the direct messages list. Discord J2ME cannot initiate DM conversations based on only a username, so this message asks the user to use another client.
        "Kullanıcı bulunamadı. Başka bir uygulama ile DM oluşturmayı deneyin.",

        // Title text for direct message list.
        "Direkt Mesaj",

        // Generic "Search" softkey label. Currently used for searching for usernames in direct messages and when inserting a mention/ping.
        "Ara",
        "Ara",

        // Title text shown for all error message screens.
        "Hata",

        // Title text shown for guild (server) selector.
        "Sunucular",

        // Title text shown for favorite servers list.
        "Favoriler",

        // Generic "Remove" softkey command. Currently used for removing a server from the favorites list.
        "Kaldır",
        "Kaldır",

        // Softkey command for adding a server to the favorites list.
        "Favorile",
        "Favori listesine ekle",

        // Text shown when the gateway disconnects due to an error with the heartbeat thread. As this error message is quite technical, you may simplify/generalize it to, for example, "connection error".
        "Yazılımsal hata: ",

        // Error message shown when the supplied authentication token is invalid (HTTP Unauthorized).
        "Tokeni kontrol edin",

        // Prefix of error message shown when the HTTP response has an error code.
        // The full message consists of this string and the code itself,
        // e.g. HTTP error 500
        "HTTP hata kodu ",

        // Error message shown when trying to load attachments and the CDN URL hasn't been set (is empty).
        "CDN URL\\si tanımlanamadı. Eklentiler mevcut degil.",

        // Parentheses. Don't change these unless your language uses a different writing system where a different type of parentheses is normally used.
        " (",
        ")",

        // Softkey labels for showing a text attachment's contents within the app.
        "Görüntüle",
        "Metin olarak görüntüle",

        // Softkey labels for showing an attachment in the device's built-in web browser.
        "Aç",
        "Tarayıcıda aç",

        // Generic "Loading..." text shown in loading screen and in "Insert mention" screen.
        "Yükleniyor...",

        // Loading screen text shown when an attachment is being sent.
        "Gönderiliyor...",

        // Error message prefix shown when an error occurs while uploading an attachment.
        "Dosya yüklemede oluşan hata: ",

        // Generic "Skip" softkey label. Currently used for skipping an action in the key mapper.
        "Atla",
        "Atla",

        // Key press prompt shown in hotkey mapper.
        "Kullanılacak yeni tuşa basın:",

        // Names of hotkey actions shown in the key mapper.
        // These are shown after the "Press the key to use for:" string.
        // "going back" only applies to the chat view, 
        "mesaj gönder",
        "mesajı yanıtla",
        "mesajı kopyala",
        "mesajları yenile",
        "geri dönme",

        // Error message prefix shown when a key has been mapped to an action and the user tried to map the same key to another action. The name of the already mapped action (see above) is written after this prefix.
        "Bu tuş zaten şunun için atanmış ",

        // Title text shown in login screen.
        "Giriş yap",

        // Proxy server warning message shown at the top of the login screen.
        "Sadece güvendiğiniz proxyleri kullanın!",

        // Help message for finding your token. Shown in login screen above the token field.
        "Token tarayıcınızın geliştirici araçları menüsünde bulunabilir (internet ten yardım alın). Yan hesap kullanmanız tavsiye edilir.",

        // "Use Wi-Fi" option shown in login screen on BlackBerry devices.
        "Wi-Fi kullan",

        // Labels of text fields shown in the login screen.
        // You don't need to use these acronyms if they don't make sense in your language. Translations like "Server URL" and "Image server URL" are acceptable too.
        "API URL",
        "CDN URL",
        "Gateway URL",
        "Token",

        // Softkey label for confirming the login options in the login screen.
        "Giriş yap",
        "Giriş yap",

        // Softkey command for exiting the application.
        "Çık",
        "Çık",

        // "Use gateway" option shown in login screen.
        "Gateway kullan",

        // Label for radio button field for token sending options.
        "Tokeni olarak gönder",

        // Token sending options.
        "Header (varsayılan)",
        "JSON",
        "Query parametresi",

        // Error messages shown when trying to login and the token or API URL fields are empty.
        "Lütfen tokeninizi girin",
        "Lütfen bir API URL'si girin",

        // Main menu items.
        // "Log out" brings you back to the login screen where you enter your token and other login settings.
        "Sunucular",
        "Favoriler",
        "Direkt mesajlar",
        "Ayarlar",
        "Oturumu kapat",

        // Title text shown in "Insert mention" screen (for adding a ping when writing a message).
        "Bahsetme ekleyin",

        // Label shown for username search results in "Insert mention" screen. Shown if more than one user matches the username query.
        "Arama sonuçları",

        // Message shown when the username query resulted in no matches in the "Insert mention" screen.
        "Sonuç bulunamadı",

        // Error message shown when selecting "Insert" in the "Insert mention" screen and none of the search results (radio buttons) were picked.
        "Kullanıcı seçilmedi",

        // Prefix and suffix of status message shown when a user has been added to a group DM. The whole message is in the form "added X to the group"
        null,
        " gruba eklendi",

        // Status message shown when a user has left a group DM.
        "gruptan ayrıldı",

        // Prefix and suffix of status message shown when a user has removed another user from a group DM. The whole message is in the form "removed X from the group".
        null,
        " gruptan çıkartıldı",

        // Status messages.
        "bir arama başlattı",
        "grubun ismini değiştirdi",
        "grup simgesini değiştirdi",
        "bir mesaj sabitledi",
        "sunucuya katıldı",
        "sunucuyu boostladı",

        // Prefix of status message shown when a user has boosted the server and the server has reached a certain boosting level. The level is appended to the end of this string, in the form "boosted the server to level X".
        "sunucuyu şu seviyeye boostladı ",

        // Prefix of message content when the message is a sticker.
        // The whole message is in the form of "(sticker: Name)"
        "(sticker: ",

        // Placeholder name for a sticker when the sticker's name could not be fetched.
        "bilinmiyor",

        // Message timestamp hour-minute separator, day-month separator, and AM/PM indicators.
        // Note: order of day and month cannot be changed currently
        ":",
        "/",
        "öö",
        "ös",

        // Softkey labels for inserting a mention/ping in the "send message" screen.
        "Bahset",
        "Bahsetme ekle",

        // Prefixes of title text for "send message" screen.
        // The full title is in the form of "Send message (@user)" or "Send message (#channel)".
        "Send message (@",
        "Send message (#",

        // Error message shown when trying to insert a mention into a message and the gateway connection is not active.
        "Aktif bir gateway bağlantısı gerekir",

        // Title text for "copy message content" screen.
        "Mesajı kopyala",

        // Title text for "edit message content" screen.
        "Mesajı düzenle",

        // Title text for gateway disconnect prompt screen.
        "Bağlantı koptu",

        // Main body text for gateway disconnect prompt screen.
        "Gateway hatası. Yeniden bağlanmak ister misiniz?",

        // Top label for disconnection message shown in gateway disconnect prompt screen. The disconnection message is either a message sent by the Discord gateway (such as "requesting client reconnect") or a Java exception.
        "Mesaj",

        // Prefix for top body text shown in the reply form. The whole top text is in the form "Replying to @user". The contents of the recipient message are shown below this.
        "Yanıtlanıyor ",

        // Top label for the message entry box in the reply form.
        "Mesajınız:",

        // Checkbox for selecting whether to mention/ping the recipient. Shown in the reply form.
        "Yazardan bahset",

        // Title text for settings menu.
        "Ayarlar",

        // Settings screen heading for themes section.
        "Tema",

        // Theme options.
        "Koyu",
        "Açık",
        "Siyah",

        // Settings screen heading for miscellaneous user interface related settings.
        "Kullanıcı arayüzü",

        // Settings option for enabling the old channel view user interface (from version 1.1 and below).
        "Eski arayüzü kullan",

        // Settings option for using 12-hour time format in timestamps.
        "12-saat stili",

        // Settings option for using the Java-based file picker for sending attachments. If disabled, the web-based file picker is used.
        "Dahili dosya seçici",

        // Settings option for automatically reconnecting to the gateway if the connection closes.
        "Gateway oto-bağlantısı",

        // Settings option for enabling icons in server and direct message lists.
        "Server/DM ikonları",

        // Settings option for enabling nickname role colors.
        "İsim renkleri",

        // Settings screen heading for message author font size.
        "Yazarın font boyutu",

        // Font size options.
        "Küçük",
        "Orta",
        "Büyük",

        // Settings screen heading for message content font size.
        "Mesaj içeriğinin boyutu",

        // Settings screen heading for message load count. This is the amount of messages that are loaded and shown at a time.
        "Yüklenecek mesaj sayısı",

        // Settings screen heading for selecting attachment file format.
        "Eklerin formatı",

        // Settings screen heading for maximum attachment size in pixels.
        "Eklerin maks. boyutu",

        // Settings screen heading for profile picture shape.
        // Note: The word "avatar" was used here because "profile picture shape" is too long to fit on one row on some phones, and I didn't want to shorten it as "PFP".
        "Avatar şekli",

        // Settings options for profile picture shape. "Çember (HQ)" çember ama grafiksel olarak gelişmiş hali daha çok kaynak tüketir.
        "Kare",
        "Çember",
        "Çember (HQ)",

        // Settings section for profile picture resolution.
        "Avatar çözünürlüğü",

        // Settings options for profile picture resolution. Placeholder means the PFPs won't get downloaded, but instead a placeholder (username's initials) is shown.
        "Sadece yer tutucular",

        // Resolution options. Used for profile picture resolution and menu icon resolution.
        "Kapalı",
        "16 px",
        "32 px",

        // Settings section for menu icon size.
        "Menu ikon boyutu",

        // Settings section for controlling the display of reply messages.
        "Yanıtları şu şekilde gönder",

        // Settings option to show replies as only the recipient (in the form "Author -> Recipient").
        "Sadece alıcı",

        // Settings option to show replies with the whole recipient message.
        "Tam mesaj",

        // Settings section for hotkey action management.
        "Kısayollar",

        // Settings option to use "default" hotkeys. When enabled, the J2ME game actions (ABCD) are used for hotkey actions, instead of user-defined key bindings. I named it "default" due to the lack of a better term for people who aren't familiar with J2ME development.
        "Varsayılan kısayollar",

        // Softkey label for opening the key remapper in the settings menu. The long variant of the label is shown as the button text.
        "Değiştir",
        "Tuşları değiş",

        // Generic softkey labels. Currently used in settings menu.
        "Kaydet",
        "Kaydet",
        "İptal",
        "İptal",

        // Error message shown when trying to open an URL (e.g. attachment)from the app, but the phone does not support opening URLs while keeping the app running in the background.
        "URL\\nin açılabilmesi için uygulamanın kapatılması gerekir.",

        // Prefix of error message shown when an error occurs when trying to open an URL.
        "URL açılamıyor (",

        // Suffix of error message shown when an error occurs when trying to open an URL. The actual URL is shown after this message.
        ")URL\\yi cihazınızın tarayıcısına manuel olarak kopyalamayı deneyebilirsiniz",

        // Title text for URL list screen ('Open URL' option in channel view).
        "URL\\yi seç",

        // Softkey labels for inserting a mention in the "Insert mention" screen.
        "Ekle",
        "Ekle"
    };
}