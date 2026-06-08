
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Used by the <span>Import API</span> to identify a Payment.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentKeyReference paymentKeyReference = PaymentKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("payment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentKeyReferenceImpl.class)
public interface PaymentKeyReference extends KeyReference {

    /**
     * discriminator value for PaymentKeyReference
     */
    String PAYMENT = "payment";

    /**
     *  <p>User-defined unique identifier of the referenced Payment.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier of the referenced Payment.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of PaymentKeyReference
     */
    public static PaymentKeyReference of() {
        return new PaymentKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy PaymentKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentKeyReference of(final PaymentKeyReference template) {
        PaymentKeyReferenceImpl instance = new PaymentKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public PaymentKeyReference copyDeep();

    /**
     * factory method to create a deep copy of PaymentKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentKeyReference deepCopy(@Nullable final PaymentKeyReference template) {
        if (template == null) {
            return null;
        }
        PaymentKeyReferenceImpl instance = new PaymentKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PaymentKeyReference
     * @return builder
     */
    public static PaymentKeyReferenceBuilder builder() {
        return PaymentKeyReferenceBuilder.of();
    }

    /**
     * create builder for PaymentKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentKeyReferenceBuilder builder(final PaymentKeyReference template) {
        return PaymentKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentKeyReference(Function<PaymentKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentKeyReference>";
            }
        };
    }
}
