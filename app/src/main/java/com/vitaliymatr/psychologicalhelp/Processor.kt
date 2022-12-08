package com.vitaliymatr.psychologicalhelp

import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity

class Processor(var situation: String) : AppCompatActivity() {
    object Strings {
        fun get(@StringRes stringRes: Int, vararg formatArgs: Any = emptyArray()): String {
            return App.instance.getString(stringRes, *formatArgs)
        }
    }

    var bigText: String = ""
    var numberOfPicture = 0
    val words: MutableList<String> = mutableListOf()
    val numbers: MutableList<Int> = mutableListOf()

    var tooMuch = Strings.get(R.string.too_much)
    var unclear = Strings.get(R.string.unclear)
    var relationship = Strings.get(R.string.relationship)
    var introDepression = Strings.get(R.string.intro_depression)
    var depression = Strings.get(R.string.depression)
    var selfIdentification = Strings.get(R.string.self_identification)
    //var argument = Strings.get(R.string.argument)
    var parentInLaw = Strings.get(R.string.parent_in_law)
    var withoutObligations = Strings.get(R.string.without_obligations)
    var anxious = Strings.get(R.string.anxious)
    var laconically = Strings.get(R.string.laconically)
    var parents = Strings.get(R.string.parents)
    var shy = Strings.get(R.string.shy)
    var trauma = Strings.get(R.string.trauma)
    var sex = Strings.get(R.string.sex)

    fun addWords() {

        if (situation.contains("депресси")||situation.contains("депрессую")) {
            words.add(depression)
            numbers.add(4)
        }
        if (!(situation.contains("депресси")) && (situation.contains("устал от жизни")
        || situation.contains("я устал") || situation.contains("апатия")
        || situation.contains("мысли негативные") || situation.contains("я очень устал")
        || situation.contains("негативные мысли") || situation.contains("ничего не радует")
        || situation.contains("ненавижу себя") || situation.contains("сил ни на что нет")
        || situation.contains("подавленное настроение") || situation.contains("вымоталась")
        || situation.contains("чтоб забыться") || situation.contains("чтобы забыться")
        || situation.contains("остаться одной") || situation.contains("чувствую себя ужасно")
        || situation.contains("хочу умереть")|| situation.contains("меня ничто не связывает")
        || situation.contains("себя подавленой")|| situation.contains("себя подавленной")
        || situation.contains("мне плохо")|| situation.contains("мне очень плохо")
        || situation.contains("никто не любит")|| situation.contains("как дальше жить")
        || situation.contains("стала плохо спать")|| situation.contains("теряю энергию")
        || situation.contains("стал плохо спать"))) {
            words.add(introDepression)
            words.add(depression)
            numbers.add(4)
        }
        if (!((situation.contains("мать")||situation.contains("никто")) && situation.contains("не любит")) &&
            (((situation.contains("он")||situation.contains("парень")||situation.contains("она"))
        && situation.contains("не любит")) ||situation.contains("нормальные отношения")
        || situation.contains("нормальных отношений") || situation.contains("отношения")
        || situation.contains("не ценит") || situation.contains("не любит")
        || situation.contains("встречаемся с парнем") || situation.contains("с ним встречаться")
        || situation.contains("с ней встречаться") || situation.contains("муж изменял")
        || situation.contains("не умеет проявлять любовь") || situation.contains("друг начал")
        || situation.contains("друг не начал") || situation.contains("стал холоднее")
        || situation.contains("боюсь сказать") || situation.contains("отдалились")
        ||situation.contains("ревност")||situation.contains("не хватает ласки")
        ||situation.contains("не хватает заботы")||situation.contains("не хватает поддержки"))) {
            words.add(relationship)
            numbers.add(6)
        }
        if (situation.contains("не знаю чего хочу") || situation.contains("запуталась в себе")
        || situation.contains("запутался в себе") || situation.contains("не знаю чего я хочу")
        || situation.contains("найти себя")|| situation.contains("какой мой путь")) {
            words.add(selfIdentification)
            numbers.add(7)
        }
        /*if (situation.contains("ссоры") || situation.contains("ссориться") || situation.contains("подрались")) {
            words.add(argument)
            numbers.add(8)
        }*/
        if (!(situation.contains("свекровь была")) && (situation.contains("его мать")
        || situation.contains("ее мать") || situation.contains("теща")
        || situation.contains("свекровь") || situation.contains("её мать")
        || situation.contains("тесть") || situation.contains("свекор"))) {
            words.add(parentInLaw)
            numbers.add(9)
        }
        if (situation.contains("без обязательств")) {
            words.add(withoutObligations)
            numbers.add(10)
        }
        if (situation.contains("тревога") || situation.contains("тревогу") || situation.contains("тревожность")
            || situation.contains("о плохом") || situation.contains("о смерти") || situation.contains("тревоги")
            || situation.contains("тревожно") || situation.contains("я очень сильно переживаю")
            || situation.contains("большой страх") || situation.contains("перестать бояться")) {
            words.add(anxious)
            numbers.add(11)
        }
        if ((situation.contains("папа") && situation.contains("мне запретил")) ||
            (situation.contains("мать") && situation.contains("не любит")) ||
            (situation.contains("мать") && situation.contains("манипулирует"))||
            (situation.contains("мама") && situation.contains("манипулирует"))||
            (situation.contains("родители") && (situation.contains("заставляют")
            || situation.contains("гнобят") || situation.contains("чморят")))
            || situation.contains("мама хочет") || situation.contains("отец хочет")
            || situation.contains("папа хочет") || situation.contains("родители говорят")
            || situation.contains("отчим оказался")) {
            words.add(parents)
            numbers.add(12)
        }
        if (situation.contains("я") && (situation.contains("молчаливая") || situation.contains("скромная")
        || situation.contains("молчаливый") || situation.contains("скромный")
        || situation.contains("застенчивый")|| situation.contains("боюсь разговаривать"))) {
            words.add(shy)
            numbers.add(13)
        }
        if(situation.contains("трогал меня") || situation.contains("приставал ко мне")
            ||situation.contains("до сих пор")||situation.contains("травма")){
            words.add(trauma)
            numbers.add(14)
        }
        if(situation.contains("я гей") || situation.contains("я бисексуал")
            ||situation.contains("я лесбиянка")){
            words.add(sex)
            numbers.add(15)
        }
    }

    fun getHelp() {
        val letterCount = situation.length

        if (words.count() > 6) {
            bigText = tooMuch
            numberOfPicture = 1
        } else if (letterCount < 10) {
            bigText = laconically
            numberOfPicture = 2
        } else if (words.isEmpty()) {
            bigText = unclear
            numberOfPicture = 3
        } else {
            for (item in words) {
                bigText = "$bigText$item "
            }
            numberOfPicture = numbers.random()
        }

    }
}