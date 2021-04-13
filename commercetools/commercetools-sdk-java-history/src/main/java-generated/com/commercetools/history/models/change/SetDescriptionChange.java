
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetDescriptionChangeImpl.class)
public interface SetDescriptionChange extends Change {

    String SET_DESCRIPTION_CHANGE = "SetDescriptionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setDescription</code></p>
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

    public static SetDescriptionChange of() {
        return new SetDescriptionChangeImpl();
    }

    public static SetDescriptionChange of(final SetDescriptionChange template) {
        SetDescriptionChangeImpl instance = new SetDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetDescriptionChangeBuilder builder() {
        return SetDescriptionChangeBuilder.of();
    }

    public static SetDescriptionChangeBuilder builder(final SetDescriptionChange template) {
        return SetDescriptionChangeBuilder.of(template);
    }

    default <T> T withSetDescriptionChange(Function<SetDescriptionChange, T> helper) {
        return helper.apply(this);
    }
}
