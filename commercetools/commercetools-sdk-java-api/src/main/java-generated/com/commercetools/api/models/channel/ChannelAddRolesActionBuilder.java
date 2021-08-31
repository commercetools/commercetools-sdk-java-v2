
package com.commercetools.api.models.channel;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChannelAddRolesActionBuilder implements Builder<ChannelAddRolesAction> {

    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    public ChannelAddRolesActionBuilder roles(final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    public ChannelAddRolesActionBuilder roles(
            final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    public ChannelAddRolesAction build() {
        Objects.requireNonNull(roles, ChannelAddRolesAction.class + ": roles is missing");
        return new ChannelAddRolesActionImpl(roles);
    }

    /**
     * builds ChannelAddRolesAction without checking for non null required values
     */
    public ChannelAddRolesAction buildUnchecked() {
        return new ChannelAddRolesActionImpl(roles);
    }

    public static ChannelAddRolesActionBuilder of() {
        return new ChannelAddRolesActionBuilder();
    }

    public static ChannelAddRolesActionBuilder of(final ChannelAddRolesAction template) {
        ChannelAddRolesActionBuilder builder = new ChannelAddRolesActionBuilder();
        builder.roles = template.getRoles();
        return builder;
    }

}
