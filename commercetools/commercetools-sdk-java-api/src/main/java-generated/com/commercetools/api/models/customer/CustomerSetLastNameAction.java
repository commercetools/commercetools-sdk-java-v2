package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetLastNameActionImpl;

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
@JsonDeserialize(as = CustomerSetLastNameActionImpl.class)
public interface CustomerSetLastNameAction extends CustomerUpdateAction {

    
    
    @JsonProperty("lastName")
    public String getLastName();

    public void setLastName(final String lastName);

    public static CustomerSetLastNameActionImpl of(){
        return new CustomerSetLastNameActionImpl();
    }
    

    public static CustomerSetLastNameActionImpl of(final CustomerSetLastNameAction template) {
        CustomerSetLastNameActionImpl instance = new CustomerSetLastNameActionImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    default <T> T withCustomerSetLastNameAction(Function<CustomerSetLastNameAction, T> helper) {
        return helper.apply(this);
    }
}
