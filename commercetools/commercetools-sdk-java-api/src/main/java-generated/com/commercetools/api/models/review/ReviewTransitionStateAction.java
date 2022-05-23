
package com.commercetools.api.models.review;

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
 * ReviewTransitionStateAction
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewTransitionStateActionImpl.class)
public interface ReviewTransitionStateAction extends ReviewUpdateAction {

    String TRANSITION_STATE = "transitionState";

    /**
     <>
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     <>
     */

    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);

    public void setForce(final Boolean force);

    public static ReviewTransitionStateAction of() {
        return new ReviewTransitionStateActionImpl();
    }

    public static ReviewTransitionStateAction of(final ReviewTransitionStateAction template) {
        ReviewTransitionStateActionImpl instance = new ReviewTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ReviewTransitionStateActionBuilder builder() {
        return ReviewTransitionStateActionBuilder.of();
    }

    public static ReviewTransitionStateActionBuilder builder(final ReviewTransitionStateAction template) {
        return ReviewTransitionStateActionBuilder.of(template);
    }

    default <T> T withReviewTransitionStateAction(Function<ReviewTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewTransitionStateAction>";
            }
        };
    }
}
