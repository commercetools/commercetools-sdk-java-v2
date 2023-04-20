
package com.commercetools.api.models.error;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMissingRoleOnChannelErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMissingRoleOnChannelError graphQLMissingRoleOnChannelError = GraphQLMissingRoleOnChannelError.builder()
 *             .missingRole(ChannelRoleEnum.INVENTORY_SUPPLY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMissingRoleOnChannelErrorBuilder implements Builder<GraphQLMissingRoleOnChannelError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier channel;

    private com.commercetools.api.models.channel.ChannelRoleEnum missingRole;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMissingRoleOnChannelErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMissingRoleOnChannelErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public GraphQLMissingRoleOnChannelErrorBuilder channel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @param builder function to build the channel value
     * @return Builder
     */

    public GraphQLMissingRoleOnChannelErrorBuilder withChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.channel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @param channel value to be set
     * @return Builder
     */

    public GraphQLMissingRoleOnChannelErrorBuilder channel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier channel) {
        this.channel = channel;
        return this;
    }

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @param missingRole value to be set
     * @return Builder
     */

    public GraphQLMissingRoleOnChannelErrorBuilder missingRole(
            final com.commercetools.api.models.channel.ChannelRoleEnum missingRole) {
        this.missingRole = missingRole;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>ResourceIdentifier to a given Channel.</p>
     * @return channel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getChannel() {
        return this.channel;
    }

    /**
     *  <ul>
     *   <li><code>ProductDistribution</code> for Product Distribution Channels allowed for the Store. Also required for Standalone Prices.</li>
     *   <li><code>InventorySupply</code> for Inventory Supply Channels allowed for the Store.</li>
     *  </ul>
     * @return missingRole
     */

    public com.commercetools.api.models.channel.ChannelRoleEnum getMissingRole() {
        return this.missingRole;
    }

    /**
     * builds GraphQLMissingRoleOnChannelError with checking for non-null required values
     * @return GraphQLMissingRoleOnChannelError
     */
    public GraphQLMissingRoleOnChannelError build() {
        Objects.requireNonNull(missingRole, GraphQLMissingRoleOnChannelError.class + ": missingRole is missing");
        return new GraphQLMissingRoleOnChannelErrorImpl(values, channel, missingRole);
    }

    /**
     * builds GraphQLMissingRoleOnChannelError without checking for non-null required values
     * @return GraphQLMissingRoleOnChannelError
     */
    public GraphQLMissingRoleOnChannelError buildUnchecked() {
        return new GraphQLMissingRoleOnChannelErrorImpl(values, channel, missingRole);
    }

    /**
     * factory method for an instance of GraphQLMissingRoleOnChannelErrorBuilder
     * @return builder
     */
    public static GraphQLMissingRoleOnChannelErrorBuilder of() {
        return new GraphQLMissingRoleOnChannelErrorBuilder();
    }

    /**
     * create builder for GraphQLMissingRoleOnChannelError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMissingRoleOnChannelErrorBuilder of(final GraphQLMissingRoleOnChannelError template) {
        GraphQLMissingRoleOnChannelErrorBuilder builder = new GraphQLMissingRoleOnChannelErrorBuilder();
        builder.values = template.values();
        builder.channel = template.getChannel();
        builder.missingRole = template.getMissingRole();
        return builder;
    }

}
