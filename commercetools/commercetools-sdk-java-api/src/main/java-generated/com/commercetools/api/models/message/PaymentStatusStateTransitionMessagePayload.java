
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Transition State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusStateTransitionMessagePayload paymentStatusStateTransitionMessagePayload = PaymentStatusStateTransitionMessagePayload.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .force(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentStatusStateTransitionMessagePayloadImpl.class)
public interface PaymentStatusStateTransitionMessagePayload extends MessagePayload {

    /**
     * discriminator value for PaymentStatusStateTransitionMessagePayload
     */
    String PAYMENT_STATUS_STATE_TRANSITION = "PaymentStatusStateTransition";

    /**
     *  <p>State of the Payment after the Transition State update action.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Whether State transition validations were turned off during the Change Transaction State update action.</p>
     * @return force
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>State of the Payment after the Transition State update action.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Whether State transition validations were turned off during the Change Transaction State update action.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of PaymentStatusStateTransitionMessagePayload
     */
    public static PaymentStatusStateTransitionMessagePayload of() {
        return new PaymentStatusStateTransitionMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy PaymentStatusStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentStatusStateTransitionMessagePayload of(
            final PaymentStatusStateTransitionMessagePayload template) {
        PaymentStatusStateTransitionMessagePayloadImpl instance = new PaymentStatusStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * factory method to create a deep copy of PaymentStatusStateTransitionMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentStatusStateTransitionMessagePayload deepCopy(
            @Nullable final PaymentStatusStateTransitionMessagePayload template) {
        if (template == null) {
            return null;
        }
        PaymentStatusStateTransitionMessagePayloadImpl instance = new PaymentStatusStateTransitionMessagePayloadImpl();
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for PaymentStatusStateTransitionMessagePayload
     * @return builder
     */
    public static PaymentStatusStateTransitionMessagePayloadBuilder builder() {
        return PaymentStatusStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * create builder for PaymentStatusStateTransitionMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusStateTransitionMessagePayloadBuilder builder(
            final PaymentStatusStateTransitionMessagePayload template) {
        return PaymentStatusStateTransitionMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentStatusStateTransitionMessagePayload(
            Function<PaymentStatusStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusStateTransitionMessagePayload>";
            }
        };
    }
}
