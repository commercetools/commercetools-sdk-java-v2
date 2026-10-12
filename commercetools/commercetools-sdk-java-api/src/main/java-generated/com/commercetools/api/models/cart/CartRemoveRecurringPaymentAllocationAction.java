
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Removes a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> from the <code>paymentAllocations</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveRecurringPaymentAllocationAction cartRemoveRecurringPaymentAllocationAction = CartRemoveRecurringPaymentAllocationAction.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeRecurringPaymentAllocation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveRecurringPaymentAllocationActionImpl.class)
public interface CartRemoveRecurringPaymentAllocationAction extends CartUpdateAction {

    /**
     * discriminator value for CartRemoveRecurringPaymentAllocationAction
     */
    String REMOVE_RECURRING_PAYMENT_ALLOCATION = "removeRecurringPaymentAllocation";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> to remove.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> to remove.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CartRemoveRecurringPaymentAllocationAction
     */
    public static CartRemoveRecurringPaymentAllocationAction of() {
        return new CartRemoveRecurringPaymentAllocationActionImpl();
    }

    /**
     * factory method to create a shallow copy CartRemoveRecurringPaymentAllocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartRemoveRecurringPaymentAllocationAction of(
            final CartRemoveRecurringPaymentAllocationAction template) {
        CartRemoveRecurringPaymentAllocationActionImpl instance = new CartRemoveRecurringPaymentAllocationActionImpl();
        instance.setId(template.getId());
        return instance;
    }

    public CartRemoveRecurringPaymentAllocationAction copyDeep();

    /**
     * factory method to create a deep copy of CartRemoveRecurringPaymentAllocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartRemoveRecurringPaymentAllocationAction deepCopy(
            @Nullable final CartRemoveRecurringPaymentAllocationAction template) {
        if (template == null) {
            return null;
        }
        CartRemoveRecurringPaymentAllocationActionImpl instance = new CartRemoveRecurringPaymentAllocationActionImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for CartRemoveRecurringPaymentAllocationAction
     * @return builder
     */
    public static CartRemoveRecurringPaymentAllocationActionBuilder builder() {
        return CartRemoveRecurringPaymentAllocationActionBuilder.of();
    }

    /**
     * create builder for CartRemoveRecurringPaymentAllocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartRemoveRecurringPaymentAllocationActionBuilder builder(
            final CartRemoveRecurringPaymentAllocationAction template) {
        return CartRemoveRecurringPaymentAllocationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartRemoveRecurringPaymentAllocationAction(
            Function<CartRemoveRecurringPaymentAllocationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartRemoveRecurringPaymentAllocationAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartRemoveRecurringPaymentAllocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveRecurringPaymentAllocationAction>";
            }
        };
    }
}
