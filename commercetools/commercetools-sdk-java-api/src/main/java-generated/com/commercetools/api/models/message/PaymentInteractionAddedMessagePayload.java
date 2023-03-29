
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add InterfaceInteraction update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInteractionAddedMessagePayload paymentInteractionAddedMessagePayload = PaymentInteractionAddedMessagePayload.builder()
 *             .interaction(interactionBuilder -> interactionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentInteractionAddedMessagePayloadImpl.class)
public interface PaymentInteractionAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentInteractionAddedMessagePayload
     */
    String PAYMENT_INTERACTION_ADDED = "PaymentInteractionAdded";

    /**
     *  <p>The interface interaction that was added to the Payment.</p>
     * @return interaction
     */
    @NotNull
    @Valid
    @JsonProperty("interaction")
    public CustomFields getInteraction();

    /**
     *  <p>The interface interaction that was added to the Payment.</p>
     * @param interaction value to be set
     */

    public void setInteraction(final CustomFields interaction);

    /**
     * factory method
     * @return instance of PaymentInteractionAddedMessagePayload
     */
    public static PaymentInteractionAddedMessagePayload of() {
        return new PaymentInteractionAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentInteractionAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentInteractionAddedMessagePayload of(final PaymentInteractionAddedMessagePayload template) {
        PaymentInteractionAddedMessagePayloadImpl instance = new PaymentInteractionAddedMessagePayloadImpl();
        instance.setInteraction(template.getInteraction());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentInteractionAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentInteractionAddedMessagePayload deepCopy(
            @Nullable final PaymentInteractionAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentInteractionAddedMessagePayloadImpl instance = new PaymentInteractionAddedMessagePayloadImpl();
        instance.setInteraction(com.commercetools.api.models.type.CustomFields.deepCopy(template.getInteraction()));
        return instance;
    }

    /**
     * builder factory method for PaymentInteractionAddedMessagePayload
     * @return builder
     */
    public static PaymentInteractionAddedMessagePayloadBuilder builder() {
        return PaymentInteractionAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentInteractionAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentInteractionAddedMessagePayloadBuilder builder(
            final PaymentInteractionAddedMessagePayload template) {
        return PaymentInteractionAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentInteractionAddedMessagePayload(Function<PaymentInteractionAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentInteractionAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentInteractionAddedMessagePayload>";
            }
        };
    }
}
