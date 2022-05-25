
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusStateTransitionMessagePayload
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

    String PAYMENT_STATUS_STATE_TRANSITION = "PaymentStatusStateTransition";

    /**
     *  <p>Reference to a State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *
     */
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setForce(final Boolean force);

    public static PaymentStatusStateTransitionMessagePayload of() {
        return new PaymentStatusStateTransitionMessagePayloadImpl();
    }

    public static PaymentStatusStateTransitionMessagePayload of(
            final PaymentStatusStateTransitionMessagePayload template) {
        PaymentStatusStateTransitionMessagePayloadImpl instance = new PaymentStatusStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static PaymentStatusStateTransitionMessagePayloadBuilder builder() {
        return PaymentStatusStateTransitionMessagePayloadBuilder.of();
    }

    public static PaymentStatusStateTransitionMessagePayloadBuilder builder(
            final PaymentStatusStateTransitionMessagePayload template) {
        return PaymentStatusStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withPaymentStatusStateTransitionMessagePayload(
            Function<PaymentStatusStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentStatusStateTransitionMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentStatusStateTransitionMessagePayload>";
            }
        };
    }
}
