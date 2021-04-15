package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetTitleActionImpl;

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
@JsonDeserialize(as = MyCustomerSetTitleActionImpl.class)
public interface MyCustomerSetTitleAction extends MyCustomerUpdateAction {

    String SET_TITLE = "setTitle";

    
    
    @JsonProperty("title")
    public String getTitle();

    
    public void setTitle(final String title);
    

    public static MyCustomerSetTitleAction of(){
        return new MyCustomerSetTitleActionImpl();
    }
    

    public static MyCustomerSetTitleAction of(final MyCustomerSetTitleAction template) {
        MyCustomerSetTitleActionImpl instance = new MyCustomerSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    public static MyCustomerSetTitleActionBuilder builder(){
        return MyCustomerSetTitleActionBuilder.of();
    }
    
    public static MyCustomerSetTitleActionBuilder builder(final MyCustomerSetTitleAction template){
        return MyCustomerSetTitleActionBuilder.of(template);
    }
    

    default <T> T withMyCustomerSetTitleAction(Function<MyCustomerSetTitleAction, T> helper) {
        return helper.apply(this);
    }
}
