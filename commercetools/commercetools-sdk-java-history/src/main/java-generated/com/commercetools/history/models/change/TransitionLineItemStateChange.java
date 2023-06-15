
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
 *   <li>Change the state of LineItem according to allowed transitions on Orders.</li>
 *   <li>Change the state of LineItem according to allowed transitions on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TransitionLineItemStateChange transitionLineItemStateChange = TransitionLineItemStateChange.builder()
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
@JsonDeserialize(as = TransitionLineItemStateChangeImpl.class)
public interface TransitionLineItemStateChange extends Change {

    /**
     * discriminator value for TransitionLineItemStateChange
     */
    String TRANSITION_LINE_ITEM_STATE_CHANGE = "TransitionLineItemStateChange";

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
     *  <p><code>id</code> of the updated LineItem.</p>
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
     *  <p><code>id</code> of the updated LineItem.</p>
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
     * @return instance of TransitionLineItemStateChange
     */
    public static TransitionLineItemStateChange of() {
        return new TransitionLineItemStateChangeImpl();
    }

    /**
     * factory method to create a shallow copy TransitionLineItemStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static TransitionLineItemStateChange of(final TransitionLineItemStateChange template) {
        TransitionLineItemStateChangeImpl instance = new TransitionLineItemStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setLineItemId(template.getLineItemId());
        instance.setStateId(template.getStateId());
        return instance;
    }

    /**
     * factory method to create a deep copy of TransitionLineItemStateChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TransitionLineItemStateChange deepCopy(@Nullable final TransitionLineItemStateChange template) {
        if (template == null) {
            return null;
        }
        TransitionLineItemStateChangeImpl instance = new TransitionLineItemStateChangeImpl();
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
     * builder factory method for TransitionLineItemStateChange
     * @return builder
     */
    public static TransitionLineItemStateChangeBuilder builder() {
        return TransitionLineItemStateChangeBuilder.of();
    }

    /**
     * create builder for TransitionLineItemStateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TransitionLineItemStateChangeBuilder builder(final TransitionLineItemStateChange template) {
        return TransitionLineItemStateChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTransitionLineItemStateChange(Function<TransitionLineItemStateChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TransitionLineItemStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransitionLineItemStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<TransitionLineItemStateChange>";
            }
        };
    }
}
