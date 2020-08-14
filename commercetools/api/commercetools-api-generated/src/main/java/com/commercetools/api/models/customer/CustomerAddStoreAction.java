package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.customer.CustomerAddStoreActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerAddStoreActionImpl.class)
public interface CustomerAddStoreAction extends CustomerUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static CustomerAddStoreActionImpl of(){
        return new CustomerAddStoreActionImpl();
    }
    

    public static CustomerAddStoreActionImpl of(final CustomerAddStoreAction template) {
        CustomerAddStoreActionImpl instance = new CustomerAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

}
