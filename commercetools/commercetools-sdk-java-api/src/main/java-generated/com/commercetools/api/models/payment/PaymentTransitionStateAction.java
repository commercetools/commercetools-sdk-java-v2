
package com.commercetools.api.models.payment;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>If the Payment has no current <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>, <code>initial</code> must be <code>true</code> for the new State. If the existing State has transitions set, the new State must be a valid transition. If the existing State has no transitions set, no validations are performed when transitioning to the new State.</p>
 *  <p>Transitioning the State of a Payment produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentStatusStateTransitionMessage" rel="nofollow">PaymentStatusStateTransition</a> Message.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("transitionState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PaymentTransitionStateActionImpl.class)
public interface PaymentTransitionStateAction extends PaymentUpdateAction {

    /**
     * discriminator value for PaymentTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
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

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>Set to <code>true</code> to skip validations when transitioning to the new State.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of PaymentTransitionStateAction
     */
    public static PaymentTransitionStateAction of() {
        return new PaymentTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy PaymentTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static PaymentTransitionStateAction of(final PaymentTransitionStateAction template) {
        PaymentTransitionStateActionImpl instance = new PaymentTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public PaymentTransitionStateAction copyDeep();

    /**
     * factory method to create a deep copy of PaymentTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PaymentTransitionStateAction deepCopy(@Nullable final PaymentTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        PaymentTransitionStateActionImpl instance = new PaymentTransitionStateActionImpl();
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for PaymentTransitionStateAction
     * @return builder
     */
    public static PaymentTransitionStateActionBuilder builder() {
        return PaymentTransitionStateActionBuilder.of();
    }

    /**
     * create builder for PaymentTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentTransitionStateActionBuilder builder(final PaymentTransitionStateAction template) {
        return PaymentTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPaymentTransitionStateAction(Function<PaymentTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PaymentTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PaymentTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<PaymentTransitionStateAction>";
            }
        };
    }
}
