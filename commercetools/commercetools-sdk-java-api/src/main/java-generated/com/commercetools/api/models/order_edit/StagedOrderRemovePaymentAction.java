package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.payment.PaymentResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderRemovePaymentActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * StagedOrderRemovePaymentAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemovePaymentAction stagedOrderRemovePaymentAction = StagedOrderRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderRemovePaymentActionImpl.class)
public interface StagedOrderRemovePaymentAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderRemovePaymentAction
     */
    String REMOVE_PAYMENT = "removePayment";

    /**
     *  <p>ResourceIdentifier of a Payment.</p>
     * @return payment
     */
    @NotNull
    @Valid
    @JsonProperty("payment")
    public PaymentResourceIdentifier getPayment();

    /**
     *  <p>ResourceIdentifier of a Payment.</p>
     * @param payment value to be set
     */
    
    public void setPayment(final PaymentResourceIdentifier payment);
    

    /**
     * factory method
     * @return instance of StagedOrderRemovePaymentAction
     */
    public static StagedOrderRemovePaymentAction of(){
        return new StagedOrderRemovePaymentActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderRemovePaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderRemovePaymentAction of(final StagedOrderRemovePaymentAction template) {
        StagedOrderRemovePaymentActionImpl instance = new StagedOrderRemovePaymentActionImpl();
        instance.setPayment(template.getPayment());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderRemovePaymentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderRemovePaymentAction deepCopy(@Nullable final StagedOrderRemovePaymentAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderRemovePaymentActionImpl instance = new StagedOrderRemovePaymentActionImpl();
        instance.setPayment(com.commercetools.api.models.payment.PaymentResourceIdentifier.deepCopy(template.getPayment()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderRemovePaymentAction
     * @return builder
     */
    public static StagedOrderRemovePaymentActionBuilder builder() {
        return StagedOrderRemovePaymentActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderRemovePaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemovePaymentActionBuilder builder(final StagedOrderRemovePaymentAction template) {
        return StagedOrderRemovePaymentActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderRemovePaymentAction(Function<StagedOrderRemovePaymentAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemovePaymentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderRemovePaymentAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderRemovePaymentAction>";
            }
        };
    }
}
