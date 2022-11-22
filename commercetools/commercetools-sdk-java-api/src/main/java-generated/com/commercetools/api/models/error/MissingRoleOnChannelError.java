
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
 *  <p>Returned when one of the following states occur:</p>
 *  <ul>
 *   <li>Channel is added or set on a Store with missing Channel <code>roles</code>.</li>
 *   <li>Standalone Price references a Channel that does not contain the <code>ProductDistribution</code> role.</li>
 *  </ul>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li>Add Distribution Channel, Set Distribution Channel, Add Supply Channel, and Set Supply Channel update actions.</li>
 *   <li>Create a Standalone Price request.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingRoleOnChannelError missingRoleOnChannelError = MissingRoleOnChannelError.builder()
 *             .message("{message}")
 *             .missingRole(ChannelRoleEnum.INVENTORY_SUPPLY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MissingRoleOnChannelErrorImpl.class)
public interface MissingRoleOnChannelError extends ErrorObject {

    String MISSING_ROLE_ON_CHANNEL = "MissingRoleOnChannel";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Given channel with $idOrKeyOfChannel does not have the required role $role."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     */
    @NotNull
    @JsonProperty("missingRole")
    public ChannelRoleEnum getMissingRole();

    public void setMessage(final String message);

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
