
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetAuthorNameChangeImpl.class)
public interface SetAuthorNameChange extends Change {

    String SET_AUTHOR_NAME_CHANGE = "SetAuthorNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setAuthorName</code></p>
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

    public static SetAuthorNameChange of() {
        return new SetAuthorNameChangeImpl();
    }

    public static SetAuthorNameChange of(final SetAuthorNameChange template) {
        SetAuthorNameChangeImpl instance = new SetAuthorNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetAuthorNameChangeBuilder builder() {
        return SetAuthorNameChangeBuilder.of();
    }

    public static SetAuthorNameChangeBuilder builder(final SetAuthorNameChange template) {
        return SetAuthorNameChangeBuilder.of(template);
    }

    default <T> T withSetAuthorNameChange(Function<SetAuthorNameChange, T> helper) {
        return helper.apply(this);
    }
}
