
package com.commercetools.api.models.quote_request;

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
 *  <p>If the existing State has set <code>transitions</code>, there must be a direct transition to the new State. If <code>transitions</code> is not set, no validation is performed. This update action produces the Quote Request State Transition Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestTransitionStateAction quoteRequestTransitionStateAction = QuoteRequestTransitionStateAction.builder()
 *             .state(stateBuilder -> stateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QuoteRequestTransitionStateActionImpl.class)
public interface QuoteRequestTransitionStateAction extends QuoteRequestUpdateAction {

    String TRANSITION_STATE = "transitionState";

    /**
     *  <p>Value to set. If there is no State yet, this must be an initial State.</p>
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

    public static QuoteRequestTransitionStateAction of() {
        return new QuoteRequestTransitionStateActionImpl();
    }

    public static QuoteRequestTransitionStateAction of(final QuoteRequestTransitionStateAction template) {
        QuoteRequestTransitionStateActionImpl instance = new QuoteRequestTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static QuoteRequestTransitionStateActionBuilder builder() {
        return QuoteRequestTransitionStateActionBuilder.of();
    }

    public static QuoteRequestTransitionStateActionBuilder builder(final QuoteRequestTransitionStateAction template) {
        return QuoteRequestTransitionStateActionBuilder.of(template);
    }

    default <T> T withQuoteRequestTransitionStateAction(Function<QuoteRequestTransitionStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QuoteRequestTransitionStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QuoteRequestTransitionStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<QuoteRequestTransitionStateAction>";
            }
        };
    }
}
