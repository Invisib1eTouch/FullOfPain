package baseEntities;

import core.BrowserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;

public abstract class BaseStep<T extends BasePage> {
    protected BrowserService browserService;
    protected T page;
    private final Class<T> pageClass;

//    Правила Бойцовского Клуба

//    1. Класс степа соответствует классу страницы (дженерик)
//    2. Степы возсращают только степы
//      2.1 Если степ возвращет НЕ степы, то цепочка обрывается (т.е. это конец теста)


    @SuppressWarnings("unchecked")
    public BaseStep(BrowserService browserService) {
        this.browserService = browserService;
        this.pageClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.page = getPageInstance();
    }

    public T getPageInstance() {
        if (this.page != null) return this.page;
        if (pageClass == null) throw new NoClassDefFoundError("Page class was not defined.");
        T page = null;
        try {
            page = pageClass.getConstructor(BrowserService.class).newInstance(this.browserService);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return page;
    }

    public abstract BaseStep<T> openPage();
}
