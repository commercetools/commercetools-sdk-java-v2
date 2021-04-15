package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.customer.CustomerRemoveStoreAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerRemoveStoreActionBuilder {

    
    
    private com.commercetools.api.models.store.StoreResourceIdentifier store;

    
    public CustomerRemoveStoreActionBuilder store( final com.commercetools.api.models.store.StoreResourceIdentifier store) {
        this.store = store;
        return this;
    }

    
    
    public com.commercetools.api.models.store.StoreResourceIdentifier getStore(){
        return this.store;
    }

    public CustomerRemoveStoreAction build() {
        return new CustomerRemoveStoreActionImpl(store);
    }

    public static CustomerRemoveStoreActionBuilder of() {
        return new CustomerRemoveStoreActionBuilder();
    }

    public static CustomerRemoveStoreActionBuilder of(final CustomerRemoveStoreAction template) {
        CustomerRemoveStoreActionBuilder builder = new CustomerRemoveStoreActionBuilder();
        builder.store = template.getStore();
        return builder;
    }

}
