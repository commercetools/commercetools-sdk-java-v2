
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
 *   <li>Create StandalonePrice request.</li>
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

    /**
     * discriminator value for MissingRoleOnChannelError
     */
    String MISSING_ROLE_ON_CHANNEL = "MissingRoleOnChannel";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Given channel with $idOrKeyOfChannel does not have the required role $role."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @return channel
     */
    @Valid
    @JsonProperty("channel")
    public ChannelResourceIdentifier getChannel();

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @return missingRole
     */
    @NotNull
    @JsonProperty("missingRole")
    public ChannelRoleEnum getMissingRole();

    /**
     *  <p><code>"Given channel with $idOrKeyOfChannel does not have the required role $role."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @param channel value to be set
     */

    public void setChannel(final ChannelResourceIdentifier channel);

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @param missingRole value to be set
     */

    public void setMissingRole(final ChannelRoleEnum missingRole);

    /**
     * factory method
     * @return instance of MissingRoleOnChannelError
     */
    public static MissingRoleOnChannelError of() {
        return new MissingRoleOnChannelErrorImpl();
    }

    /**
     * factory method to create a shallow copy MissingRoleOnChannelError
     * @param template instance to be copied
     * @return copy instance
     */
    public static MissingRoleOnChannelError of(final MissingRoleOnChannelError template) {
        MissingRoleOnChannelErrorImpl instance = new MissingRoleOnChannelErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setChannel(template.getChannel());
        instance.setMissingRole(template.getMissingRole());
        return instance;
    }

    /**
     * factory method to create a deep copy of MissingRoleOnChannelError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MissingRoleOnChannelError deepCopy(@Nullable final MissingRoleOnChannelError template) {
        if (template == null) {
            return null;
        }
        MissingRoleOnChannelErrorImpl instance = new MissingRoleOnChannelErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getChannel()));
        instance.setMissingRole(template.getMissingRole());
        return instance;
    }

    /**
     * builder factory method for MissingRoleOnChannelError
     * @return builder
     */
    public static MissingRoleOnChannelErrorBuilder builder() {
        return MissingRoleOnChannelErrorBuilder.of();
    }

    /**
     * create builder for MissingRoleOnChannelError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MissingRoleOnChannelErrorBuilder builder(final MissingRoleOnChannelError template) {
        return MissingRoleOnChannelErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMissingRoleOnChannelError(Function<MissingRoleOnChannelError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MissingRoleOnChannelError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingRoleOnChannelError>() {
            @Override
            public String toString() {
                return "TypeReference<MissingRoleOnChannelError>";
            }
        };
    }
}
