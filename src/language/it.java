package language;

public class it implements Language {
    public it() {}
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
        "Nome file sconosciuto",

        // Title text for the attachment picker (native file picker) screen.
        "Seleziona allegato",

        // Softkey labels for going back to the previous screen.
        "Indietro",
        "Indietro",

        // Softkey label for closing a menu.
        // Currently used in the attachment picker for closing the whole picker (because there is also a "Back" softkey for going back one directory)
        "Chiudi",
        "Chiudi",

        // Title text for attachment view screen.
        "Allegati",

        // Softkey labels for refetching contents of channel view or attachment view.
        "Aggiorna",
        "Aggiorna",

        // Softkey labels used in channel or DM list for marking the selected channel or DM as read.
        "Segna letto",
        "Segna come già letto",

        // Softkey labels used in channel and DM lists for marking every DM or every channel in the currently shown server as read.
        "Segna tutto letto",
        "Segna tutto come già letto",

        // Generic "Select" softkey labels.
        "Seleziona",
        "Seleziona",

        // Softkey labels for sending a message in the currently open channel.
        "Invia",
        "Invia messaggio",

        // Softkey labels for sending a reply to the selected message.
        "Rispondi",
        "Rispondi",

        // Softkey labels for sending an attachment in the currently open channel.
        "Carica",
        "Carica file",

        // Softkey labels for copying the text content of the selected message.
        "Copia",
        "Copia il testo",

        // Softkey labels for editing the selected message.
        "Modifica",
        "Modifica",

        // Softkey labels for deleting the selected message.
        "Elimina",
        "Elimina",

        // Softkey labels for selecting an URL in the selected message. This opens a screen where each URL found in the message is listed, and one can be selected to be opened in the device's browser.
        "Apri URL",
        "Apri URL",

        // Channel view title suffix when reading older messages.
        " (preced.)",

        // Text shown at the center of the channel view when it is empty (no messages).
        "Nulla da vedere qui",

        // Channel view banner text shown when reading older messages and a new message arrives via the gateway.
        "Aggiorna per nuovi msg.",

        // Channel view banner text shown when a gateway disconnect occurred and an automatic reconnect is in progress.
        "Riconnessione in corso",

        // Channel view banner shown when a message is being sent by the client.
        "Invio messaggio",

        // Channel view banner shown when a message is being edited by the client.
        "Modifica messaggio",

        // Channel view banner shown when a message is being deleted by the client.
        "Elimina messaggio",

        // Channel view banner shown when messages are being loaded, e.g. during a refresh or after a message was sent by the client.
        "Caricando messaggi",

        // Suffix for channel view banner text when one person is typing.
        // Example: "aa is typing"
        " sta scrivendo",

        // Suffix for channel view banner text when two or three people are typing.
        // Example: "aa, bb, cc are typing"
        " stanno scrivendo",

        // Suffix for channel view banner text when more than three people are typing.
        // Example: "4 people are typing"
        " utenti stanno scrivendo",

        // Comma separator used to separate usernames in the channel view banner text shown when people are typing.
        ", ",

        // Error messages shown when trying to upload a file, delete a message, or edit a message, and the current proxy server is a direct HTTPS-HTTP proxy (and not a Discord J2ME specific proxy)
        "Questo proxy non supporta il caricamento dei file",
        "Questo proxy non supporta l'eliminazione dei messaggi",
        "Questo proxy non supporta la modifica dei messaggi",

        // Error message shown when trying to open the native file picker and the device does not support the J2ME FileConnection API.
        "API FileConnection non supportato",

        // Button labels for navigating between pages of messages in the channel view. Try to keep these as long as (or shorter than) the English strings.
        // In the old channel view, these are shown as softkey labels (these strings are short and long variations of each)
        "Vecchi",
        "Vedi vecchi msg.",
        "Nuovi",
        "Vedi nuovi msg.",

        // Parts of the button label for viewing attachments of a message.
        // Examples: "View 1 attachment", "View 2 attachments"
        "Vedi ",
        " allegato",
        " allegati",

