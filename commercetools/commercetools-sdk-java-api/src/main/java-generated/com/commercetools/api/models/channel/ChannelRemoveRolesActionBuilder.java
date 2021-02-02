
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelRemoveRolesActionBuilder {

    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    public ChannelRemoveRolesActionBuilder roles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    public ChannelRemoveRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    public ChannelRemoveRolesAction build() {
        return new ChannelRemoveRolesActionImpl(roles);
    }

    public static ChannelRemoveRolesActionBuilder of() {
        return new ChannelRemoveRolesActionBuilder();
    }

    public static ChannelRemoveRolesActionBuilder of(final ChannelRemoveRolesAction template) {
        ChannelRemoveRolesActionBuilder builder = new ChannelRemoveRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
