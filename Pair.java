/**
 * Напишите обобщенный класс Pair,
 * который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для
 * получения значений каждого из составляющих пары, а также
 * переопределение метода toString(), возвращающее строковое
 * представление пары. Работу сдать в виде ссылки на гит репозиторий.
 */
public class Pair <E,V>{
    private E first;
    private V second;

    public Pair(E first, V second){
        this.first = first;
        this.second = second;
    }


    public E getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first.toString() +
                ", second=" + second.toString() +
                '}';
    }
}
