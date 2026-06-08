
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
 *  <p>Generated after changing an existing Custom Field on a Customer using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomFieldChangedMessagePayload customerCustomFieldChangedMessagePayload = CustomerCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCustomFieldChangedMessagePayloadImpl.class)
public interface CustomerCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerCustomFieldChangedMessagePayload
     */
    String CUSTOMER_CUSTOM_FIELD_CHANGED = "CustomerCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action. When there has not been a Custom Field with the <code>name</code> on the Customer before, a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerCustomFieldAddedMessage" rel="nofollow">Customer Custom Field Added</a> Message is generated instead.</p>
     * @return previousValue
     */

    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action. When there has not been a Custom Field with the <code>name</code> on the Customer before, a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerCustomFieldAddedMessage" rel="nofollow">Customer Custom Field Added</a> Message is generated instead.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of CustomerCustomFieldChangedMessagePayload
     */
    public static CustomerCustomFieldChangedMessagePayload of() {
        return new CustomerCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCustomFieldChangedMessagePayload of(final CustomerCustomFieldChangedMessagePayload template) {
        CustomerCustomFieldChangedMessagePayloadImpl instance = new CustomerCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public CustomerCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCustomFieldChangedMessagePayload deepCopy(
            @Nullable final CustomerCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerCustomFieldChangedMessagePayloadImpl instance = new CustomerCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for CustomerCustomFieldChangedMessagePayload
     * @return builder
     */
    public static CustomerCustomFieldChangedMessagePayloadBuilder builder() {
        return CustomerCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomFieldChangedMessagePayloadBuilder builder(
            final CustomerCustomFieldChangedMessagePayload template) {
        return CustomerCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCustomFieldChangedMessagePayload(
            Function<CustomerCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCustomFieldChangedMessagePayload>";
            }
        };
    }
}
