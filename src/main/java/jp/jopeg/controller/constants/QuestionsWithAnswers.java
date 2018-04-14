package jp.jopeg.controller.constants;

/**
 * @author Igor Bisarnov
 *         i.bisarnov@innopolis.ru
 */
public enum QuestionsWithAnswers {
    AUTO_NEWS("Здравствуйте! Знаете ли  вы что сейчас экономика России замедлила свой рост в связи с экономическими санкциями Трампа? Как вы относитесь к падению рубля на этом фоне?",
        "Да, согласны с вами, но есть вариант как можно сэкономить крупную сумму даже в условиях санкций, хотите расскажем?"),

    AUTO_ZAMANUHA_POSITIVE("Да, согласны с вами, но есть вариант как можно сэкономить крупную сумму даже в условиях санкций, хотите расскажем?",
        "Автоцентры распродают новые автомобили по старому курсу, то есть фактически вы можете сэкономить десять пятнадцать процентов на автомобиле вашей мечты. Вот ссылка: www.taz.ru Посмотрите?")

//    AUTO_ZAMANUHA_NEGATIVE()
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
