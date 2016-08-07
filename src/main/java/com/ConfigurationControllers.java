package com;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.ui.MainController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

/**
 * Date: 27.08.15
 * Time: 11:04
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 */
@Configuration
public class ConfigurationControllers {

    @Bean(name = "mainView")
    public View getMainView() throws IOException {
        return loadView("fxml/main.fxml");
    }

   
    @Bean
    public MainController getMainController() throws IOException {
        return (MainController) getMainView().getController();
    }

    
    protected View loadView(String url) throws IOException {
        InputStream fxmlStream = null;
        try {
            fxmlStream = getClass().getClassLoader().getResourceAsStream(url);
            FXMLLoader loader = new FXMLLoader();
            loader.load(fxmlStream);
            return new View((Parent)loader.getRoot(), loader.getController());
        } finally {
            if (fxmlStream != null) {
                fxmlStream.close();
            }
        }
    }


    public class View {
        private Parent view;
        private Object controller;

        public View(Parent view, Object controller) {
            this.view = view;
            this.controller = controller;
        }

        public Parent getView() {
            return view;
        }

        public void setView(Parent view) {
            this.view = view;
        }

        public Object getController() {
            return controller;
        }

        public void setController(Object controller) {
            this.controller = controller;
        }
    }

}
