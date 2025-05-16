
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a CustomerToken for password reset.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordTokenReference customerPasswordTokenReference = CustomerPasswordTokenReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("customer-password-token")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordTokenReferenceImpl.class)
public interface CustomerPasswordTokenReference extends Reference {

    /**
     * discriminator value for CustomerPasswordTokenReference
     */
    String CUSTOMER_PASSWORD_TOKEN = "customer-password-token";

    /**
     *  <p>Unique identifier of the referenced CustomerToken.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced CustomerToken.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CustomerPasswordTokenReference
     */
    public static CustomerPasswordTokenReference of() {
        return new CustomerPasswordTokenReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomerPasswordTokenReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerPasswordTokenReference of(final CustomerPasswordTokenReference template) {
        CustomerPasswordTokenReferenceImpl instance = new CustomerPasswordTokenReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public CustomerPasswordTokenReference copyDeep();

    /**
     * factory method to create a deep copy of CustomerPasswordTokenReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerPasswordTokenReference deepCopy(@Nullable final CustomerPasswordTokenReference template) {
        if (template == null) {
            return null;
        }
        CustomerPasswordTokenReferenceImpl instance = new CustomerPasswordTokenReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for CustomerPasswordTokenReference
     * @return builder
     */
    public static CustomerPasswordTokenReferenceBuilder builder() {
        return CustomerPasswordTokenReferenceBuilder.of();
    }

    /**
     * create builder for CustomerPasswordTokenReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordTokenReferenceBuilder builder(final CustomerPasswordTokenReference template) {
        return CustomerPasswordTokenReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerPasswordTokenReference(Function<CustomerPasswordTokenReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordTokenReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordTokenReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPasswordTokenReference>";
            }
        };
    }
}
