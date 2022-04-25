
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetValidFromChangeImpl.class)
public interface SetValidFromChange extends Change {

    String SET_VALID_FROM_CHANGE = "SetValidFromChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setValidFrom</code></p>
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

    public static SetValidFromChange of() {
        return new SetValidFromChangeImpl();
    }

    public static SetValidFromChange of(final SetValidFromChange template) {
        SetValidFromChangeImpl instance = new SetValidFromChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetValidFromChangeBuilder builder() {
        return SetValidFromChangeBuilder.of();
    }

    public static SetValidFromChangeBuilder builder(final SetValidFromChange template) {
        return SetValidFromChangeBuilder.of(template);
    }

    default <T> T withSetValidFromChange(Function<SetValidFromChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetValidFromChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidFromChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidFromChange>";
            }
        };
    }
}
