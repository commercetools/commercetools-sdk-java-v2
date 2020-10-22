package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetCompanyNameActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
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

    public static CustomerSetCompanyNameActionImpl of(){
        return new CustomerSetCompanyNameActionImpl();
    }
    

    public static CustomerSetCompanyNameActionImpl of(final CustomerSetCompanyNameAction template) {
        CustomerSetCompanyNameActionImpl instance = new CustomerSetCompanyNameActionImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    default <T extends Accessor<CustomerSetCompanyNameAction>> T withCustomerSetCompanyNameAction(Function<CustomerSetCompanyNameAction, T> helper) {
        return helper.apply(this);
    }
}
