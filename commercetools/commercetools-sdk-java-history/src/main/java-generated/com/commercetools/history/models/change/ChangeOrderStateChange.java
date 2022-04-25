
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.OrderState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeOrderStateChangeImpl.class)
public interface ChangeOrderStateChange extends Change {

    String CHANGE_ORDER_STATE_CHANGE = "ChangeOrderStateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeOrderState</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("nextValue")
    public OrderState getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public OrderState getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final OrderState nextValue);

    public void setPreviousValue(final OrderState previousValue);

    public static ChangeOrderStateChange of() {
        return new ChangeOrderStateChangeImpl();
    }

    public static ChangeOrderStateChange of(final ChangeOrderStateChange template) {
        ChangeOrderStateChangeImpl instance = new ChangeOrderStateChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeOrderStateChangeBuilder builder() {
        return ChangeOrderStateChangeBuilder.of();
    }

    public static ChangeOrderStateChangeBuilder builder(final ChangeOrderStateChange template) {
        return ChangeOrderStateChangeBuilder.of(template);
    }

    default <T> T withChangeOrderStateChange(Function<ChangeOrderStateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeOrderStateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeOrderStateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeOrderStateChange>";
            }
        };
    }
}
