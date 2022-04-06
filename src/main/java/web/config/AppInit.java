package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Метод, указывающий на класс конфигурации
    @Override
    protected Class<?>[] getRootConfigClasses() { //не используем
        return null;
    }


    // подставляем конфигурацию Webconfig
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    /* Данный метод указывает url, на котором будет базироваться приложение */
    //все Http-запросы пользователя шлем на диспатчер сервлет
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}