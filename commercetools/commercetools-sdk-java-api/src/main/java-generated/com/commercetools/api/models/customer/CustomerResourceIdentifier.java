
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a Customer. Either <code>id</code> or <code>key</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerResourceIdentifier customerResourceIdentifier = CustomerResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerResourceIdentifierImpl.class)
public interface CustomerResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Customer> {

    /**
     * discriminator value for CustomerResourceIdentifier
     */
    String CUSTOMER = "customer";

    /**
     *  <p>Unique identifier of the referenced Customer.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced Customer.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Customer.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced Customer.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of CustomerResourceIdentifier
     */
    public static CustomerResourceIdentifier of() {
        return new CustomerResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy CustomerResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerResourceIdentifier of(final CustomerResourceIdentifier template) {
        CustomerResourceIdentifierImpl instance = new CustomerResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerResourceIdentifier deepCopy(@Nullable final CustomerResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        CustomerResourceIdentifierImpl instance = new CustomerResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CustomerResourceIdentifier
     * @return builder
     */
    public static CustomerResourceIdentifierBuilder builder() {
        return CustomerResourceIdentifierBuilder.of();
    }

    /**
     * create builder for CustomerResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerResourceIdentifierBuilder builder(final CustomerResourceIdentifier template) {
        return CustomerResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerResourceIdentifier(Function<CustomerResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerResourceIdentifier>";
            }
        };
    }
}
