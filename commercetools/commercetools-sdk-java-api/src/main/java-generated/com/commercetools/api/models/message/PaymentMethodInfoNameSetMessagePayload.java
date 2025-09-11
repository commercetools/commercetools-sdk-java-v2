
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoNameSetMessagePayload paymentMethodInfoNameSetMessagePayload = PaymentMethodInfoNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("PaymentMethodInfoNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodInfoNameSetMessagePayloadImpl.class)
public interface PaymentMethodInfoNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentMethodInfoNameSetMessagePayload
     */
    String PAYMENT_METHOD_INFO_NAME_SET = "PaymentMethodInfoNameSet";

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @return oldName
     */
    @Valid
    @JsonProperty("oldName")
    public LocalizedString getOldName();

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoNameAction" rel="nofollow">Set MethodInfo Name</a> update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final LocalizedString oldName);

    /**
     * factory method
     * @return instance of PaymentMethodInfoNameSetMessagePayload
     */
    public static PaymentMethodInfoNameSetMessagePayload of() {
        return new PaymentMethodInfoNameSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodInfoNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodInfoNameSetMessagePayload of(final PaymentMethodInfoNameSetMessagePayload template) {
        PaymentMethodInfoNameSetMessagePayloadImpl instance = new PaymentMethodInfoNameSetMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    public PaymentMethodInfoNameSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodInfoNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodInfoNameSetMessagePayload deepCopy(
            @Nullable final PaymentMethodInfoNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentMethodInfoNameSetMessagePayloadImpl instance = new PaymentMethodInfoNameSetMessagePayloadImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setOldName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldName()));
        return instance;
    }

    /**
     * builder factory method for PaymentMethodInfoNameSetMessagePayload
     * @return builder
     */
    public static PaymentMethodInfoNameSetMessagePayloadBuilder builder() {
        return PaymentMethodInfoNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentMethodInfoNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoNameSetMessagePayloadBuilder builder(
            final PaymentMethodInfoNameSetMessagePayload template) {
        return PaymentMethodInfoNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodInfoNameSetMessagePayload(
            Function<PaymentMethodInfoNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodInfoNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodInfoNameSetMessagePayload>";
            }
        };
    }
}
