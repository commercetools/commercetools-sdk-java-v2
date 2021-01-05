package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetExternalIdActionImpl;

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
@JsonDeserialize(as = CustomerSetExternalIdActionImpl.class)
public interface CustomerSetExternalIdAction extends CustomerUpdateAction {

    /**
    *  <p>If not defined, the external ID is unset.</p>
    */
    
    @JsonProperty("externalId")
    public String getExternalId();

    public void setExternalId(final String externalId);

    public static CustomerSetExternalIdAction of(){
        return new CustomerSetExternalIdActionImpl();
    }
    

    public static CustomerSetExternalIdAction of(final CustomerSetExternalIdAction template) {
        CustomerSetExternalIdActionImpl instance = new CustomerSetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    public static CustomerSetExternalIdActionBuilder builder(){
        return CustomerSetExternalIdActionBuilder.of();
    }
    
    public static CustomerSetExternalIdActionBuilder builder(final CustomerSetExternalIdAction template){
        return CustomerSetExternalIdActionBuilder.of(template);
    }
    

    default <T> T withCustomerSetExternalIdAction(Function<CustomerSetExternalIdAction, T> helper) {
        return helper.apply(this);
    }
}
