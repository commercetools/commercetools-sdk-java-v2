
package com.commercetools.checkout.models.payment_integration;

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
 *  <p>Reference to a <span>Payment Integration</span>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationReference paymentIntegrationReference = PaymentIntegrationReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment-integration")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntegrationReferenceImpl.class)
public interface PaymentIntegrationReference extends Reference {

    /**
     * discriminator value for PaymentIntegrationReference
     */
    String PAYMENT_INTEGRATION = "payment-integration";

    /**
     *  <p>Unique identifier of the referenced Payment Integration.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced Payment Integration.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of PaymentIntegrationReference
     */
    public static PaymentIntegrationReference of() {
        return new PaymentIntegrationReferenceImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntegrationReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntegrationReference of(final PaymentIntegrationReference template) {
        PaymentIntegrationReferenceImpl instance = new PaymentIntegrationReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public PaymentIntegrationReference copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntegrationReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntegrationReference deepCopy(@Nullable final PaymentIntegrationReference template) {
        if (template == null) {
            return null;
        }
        PaymentIntegrationReferenceImpl instance = new PaymentIntegrationReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for PaymentIntegrationReference
     * @return builder
     */
    public static PaymentIntegrationReferenceBuilder builder() {
        return PaymentIntegrationReferenceBuilder.of();
    }

    /**
     * create builder for PaymentIntegrationReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationReferenceBuilder builder(final PaymentIntegrationReference template) {
        return PaymentIntegrationReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntegrationReference(Function<PaymentIntegrationReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntegrationReference>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntegrationReference>";
            }
        };
    }
}
