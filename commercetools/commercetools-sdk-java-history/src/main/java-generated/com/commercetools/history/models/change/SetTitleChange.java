
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetTitleChangeImpl.class)
public interface SetTitleChange extends Change {

    String SET_TITLE_CHANGE = "SetTitleChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setTitle</code></p>
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

    public static SetTitleChange of() {
        return new SetTitleChangeImpl();
    }

    public static SetTitleChange of(final SetTitleChange template) {
        SetTitleChangeImpl instance = new SetTitleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetTitleChangeBuilder builder() {
        return SetTitleChangeBuilder.of();
    }

    public static SetTitleChangeBuilder builder(final SetTitleChange template) {
        return SetTitleChangeBuilder.of(template);
    }

    default <T> T withSetTitleChange(Function<SetTitleChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetTitleChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTitleChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTitleChange>";
            }
        };
    }
}
