
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodNameSetMessagePayload paymentMethodNameSetMessagePayload = PaymentMethodNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodNameSetMessagePayloadImpl.class)
public interface PaymentMethodNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodNameSetMessagePayload
     */
    String PAYMENT_METHOD_NAME_SET = "PaymentMethodNameSet";

    /**
     *  <p>Name of the Payment Method after the Set Name update action.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Name of the Payment Method before the Set Name update action.</p>
     * @return oldName
     */
    @Valid
    @JsonProperty("oldName")
    public LocalizedString getOldName();

    /**
     *  <p>Name of the Payment Method after the Set Name update action.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Name of the Payment Method before the Set Name update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final LocalizedString oldName);

    /**
     * factory method
     * @return instance of PaymentMethodNameSetMessagePayload
     */
    public static PaymentMethodNameSetMessagePayload of() {
        return new PaymentMethodNameSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodNameSetMessagePayload of(final PaymentMethodNameSetMessagePayload template) {
        PaymentMethodNameSetMessagePayloadImpl instance = new PaymentMethodNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    public PaymentMethodNameSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodNameSetMessagePayload deepCopy(
            @Nullable final PaymentMethodNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodNameSetMessagePayloadImpl instance = new PaymentMethodNameSetMessagePayloadImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setOldName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldName()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodNameSetMessagePayload
     * @return builder
     */
    public static PaymentMethodNameSetMessagePayloadBuilder builder() {
        return PaymentMethodNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodNameSetMessagePayloadBuilder builder(final PaymentMethodNameSetMessagePayload template) {
        return PaymentMethodNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodNameSetMessagePayload(Function<PaymentMethodNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodNameSetMessagePayload>";
            }
        };
    }
}
