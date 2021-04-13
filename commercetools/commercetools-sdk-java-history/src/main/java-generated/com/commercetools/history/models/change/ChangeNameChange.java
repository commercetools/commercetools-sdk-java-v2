
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeNameChangeImpl.class)
public interface ChangeNameChange extends Change {

    String CHANGE_NAME_CHANGE = "ChangeNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeName</code></p>
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

    public static ChangeNameChange of() {
        return new ChangeNameChangeImpl();
    }

    public static ChangeNameChange of(final ChangeNameChange template) {
        ChangeNameChangeImpl instance = new ChangeNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeNameChangeBuilder builder() {
        return ChangeNameChangeBuilder.of();
    }

    public static ChangeNameChangeBuilder builder(final ChangeNameChange template) {
        return ChangeNameChangeBuilder.of(template);
    }

    default <T> T withChangeNameChange(Function<ChangeNameChange, T> helper) {
        return helper.apply(this);
    }
}
