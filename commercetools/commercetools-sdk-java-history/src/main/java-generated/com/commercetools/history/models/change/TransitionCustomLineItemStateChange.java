
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
@JsonDeserialize(as = TransitionCustomLineItemStateChangeImpl.class)
public interface TransitionCustomLineItemStateChange extends Change {

    String TRANSITION_CUSTOM_LINE_ITEM_STATE_CHANGE = "TransitionCustomLineItemStateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>transitionCustomLineItemState</code></p>
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

    public static TransitionCustomLineItemStateChange of() {
        return new TransitionCustomLineItemStateChangeImpl();
    }

    public static TransitionCustomLineItemStateChange of(final TransitionCustomLineItemStateChange template) {
        TransitionCustomLineItemStateChangeImpl instance = new TransitionCustomLineItemStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setLineItemId(template.getLineItemId());
        instance.setStateId(template.getStateId());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static TransitionCustomLineItemStateChangeBuilder builder() {
        return TransitionCustomLineItemStateChangeBuilder.of();
    }

    public static TransitionCustomLineItemStateChangeBuilder builder(
            final TransitionCustomLineItemStateChange template) {
        return TransitionCustomLineItemStateChangeBuilder.of(template);
    }

    default <T> T withTransitionCustomLineItemStateChange(Function<TransitionCustomLineItemStateChange, T> helper) {
        return helper.apply(this);
    }
}
