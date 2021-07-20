package com.developer.jauregui.interviewexample.views;

import com.developer.jauregui.interviewexample.backend.Role;
import com.developer.jauregui.interviewexample.backend.services.RoleService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;


@Route("")
public class MainView extends VerticalLayout {

    private RoleService roleService;


    private final Button btnSave = new Button("Save");
    private final Grid<Role> grdRoles = new Grid<>();
    private final Binder<Role> roleBinder = new Binder<>();
    private final TextField txtDescription = new TextField("Description");

    public MainView(RoleService roleService){
        this.roleService = roleService;
        setSizeFull();

        initializer();
        applyListeners();
    }

    private void initializer(){
        grdRoles.setItems(roleService.findAll());

        initBinder();

        add(grdRoles);
    }

    private void initBinder(){
        roleBinder.forField(txtDescription)
                .asRequired("Obligatory Field")
                .bind(Role::getvDescription, Role::setvDescription);
    }

    private void applyListeners(){
         btnSave.addClickListener(save->{




         });
    }

}
