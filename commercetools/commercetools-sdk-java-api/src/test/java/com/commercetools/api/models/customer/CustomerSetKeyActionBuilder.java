package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetKeyActionBuilder {

    
    @Nullable
    private String key;

    
    public CustomerSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    
    @Nullable
    public String getKey(){
        return this.key;
    }

    public CustomerSetKeyAction build() {
        return new CustomerSetKeyActionImpl(key);
    }

    public static CustomerSetKeyActionBuilder of() {
        return new CustomerSetKeyActionBuilder();
    }

    public static CustomerSetKeyActionBuilder of(final CustomerSetKeyAction template) {
        CustomerSetKeyActionBuilder builder = new CustomerSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
