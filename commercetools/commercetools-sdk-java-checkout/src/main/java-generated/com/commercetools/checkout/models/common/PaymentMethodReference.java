
package com.commercetools.checkout.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Reference to a <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodReference paymentMethodReference = PaymentMethodReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment-method")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentMethodReferenceImpl.class)
public interface PaymentMethodReference extends Reference {

    /**
     * discriminator value for PaymentMethodReference
     */
    String PAYMENT_METHOD = "payment-method";

    /**
     *
     * @return typeId
     */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethod" rel="nofollow">PaymentMethod</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of PaymentMethodReference
     */
    public static PaymentMethodReference of() {
        return new PaymentMethodReferenceImpl();
    }

    /**
     * factory method to create a shallow copy PaymentMethodReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentMethodReference of(final PaymentMethodReference template) {
        PaymentMethodReferenceImpl instance = new PaymentMethodReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public PaymentMethodReference copyDeep();

    /**
     * factory method to create a deep copy of PaymentMethodReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentMethodReference deepCopy(@Nullable final PaymentMethodReference template) {
        if (template == null) {
            return null;
        }
        PaymentMethodReferenceImpl instance = new PaymentMethodReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for PaymentMethodReference
     * @return builder
     */
    public static PaymentMethodReferenceBuilder builder() {
        return PaymentMethodReferenceBuilder.of();
    }

    /**
     * create builder for PaymentMethodReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodReferenceBuilder builder(final PaymentMethodReference template) {
        return PaymentMethodReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentMethodReference(Function<PaymentMethodReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<PaymentMethodReference> typeReference() {
        return new tools.jackson.core.type.TypeReference<PaymentMethodReference>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodReference>";
            }
        };
    }
}
