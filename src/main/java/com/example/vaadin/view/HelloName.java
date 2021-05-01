package com.example.vaadin.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloName extends VerticalLayout {
    public HelloName() {
        TextField textField = new TextField(null, "Enter your name");
        Button btn = new Button("Click me");
        btn.addClickListener(e -> Notification.show("Hi" + textField.getValue()));
        add(textField, btn);
    }
}
