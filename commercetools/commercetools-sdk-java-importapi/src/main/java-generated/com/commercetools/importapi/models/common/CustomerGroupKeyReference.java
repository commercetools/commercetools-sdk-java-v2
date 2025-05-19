
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a customer group by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupKeyReference customerGroupKeyReference = CustomerGroupKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("customer-group")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupKeyReferenceImpl.class)
public interface CustomerGroupKeyReference extends KeyReference {

    /**
     * discriminator value for CustomerGroupKeyReference
     */
    String CUSTOMER_GROUP = "customer-group";

    /**
     * factory method
     * @return instance of CustomerGroupKeyReference
     */
    public static CustomerGroupKeyReference of() {
        return new CustomerGroupKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupKeyReference of(final CustomerGroupKeyReference template) {
        CustomerGroupKeyReferenceImpl instance = new CustomerGroupKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public CustomerGroupKeyReference copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupKeyReference deepCopy(@Nullable final CustomerGroupKeyReference template) {
        if (template == null) {
            return null;
        }
        CustomerGroupKeyReferenceImpl instance = new CustomerGroupKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupKeyReference
     * @return builder
     */
    public static CustomerGroupKeyReferenceBuilder builder() {
        return CustomerGroupKeyReferenceBuilder.of();
    }

    /**
     * create builder for CustomerGroupKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupKeyReferenceBuilder builder(final CustomerGroupKeyReference template) {
        return CustomerGroupKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupKeyReference(Function<CustomerGroupKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupKeyReference>";
            }
        };
    }
}
