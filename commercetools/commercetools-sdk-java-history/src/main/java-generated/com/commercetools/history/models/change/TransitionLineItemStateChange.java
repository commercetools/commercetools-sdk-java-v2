
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ItemState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TransitionLineItemStateChangeImpl.class)
public interface TransitionLineItemStateChange extends Change {

    String TRANSITION_LINE_ITEM_STATE_CHANGE = "TransitionLineItemStateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>transitionLineItemState</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("stateId")
    public String getStateId();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<ItemState> getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<ItemState> getPreviousValue();

    public void setChange(final String change);

    public void setLineItemId(final String lineItemId);

    public void setStateId(final String stateId);

    @JsonIgnore
    public void setNextValue(final ItemState... nextValue);

    public void setNextValue(final List<ItemState> nextValue);

    @JsonIgnore
    public void setPreviousValue(final ItemState... previousValue);

    public void setPreviousValue(final List<ItemState> previousValue);

    public static TransitionLineItemStateChange of() {
        return new TransitionLineItemStateChangeImpl();
    }

    public static TransitionLineItemStateChange of(final TransitionLineItemStateChange template) {
        TransitionLineItemStateChangeImpl instance = new TransitionLineItemStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItemId(template.getLineItemId());
        instance.setStateId(template.getStateId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static TransitionLineItemStateChangeBuilder builder() {
        return TransitionLineItemStateChangeBuilder.of();
    }

    public static TransitionLineItemStateChangeBuilder builder(final TransitionLineItemStateChange template) {
        return TransitionLineItemStateChangeBuilder.of(template);
    }

    default <T> T withTransitionLineItemStateChange(Function<TransitionLineItemStateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TransitionLineItemStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TransitionLineItemStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<TransitionLineItemStateChange>";
            }
        };
    }
}
