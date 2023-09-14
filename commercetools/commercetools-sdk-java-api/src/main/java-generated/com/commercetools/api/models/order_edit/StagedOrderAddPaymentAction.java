
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddPaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddPaymentAction stagedOrderAddPaymentAction = StagedOrderAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddPaymentActionImpl.class)
public interface StagedOrderAddPaymentAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddPaymentAction
     */
    String ADD_PAYMENT = "addPayment";

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @param payment value to be set
     */

    public void setPayment(final PaymentResourceIdentifier payment);

    /**
     * factory method
     * @return instance of StagedOrderAddPaymentAction
     */
    public static StagedOrderAddPaymentAction of() {
        return new StagedOrderAddPaymentActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddPaymentAction of(final StagedOrderAddPaymentAction template) {
        StagedOrderAddPaymentActionImpl instance = new StagedOrderAddPaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderAddPaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddPaymentAction deepCopy(@Nullable final StagedOrderAddPaymentAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddPaymentActionImpl instance = new StagedOrderAddPaymentActionImpl();
        instance.setPayment(
            com.commercetools.api.models.payment.PaymentResourceIdentifier.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddPaymentAction
     * @return builder
     */
    public static StagedOrderAddPaymentActionBuilder builder() {
        return StagedOrderAddPaymentActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddPaymentActionBuilder builder(final StagedOrderAddPaymentAction template) {
        return StagedOrderAddPaymentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddPaymentAction(Function<StagedOrderAddPaymentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddPaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddPaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddPaymentAction>";
            }
        };
    }
}
