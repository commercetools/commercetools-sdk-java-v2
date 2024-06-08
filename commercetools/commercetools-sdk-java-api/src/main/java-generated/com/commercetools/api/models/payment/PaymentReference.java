
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a Payment.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentReferenceImpl.class)
public interface PaymentReference extends Reference, com.commercetools.api.models.Identifiable<Payment>,
        com.commercetools.api.models.IdentifiableObjHolder<Payment> {

    /**
     * discriminator value for PaymentReference
     */
    String PAYMENT = "payment";

    /**
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with Reference Expansion for Payments.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Payment getObj();

    /**
     *  <p>Unique identifier of the referenced Payment.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Payment. Only present in responses to requests with Reference Expansion for Payments.</p>
     * @param obj value to be set
     */

    public void setObj(final Payment obj);

    /**
     *  <p>Unique identifier of the referenced Payment.</p>
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
        instance.setObj(template.getObj());
        return instance;
    }

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
        instance.setObj(com.commercetools.api.models.payment.Payment.deepCopy(template.getObj()));
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
