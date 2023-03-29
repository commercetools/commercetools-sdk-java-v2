
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to a CustomerGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupResourceIdentifier customerGroupResourceIdentifier = CustomerGroupResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupResourceIdentifierImpl.class)
public interface CustomerGroupResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<CustomerGroup> {

    /**
     * discriminator value for CustomerGroupResourceIdentifier
     */
    String CUSTOMER_GROUP = "customer-group";

    /**
     *  <p>Unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of CustomerGroupResourceIdentifier
     */
    public static CustomerGroupResourceIdentifier of() {
        return new CustomerGroupResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupResourceIdentifier of(final CustomerGroupResourceIdentifier template) {
        CustomerGroupResourceIdentifierImpl instance = new CustomerGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupResourceIdentifier deepCopy(@Nullable final CustomerGroupResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        CustomerGroupResourceIdentifierImpl instance = new CustomerGroupResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupResourceIdentifier
     * @return builder
     */
    public static CustomerGroupResourceIdentifierBuilder builder() {
        return CustomerGroupResourceIdentifierBuilder.of();
    }

    /**
     * create builder for CustomerGroupResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupResourceIdentifierBuilder builder(final CustomerGroupResourceIdentifier template) {
        return CustomerGroupResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupResourceIdentifier(Function<CustomerGroupResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupResourceIdentifier>";
            }
        };
    }
}
