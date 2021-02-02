
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingRoleOnChannelErrorBuilder {

    private String message;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    public MissingRoleOnChannelErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public MissingRoleOnChannelErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    public MissingRoleOnChannelErrorBuilder missingRole(
            final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.missingRole = missingRole;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole() {
        return this.missingRole;
    }

    public MissingRoleOnChannelError build() {
        return new MissingRoleOnChannelErrorImpl(message, channel, missingRole);
    }

    public static MissingRoleOnChannelErrorBuilder of() {
        return new MissingRoleOnChannelErrorBuilder();
    }

    public static MissingRoleOnChannelErrorBuilder of(final MissingRoleOnChannelError template) {
        MissingRoleOnChannelErrorBuilder builder = new MissingRoleOnChannelErrorBuilder();
        builder.message = template.getMessage();
        builder.channel = template.getChannel();
        builder.missingRole = template.getMissingRole();
        return builder;
    }

}
