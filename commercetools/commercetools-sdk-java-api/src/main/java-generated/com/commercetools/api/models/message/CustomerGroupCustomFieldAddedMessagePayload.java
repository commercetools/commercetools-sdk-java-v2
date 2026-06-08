
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
 *  <p>Generated after adding a Custom Field to a Customer Group using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action. If a Custom Field already exists with the same name, a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupCustomFieldChangedMessage" rel="nofollow">CustomerGroupCustomFieldChanged</a> Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldAddedMessagePayload customerGroupCustomFieldAddedMessagePayload = CustomerGroupCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupCustomFieldAddedMessagePayloadImpl.class)
public interface CustomerGroupCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupCustomFieldAddedMessagePayload
     */
    String CUSTOMER_GROUP_CUSTOM_FIELD_ADDED = "CustomerGroupCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of CustomerGroupCustomFieldAddedMessagePayload
     */
    public static CustomerGroupCustomFieldAddedMessagePayload of() {
        return new CustomerGroupCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomFieldAddedMessagePayload of(
            final CustomerGroupCustomFieldAddedMessagePayload template) {
        CustomerGroupCustomFieldAddedMessagePayloadImpl instance = new CustomerGroupCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public CustomerGroupCustomFieldAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomFieldAddedMessagePayload deepCopy(
            @Nullable final CustomerGroupCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomFieldAddedMessagePayloadImpl instance = new CustomerGroupCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupCustomFieldAddedMessagePayload
     * @return builder
     */
    public static CustomerGroupCustomFieldAddedMessagePayloadBuilder builder() {
        return CustomerGroupCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldAddedMessagePayloadBuilder builder(
            final CustomerGroupCustomFieldAddedMessagePayload template) {
        return CustomerGroupCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomFieldAddedMessagePayload(
            Function<CustomerGroupCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomFieldAddedMessagePayload>";
            }
        };
    }
}
