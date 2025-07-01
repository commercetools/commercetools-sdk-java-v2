
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after adding Custom Fields to a PaymentMethodInfo using the Set MethodInfo Custom Type update action on Payments and the Set MethodInfo Custom Type update action on My Payments.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomTypeSetMessagePayload paymentMethodInfoCustomTypeSetMessagePayload = PaymentMethodInfoCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoCustomTypeSetMessagePayloadImpl.class)
public interface PaymentMethodInfoCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoCustomTypeSetMessagePayload
     */
    String PAYMENT_METHOD_INFO_CUSTOM_TYPE_SET = "PaymentMethodInfoCustomTypeSet";

    /**
     *  <p>The Custom Fields that were set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous Type. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of PaymentMethodInfoCustomTypeSetMessagePayload
     */
    public static PaymentMethodInfoCustomTypeSetMessagePayload of() {
        return new PaymentMethodInfoCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoCustomTypeSetMessagePayload of(
            final PaymentMethodInfoCustomTypeSetMessagePayload template) {
        PaymentMethodInfoCustomTypeSetMessagePayloadImpl instance = new PaymentMethodInfoCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public PaymentMethodInfoCustomTypeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoCustomTypeSetMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoCustomTypeSetMessagePayloadImpl instance = new PaymentMethodInfoCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoCustomTypeSetMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeSetMessagePayloadBuilder builder() {
        return PaymentMethodInfoCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeSetMessagePayloadBuilder builder(
            final PaymentMethodInfoCustomTypeSetMessagePayload template) {
        return PaymentMethodInfoCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoCustomTypeSetMessagePayload(
            Function<PaymentMethodInfoCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoCustomTypeSetMessagePayload>";
            }
        };
    }
}
