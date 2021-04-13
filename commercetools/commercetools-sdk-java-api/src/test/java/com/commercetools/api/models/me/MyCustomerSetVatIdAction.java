package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetVatIdActionImpl;

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
@JsonDeserialize(as = MyCustomerSetVatIdActionImpl.class)
public interface MyCustomerSetVatIdAction extends MyCustomerUpdateAction {

    String SET_VAT_ID = "setVatId";

    
    
    @JsonProperty("vatId")
    public String getVatId();

    
    public void setVatId(final String vatId);
    

    public static MyCustomerSetVatIdAction of(){
        return new MyCustomerSetVatIdActionImpl();
    }
    

    public static MyCustomerSetVatIdAction of(final MyCustomerSetVatIdAction template) {
        MyCustomerSetVatIdActionImpl instance = new MyCustomerSetVatIdActionImpl();
        instance.setVatId(template.getVatId());
        return instance;
    }

    public static MyCustomerSetVatIdActionBuilder builder(){
        return MyCustomerSetVatIdActionBuilder.of();
    }
    
    public static MyCustomerSetVatIdActionBuilder builder(final MyCustomerSetVatIdAction template){
        return MyCustomerSetVatIdActionBuilder.of(template);
    }
    

    default <T> T withMyCustomerSetVatIdAction(Function<MyCustomerSetVatIdAction, T> helper) {
        return helper.apply(this);
    }
}
