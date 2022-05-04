
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Customer">Customer</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerResourceIdentifierImpl.class)
public interface CustomerResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Customer> {

    String CUSTOMER = "customer";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Customer">Customer</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:Customer">Customer</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

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

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerResourceIdentifier>";
            }
        };
    }
}
