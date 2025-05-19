
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a customer by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerKeyReference customerKeyReference = CustomerKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("customer")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerKeyReferenceImpl.class)
public interface CustomerKeyReference extends KeyReference {

    /**
     * discriminator value for CustomerKeyReference
     */
    String CUSTOMER = "customer";

    /**
     * factory method
     * @return instance of CustomerKeyReference
     */
    public static CustomerKeyReference of() {
        return new CustomerKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomerKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerKeyReference of(final CustomerKeyReference template) {
        CustomerKeyReferenceImpl instance = new CustomerKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public CustomerKeyReference copyDeep();

    /**
     * factory method to create a deep copy of CustomerKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerKeyReference deepCopy(@Nullable final CustomerKeyReference template) {
        if (template == null) {
            return null;
        }
        CustomerKeyReferenceImpl instance = new CustomerKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CustomerKeyReference
     * @return builder
     */
    public static CustomerKeyReferenceBuilder builder() {
        return CustomerKeyReferenceBuilder.of();
    }

    /**
     * create builder for CustomerKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerKeyReferenceBuilder builder(final CustomerKeyReference template) {
        return CustomerKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerKeyReference(Function<CustomerKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerKeyReference>";
            }
        };
    }
}
