
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the Order State Changed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeOrderStateAction stagedOrderChangeOrderStateAction = StagedOrderChangeOrderStateAction.builder()
 *             .orderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeOrderState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeOrderStateActionImpl.class)
public interface StagedOrderChangeOrderStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeOrderStateAction
     */
    String CHANGE_ORDER_STATE = "changeOrderState";

    /**
     *  <p>New status of the Order.</p>
     * @return orderState
     */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>New status of the Order.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     * factory method
     * @return instance of StagedOrderChangeOrderStateAction
     */
    public static StagedOrderChangeOrderStateAction of() {
        return new StagedOrderChangeOrderStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangeOrderStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeOrderStateAction of(final StagedOrderChangeOrderStateAction template) {
        StagedOrderChangeOrderStateActionImpl instance = new StagedOrderChangeOrderStateActionImpl();
        instance.setOrderState(template.getOrderState());
        return instance;
    }

    public StagedOrderChangeOrderStateAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderChangeOrderStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeOrderStateAction deepCopy(
            @Nullable final StagedOrderChangeOrderStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeOrderStateActionImpl instance = new StagedOrderChangeOrderStateActionImpl();
        instance.setOrderState(template.getOrderState());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeOrderStateAction
     * @return builder
     */
    public static StagedOrderChangeOrderStateActionBuilder builder() {
        return StagedOrderChangeOrderStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangeOrderStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeOrderStateActionBuilder builder(final StagedOrderChangeOrderStateAction template) {
        return StagedOrderChangeOrderStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeOrderStateAction(Function<StagedOrderChangeOrderStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeOrderStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeOrderStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeOrderStateAction>";
            }
        };
    }
}
