
package com.commercetools.api.models.review;

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
 *  <p>Transition to a new State. This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReviewStateTransitionMessage" rel="nofollow">Review State Transition</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewTransitionStateAction reviewTransitionStateAction = ReviewTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("transitionState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewTransitionStateActionImpl.class)
public interface ReviewTransitionStateAction extends ReviewUpdateAction {

    /**
     * discriminator value for ReviewTransitionStateAction
     */
    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the <a href="https://docs.commercetools.com/apis/ctp:api:type:StateRoleEnum" rel="nofollow">role</a> <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     * @return state
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Switch validations on or off.</p>
     * @return force
     */

    @JsonProperty("force")
    public Boolean getForce();

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State. If the existing State has <code>transitions</code> set, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. If the new State does not have the <a href="https://docs.commercetools.com/apis/ctp:api:type:StateRoleEnum" rel="nofollow">role</a> <code>ReviewIncludedInStatistics</code>, the Review is not taken into account in the ratings statistics of the target.</p>
     * @param state value to be set
     */

    public void setState(final StateResourceIdentifier state);

    /**
     *  <p>Switch validations on or off.</p>
     * @param force value to be set
     */

    public void setForce(final Boolean force);

    /**
     * factory method
     * @return instance of ReviewTransitionStateAction
     */
    public static ReviewTransitionStateAction of() {
        return new ReviewTransitionStateActionImpl();
    }

    /**
     * factory method to create a shallow copy ReviewTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ReviewTransitionStateAction of(final ReviewTransitionStateAction template) {
        ReviewTransitionStateActionImpl instance = new ReviewTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public ReviewTransitionStateAction copyDeep();

    /**
     * factory method to create a deep copy of ReviewTransitionStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ReviewTransitionStateAction deepCopy(@Nullable final ReviewTransitionStateAction template) {
        if (template == null) {
            return null;
        }
        ReviewTransitionStateActionImpl instance = new ReviewTransitionStateActionImpl();
        instance.setState(com.commercetools.api.models.state.StateResourceIdentifier.deepCopy(template.getState()));
        instance.setForce(template.getForce());
        return instance;
    }

    /**
     * builder factory method for ReviewTransitionStateAction
     * @return builder
     */
    public static ReviewTransitionStateActionBuilder builder() {
        return ReviewTransitionStateActionBuilder.of();
    }

    /**
     * create builder for ReviewTransitionStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewTransitionStateActionBuilder builder(final ReviewTransitionStateAction template) {
        return ReviewTransitionStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReviewTransitionStateAction(Function<ReviewTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ReviewTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewTransitionStateAction>";
            }
        };
    }
}
