
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerReference customerReference = CustomerReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("customer")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerReferenceImpl.class)
public interface CustomerReference extends Reference {

    /**
     * discriminator value for CustomerReference
     */
    String CUSTOMER = "customer";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CustomerReference
     */
    public static CustomerReference of() {
        return new CustomerReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomerReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerReference of(final CustomerReference template) {
        CustomerReferenceImpl instance = new CustomerReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public CustomerReference copyDeep();

    /**
     * factory method to create a deep copy of CustomerReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerReference deepCopy(@Nullable final CustomerReference template) {
        if (template == null) {
            return null;
        }
        CustomerReferenceImpl instance = new CustomerReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for CustomerReference
     * @return builder
     */
    public static CustomerReferenceBuilder builder() {
        return CustomerReferenceBuilder.of();
    }

    /**
     * create builder for CustomerReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerReferenceBuilder builder(final CustomerReference template) {
        return CustomerReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerReference(Function<CustomerReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerReference>";
            }
        };
    }
}
