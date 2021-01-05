package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetCompanyNameActionImpl;

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
@JsonDeserialize(as = CustomerSetCompanyNameActionImpl.class)
public interface CustomerSetCompanyNameAction extends CustomerUpdateAction {

    /**
    *  <p>If not defined, the company name is unset.</p>
    */
    
    @JsonProperty("companyName")
    public String getCompanyName();

    public void setCompanyName(final String companyName);

    public static CustomerSetCompanyNameAction of(){
        return new CustomerSetCompanyNameActionImpl();
    }
    

    public static CustomerSetCompanyNameAction of(final CustomerSetCompanyNameAction template) {
        CustomerSetCompanyNameActionImpl instance = new CustomerSetCompanyNameActionImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    public static CustomerSetCompanyNameActionBuilder builder(){
        return CustomerSetCompanyNameActionBuilder.of();
    }
    
    public static CustomerSetCompanyNameActionBuilder builder(final CustomerSetCompanyNameAction template){
        return CustomerSetCompanyNameActionBuilder.of(template);
    }
    

    default <T> T withCustomerSetCompanyNameAction(Function<CustomerSetCompanyNameAction, T> helper) {
        return helper.apply(this);
    }
}
