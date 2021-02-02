
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerSetStoresActionImpl.class)
public interface CustomerSetStoresAction extends CustomerUpdateAction {

    String SET_STORES = "setStores";

    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    public void setStores(final List<StoreResourceIdentifier> stores);

    public static CustomerSetStoresAction of() {
        return new CustomerSetStoresActionImpl();
    }

    public static CustomerSetStoresAction of(final CustomerSetStoresAction template) {
        CustomerSetStoresActionImpl instance = new CustomerSetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public static CustomerSetStoresActionBuilder builder() {
        return CustomerSetStoresActionBuilder.of();
    }

    public static CustomerSetStoresActionBuilder builder(final CustomerSetStoresAction template) {
        return CustomerSetStoresActionBuilder.of(template);
    }

    default <T> T withCustomerSetStoresAction(Function<CustomerSetStoresAction, T> helper) {
        return helper.apply(this);
    }
}
