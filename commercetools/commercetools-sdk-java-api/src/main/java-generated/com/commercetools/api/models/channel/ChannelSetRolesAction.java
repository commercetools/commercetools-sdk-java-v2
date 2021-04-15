
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelSetRolesActionImpl.class)
public interface ChannelSetRolesAction extends ChannelUpdateAction {

    String SET_ROLES = "setRoles";

    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    public void setRoles(final List<ChannelRoleEnum> roles);

    public static ChannelSetRolesAction of() {
        return new ChannelSetRolesActionImpl();
    }

    public static ChannelSetRolesAction of(final ChannelSetRolesAction template) {
        ChannelSetRolesActionImpl instance = new ChannelSetRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    public static ChannelSetRolesActionBuilder builder() {
        return ChannelSetRolesActionBuilder.of();
    }

    public static ChannelSetRolesActionBuilder builder(final ChannelSetRolesAction template) {
        return ChannelSetRolesActionBuilder.of(template);
    }

    default <T> T withChannelSetRolesAction(Function<ChannelSetRolesAction, T> helper) {
        return helper.apply(this);
    }
}
