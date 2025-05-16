
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
 *  <p>Reference to a CustomerToken for email verification.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailTokenReference customerEmailTokenReference = CustomerEmailTokenReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("customer-email-token")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerEmailTokenReferenceImpl.class)
public interface CustomerEmailTokenReference extends Reference {

    /**
     * discriminator value for CustomerEmailTokenReference
     */
    String CUSTOMER_EMAIL_TOKEN = "customer-email-token";

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
     * @return instance of CustomerEmailTokenReference
     */
    public static CustomerEmailTokenReference of() {
        return new CustomerEmailTokenReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomerEmailTokenReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailTokenReference of(final CustomerEmailTokenReference template) {
        CustomerEmailTokenReferenceImpl instance = new CustomerEmailTokenReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public CustomerEmailTokenReference copyDeep();

    /**
     * factory method to create a deep copy of CustomerEmailTokenReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerEmailTokenReference deepCopy(@Nullable final CustomerEmailTokenReference template) {
        if (template == null) {
            return null;
        }
        CustomerEmailTokenReferenceImpl instance = new CustomerEmailTokenReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for CustomerEmailTokenReference
     * @return builder
     */
    public static CustomerEmailTokenReferenceBuilder builder() {
        return CustomerEmailTokenReferenceBuilder.of();
    }

    /**
     * create builder for CustomerEmailTokenReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailTokenReferenceBuilder builder(final CustomerEmailTokenReference template) {
        return CustomerEmailTokenReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailTokenReference(Function<CustomerEmailTokenReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailTokenReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailTokenReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailTokenReference>";
            }
        };
    }
}
