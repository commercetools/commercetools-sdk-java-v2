
package com.commercetools.api.models.payment_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * PaymentMethodUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodUpdateAction paymentMethodUpdateAction = PaymentMethodUpdateAction.setCustomFieldBuilder()
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = PaymentMethodUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = PaymentMethodUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface PaymentMethodUpdateAction {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public PaymentMethodUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodUpdateAction deepCopy(@Nullable final PaymentMethodUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof PaymentMethodUpdateActionImpl)) {
            return template.copyDeep();
        }
        PaymentMethodUpdateActionImpl instance = new PaymentMethodUpdateActionImpl();
        return instance;
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setDefault subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetDefaultActionBuilder setDefaultBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetDefaultActionBuilder.of();
    }

    /**
     * builder for setInterfaceAccount subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetInterfaceAccountActionBuilder setInterfaceAccountBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetInterfaceAccountActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetKeyActionBuilder.of();
    }

    /**
     * builder for setMethod subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetMethodActionBuilder setMethodBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetMethodActionBuilder.of();
    }

    /**
     * builder for setName subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetNameActionBuilder.of();
    }

    /**
     * builder for setPaymentInterface subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetPaymentInterfaceActionBuilder setPaymentInterfaceBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetPaymentInterfaceActionBuilder.of();
    }

    /**
     * builder for setPaymentMethodStatus subtype
     * @return builder
     */
    public static com.commercetools.api.models.payment_method.PaymentMethodSetPaymentMethodStatusActionBuilder setPaymentMethodStatusBuilder() {
        return com.commercetools.api.models.payment_method.PaymentMethodSetPaymentMethodStatusActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodUpdateAction(Function<PaymentMethodUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodUpdateAction>";
            }
        };
    }
}
