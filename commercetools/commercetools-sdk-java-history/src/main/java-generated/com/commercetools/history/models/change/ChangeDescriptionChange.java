
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeDescriptionChangeImpl.class)
public interface ChangeDescriptionChange extends Change {

    String CHANGE_DESCRIPTION_CHANGE = "ChangeDescriptionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeDescription</code></p>
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

    public static ChangeDescriptionChange of() {
        return new ChangeDescriptionChangeImpl();
    }

    public static ChangeDescriptionChange of(final ChangeDescriptionChange template) {
        ChangeDescriptionChangeImpl instance = new ChangeDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeDescriptionChangeBuilder builder() {
        return ChangeDescriptionChangeBuilder.of();
    }

    public static ChangeDescriptionChangeBuilder builder(final ChangeDescriptionChange template) {
        return ChangeDescriptionChangeBuilder.of(template);
    }

    default <T> T withChangeDescriptionChange(Function<ChangeDescriptionChange, T> helper) {
        return helper.apply(this);
    }
}
