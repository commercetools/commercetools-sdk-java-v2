
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
 *  <p>Generated after changing an existing Custom Field on a Customer Group using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldChangedMessagePayload customerGroupCustomFieldChangedMessagePayload = CustomerGroupCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupCustomFieldChangedMessagePayloadImpl.class)
public interface CustomerGroupCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupCustomFieldChangedMessagePayload
     */
    String CUSTOMER_GROUP_CUSTOM_FIELD_CHANGED = "CustomerGroupCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @return oldValue
     */

    @JsonProperty("oldValue")
    public Object getOldValue();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @param oldValue value to be set
     */

    public void setOldValue(final Object oldValue);

    /**
     * factory method
     * @return instance of CustomerGroupCustomFieldChangedMessagePayload
     */
    public static CustomerGroupCustomFieldChangedMessagePayload of() {
        return new CustomerGroupCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomFieldChangedMessagePayload of(
            final CustomerGroupCustomFieldChangedMessagePayload template) {
        CustomerGroupCustomFieldChangedMessagePayloadImpl instance = new CustomerGroupCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    public CustomerGroupCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomFieldChangedMessagePayload deepCopy(
            @Nullable final CustomerGroupCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomFieldChangedMessagePayloadImpl instance = new CustomerGroupCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupCustomFieldChangedMessagePayload
     * @return builder
     */
    public static CustomerGroupCustomFieldChangedMessagePayloadBuilder builder() {
        return CustomerGroupCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldChangedMessagePayloadBuilder builder(
            final CustomerGroupCustomFieldChangedMessagePayload template) {
        return CustomerGroupCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomFieldChangedMessagePayload(
            Function<CustomerGroupCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomFieldChangedMessagePayload>";
            }
        };
    }
}
