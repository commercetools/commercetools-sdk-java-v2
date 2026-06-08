
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
 *  <p>Generated after removing a Custom Field from a Customer using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomFieldRemovedMessagePayload customerCustomFieldRemovedMessagePayload = CustomerCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCustomFieldRemovedMessagePayloadImpl.class)
public interface CustomerCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerCustomFieldRemovedMessagePayload
     */
    String CUSTOMER_CUSTOM_FIELD_REMOVED = "CustomerCustomFieldRemoved";

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
     * @return instance of CustomerCustomFieldRemovedMessagePayload
     */
    public static CustomerCustomFieldRemovedMessagePayload of() {
        return new CustomerCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCustomFieldRemovedMessagePayload of(final CustomerCustomFieldRemovedMessagePayload template) {
        CustomerCustomFieldRemovedMessagePayloadImpl instance = new CustomerCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public CustomerCustomFieldRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final CustomerCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerCustomFieldRemovedMessagePayloadImpl instance = new CustomerCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for CustomerCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static CustomerCustomFieldRemovedMessagePayloadBuilder builder() {
        return CustomerCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomFieldRemovedMessagePayloadBuilder builder(
            final CustomerCustomFieldRemovedMessagePayload template) {
        return CustomerCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCustomFieldRemovedMessagePayload(
            Function<CustomerCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
