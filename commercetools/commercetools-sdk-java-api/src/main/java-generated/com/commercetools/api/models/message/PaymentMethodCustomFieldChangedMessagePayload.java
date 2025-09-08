
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
 *  <p>Generated after changing an existing Custom Field on a Payment Method using the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomFieldChangedMessagePayload paymentMethodCustomFieldChangedMessagePayload = PaymentMethodCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomFieldChangedMessagePayloadImpl.class)
public interface PaymentMethodCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodCustomFieldChangedMessagePayload
     */
    String PAYMENT_METHOD_CUSTOM_FIELD_CHANGED = "PaymentMethodCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param oldValue value to be set
     */

    public void setOldValue(final Object oldValue);

    /**
     * factory method
     * @return instance of PaymentMethodCustomFieldChangedMessagePayload
     */
    public static PaymentMethodCustomFieldChangedMessagePayload of() {
        return new PaymentMethodCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomFieldChangedMessagePayload of(
            final PaymentMethodCustomFieldChangedMessagePayload template) {
        PaymentMethodCustomFieldChangedMessagePayloadImpl instance = new PaymentMethodCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    public PaymentMethodCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomFieldChangedMessagePayload deepCopy(
            @Nullable final PaymentMethodCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomFieldChangedMessagePayloadImpl instance = new PaymentMethodCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCustomFieldChangedMessagePayload
     * @return builder
     */
    public static PaymentMethodCustomFieldChangedMessagePayloadBuilder builder() {
        return PaymentMethodCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomFieldChangedMessagePayloadBuilder builder(
            final PaymentMethodCustomFieldChangedMessagePayload template) {
        return PaymentMethodCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomFieldChangedMessagePayload(
            Function<PaymentMethodCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomFieldChangedMessagePayload>";
            }
        };
    }
}
