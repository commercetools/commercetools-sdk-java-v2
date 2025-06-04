
package com.commercetools.api.models.event;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.payment.PaymentReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The <code>data</code> payload of all related order event messages.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutMessageOrderPayloadBaseData checkoutMessageOrderPayloadBaseData = CheckoutMessageOrderPayloadBaseData.builder()
 *             .projectKey("{projectKey}")
 *             .cart(cartBuilder -> cartBuilder)
 *             .plusPayments(paymentsBuilder -> paymentsBuilder)
 *             .plusErrors(errorsBuilder -> errorsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutMessageOrderPayloadBaseDataImpl.class)
public interface CheckoutMessageOrderPayloadBaseData {

    /**
     *  <p><code>key</code> of the Project where the order would belong to.</p>
     * @return projectKey
     */
    @NotNull
    @JsonProperty("projectKey")
    public String getProjectKey();

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @return cart
     */
    @NotNull
    @Valid
    @JsonProperty("cart")
    public CartReference getCart();

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @return payments
     */
    @NotNull
    @Valid
    @JsonProperty("payments")
    public List<PaymentReference> getPayments();

    /**
     *  <p>Errors associated with the order event.</p>
     * @return errors
     */
    @NotNull
    @Valid
    @JsonProperty("errors")
    public List<ErrorObject> getErrors();

    /**
     *  <p><code>key</code> of the Project where the order would belong to.</p>
     * @param projectKey value to be set
     */

    public void setProjectKey(final String projectKey);

    /**
     *  <p>The Cart on which the change or action was performed.</p>
     * @param cart value to be set
     */

    public void setCart(final CartReference cart);

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param payments values to be set
     */

    @JsonIgnore
    public void setPayments(final PaymentReference... payments);

    /**
     *  <p>The Payments on which the change or action was performed.</p>
     * @param payments values to be set
     */

    public void setPayments(final List<PaymentReference> payments);

    /**
     *  <p>Errors associated with the order event.</p>
     * @param errors values to be set
     */

    @JsonIgnore
    public void setErrors(final ErrorObject... errors);

    /**
     *  <p>Errors associated with the order event.</p>
     * @param errors values to be set
     */

    public void setErrors(final List<ErrorObject> errors);

    /**
     * factory method
     * @return instance of CheckoutMessageOrderPayloadBaseData
     */
    public static CheckoutMessageOrderPayloadBaseData of() {
        return new CheckoutMessageOrderPayloadBaseDataImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutMessageOrderPayloadBaseData
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutMessageOrderPayloadBaseData of(final CheckoutMessageOrderPayloadBaseData template) {
        CheckoutMessageOrderPayloadBaseDataImpl instance = new CheckoutMessageOrderPayloadBaseDataImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setCart(template.getCart());
        instance.setPayments(template.getPayments());
        instance.setErrors(template.getErrors());
        return instance;
    }

    public CheckoutMessageOrderPayloadBaseData copyDeep();

    /**
     * factory method to create a deep copy of CheckoutMessageOrderPayloadBaseData
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutMessageOrderPayloadBaseData deepCopy(
            @Nullable final CheckoutMessageOrderPayloadBaseData template) {
        if (template == null) {
            return null;
        }
        CheckoutMessageOrderPayloadBaseDataImpl instance = new CheckoutMessageOrderPayloadBaseDataImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setCart(com.commercetools.api.models.cart.CartReference.deepCopy(template.getCart()));
        instance.setPayments(Optional.ofNullable(template.getPayments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.payment.PaymentReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setErrors(Optional.ofNullable(template.getErrors())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.error.ErrorObject::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CheckoutMessageOrderPayloadBaseData
     * @return builder
     */
    public static CheckoutMessageOrderPayloadBaseDataBuilder builder() {
        return CheckoutMessageOrderPayloadBaseDataBuilder.of();
    }

    /**
     * create builder for CheckoutMessageOrderPayloadBaseData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutMessageOrderPayloadBaseDataBuilder builder(
            final CheckoutMessageOrderPayloadBaseData template) {
        return CheckoutMessageOrderPayloadBaseDataBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutMessageOrderPayloadBaseData(Function<CheckoutMessageOrderPayloadBaseData, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutMessageOrderPayloadBaseData> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutMessageOrderPayloadBaseData>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutMessageOrderPayloadBaseData>";
            }
        };
    }
}
