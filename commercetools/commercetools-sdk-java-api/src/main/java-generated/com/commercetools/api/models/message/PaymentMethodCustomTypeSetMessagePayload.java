
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
 *  <p>Generated after adding a Custom Type to a Payment Method using the Set Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodCustomTypeSetMessagePayload paymentMethodCustomTypeSetMessagePayload = PaymentMethodCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodCustomTypeSetMessagePayloadImpl.class)
public interface PaymentMethodCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodCustomTypeSetMessagePayload
     */
    String PAYMENT_METHOD_CUSTOM_TYPE_SET = "PaymentMethodCustomTypeSet";

    /**
     *  <p>The Custom Fields that were set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
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
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of PaymentMethodCustomTypeSetMessagePayload
     */
    public static PaymentMethodCustomTypeSetMessagePayload of() {
        return new PaymentMethodCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodCustomTypeSetMessagePayload of(final PaymentMethodCustomTypeSetMessagePayload template) {
        PaymentMethodCustomTypeSetMessagePayloadImpl instance = new PaymentMethodCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public PaymentMethodCustomTypeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodCustomTypeSetMessagePayload deepCopy(
            @Nullable final PaymentMethodCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodCustomTypeSetMessagePayloadImpl instance = new PaymentMethodCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodCustomTypeSetMessagePayload
     * @return builder
     */
    public static PaymentMethodCustomTypeSetMessagePayloadBuilder builder() {
        return PaymentMethodCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodCustomTypeSetMessagePayloadBuilder builder(
            final PaymentMethodCustomTypeSetMessagePayload template) {
        return PaymentMethodCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodCustomTypeSetMessagePayload(
            Function<PaymentMethodCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodCustomTypeSetMessagePayload>";
            }
        };
    }
}
