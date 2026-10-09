
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.payment_method.PaymentMethodReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Adds a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> to the <code>paymentAllocations</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddRecurringPaymentAllocationAction cartAddRecurringPaymentAllocationAction = CartAddRecurringPaymentAllocationAction.builder()
 *             .id("{id}")
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .allocation(allocationBuilder -> allocationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addRecurringPaymentAllocation")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddRecurringPaymentAllocationActionImpl.class)
public interface CartAddRecurringPaymentAllocationAction extends CartUpdateAction {

    /**
     * discriminator value for CartAddRecurringPaymentAllocationAction
     */
    String ADD_RECURRING_PAYMENT_ALLOCATION = "addRecurringPaymentAllocation";

    /**
     *  <p>Unique identifier of the new <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     * @return paymentMethod
     */
    @NotNull
    @Valid
    @JsonProperty("paymentMethod")
    public PaymentMethodReference getPaymentMethod();

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     * @return allocation
     */
    @NotNull
    @Valid
    @JsonProperty("allocation")
    public AllocationDraft getAllocation();

    /**
     *  <p>Unique identifier of the new <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Payment Method charged for this share of the Order total.</p>
     * @param paymentMethod value to be set
     */

    public void setPaymentMethod(final PaymentMethodReference paymentMethod);

    /**
     *  <p>Share of the Order total charged to the <code>paymentMethod</code>.</p>
     * @param allocation value to be set
     */

    public void setAllocation(final AllocationDraft allocation);

    /**
     * factory method
     * @return instance of CartAddRecurringPaymentAllocationAction
     */
    public static CartAddRecurringPaymentAllocationAction of() {
        return new CartAddRecurringPaymentAllocationActionImpl();
    }

    /**
     * factory method to create a shallow copy CartAddRecurringPaymentAllocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartAddRecurringPaymentAllocationAction of(final CartAddRecurringPaymentAllocationAction template) {
        CartAddRecurringPaymentAllocationActionImpl instance = new CartAddRecurringPaymentAllocationActionImpl();
        instance.setId(template.getId());
        instance.setPaymentMethod(template.getPaymentMethod());
        instance.setAllocation(template.getAllocation());
        return instance;
    }

    public CartAddRecurringPaymentAllocationAction copyDeep();

    /**
     * factory method to create a deep copy of CartAddRecurringPaymentAllocationAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartAddRecurringPaymentAllocationAction deepCopy(
            @Nullable final CartAddRecurringPaymentAllocationAction template) {
        if (template == null) {
            return null;
        }
        CartAddRecurringPaymentAllocationActionImpl instance = new CartAddRecurringPaymentAllocationActionImpl();
        instance.setId(template.getId());
        instance.setPaymentMethod(
            com.commercetools.api.models.payment_method.PaymentMethodReference.deepCopy(template.getPaymentMethod()));
        instance.setAllocation(com.commercetools.api.models.cart.AllocationDraft.deepCopy(template.getAllocation()));
        return instance;
    }

    /**
     * builder factory method for CartAddRecurringPaymentAllocationAction
     * @return builder
     */
    public static CartAddRecurringPaymentAllocationActionBuilder builder() {
        return CartAddRecurringPaymentAllocationActionBuilder.of();
    }

    /**
     * create builder for CartAddRecurringPaymentAllocationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddRecurringPaymentAllocationActionBuilder builder(
            final CartAddRecurringPaymentAllocationAction template) {
        return CartAddRecurringPaymentAllocationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartAddRecurringPaymentAllocationAction(
            Function<CartAddRecurringPaymentAllocationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartAddRecurringPaymentAllocationAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartAddRecurringPaymentAllocationAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddRecurringPaymentAllocationAction>";
            }
        };
    }
}
