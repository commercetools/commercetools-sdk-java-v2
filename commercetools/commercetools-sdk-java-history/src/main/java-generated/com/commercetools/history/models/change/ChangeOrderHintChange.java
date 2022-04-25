
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeOrderHintChangeImpl.class)
public interface ChangeOrderHintChange extends Change {

    String CHANGE_ORDER_HINT_CHANGE = "ChangeOrderHintChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeOrderHint</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static ChangeOrderHintChange of() {
        return new ChangeOrderHintChangeImpl();
    }

    public static ChangeOrderHintChange of(final ChangeOrderHintChange template) {
        ChangeOrderHintChangeImpl instance = new ChangeOrderHintChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeOrderHintChangeBuilder builder() {
        return ChangeOrderHintChangeBuilder.of();
    }

    public static ChangeOrderHintChangeBuilder builder(final ChangeOrderHintChange template) {
        return ChangeOrderHintChangeBuilder.of(template);
    }

    default <T> T withChangeOrderHintChange(Function<ChangeOrderHintChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeOrderHintChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeOrderHintChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeOrderHintChange>";
            }
        };
    }
}