        // Title for confirmation screen shown when deleting a message.
        "Elimina",

        // Body text for confirmation screen shown when deleting a message.
        "Elimina questo messaggio?",

        // Generic softkey labels.
        "Si",
        "Si",
        "No",
        "No",
        "OK",
        "OK",

        // Placeholder name shown when fetching the name of an item (e.g. message author or DM) failed.
        "(sconosciuto)",

        // Placeholder shown when the recipient message of a reply does not have any text content.
        "(nessun testo)",

        // Placeholder message content shown when a message does not have any content that is supported by Discord J2ME.
        "(messaggio non supportato)",

        // Message content shown for a message that has been deleted.
        "(messaggio eliminato)",

        // Title text for direct message search screen.
        "Cerca messaggi diretti",

        // Guide text for text field in direct message search and "insert mention" screens.
        "Inserisci nome utente",

        // Error message shown when the searched user was not found in the direct messages list. Discord J2ME cannot initiate DM conversations based on only a username, so this message asks the user to use another client.
        "Utente non trovato. Prova a creare un messaggio diretto da un altro client.",

        // Title text for direct message list.
        "Messaggi diretti",

        // Generic "Search" softkey label. Currently used for searching for usernames in direct messages and when inserting a mention/ping.
        "Cerca",
        "Cerca",

        // Title text shown for all error message screens.
        "Errore",

        // Title text shown for guild (server) selector.
        "Server",

        // Title text shown for favorite servers list.
        "Preferiti",

        // Generic "Remove" softkey command. Currently used for removing a server from the favorites list.
        "Rimuovi",
        "Rimuovi",

        // Softkey command for adding a server to the favorites list.
        "Preferito",
        "Aggiungi ai preferiti",

        // Text shown when the gateway disconnects due to an error with the heartbeat thread. As this error message is quite technical, you may simplify/generalize it to, for example, "connection error".
        "errore Heartbeat thread (errore connessione): ",

        // Error message shown when the supplied authentication token is invalid (HTTP Unauthorized).
        "Controlla il tuo token",

        // Prefix of error message shown when the HTTP response has an error code.
        // The full message consists of this string and the code itself,
        // e.g. HTTP error 500
        "errore HTTP ",

        // Error message shown when trying to load attachments and the CDN URL hasn't been set (is empty).
        "URL CDN non è stato impostato. La visualizzazione degli allegati non è disponibile.",

        // Parentheses. Don't change these unless your language uses a different writing system where a different type of parentheses is normally used.
        " (",
        ")",

        // Softkey labels for showing a text attachment's contents within the app.
        "Mostra",
        "Mostra come testo",

        // Softkey labels for showing an attachment in the device's built-in web browser.
        "Apri",
        "Apri nel browser",

        // Generic "Loading..." text shown in loading screen and in "Insert mention" screen.
        "Caricamento...",

        // Loading screen text shown when an attachment is being sent.
        "Invio allegato...",

        // Error message prefix shown when an error occurs while uploading an attachment.
        "Errore durante l'invio del file: ",

        // Generic "Skip" softkey label. Currently used for skipping an action in the key mapper.
        "Salta",
        "Salta",

        // Key press prompt shown in hotkey mapper.
        "Premi un tasto per:",

        // Names of hotkey actions shown in the key mapper.
        // These are shown after the "Press the key to use for:" string.
        // "going back" only applies to the chat view, 
        "scrivere un messaggio",
        "rispondere a un messaggio",
        "copiare testo del messaggio",
        "aggiornare la chat",
        "tornare indietro",

        // Error message prefix shown when a key has been mapped to an action and the user tried to map the same key to another action. The name of the already mapped action (see above) is written after this prefix.
        "Questo tasto è gia assegnato per ",

        // Title text shown in login screen.
        "Accedi",

        // Proxy server warning message shown at the top of the login screen.
        "Utilizza solo un proxy server di cui ti fidi!",

        // Help message for finding your token. Shown in login screen above the token field.

