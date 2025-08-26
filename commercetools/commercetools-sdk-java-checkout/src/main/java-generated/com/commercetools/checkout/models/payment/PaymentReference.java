
package com.commercetools.checkout.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.checkout.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a <span>Payment</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentReference paymentReference = PaymentReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentReferenceImpl.class)
public interface PaymentReference extends Reference {

    /**
     * discriminator value for PaymentReference
     */
    String PAYMENT = "payment";

    /**
     *  <p>Unique identifier of the referenced <span>Payment</span>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <span>Payment</span>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of PaymentReference
     */
    public static PaymentReference of() {
        return new PaymentReferenceImpl();
    }

    /**
     * factory method to create a shallow copy PaymentReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentReference of(final PaymentReference template) {
        PaymentReferenceImpl instance = new PaymentReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public PaymentReference copyDeep();

    /**
     * factory method to create a deep copy of PaymentReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentReference deepCopy(@Nullable final PaymentReference template) {
        if (template == null) {
            return null;
        }
        PaymentReferenceImpl instance = new PaymentReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for PaymentReference
     * @return builder
     */
    public static PaymentReferenceBuilder builder() {
        return PaymentReferenceBuilder.of();
    }

    /**
     * create builder for PaymentReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentReferenceBuilder builder(final PaymentReference template) {
        return PaymentReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentReference(Function<PaymentReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentReference>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentReference>";
            }
        };
    }
}
