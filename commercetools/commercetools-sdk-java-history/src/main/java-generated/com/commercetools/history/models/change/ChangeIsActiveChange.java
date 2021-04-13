
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeIsActiveChangeImpl.class)
public interface ChangeIsActiveChange extends Change {

    String CHANGE_IS_ACTIVE_CHANGE = "ChangeIsActiveChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeIsActive</code></p>
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

    public static ChangeIsActiveChange of() {
        return new ChangeIsActiveChangeImpl();
    }

    public static ChangeIsActiveChange of(final ChangeIsActiveChange template) {
        ChangeIsActiveChangeImpl instance = new ChangeIsActiveChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeIsActiveChangeBuilder builder() {
        return ChangeIsActiveChangeBuilder.of();
    }

    public static ChangeIsActiveChangeBuilder builder(final ChangeIsActiveChange template) {
        return ChangeIsActiveChangeBuilder.of(template);
    }

    default <T> T withChangeIsActiveChange(Function<ChangeIsActiveChange, T> helper) {
        return helper.apply(this);
    }
}
