
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
@JsonDeserialize(as = AddStateRolesChangeImpl.class)
public interface AddStateRolesChange extends Change {

    String ADD_STATE_ROLES_CHANGE = "AddStateRolesChange";

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

    public static AddStateRolesChange of() {
        return new AddStateRolesChangeImpl();
    }

    public static AddStateRolesChange of(final AddStateRolesChange template) {
        AddStateRolesChangeImpl instance = new AddStateRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddStateRolesChangeBuilder builder() {
        return AddStateRolesChangeBuilder.of();
    }

    public static AddStateRolesChangeBuilder builder(final AddStateRolesChange template) {
        return AddStateRolesChangeBuilder.of(template);
    }

    default <T> T withAddStateRolesChange(Function<AddStateRolesChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddStateRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddStateRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddStateRolesChange>";
            }
        };
    }
}
