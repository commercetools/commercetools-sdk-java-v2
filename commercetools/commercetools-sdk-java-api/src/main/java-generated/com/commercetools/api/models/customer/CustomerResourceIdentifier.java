
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerResourceIdentifierImpl.class)
public interface CustomerResourceIdentifier extends ResourceIdentifier {

    String CUSTOMER = "customer";

    public static CustomerResourceIdentifier of() {
        return new CustomerResourceIdentifierImpl();
    }

    public static CustomerResourceIdentifier of(final CustomerResourceIdentifier template) {
        CustomerResourceIdentifierImpl instance = new CustomerResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerResourceIdentifierBuilder builder() {
        return CustomerResourceIdentifierBuilder.of();
    }

    public static CustomerResourceIdentifierBuilder builder(final CustomerResourceIdentifier template) {
        return CustomerResourceIdentifierBuilder.of(template);
    }

    default <T> T withCustomerResourceIdentifier(Function<CustomerResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
}
