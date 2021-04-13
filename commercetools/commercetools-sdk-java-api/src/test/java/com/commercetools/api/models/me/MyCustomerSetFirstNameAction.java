package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetFirstNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MyCustomerSetFirstNameActionImpl.class)
public interface MyCustomerSetFirstNameAction extends MyCustomerUpdateAction {

    String SET_FIRST_NAME = "setFirstName";

    
    
    @JsonProperty("firstName")
    public String getFirstName();

    
    public void setFirstName(final String firstName);
    

    public static MyCustomerSetFirstNameAction of(){
        return new MyCustomerSetFirstNameActionImpl();
    }
    

    public static MyCustomerSetFirstNameAction of(final MyCustomerSetFirstNameAction template) {
        MyCustomerSetFirstNameActionImpl instance = new MyCustomerSetFirstNameActionImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    public static MyCustomerSetFirstNameActionBuilder builder(){
        return MyCustomerSetFirstNameActionBuilder.of();
    }
    
    public static MyCustomerSetFirstNameActionBuilder builder(final MyCustomerSetFirstNameAction template){
        return MyCustomerSetFirstNameActionBuilder.of(template);
    }
    

    default <T> T withMyCustomerSetFirstNameAction(Function<MyCustomerSetFirstNameAction, T> helper) {
        return helper.apply(this);
    }
}
