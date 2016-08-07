package com.spring.ui;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;


import org.springframework.beans.factory.annotation.Autowired;

import com.jctp.model.TUserInfo;
import com.jctp.service.TUserService;
import com.jctp.util.TCache;
import com.spring.model.Contact;
import com.spring.service.ContactService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * Date: 27.08.15
 * Time: 11:10
 *
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 * @author http://mruslan.com
 */
public class MainController {


    @Autowired 
    private ContactService contactService;

	@Resource
	private TUserService TUserService;


    @FXML private TableView<Contact> table;
    @FXML private TextField txtName;
    @FXML private TextField txtIntro;
    @FXML private TextField txtSort;

    private ObservableList<Contact> data;


    @FXML
    public void initialize() {
    }

 
    @SuppressWarnings("unchecked")
    @PostConstruct
    public void init() {
        List<Contact> contacts = contactService.findAll();
        data = FXCollections.observableArrayList(contacts);

   
        TableColumn<Contact, String> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Contact, String> nameColumn = new TableColumn<>("Имя");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Contact, String> phoneColumn = new TableColumn<>("Телефон");
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("intro"));

        TableColumn<Contact, String> emailColumn = new TableColumn<>("E-mail");
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("sort"));

        table.getColumns().setAll(idColumn, nameColumn, phoneColumn, emailColumn);

        table.setItems(data);
    }


    @FXML
    public void addContact() {
       /* Contact contact = new Contact( );
        contact.setName(txtName.getText());
        contact.setIntro(txtIntro.getText());
        contact.setSort(Integer.valueOf(txtSort.getText()));
        //txtName.getText(), txtIntro.getText(),Integer.valueOf(txtSort.getText())
        contactService.save(contact);
        data.add(contact);
        txtName.setText("");
        txtIntro.setText("");
        txtSort.setText("");
        Dialog.buildConfirmation("111", "1111111111111111111111").addNoButton(new EventHandler() {
	        @Override
	        public void handle(Event event) {
	        }
	      }).addYesButton(new EventHandler() {
		        @Override
		        public void handle(Event event) {
		        	
		    }
		  }).build().show();
    }*/
		try {
			
			
			for(TUserInfo tUser:TCache.getUserCache()){
				TUserService.initUser(tUser);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

    }
}
