
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
 *  <p>Assigns a share of the Order total to a specific <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentAllocation recurringPaymentAllocation = RecurringPaymentAllocation.builder()
 *             .id("{id}")
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .allocation(allocationBuilder -> allocationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringPaymentAllocationImpl.class)
public interface RecurringPaymentAllocation {

    /**
     *  <p>Unique identifier of the RecurringPaymentAllocation within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>. Use it to remove the allocation with the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveRecurringPaymentAllocationAction" rel="nofollow">Remove RecurringPaymentAllocation</a> update action.</p>
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
    public Allocation getAllocation();

    /**
     *  <p>Unique identifier of the RecurringPaymentAllocation within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>. Use it to remove the allocation with the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartRemoveRecurringPaymentAllocationAction" rel="nofollow">Remove RecurringPaymentAllocation</a> update action.</p>
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

    public void setAllocation(final Allocation allocation);

    /**
     * factory method
     * @return instance of RecurringPaymentAllocation
     */
    public static RecurringPaymentAllocation of() {
        return new RecurringPaymentAllocationImpl();
    }

    /**
     * factory method to create a shallow copy RecurringPaymentAllocation
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringPaymentAllocation of(final RecurringPaymentAllocation template) {
        RecurringPaymentAllocationImpl instance = new RecurringPaymentAllocationImpl();
        instance.setId(template.getId());
        instance.setPaymentMethod(template.getPaymentMethod());
        instance.setAllocation(template.getAllocation());
        return instance;
    }

    public RecurringPaymentAllocation copyDeep();

    /**
     * factory method to create a deep copy of RecurringPaymentAllocation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringPaymentAllocation deepCopy(@Nullable final RecurringPaymentAllocation template) {
        if (template == null) {
            return null;
        }
        RecurringPaymentAllocationImpl instance = new RecurringPaymentAllocationImpl();
        instance.setId(template.getId());
        instance.setPaymentMethod(
            com.commercetools.api.models.payment_method.PaymentMethodReference.deepCopy(template.getPaymentMethod()));
        instance.setAllocation(com.commercetools.api.models.cart.Allocation.deepCopy(template.getAllocation()));
        return instance;
    }

    /**
     * builder factory method for RecurringPaymentAllocation
     * @return builder
     */
    public static RecurringPaymentAllocationBuilder builder() {
        return RecurringPaymentAllocationBuilder.of();
    }

    /**
     * create builder for RecurringPaymentAllocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentAllocationBuilder builder(final RecurringPaymentAllocation template) {
        return RecurringPaymentAllocationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringPaymentAllocation(Function<RecurringPaymentAllocation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringPaymentAllocation> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringPaymentAllocation>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringPaymentAllocation>";
            }
        };
    }
}
