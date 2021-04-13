package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerChangeEmailActionImpl;

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
@JsonDeserialize(as = CustomerChangeEmailActionImpl.class)
public interface CustomerChangeEmailAction extends CustomerUpdateAction {

    String CHANGE_EMAIL = "changeEmail";

    
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    
    public void setEmail(final String email);
    

    public static CustomerChangeEmailAction of(){
        return new CustomerChangeEmailActionImpl();
    }
    

    public static CustomerChangeEmailAction of(final CustomerChangeEmailAction template) {
        CustomerChangeEmailActionImpl instance = new CustomerChangeEmailActionImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public static CustomerChangeEmailActionBuilder builder(){
        return CustomerChangeEmailActionBuilder.of();
    }
    
    public static CustomerChangeEmailActionBuilder builder(final CustomerChangeEmailAction template){
        return CustomerChangeEmailActionBuilder.of(template);
    }
    

    default <T> T withCustomerChangeEmailAction(Function<CustomerChangeEmailAction, T> helper) {
        return helper.apply(this);
    }
}
