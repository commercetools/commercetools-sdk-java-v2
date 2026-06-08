
package com.commercetools.checkout.models.application;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.payment_integration.PaymentComponentType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * SetActivePaymentComponentTypeUpdateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetActivePaymentComponentTypeUpdateAction setActivePaymentComponentTypeUpdateAction = SetActivePaymentComponentTypeUpdateAction.builder()
 *             .activePaymentComponentType(PaymentComponentType.COMPONENT)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setActivePaymentComponentType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetActivePaymentComponentTypeUpdateActionImpl.class)
public interface SetActivePaymentComponentTypeUpdateAction extends ApplicationUpdateAction {

    /**
     * discriminator value for SetActivePaymentComponentTypeUpdateAction
     */
    String SET_ACTIVE_PAYMENT_COMPONENT_TYPE = "setActivePaymentComponentType";

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    /**
     *  <p>Type of payment components that the Application will use.</p>
     * @return activePaymentComponentType
     */
    @NotNull
    @JsonProperty("activePaymentComponentType")
    public PaymentComponentType getActivePaymentComponentType();

    /**
     *  <p>Type of payment components that the Application will use.</p>
     * @param activePaymentComponentType value to be set
     */

    public void setActivePaymentComponentType(final PaymentComponentType activePaymentComponentType);

    /**
     * factory method
     * @return instance of SetActivePaymentComponentTypeUpdateAction
     */
    public static SetActivePaymentComponentTypeUpdateAction of() {
        return new SetActivePaymentComponentTypeUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetActivePaymentComponentTypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetActivePaymentComponentTypeUpdateAction of(
            final SetActivePaymentComponentTypeUpdateAction template) {
        SetActivePaymentComponentTypeUpdateActionImpl instance = new SetActivePaymentComponentTypeUpdateActionImpl();
        instance.setActivePaymentComponentType(template.getActivePaymentComponentType());
        return instance;
    }

    public SetActivePaymentComponentTypeUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetActivePaymentComponentTypeUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetActivePaymentComponentTypeUpdateAction deepCopy(
            @Nullable final SetActivePaymentComponentTypeUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetActivePaymentComponentTypeUpdateActionImpl instance = new SetActivePaymentComponentTypeUpdateActionImpl();
        instance.setActivePaymentComponentType(template.getActivePaymentComponentType());
        return instance;
    }

    /**
     * builder factory method for SetActivePaymentComponentTypeUpdateAction
     * @return builder
     */
    public static SetActivePaymentComponentTypeUpdateActionBuilder builder() {
        return SetActivePaymentComponentTypeUpdateActionBuilder.of();
    }

    /**
     * create builder for SetActivePaymentComponentTypeUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetActivePaymentComponentTypeUpdateActionBuilder builder(
            final SetActivePaymentComponentTypeUpdateAction template) {
        return SetActivePaymentComponentTypeUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetActivePaymentComponentTypeUpdateAction(
            Function<SetActivePaymentComponentTypeUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetActivePaymentComponentTypeUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetActivePaymentComponentTypeUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetActivePaymentComponentTypeUpdateAction>";
            }
        };
    }
}
