package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.ReturnPaymentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetReturnPaymentStateActionImpl;

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
 * StagedOrderSetReturnPaymentStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnPaymentStateAction stagedOrderSetReturnPaymentStateAction = StagedOrderSetReturnPaymentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetReturnPaymentStateActionImpl.class)
public interface StagedOrderSetReturnPaymentStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetReturnPaymentStateAction
     */
    String SET_RETURN_PAYMENT_STATE = "setReturnPaymentState";

    /**
     *
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();
    /**
     *
     * @return paymentState
     */
    @NotNull
    @JsonProperty("paymentState")
    public ReturnPaymentState getPaymentState();

    /**
     * set returnItemId
     * @param returnItemId value to be set
     */
    
    public void setReturnItemId(final String returnItemId);
    
    
    /**
     * set paymentState
     * @param paymentState value to be set
     */
    
    public void setPaymentState(final ReturnPaymentState paymentState);
    

    /**
     * factory method
     * @return instance of StagedOrderSetReturnPaymentStateAction
     */
    public static StagedOrderSetReturnPaymentStateAction of(){
        return new StagedOrderSetReturnPaymentStateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy StagedOrderSetReturnPaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetReturnPaymentStateAction of(final StagedOrderSetReturnPaymentStateAction template) {
        StagedOrderSetReturnPaymentStateActionImpl instance = new StagedOrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetReturnPaymentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetReturnPaymentStateAction deepCopy(@Nullable final StagedOrderSetReturnPaymentStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetReturnPaymentStateActionImpl instance = new StagedOrderSetReturnPaymentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setPaymentState(template.getPaymentState());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetReturnPaymentStateAction
     * @return builder
     */
    public static StagedOrderSetReturnPaymentStateActionBuilder builder() {
        return StagedOrderSetReturnPaymentStateActionBuilder.of();
    }
    
    /**
     * create builder for StagedOrderSetReturnPaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnPaymentStateActionBuilder builder(final StagedOrderSetReturnPaymentStateAction template) {
        return StagedOrderSetReturnPaymentStateActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetReturnPaymentStateAction(Function<StagedOrderSetReturnPaymentStateAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnPaymentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnPaymentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnPaymentStateAction>";
            }
        };
    }
}
