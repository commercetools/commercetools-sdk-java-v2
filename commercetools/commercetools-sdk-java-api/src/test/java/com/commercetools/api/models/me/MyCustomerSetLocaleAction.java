package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetLocaleActionImpl;

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
@JsonDeserialize(as = MyCustomerSetLocaleActionImpl.class)
public interface MyCustomerSetLocaleAction extends MyCustomerUpdateAction {

    String SET_LOCALE = "setLocale";

    
    
    @JsonProperty("locale")
    public String getLocale();

    
    public void setLocale(final String locale);
    

    public static MyCustomerSetLocaleAction of(){
        return new MyCustomerSetLocaleActionImpl();
    }
    

    public static MyCustomerSetLocaleAction of(final MyCustomerSetLocaleAction template) {
        MyCustomerSetLocaleActionImpl instance = new MyCustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static MyCustomerSetLocaleActionBuilder builder(){
        return MyCustomerSetLocaleActionBuilder.of();
    }
    
    public static MyCustomerSetLocaleActionBuilder builder(final MyCustomerSetLocaleAction template){
        return MyCustomerSetLocaleActionBuilder.of(template);
    }
    

    default <T> T withMyCustomerSetLocaleAction(Function<MyCustomerSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
