package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerUpdateImpl;

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
@JsonDeserialize(as = CustomerUpdateImpl.class)
public interface CustomerUpdate extends com.commercetools.api.models.ResourceUpdate<CustomerUpdate, CustomerUpdateAction> {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CustomerUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final CustomerUpdateAction ...actions);
    public void setActions(final List<CustomerUpdateAction> actions);

    public static CustomerUpdateImpl of(){
        return new CustomerUpdateImpl();
    }
    

    public static CustomerUpdateImpl of(final CustomerUpdate template) {
        CustomerUpdateImpl instance = new CustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withCustomerUpdate(Function<CustomerUpdate, T> helper) {
        return helper.apply(this);
    }
}
