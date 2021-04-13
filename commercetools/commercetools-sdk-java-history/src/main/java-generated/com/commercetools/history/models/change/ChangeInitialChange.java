
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeInitialChangeImpl.class)
public interface ChangeInitialChange extends Change {

    String CHANGE_INITIAL_CHANGE = "ChangeInitialChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeInitial</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public Boolean getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Boolean previousValue);

    public void setNextValue(final Boolean nextValue);

    public static ChangeInitialChange of() {
        return new ChangeInitialChangeImpl();
    }

    public static ChangeInitialChange of(final ChangeInitialChange template) {
        ChangeInitialChangeImpl instance = new ChangeInitialChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeInitialChangeBuilder builder() {
        return ChangeInitialChangeBuilder.of();
    }

    public static ChangeInitialChangeBuilder builder(final ChangeInitialChange template) {
        return ChangeInitialChangeBuilder.of(template);
    }

    default <T> T withChangeInitialChange(Function<ChangeInitialChange, T> helper) {
        return helper.apply(this);
    }
}
