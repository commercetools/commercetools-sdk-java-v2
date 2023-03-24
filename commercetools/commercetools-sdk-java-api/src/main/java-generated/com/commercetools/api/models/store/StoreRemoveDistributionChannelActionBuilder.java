
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreRemoveDistributionChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveDistributionChannelAction storeRemoveDistributionChannelAction = StoreRemoveDistributionChannelAction.builder()
 *             .distributionChannel(distributionChannelBuilder -> distributionChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreRemoveDistributionChannelActionBuilder implements Builder<StoreRemoveDistributionChannelAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public StoreRemoveDistributionChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public StoreRemoveDistributionChannelActionBuilder distributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds StoreRemoveDistributionChannelAction with checking for non-null required values
     * @return StoreRemoveDistributionChannelAction
     */
    public StoreRemoveDistributionChannelAction build() {
        Objects.requireNonNull(distributionChannel,
            StoreRemoveDistributionChannelAction.class + ": distributionChannel is missing");
        return new StoreRemoveDistributionChannelActionImpl(distributionChannel);
    }

    /**
     * builds StoreRemoveDistributionChannelAction without checking for non-null required values
     * @return StoreRemoveDistributionChannelAction
     */
    public StoreRemoveDistributionChannelAction buildUnchecked() {
        return new StoreRemoveDistributionChannelActionImpl(distributionChannel);
    }

    public static StoreRemoveDistributionChannelActionBuilder of() {
        return new StoreRemoveDistributionChannelActionBuilder();
    }

    public static StoreRemoveDistributionChannelActionBuilder of(final StoreRemoveDistributionChannelAction template) {
        StoreRemoveDistributionChannelActionBuilder builder = new StoreRemoveDistributionChannelActionBuilder();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
