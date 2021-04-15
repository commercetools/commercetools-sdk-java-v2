
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelAddRolesActionImpl.class)
public interface ChannelAddRolesAction extends ChannelUpdateAction {

    String ADD_ROLES = "addRoles";

    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    public void setRoles(final List<ChannelRoleEnum> roles);

    public static ChannelAddRolesAction of() {
        return new ChannelAddRolesActionImpl();
    }

    public static ChannelAddRolesAction of(final ChannelAddRolesAction template) {
        ChannelAddRolesActionImpl instance = new ChannelAddRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    public static ChannelAddRolesActionBuilder builder() {
        return ChannelAddRolesActionBuilder.of();
    }

    public static ChannelAddRolesActionBuilder builder(final ChannelAddRolesAction template) {
        return ChannelAddRolesActionBuilder.of(template);
    }

    default <T> T withChannelAddRolesAction(Function<ChannelAddRolesAction, T> helper) {
        return helper.apply(this);
    }
}