        "Puoi trovare il tuo token negli strumenti sviluppatore del tuo browser (cerca aiuto online). È preferibile utilizzare un account alternativo per sicurezza.",
        // "Use Wi-Fi" option shown in login screen on BlackBerry devices.
        "Usa il Wi-Fi",

        // Labels of text fields shown in the login screen.
        // You don't need to use these acronyms if they don't make sense in your language. Translations like "Server URL" and "Image server URL" are acceptable too.
        "URL API",
        "URL CDN",
        "URL Gateway",
        "Token",

        // Softkey label for confirming the login options in the login screen.
        "Accedi",
        "Accedi",

        // Softkey command for exiting the application.
        "Esci",
        "Esci",

        // "Use gateway" option shown in login screen.
        "Usa il gateway",

        // Label for radio button field for token sending options.
        "Invia il token come",

        // Token sending options.
        "Header (predefinito)",
        "JSON",
        "Parametro query",

        // Error messages shown when trying to login and the token or API URL fields are empty.
        "Inserisci il tuo token",
        "Specifica un URL API",

        // Main menu items.
        // "Log out" brings you back to the login screen where you enter your token and other login settings.
        "Server",
        "Preferiti",
        "Messaggi diretti",
        "Impostazioni",
        "Disconnettiti",

        // Title text shown in "Insert mention" screen (for adding a ping when writing a message).
        "Insert mention",

        // Label shown for username search results in "Insert mention" screen. Shown if more than one user matches the username query.
        "Risultati ricerca",

        // Message shown when the username query resulted in no matches in the "Insert mention" screen.
        "Nessun risultato",

        // Error message shown when selecting "Insert" in the "Insert mention" screen and none of the search results (radio buttons) were picked.
        "Utente non selezionato",

        // Prefix and suffix of status message shown when a user has been added to a group DM. The whole message is in the form "added X to the group"
        "ha aggiunto ",
        " al gruppo",

        // Status message shown when a user has left a group DM.
        "è uscito dal gruppo",

        // Prefix and suffix of status message shown when a user has removed another user from a group DM. The whole message is in the form "removed X from the group".
        "ha rimosso ",
        " dal gruppo",

        // Status messages.
        "ha avviato una chiamata",
        "ha cambiato il nome del gruppo",
        "ha cambiato l'icona del gruppo",
        "ha attaccato un messaggio",
        "si è unito al server",
        "ha potenziato il server",

        // Prefix of status message shown when a user has boosted the server and the server has reached a certain boosting level. The level is appended to the end of this string, in the form "boosted the server to level X".
        "ha potenziato il server al livello ",

        // Prefix of message content when the message is a sticker.
        // The whole message is in the form of "(sticker: Name)"
        "(adesivo: ",

        // Placeholder name for a sticker when the sticker's name could not be fetched.
        "sconosciuto",

        // Message timestamp hour-minute separator, day-month separator, and AM/PM indicators.
        // Note: order of day and month cannot be changed currently
        ":",
        "/",
        "AM",
        "PM",

        // Softkey labels for inserting a mention/ping in the "send message" screen.
        "Menziona",
        "Inserisci menzione",

        // Prefixes of title text for "send message" screen.
        // The full title is in the form of "Send message (@user)" or "Send message (#channel)".
        "Invia messaggio (@",
        "Invia messaggio (#",

        // Error message shown when trying to insert a mention into a message and the gateway connection is not active.
        "La connessione gateway deve essere attiva",

        // Title text for "copy message content" screen.
        "Copia messaggio",

        // Title text for "edit message content" screen.
        "Modifica messaggio",

        // Title text for gateway disconnect prompt screen.
        "Disconnesso",

        // Main body text for gateway disconnect prompt screen.
        "Errore gateway. Vuoi riconnetterti?",

        // Top label for disconnection message shown in gateway disconnect prompt screen. The disconnection message is either a message sent by the Discord gateway (such as "requesting client reconnect") or a Java exception.
        "Messaggio",

        // Prefix for top body text shown in the reply form. The whole top text is in the form "Replying to @user". The contents of the recipient message are shown below this.
        "Rispondendo a ",

