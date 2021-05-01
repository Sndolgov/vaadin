package com.example.vaadin.view;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.HasUrlParameter;
import com.vaadin.flow.router.Route;

@Route("manageContact")
public class ManageContact extends AppLayout implements HasUrlParameter<Integer> {
    @Override
    public void setParameter(BeforeEvent beforeEvent, Integer integer) {

    }
}
