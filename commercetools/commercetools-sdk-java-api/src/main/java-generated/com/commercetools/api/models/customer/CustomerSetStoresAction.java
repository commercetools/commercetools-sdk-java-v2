package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetStoresActionImpl;

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
@JsonDeserialize(as = CustomerSetStoresActionImpl.class)
public interface CustomerSetStoresAction extends CustomerUpdateAction {

    
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier ...stores);
    public void setStores(final List<StoreResourceIdentifier> stores);

    public static CustomerSetStoresActionImpl of(){
        return new CustomerSetStoresActionImpl();
    }
    

    public static CustomerSetStoresActionImpl of(final CustomerSetStoresAction template) {
        CustomerSetStoresActionImpl instance = new CustomerSetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    default <T> T withCustomerSetStoresAction(Function<CustomerSetStoresAction, T> helper) {
        return helper.apply(this);
    }
}
