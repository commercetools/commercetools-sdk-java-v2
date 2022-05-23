
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

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MissingRoleOnChannelError missingRoleOnChannelError = MissingRoleOnChannelError.builder()
           .message("{message}")
           .missingRole(ChannelRoleEnum.INVENTORY_SUPPLY)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingRoleOnChannelErrorImpl.class)
public interface MissingRoleOnChannelError extends ErrorObject {

    String MISSING_ROLE_ON_CHANNEL = "MissingRoleOnChannel";

    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <p>Describes the purpose and type of the Channel. A Channel can have one or more roles.</p>
     */
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

    public static com.fasterxml.jackson.core.type.TypeReference<MissingRoleOnChannelError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingRoleOnChannelError>() {
            @Override
            public String toString() {
                return "TypeReference<MissingRoleOnChannelError>";
            }
        };
    }
}
