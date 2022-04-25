
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetValidUntilChangeImpl.class)
public interface SetValidUntilChange extends Change {

    String SET_VALID_UNTIL_CHANGE = "SetValidUntilChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setValidUntil</code></p>
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

    public static SetValidUntilChange of() {
        return new SetValidUntilChangeImpl();
    }

    public static SetValidUntilChange of(final SetValidUntilChange template) {
        SetValidUntilChangeImpl instance = new SetValidUntilChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetValidUntilChangeBuilder builder() {
        return SetValidUntilChangeBuilder.of();
    }

    public static SetValidUntilChangeBuilder builder(final SetValidUntilChange template) {
        return SetValidUntilChangeBuilder.of(template);
    }

    default <T> T withSetValidUntilChange(Function<SetValidUntilChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetValidUntilChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidUntilChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidUntilChange>";
            }
        };
    }
}
