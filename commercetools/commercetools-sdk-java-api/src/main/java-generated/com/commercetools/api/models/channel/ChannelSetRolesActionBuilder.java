
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChannelSetRolesActionBuilder implements Builder<ChannelSetRolesAction> {

    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    public ChannelSetRolesActionBuilder roles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    public ChannelSetRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public ChannelSetRolesActionBuilder plusRoles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    public ChannelSetRolesAction build() {
        Objects.requireNonNull(roles, ChannelSetRolesAction.class + ": roles is missing");
        return new ChannelSetRolesActionImpl(roles);
    }

    /**
     * builds ChannelSetRolesAction without checking for non null required values
     */
    public ChannelSetRolesAction buildUnchecked() {
        return new ChannelSetRolesActionImpl(roles);
    }

    public static ChannelSetRolesActionBuilder of() {
        return new ChannelSetRolesActionBuilder();
    }

    public static ChannelSetRolesActionBuilder of(final ChannelSetRolesAction template) {
        ChannelSetRolesActionBuilder builder = new ChannelSetRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
