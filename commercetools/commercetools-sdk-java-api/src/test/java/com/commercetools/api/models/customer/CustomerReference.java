package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.customer.Customer;
import com.commercetools.api.models.customer.CustomerReferenceImpl;

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
@JsonDeserialize(as = CustomerReferenceImpl.class)
public interface CustomerReference extends Reference {

    String CUSTOMER = "customer";

    
    @Valid
    @JsonProperty("obj")
    public Customer getObj();

    
    public void setObj(final Customer obj);
    

    public static CustomerReference of(){
        return new CustomerReferenceImpl();
    }
    

    public static CustomerReference of(final CustomerReference template) {
        CustomerReferenceImpl instance = new CustomerReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CustomerReferenceBuilder builder(){
        return CustomerReferenceBuilder.of();
    }
    
    public static CustomerReferenceBuilder builder(final CustomerReference template){
        return CustomerReferenceBuilder.of(template);
    }
    

    default <T> T withCustomerReference(Function<CustomerReference, T> helper) {
        return helper.apply(this);
    }
}