        // Top label for the message entry box in the reply form.
        "Messaggio:",

        // Checkbox for selecting whether to mention/ping the recipient. Shown in the reply form.
        "Menziona l'utente",

        // Title text for settings menu.
        "Impostazioni",

        // Settings screen heading for themes section.
        "Tema",

        // Theme options.
        "Scuro",
        "Chiaro",
        "Nero",

        // Settings screen heading for miscellaneous user interface related settings.
        "Interfaccia",

        // Settings option for enabling the old channel view user interface (from version 1.1 and below).
        "Vecchia interfaccia",

        // Settings option for using 12-hour time format in timestamps.
        "Formato orario a 12 ore",

        // Settings option for using the Java-based file picker for sending attachments. If disabled, the web-based file picker is used.
        "Selettore file nativo",

        // Settings option for automatically reconnecting to the gateway if the connection closes.
        "Riconnessione gateway automatica",

        // Settings option for enabling icons in server and direct message lists.
        "Icone Server/MD",

        // Settings option for enabling nickname role colors.
        "Colore dei nomi",

        // Settings screen heading for message author font size.
        "Font dei nomi",

        // Font size options.
        "Piccolo",
        "Medio",
        "Grande",

        // Settings screen heading for message content font size.
        "Font dei messaggi",

        // Settings screen heading for message load count. This is the amount of messages that are loaded and shown at a time.
        "Numero messaggi caricati",

        // Settings screen heading for selecting attachment file format.
        "Formato allegato",

        // Settings screen heading for maximum attachment size in pixels.
        "Dimensioni massime degli allegati",

        // Settings screen heading for profile picture shape.
        // Note: The word "avatar" was used here because "profile picture shape" is too long to fit on one row on some phones, and I didn't want to shorten it as "PFP".
        "Forma avatar",

        // Settings options for profile picture shape. "Circle (HQ)" is circle but with anti-aliasing and smoothing enabled.
        "Quadrata",
        "Cerchio",
        "Cerchio (Alta qualità)",

        // Settings section for profile picture resolution.
        "Risoluzione avatar",

        // Settings options for profile picture resolution. Placeholder means the PFPs won't get downloaded, but instead a placeholder (username's initials) is shown.
        "Solo iniziali",

        // Resolution options. Used for profile picture resolution and menu icon resolution.
        "Off",
        "16 pixel",
        "32 pixel",

        // Settings section for menu icon size.
        "Dimensione icone menu",

        // Settings section for controlling the display of reply messages.
        "Mostra risposte come",

        // Settings option to show replies as only the recipient (in the form "Author -> Recipient").
        "Solo nome destinatario",

        // Settings option to show replies with the whole recipient message.
        "Intero messaggio",

        // Settings section for hotkey action management.
        "Tasti scorciatoia",

        // Settings option to use "default" hotkeys. When enabled, the J2ME game actions (ABCD) are used for hotkey actions, instead of user-defined key bindings. I named it "default" due to the lack of a better term for people who aren't familiar with J2ME development.
        "Scorciatoie predefinite",

        // Softkey label for opening the key remapper in the settings menu. The long variant of the label is shown as the button text.
        "Imposta scorciatoie",
        "Reimposta scorciatoie",

        // Generic softkey labels. Currently used in settings menu.
        "Salva",
        "Salva",
        "Annulla",
        "Annulla",

        // Error message shown when trying to open an URL (e.g. attachment)from the app, but the phone does not support opening URLs while keeping the app running in the background.
        "L'app deve essere chiusa per aprire l'URL",

        // Prefix of error message shown when an error occurs when trying to open an URL.
        "Non è stato possibile aprire l'URL (",

        // Suffix of error message shown when an error occurs when trying to open an URL. The actual URL is shown after this message.
        ")\n\nPuoi provare a copiare l'URL manualmente nel tuo browser: ",

        // Title text for URL list screen ('Open URL' option in channel view).
        "Seleziona un URL",

        // Softkey labels for inserting a mention in the "Insert mention" screen.
        "Inserisci",
        "Inserisci"
    };
}