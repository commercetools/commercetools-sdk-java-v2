
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

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
@io.vrap.rmf.base.client.utils.json.SubType("TransitionStateChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransitionStateChangeImpl.class)
public interface TransitionStateChange extends Change {

    /**
     * discriminator value for TransitionStateChange
     */
    String TRANSITION_STATE_CHANGE = "TransitionStateChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of TransitionStateChange
     */
    public static TransitionStateChange of() {
        return new TransitionStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy TransitionStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransitionStateChange of(final TransitionStateChange template) {
        TransitionStateChangeImpl instance = new TransitionStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public TransitionStateChange copyDeep();

    /**
     * factory method to create a deep copy of TransitionStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransitionStateChange deepCopy(@Nullable final TransitionStateChange template) {
        if (template == null) {
            return null;
        }
        TransitionStateChangeImpl instance = new TransitionStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for TransitionStateChange
     * @return builder
     */
    public static TransitionStateChangeBuilder builder() {
        return TransitionStateChangeBuilder.of();
    }

    /**
     * create builder for TransitionStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransitionStateChangeBuilder builder(final TransitionStateChange template) {
        return TransitionStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransitionStateChange(Function<TransitionStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransitionStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransitionStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<TransitionStateChange>";
            }
        };
    }
}
