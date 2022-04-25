
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerAddStoreActionImpl.class)
public interface CustomerAddStoreAction extends CustomerUpdateAction {

    String ADD_STORE = "addStore";

    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static CustomerAddStoreAction of() {
        return new CustomerAddStoreActionImpl();
    }

    public static CustomerAddStoreAction of(final CustomerAddStoreAction template) {
        CustomerAddStoreActionImpl instance = new CustomerAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static CustomerAddStoreActionBuilder builder() {
        return CustomerAddStoreActionBuilder.of();
    }

    public static CustomerAddStoreActionBuilder builder(final CustomerAddStoreAction template) {
        return CustomerAddStoreActionBuilder.of(template);
    }

    default <T> T withCustomerAddStoreAction(Function<CustomerAddStoreAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddStoreAction>";
            }
        };
    }
}
