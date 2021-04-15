package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetTitleActionImpl;

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
@JsonDeserialize(as = CustomerSetTitleActionImpl.class)
public interface CustomerSetTitleAction extends CustomerUpdateAction {

    String SET_TITLE = "setTitle";

    
    
    @JsonProperty("title")
    public String getTitle();

    
    public void setTitle(final String title);
    

    public static CustomerSetTitleAction of(){
        return new CustomerSetTitleActionImpl();
    }
    

    public static CustomerSetTitleAction of(final CustomerSetTitleAction template) {
        CustomerSetTitleActionImpl instance = new CustomerSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    public static CustomerSetTitleActionBuilder builder(){
        return CustomerSetTitleActionBuilder.of();
    }
    
    public static CustomerSetTitleActionBuilder builder(final CustomerSetTitleAction template){
        return CustomerSetTitleActionBuilder.of(template);
    }
    

    default <T> T withCustomerSetTitleAction(Function<CustomerSetTitleAction, T> helper) {
        return helper.apply(this);
    }
}
