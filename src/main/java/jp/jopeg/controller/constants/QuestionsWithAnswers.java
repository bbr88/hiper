package jp.jopeg.controller.constants;

/**
 * @author Igor Bisarnov
 *         i.bisarnov@innopolis.ru
 */
public enum QuestionsWithAnswers {
    /*AUTO_NEWS("Здравствуйте! Знаете ли  вы что сейчас экономика России замедлила свой рост благодаря экономическим санкциями Трампа? Как вы относитесь к падению рубля на этом фоне?",
        "Да, согласны с вами, но есть вариант как можно сэкономить крупную сумму даже в условиях санкций, хотите расскажем?"),*/

    AUTO_NEWS("Привет! Меня зовут Оксана! У тебя найдется минутка поговорить?", ""),

//    AUTO_NEWS("Привет! Меня зовут Оксана! Есть минутка поговорить?", ""),

    AUTO_ZAMANUHA_POSITIVE("Да, согласны с вами, но есть вариант как можно сэкономить крупную сумму даже в условиях санкций, хотите расскажем?",
        "Автоцентры распродают новые автомобили по старому курсу, то есть фактически вы можете сэкономить десять пятнадцать процентов на автомобиле вашей мечты. Вот ссылка: www.taz.ru Посмотрите?"),

//    AUTO_POSITIVE_ANSWER("", "п-п-п-поднял бабла!")
//    AUTO_POSITIVE_ANSWER("", "Ой! Извини! Пора бежать, перезвоню позже чмаффки")
    AUTO_POSITIVE_ANSWER("", "Ой Я не расслышала! Можешь повторить?")
    ;

    private String question;
    private String answer;

    QuestionsWithAnswers(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
