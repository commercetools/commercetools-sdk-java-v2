
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.StateRole;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveStateRolesChangeImpl.class)
public interface RemoveStateRolesChange extends Change {

    String REMOVE_STATE_ROLES_CHANGE = "RemoveStateRolesChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public List<StateRole> getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public List<StateRole> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final StateRole... previousValue);

    public void setPreviousValue(final List<StateRole> previousValue);

    @JsonIgnore
    public void setNextValue(final StateRole... nextValue);

    public void setNextValue(final List<StateRole> nextValue);

    public static RemoveStateRolesChange of() {
        return new RemoveStateRolesChangeImpl();
    }

    public static RemoveStateRolesChange of(final RemoveStateRolesChange template) {
        RemoveStateRolesChangeImpl instance = new RemoveStateRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveStateRolesChangeBuilder builder() {
        return RemoveStateRolesChangeBuilder.of();
    }

    public static RemoveStateRolesChangeBuilder builder(final RemoveStateRolesChange template) {
        return RemoveStateRolesChangeBuilder.of(template);
    }

    default <T> T withRemoveStateRolesChange(Function<RemoveStateRolesChange, T> helper) {
        return helper.apply(this);
    }
}
