
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after adding a Custom Field using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomFieldAddedMessagePayload customerCustomFieldAddedMessagePayload = CustomerCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCustomFieldAddedMessagePayloadImpl.class)
public interface CustomerCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerCustomFieldAddedMessagePayload
     */
    String CUSTOMER_CUSTOM_FIELD_ADDED = "CustomerCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that has been added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that has been added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of CustomerCustomFieldAddedMessagePayload
     */
    public static CustomerCustomFieldAddedMessagePayload of() {
        return new CustomerCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCustomFieldAddedMessagePayload of(final CustomerCustomFieldAddedMessagePayload template) {
        CustomerCustomFieldAddedMessagePayloadImpl instance = new CustomerCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCustomFieldAddedMessagePayload deepCopy(
            @Nullable final CustomerCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerCustomFieldAddedMessagePayloadImpl instance = new CustomerCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CustomerCustomFieldAddedMessagePayload
     * @return builder
     */
    public static CustomerCustomFieldAddedMessagePayloadBuilder builder() {
        return CustomerCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomFieldAddedMessagePayloadBuilder builder(
            final CustomerCustomFieldAddedMessagePayload template) {
        return CustomerCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCustomFieldAddedMessagePayload(
            Function<CustomerCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCustomFieldAddedMessagePayload>";
            }
        };
    }
}
