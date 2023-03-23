
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TransitionStateChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransitionStateChange transitionStateChange = TransitionStateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransitionStateChangeImpl.class)
public interface TransitionStateChange extends Change {

    String TRANSITION_STATE_CHANGE = "TransitionStateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>transitionState</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static TransitionStateChange of() {
        return new TransitionStateChangeImpl();
    }

    public static TransitionStateChange of(final TransitionStateChange template) {
        TransitionStateChangeImpl instance = new TransitionStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static TransitionStateChangeBuilder builder() {
        return TransitionStateChangeBuilder.of();
    }

    public static TransitionStateChangeBuilder builder(final TransitionStateChange template) {
        return TransitionStateChangeBuilder.of(template);
    }

    default <T> T withTransitionStateChange(Function<TransitionStateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TransitionStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransitionStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<TransitionStateChange>";
            }
        };
    }
}
