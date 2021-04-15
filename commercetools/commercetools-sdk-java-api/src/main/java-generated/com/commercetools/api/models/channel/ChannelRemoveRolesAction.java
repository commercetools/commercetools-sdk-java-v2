
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelRemoveRolesActionImpl.class)
public interface ChannelRemoveRolesAction extends ChannelUpdateAction {

    String REMOVE_ROLES = "removeRoles";

    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    public void setRoles(final List<ChannelRoleEnum> roles);

    public static ChannelRemoveRolesAction of() {
        return new ChannelRemoveRolesActionImpl();
    }

    public static ChannelRemoveRolesAction of(final ChannelRemoveRolesAction template) {
        ChannelRemoveRolesActionImpl instance = new ChannelRemoveRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

    public static ChannelRemoveRolesActionBuilder builder() {
        return ChannelRemoveRolesActionBuilder.of();
    }

    public static ChannelRemoveRolesActionBuilder builder(final ChannelRemoveRolesAction template) {
        return ChannelRemoveRolesActionBuilder.of(template);
    }

    default <T> T withChannelRemoveRolesAction(Function<ChannelRemoveRolesAction, T> helper) {
        return helper.apply(this);
    }
}
