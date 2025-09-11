
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
 *  <p>Generated after changing an existing Custom Field on a PaymentMethodInfo using the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set MethodInfo CustomField</a> update action on Payments and the <a href="https://docs.commercetools.com/apis/ctp:api:type:MyPaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set MethodInfo CustomField</a> update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomFieldChangedMessagePayload paymentMethodInfoCustomFieldChangedMessagePayload = PaymentMethodInfoCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomFieldChangedMessagePayloadImpl.class)
public interface PaymentMethodInfoCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoCustomFieldChangedMessagePayload
     */
    String PAYMENT_METHOD_INFO_CUSTOM_FIELD_CHANGED = "PaymentMethodInfoCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of PaymentMethodInfoCustomFieldChangedMessagePayload
     */
    public static PaymentMethodInfoCustomFieldChangedMessagePayload of() {
        return new PaymentMethodInfoCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomFieldChangedMessagePayload of(
            final PaymentMethodInfoCustomFieldChangedMessagePayload template) {
        PaymentMethodInfoCustomFieldChangedMessagePayloadImpl instance = new PaymentMethodInfoCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public PaymentMethodInfoCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomFieldChangedMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomFieldChangedMessagePayloadImpl instance = new PaymentMethodInfoCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoCustomFieldChangedMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder builder() {
        return PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder builder(
            final PaymentMethodInfoCustomFieldChangedMessagePayload template) {
        return PaymentMethodInfoCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomFieldChangedMessagePayload(
            Function<PaymentMethodInfoCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomFieldChangedMessagePayload>";
            }
        };
    }
}
