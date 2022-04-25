
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
@JsonDeserialize(as = SetChannelRolesChangeImpl.class)
public interface SetChannelRolesChange extends Change {

    String SET_CHANNEL_ROLES_CHANGE = "SetChannelRolesChange";

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

    public static SetChannelRolesChange of() {
        return new SetChannelRolesChangeImpl();
    }

    public static SetChannelRolesChange of(final SetChannelRolesChange template) {
        SetChannelRolesChangeImpl instance = new SetChannelRolesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetChannelRolesChangeBuilder builder() {
        return SetChannelRolesChangeBuilder.of();
    }

    public static SetChannelRolesChangeBuilder builder(final SetChannelRolesChange template) {
        return SetChannelRolesChangeBuilder.of(template);
    }

    default <T> T withSetChannelRolesChange(Function<SetChannelRolesChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetChannelRolesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetChannelRolesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetChannelRolesChange>";
            }
        };
    }
}
