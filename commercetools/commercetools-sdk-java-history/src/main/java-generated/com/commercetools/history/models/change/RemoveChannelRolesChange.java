
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.ChannelRole;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveChannelRolesChangeImpl.class)
public interface RemoveChannelRolesChange extends Change {

    String REMOVE_CHANNEL_ROLES_CHANGE = "RemoveChannelRolesChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public List<ChannelRole> getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public List<ChannelRole> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final ChannelRole... previousValue);

    public void setPreviousValue(final List<ChannelRole> previousValue);

    @JsonIgnore
    public void setNextValue(final ChannelRole... nextValue);

    public void setNextValue(final List<ChannelRole> nextValue);

    public static RemoveChannelRolesChange of() {
        return new RemoveChannelRolesChangeImpl();
    }

    public static RemoveChannelRolesChange of(final RemoveChannelRolesChange template) {
        RemoveChannelRolesChangeImpl instance = new RemoveChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static RemoveChannelRolesChangeBuilder builder() {
        return RemoveChannelRolesChangeBuilder.of();
    }

    public static RemoveChannelRolesChangeBuilder builder(final RemoveChannelRolesChange template) {
        return RemoveChannelRolesChangeBuilder.of(template);
    }

    default <T> T withRemoveChannelRolesChange(Function<RemoveChannelRolesChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveChannelRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveChannelRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveChannelRolesChange>";
            }
        };
    }
}
