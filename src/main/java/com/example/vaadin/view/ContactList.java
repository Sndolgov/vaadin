package com.example.vaadin.view;

import com.example.vaadin.entity.Contact;
import com.example.vaadin.repository.ContactRepository;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.springframework.beans.factory.annotation.Autowired;

@Route("contacts")
public class ContactList extends AppLayout {
    VerticalLayout layout;
    Grid<Contact> grid;
    RouterLink linkCreate;

    @Autowired
    ContactRepository contactRepository;

    public ContactList(){

        layout = new VerticalLayout();
        grid = new Grid<>(Contact.class);
//        grid = new Grid<>();
        linkCreate = new RouterLink("Создать контакт",ManageContact.class,0);
        layout.add(linkCreate);
        layout.add(grid);
        addToNavbar(new H3("Список контактов"));
        setContent(layout);
    }
}
