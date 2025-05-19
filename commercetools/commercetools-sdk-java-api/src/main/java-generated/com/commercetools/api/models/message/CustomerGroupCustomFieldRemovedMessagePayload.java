
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after removing a Custom Field from a Customer Group using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldRemovedMessagePayload customerGroupCustomFieldRemovedMessagePayload = CustomerGroupCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupCustomFieldRemovedMessagePayloadImpl.class)
public interface CustomerGroupCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupCustomFieldRemovedMessagePayload
     */
    String CUSTOMER_GROUP_CUSTOM_FIELD_REMOVED = "CustomerGroupCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of CustomerGroupCustomFieldRemovedMessagePayload
     */
    public static CustomerGroupCustomFieldRemovedMessagePayload of() {
        return new CustomerGroupCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomFieldRemovedMessagePayload of(
            final CustomerGroupCustomFieldRemovedMessagePayload template) {
        CustomerGroupCustomFieldRemovedMessagePayloadImpl instance = new CustomerGroupCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public CustomerGroupCustomFieldRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final CustomerGroupCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomFieldRemovedMessagePayloadImpl instance = new CustomerGroupCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static CustomerGroupCustomFieldRemovedMessagePayloadBuilder builder() {
        return CustomerGroupCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldRemovedMessagePayloadBuilder builder(
            final CustomerGroupCustomFieldRemovedMessagePayload template) {
        return CustomerGroupCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomFieldRemovedMessagePayload(
            Function<CustomerGroupCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
