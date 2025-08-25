
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderPaymentStateChangedMessage" rel="nofollow">Order Payment State Changed</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangePaymentStateAction stagedOrderChangePaymentStateAction = StagedOrderChangePaymentStateAction.builder()
 *             .paymentState(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changePaymentState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangePaymentStateActionImpl.class)
public interface StagedOrderChangePaymentStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangePaymentStateAction
     */
    String CHANGE_PAYMENT_STATE = "changePaymentState";

    /**
     *  <p>New payment status of the Order.</p>
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *  <p>New payment status of the Order.</p>
     * @param paymentState value to be set
     */

    public void setPaymentState(final PaymentState paymentState);

    /**
     * factory method
     * @return instance of StagedOrderChangePaymentStateAction
     */
    public static StagedOrderChangePaymentStateAction of() {
        return new StagedOrderChangePaymentStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangePaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangePaymentStateAction of(final StagedOrderChangePaymentStateAction template) {
        StagedOrderChangePaymentStateActionImpl instance = new StagedOrderChangePaymentStateActionImpl();
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    public StagedOrderChangePaymentStateAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderChangePaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangePaymentStateAction deepCopy(
            @Nullable final StagedOrderChangePaymentStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangePaymentStateActionImpl instance = new StagedOrderChangePaymentStateActionImpl();
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangePaymentStateAction
     * @return builder
     */
    public static StagedOrderChangePaymentStateActionBuilder builder() {
        return StagedOrderChangePaymentStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangePaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangePaymentStateActionBuilder builder(
            final StagedOrderChangePaymentStateAction template) {
        return StagedOrderChangePaymentStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangePaymentStateAction(Function<StagedOrderChangePaymentStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangePaymentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangePaymentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangePaymentStateAction>";
            }
        };
    }
}
