package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetSalutationActionImpl;

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
@JsonDeserialize(as = CustomerSetSalutationActionImpl.class)
public interface CustomerSetSalutationAction extends CustomerUpdateAction {

    String SET_SALUTATION = "setSalutation";

    
    
    @JsonProperty("salutation")
    public String getSalutation();

    
    public void setSalutation(final String salutation);
    

    public static CustomerSetSalutationAction of(){
        return new CustomerSetSalutationActionImpl();
    }
    

    public static CustomerSetSalutationAction of(final CustomerSetSalutationAction template) {
        CustomerSetSalutationActionImpl instance = new CustomerSetSalutationActionImpl();
        instance.setSalutation(template.getSalutation());
        return instance;
    }

    public static CustomerSetSalutationActionBuilder builder(){
        return CustomerSetSalutationActionBuilder.of();
    }
    
    public static CustomerSetSalutationActionBuilder builder(final CustomerSetSalutationAction template){
        return CustomerSetSalutationActionBuilder.of(template);
    }
    

    default <T> T withCustomerSetSalutationAction(Function<CustomerSetSalutationAction, T> helper) {
        return helper.apply(this);
    }
}
