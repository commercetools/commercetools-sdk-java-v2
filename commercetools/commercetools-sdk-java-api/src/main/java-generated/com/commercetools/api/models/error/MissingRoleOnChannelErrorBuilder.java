
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingRoleOnChannelErrorBuilder
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
public class MissingRoleOnChannelErrorBuilder implements Builder<MissingRoleOnChannelError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    /**
     *  <p><code>"Given channel with $idOrKeyOfChannel does not have the required role $role."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public MissingRoleOnChannelErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public MissingRoleOnChannelErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public MissingRoleOnChannelErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a given <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public MissingRoleOnChannelErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a given <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public MissingRoleOnChannelErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a given <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @param channel value to be set
     * @return Builder
     */

    public MissingRoleOnChannelErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Prices</a>.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @param missingRole value to be set
     * @return Builder
     */

    public MissingRoleOnChannelErrorBuilder missingRole(
            final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.missingRole = missingRole;
        return this;
    }

    /**
     *  <p><code>"Given channel with $idOrKeyOfChannel does not have the required role $role."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to a given <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">Standalone Prices</a>.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @return missingRole
     */

    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole() {
        return this.missingRole;
    }

    /**
     * builds MissingRoleOnChannelError with checking for non-null required values
     * @return MissingRoleOnChannelError
     */
    public MissingRoleOnChannelError build() {
        Objects.requireNonNull(message, MissingRoleOnChannelError.class + ": message is missing");
        Objects.requireNonNull(missingRole, MissingRoleOnChannelError.class + ": missingRole is missing");
        return new MissingRoleOnChannelErrorImpl(message, values, channel, missingRole);
    }

    /**
     * builds MissingRoleOnChannelError without checking for non-null required values
     * @return MissingRoleOnChannelError
     */
    public MissingRoleOnChannelError buildUnchecked() {
        return new MissingRoleOnChannelErrorImpl(message, values, channel, missingRole);
    }

    /**
     * factory method for an instance of MissingRoleOnChannelErrorBuilder
     * @return builder
     */
    public static MissingRoleOnChannelErrorBuilder of() {
        return new MissingRoleOnChannelErrorBuilder();
    }

    /**
     * create builder for MissingRoleOnChannelError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MissingRoleOnChannelErrorBuilder of(final MissingRoleOnChannelError template) {
        MissingRoleOnChannelErrorBuilder builder = new MissingRoleOnChannelErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.channel = template.getChannel();
        builder.missingRole = template.getMissingRole();
        return builder;
    }

}
