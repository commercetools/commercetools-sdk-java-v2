
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

/**
 * StagedOrderChangePaymentStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangePaymentStateAction stagedOrderChangePaymentStateAction = StagedOrderChangePaymentStateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangePaymentStateActionImpl.class)
public interface StagedOrderChangePaymentStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangePaymentStateAction
     */
    String CHANGE_PAYMENT_STATE = "changePaymentState";

    /**
     *
     * @return paymentState
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     * set paymentState
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
