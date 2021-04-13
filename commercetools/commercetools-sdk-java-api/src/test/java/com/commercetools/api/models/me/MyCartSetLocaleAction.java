package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetLocaleActionImpl;

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
@JsonDeserialize(as = MyCartSetLocaleActionImpl.class)
public interface MyCartSetLocaleAction extends MyCartUpdateAction {

    String SET_LOCALE = "setLocale";

    
    
    @JsonProperty("locale")
    public String getLocale();

    
    public void setLocale(final String locale);
    

    public static MyCartSetLocaleAction of(){
        return new MyCartSetLocaleActionImpl();
    }
    

    public static MyCartSetLocaleAction of(final MyCartSetLocaleAction template) {
        MyCartSetLocaleActionImpl instance = new MyCartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static MyCartSetLocaleActionBuilder builder(){
        return MyCartSetLocaleActionBuilder.of();
    }
    
    public static MyCartSetLocaleActionBuilder builder(final MyCartSetLocaleAction template){
        return MyCartSetLocaleActionBuilder.of(template);
    }
    

    default <T> T withMyCartSetLocaleAction(Function<MyCartSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
