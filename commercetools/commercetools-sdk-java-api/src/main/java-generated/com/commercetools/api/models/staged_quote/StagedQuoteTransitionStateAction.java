
package com.commercetools.api.models.staged_quote;

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
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. This update action produces the Staged Quote State Transition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedQuoteTransitionStateAction stagedQuoteTransitionStateAction = StagedQuoteTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedQuoteTransitionStateActionImpl.class)
public interface StagedQuoteTransitionStateAction extends StagedQuoteUpdateAction {

    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>Value to set. If there is no State yet, the new State must be an initial State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
     *  <p>Switch validations on or off.</p>
     */

    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);

    public void setForce(final Boolean force);

    public static StagedQuoteTransitionStateAction of() {
        return new StagedQuoteTransitionStateActionImpl();
    }

    public static StagedQuoteTransitionStateAction of(final StagedQuoteTransitionStateAction template) {
        StagedQuoteTransitionStateActionImpl instance = new StagedQuoteTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static StagedQuoteTransitionStateActionBuilder builder() {
        return StagedQuoteTransitionStateActionBuilder.of();
    }

    public static StagedQuoteTransitionStateActionBuilder builder(final StagedQuoteTransitionStateAction template) {
        return StagedQuoteTransitionStateActionBuilder.of(template);
    }

    default <T> T withStagedQuoteTransitionStateAction(Function<StagedQuoteTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedQuoteTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedQuoteTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedQuoteTransitionStateAction>";
            }
        };
    }
}
