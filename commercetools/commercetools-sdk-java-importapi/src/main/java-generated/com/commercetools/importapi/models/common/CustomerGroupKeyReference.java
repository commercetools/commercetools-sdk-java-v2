
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a customer group by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerGroupKeyReferenceImpl.class)
public interface CustomerGroupKeyReference extends KeyReference {

    String CUSTOMER_GROUP = "customer-group";

    public static CustomerGroupKeyReference of() {
        return new CustomerGroupKeyReferenceImpl();
    }

    public static CustomerGroupKeyReference of(final CustomerGroupKeyReference template) {
        CustomerGroupKeyReferenceImpl instance = new CustomerGroupKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerGroupKeyReferenceBuilder builder() {
        return CustomerGroupKeyReferenceBuilder.of();
    }

    public static CustomerGroupKeyReferenceBuilder builder(final CustomerGroupKeyReference template) {
        return CustomerGroupKeyReferenceBuilder.of(template);
    }

    default <T> T withCustomerGroupKeyReference(Function<CustomerGroupKeyReference, T> helper) {
        return helper.apply(this);
    }
}
