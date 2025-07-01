
package com.commercetools.api.models.payment_method;

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
 *  <p>Reference to a PaymentMethod.</p>
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
     *  <p>Contains the representation of the expanded PaymentMethod. Only present in responses to requests with Reference Expansion for PaymentMethods.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public PaymentMethod getObj();

    /**
     *  <p>Unique identifier of the referenced PaymentMethod.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded PaymentMethod. Only present in responses to requests with Reference Expansion for PaymentMethods.</p>
     * @param obj value to be set
     */

    public void setObj(final PaymentMethod obj);

    /**
     *  <p>Unique identifier of the referenced PaymentMethod.</p>
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
        instance.setObj(template.getObj());
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
        instance.setObj(com.commercetools.api.models.payment_method.PaymentMethod.deepCopy(template.getObj()));
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
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentMethodReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentMethodReference>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentMethodReference>";
            }
        };
    }
}
