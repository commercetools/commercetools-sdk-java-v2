
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
 *  <p>Draft type that stores the data to create a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentAllocationDraft paymentAllocationDraft = PaymentAllocationDraft.builder()
 *             .id("{id}")
 *             .paymentMethod(paymentMethodBuilder -> paymentMethodBuilder)
 *             .allocation(allocationBuilder -> allocationBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentAllocationDraftImpl.class)
public interface PaymentAllocationDraft extends io.vrap.rmf.base.client.Draft<PaymentAllocationDraft> {

    /**
     *  <p>Unique identifier of the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
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
     *  <p>Unique identifier of the resulting <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentAllocation" rel="nofollow">RecurringPaymentAllocation</a> within the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringPaymentConfiguration" rel="nofollow">RecurringPaymentConfiguration</a>.</p>
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
     * @return instance of PaymentAllocationDraft
     */
    public static PaymentAllocationDraft of() {
        return new PaymentAllocationDraftImpl();
    }

    /**
     * factory method to create a shallow copy PaymentAllocationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentAllocationDraft of(final PaymentAllocationDraft template) {
        PaymentAllocationDraftImpl instance = new PaymentAllocationDraftImpl();
        instance.setId(template.getId());
        instance.setPaymentMethod(template.getPaymentMethod());
        instance.setAllocation(template.getAllocation());
        return instance;
    }

    public PaymentAllocationDraft copyDeep();

    /**
     * factory method to create a deep copy of PaymentAllocationDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentAllocationDraft deepCopy(@Nullable final PaymentAllocationDraft template) {
        if (template == null) {
            return null;
        }
        PaymentAllocationDraftImpl instance = new PaymentAllocationDraftImpl();
        instance.setId(template.getId());
        instance.setPaymentMethod(
            com.commercetools.api.models.payment_method.PaymentMethodReference.deepCopy(template.getPaymentMethod()));
        instance.setAllocation(com.commercetools.api.models.cart.AllocationDraft.deepCopy(template.getAllocation()));
        return instance;
    }

    /**
     * builder factory method for PaymentAllocationDraft
     * @return builder
     */
    public static PaymentAllocationDraftBuilder builder() {
        return PaymentAllocationDraftBuilder.of();
    }

    /**
     * create builder for PaymentAllocationDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentAllocationDraftBuilder builder(final PaymentAllocationDraft template) {
        return PaymentAllocationDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentAllocationDraft(Function<PaymentAllocationDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<PaymentAllocationDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<PaymentAllocationDraft>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentAllocationDraft>";
            }
        };
    }
}
