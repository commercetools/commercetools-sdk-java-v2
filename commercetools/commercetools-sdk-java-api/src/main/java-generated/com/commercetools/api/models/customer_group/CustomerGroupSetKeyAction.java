
package com.commercetools.api.models.customer_group;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionImpl;
import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupSetKeyActionImpl.class)
public interface CustomerGroupSetKeyAction extends CustomerGroupUpdateAction {

    /**
    *  <p>User-specific unique identifier for the customer group.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CustomerGroupSetKeyAction of() {
        return new CustomerGroupSetKeyActionImpl();
    }

    public static CustomerGroupSetKeyAction of(final CustomerGroupSetKeyAction template) {
        CustomerGroupSetKeyActionImpl instance = new CustomerGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerGroupSetKeyActionBuilder builder() {
        return CustomerGroupSetKeyActionBuilder.of();
    }

    public static CustomerGroupSetKeyActionBuilder builder(final CustomerGroupSetKeyAction template) {
        return CustomerGroupSetKeyActionBuilder.of(template);
    }

    default <T> T withCustomerGroupSetKeyAction(Function<CustomerGroupSetKeyAction, T> helper) {
        return helper.apply(this);
    }
}
