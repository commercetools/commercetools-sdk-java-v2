
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingRoleOnChannelErrorImpl.class)
public interface MissingRoleOnChannelError extends ErrorObject {

    String MISSING_ROLE_ON_CHANNEL = "MissingRoleOnChannel";

    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    @NotNull
    @JsonProperty("missingRole")
    public ChannelRoleEnum getMissingRole();

    public void setChannel(final ChannelResourceIdentifier channel);

    public void setMissingRole(final ChannelRoleEnum missingRole);

    public static MissingRoleOnChannelError of() {
        return new MissingRoleOnChannelErrorImpl();
    }

    public static MissingRoleOnChannelError of(final MissingRoleOnChannelError template) {
        MissingRoleOnChannelErrorImpl instance = new MissingRoleOnChannelErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setChannel(template.getChannel());
        instance.setMissingRole(template.getMissingRole());
        return instance;
    }

    public static MissingRoleOnChannelErrorBuilder builder() {
        return MissingRoleOnChannelErrorBuilder.of();
    }

    public static MissingRoleOnChannelErrorBuilder builder(final MissingRoleOnChannelError template) {
        return MissingRoleOnChannelErrorBuilder.of(template);
    }

    default <T> T withMissingRoleOnChannelError(Function<MissingRoleOnChannelError, T> helper) {
        return helper.apply(this);
    }
}
