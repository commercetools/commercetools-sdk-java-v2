
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ItemState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change the state of CustomLineItem according to allowed transitions on Orders.</li>
 *   <li>Change the state of CustomLineItem according to allowed transitions on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransitionCustomLineItemStateChange transitionCustomLineItemStateChange = TransitionCustomLineItemStateChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .lineItemId("{lineItemId}")
 *             .stateId("{stateId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TransitionCustomLineItemStateChangeImpl.class)
public interface TransitionCustomLineItemStateChange extends Change {

    /**
     * discriminator value for TransitionCustomLineItemStateChange
     */
    String TRANSITION_CUSTOM_LINE_ITEM_STATE_CHANGE = "TransitionCustomLineItemStateChange";

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
    public List<ItemState> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<ItemState> getNextValue();

    /**
     *  <p><code>id</code> of the updated CustomLineItem.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p><code>id</code> of the State involved in the transition.</p>
     * @return stateId
     */
    @NotNull
    @JsonProperty("stateId")
    public String getStateId();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final ItemState... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<ItemState> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final ItemState... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<ItemState> nextValue);

    /**
     *  <p><code>id</code> of the updated CustomLineItem.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p><code>id</code> of the State involved in the transition.</p>
     * @param stateId value to be set
     */

    public void setStateId(final String stateId);

    /**
     * factory method
     * @return instance of TransitionCustomLineItemStateChange
     */
    public static TransitionCustomLineItemStateChange of() {
        return new TransitionCustomLineItemStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy TransitionCustomLineItemStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransitionCustomLineItemStateChange of(final TransitionCustomLineItemStateChange template) {
        TransitionCustomLineItemStateChangeImpl instance = new TransitionCustomLineItemStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItemId(template.getLineItemId());
        instance.setStateId(template.getStateId());
        return instance;
    }

    /**
     * factory method to create a deep copy of TransitionCustomLineItemStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransitionCustomLineItemStateChange deepCopy(
            @Nullable final TransitionCustomLineItemStateChange template) {
        if (template == null) {
            return null;
        }
        TransitionCustomLineItemStateChangeImpl instance = new TransitionCustomLineItemStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.ItemState::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLineItemId(template.getLineItemId());
        instance.setStateId(template.getStateId());
        return instance;
    }

    /**
     * builder factory method for TransitionCustomLineItemStateChange
     * @return builder
     */
    public static TransitionCustomLineItemStateChangeBuilder builder() {
        return TransitionCustomLineItemStateChangeBuilder.of();
    }

    /**
     * create builder for TransitionCustomLineItemStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransitionCustomLineItemStateChangeBuilder builder(
            final TransitionCustomLineItemStateChange template) {
        return TransitionCustomLineItemStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransitionCustomLineItemStateChange(Function<TransitionCustomLineItemStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransitionCustomLineItemStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransitionCustomLineItemStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<TransitionCustomLineItemStateChange>";
            }
        };
    }
}
