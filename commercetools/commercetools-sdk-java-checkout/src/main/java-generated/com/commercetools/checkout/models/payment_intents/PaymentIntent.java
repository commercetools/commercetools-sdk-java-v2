
package com.commercetools.checkout.models.payment_intents;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * PaymentIntent
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntent paymentIntent = PaymentIntent.builder()
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentIntentImpl.class)
public interface PaymentIntent {

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<PaymentIntentAction> getActions();

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final PaymentIntentAction... actions);

    /**
     *  <p>Action to execute for the given Payment.</p>
     * @param actions values to be set
     */

    public void setActions(final List<PaymentIntentAction> actions);

    /**
     * factory method
     * @return instance of PaymentIntent
     */
    public static PaymentIntent of() {
        return new PaymentIntentImpl();
    }

    /**
     * factory method to create a shallow copy PaymentIntent
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentIntent of(final PaymentIntent template) {
        PaymentIntentImpl instance = new PaymentIntentImpl();
        instance.setActions(template.getActions());
        return instance;
    }

    public PaymentIntent copyDeep();

    /**
     * factory method to create a deep copy of PaymentIntent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentIntent deepCopy(@Nullable final PaymentIntent template) {
        if (template == null) {
            return null;
        }
        PaymentIntentImpl instance = new PaymentIntentImpl();
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.checkout.models.payment_intents.PaymentIntentAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PaymentIntent
     * @return builder
     */
    public static PaymentIntentBuilder builder() {
        return PaymentIntentBuilder.of();
    }

    /**
     * create builder for PaymentIntent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentBuilder builder(final PaymentIntent template) {
        return PaymentIntentBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentIntent(Function<PaymentIntent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentIntent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentIntent>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentIntent>";
            }
        };
    }
}
