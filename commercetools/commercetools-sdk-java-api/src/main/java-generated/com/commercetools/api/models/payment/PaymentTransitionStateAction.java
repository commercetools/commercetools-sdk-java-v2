
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If the Payment has no current State, <code>initial</code> must be <code>true</code> for the new State. If the existing State has transitions set, the new State must be a valid transition. If the existing State has no transitions set, no validations are performed when transitioning to the new State.</p>
 *  <p>Transitioning the State of a Payment produces the PaymentStatusStateTransition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentTransitionStateAction paymentTransitionStateAction = PaymentTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentTransitionStateActionImpl.class)
public interface PaymentTransitionStateAction extends PaymentUpdateAction {

    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>ResourceIdentifier to a State.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Set to <code>true</code> to skip validations when transitioning to the new State.</p>
     * @return force
     */

    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);

    public void setForce(final Boolean force);

    public static PaymentTransitionStateAction of() {
        return new PaymentTransitionStateActionImpl();
    }

    public static PaymentTransitionStateAction of(final PaymentTransitionStateAction template) {
        PaymentTransitionStateActionImpl instance = new PaymentTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static PaymentTransitionStateActionBuilder builder() {
        return PaymentTransitionStateActionBuilder.of();
    }

    public static PaymentTransitionStateActionBuilder builder(final PaymentTransitionStateAction template) {
        return PaymentTransitionStateActionBuilder.of(template);
    }

    default <T> T withPaymentTransitionStateAction(Function<PaymentTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransitionStateAction>";
            }
        };
    }
}
