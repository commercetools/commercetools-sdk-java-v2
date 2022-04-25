
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetOrderNumberChangeImpl.class)
public interface SetOrderNumberChange extends Change {

    String SET_ORDER_NUMBER_CHANGE = "SetOrderNumberChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setOrderNumber</code></p>
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

    public static SetOrderNumberChange of() {
        return new SetOrderNumberChangeImpl();
    }

    public static SetOrderNumberChange of(final SetOrderNumberChange template) {
        SetOrderNumberChangeImpl instance = new SetOrderNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetOrderNumberChangeBuilder builder() {
        return SetOrderNumberChangeBuilder.of();
    }

    public static SetOrderNumberChangeBuilder builder(final SetOrderNumberChange template) {
        return SetOrderNumberChangeBuilder.of(template);
    }

    default <T> T withSetOrderNumberChange(Function<SetOrderNumberChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetOrderNumberChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetOrderNumberChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetOrderNumberChange>";
            }
        };
    }
}
