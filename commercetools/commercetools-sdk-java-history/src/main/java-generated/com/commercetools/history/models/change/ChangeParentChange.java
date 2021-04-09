
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeParentChangeImpl.class)
public interface ChangeParentChange extends Change {

    String CHANGE_PARENT_CHANGE = "ChangeParentChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeParent</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static ChangeParentChange of() {
        return new ChangeParentChangeImpl();
    }

    public static ChangeParentChange of(final ChangeParentChange template) {
        ChangeParentChangeImpl instance = new ChangeParentChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeParentChangeBuilder builder() {
        return ChangeParentChangeBuilder.of();
    }

    public static ChangeParentChangeBuilder builder(final ChangeParentChange template) {
        return ChangeParentChangeBuilder.of(template);
    }

    default <T> T withChangeParentChange(Function<ChangeParentChange, T> helper) {
        return helper.apply(this);
    }
}
