
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
@JsonDeserialize(as = SetStateRolesChangeImpl.class)
public interface SetStateRolesChange extends Change {

    String SET_STATE_ROLES_CHANGE = "SetStateRolesChange";

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

    public static SetStateRolesChange of() {
        return new SetStateRolesChangeImpl();
    }

    public static SetStateRolesChange of(final SetStateRolesChange template) {
        SetStateRolesChangeImpl instance = new SetStateRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetStateRolesChangeBuilder builder() {
        return SetStateRolesChangeBuilder.of();
    }

    public static SetStateRolesChangeBuilder builder(final SetStateRolesChange template) {
        return SetStateRolesChangeBuilder.of(template);
    }

    default <T> T withSetStateRolesChange(Function<SetStateRolesChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetStateRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetStateRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetStateRolesChange>";
            }
        };
    }
}
