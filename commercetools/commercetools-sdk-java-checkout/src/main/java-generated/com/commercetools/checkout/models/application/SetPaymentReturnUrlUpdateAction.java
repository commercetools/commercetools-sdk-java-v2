
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SetPaymentReturnUrlUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPaymentReturnUrlUpdateAction setPaymentReturnUrlUpdateAction = SetPaymentReturnUrlUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPaymentReturnUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPaymentReturnUrlUpdateActionImpl.class)
public interface SetPaymentReturnUrlUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetPaymentReturnUrlUpdateAction
     */
    String SET_PAYMENT_RETURN_URL = "setPaymentReturnUrl";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return paymentReturnUrl
     */

    @JsonProperty("paymentReturnUrl")
    public String getPaymentReturnUrl();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param paymentReturnUrl value to be set
     */

    public void setPaymentReturnUrl(final String paymentReturnUrl);

    /**
     * factory method
     * @return instance of SetPaymentReturnUrlUpdateAction
     */
    public static SetPaymentReturnUrlUpdateAction of() {
        return new SetPaymentReturnUrlUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetPaymentReturnUrlUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPaymentReturnUrlUpdateAction of(final SetPaymentReturnUrlUpdateAction template) {
        SetPaymentReturnUrlUpdateActionImpl instance = new SetPaymentReturnUrlUpdateActionImpl();
        instance.setPaymentReturnUrl(template.getPaymentReturnUrl());
        return instance;
    }

    public SetPaymentReturnUrlUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetPaymentReturnUrlUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPaymentReturnUrlUpdateAction deepCopy(@Nullable final SetPaymentReturnUrlUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetPaymentReturnUrlUpdateActionImpl instance = new SetPaymentReturnUrlUpdateActionImpl();
        instance.setPaymentReturnUrl(template.getPaymentReturnUrl());
        return instance;
    }

    /**
     * builder factory method for SetPaymentReturnUrlUpdateAction
     * @return builder
     */
    public static SetPaymentReturnUrlUpdateActionBuilder builder() {
        return SetPaymentReturnUrlUpdateActionBuilder.of();
    }

    /**
     * create builder for SetPaymentReturnUrlUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPaymentReturnUrlUpdateActionBuilder builder(final SetPaymentReturnUrlUpdateAction template) {
        return SetPaymentReturnUrlUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPaymentReturnUrlUpdateAction(Function<SetPaymentReturnUrlUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPaymentReturnUrlUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPaymentReturnUrlUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetPaymentReturnUrlUpdateAction>";
            }
        };
    }
}
