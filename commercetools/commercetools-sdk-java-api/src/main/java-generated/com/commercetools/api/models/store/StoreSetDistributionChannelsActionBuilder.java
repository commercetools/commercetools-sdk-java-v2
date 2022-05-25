
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetDistributionChannelsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetDistributionChannelsAction storeSetDistributionChannelsAction = StoreSetDistributionChannelsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetDistributionChannelsActionBuilder implements Builder<StoreSetDistributionChannelsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    /**
     *
     */

    public StoreSetDistributionChannelsActionBuilder distributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *
     */

    public StoreSetDistributionChannelsActionBuilder distributionChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *
     */

    public StoreSetDistributionChannelsActionBuilder plusDistributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels.addAll(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *
     */

    public StoreSetDistributionChannelsActionBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public StoreSetDistributionChannelsActionBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels() {
        return this.distributionChannels;
    }

    public StoreSetDistributionChannelsAction build() {
        return new StoreSetDistributionChannelsActionImpl(distributionChannels);
    }

    /**
     * builds StoreSetDistributionChannelsAction without checking for non null required values
     */
    public StoreSetDistributionChannelsAction buildUnchecked() {
        return new StoreSetDistributionChannelsActionImpl(distributionChannels);
    }

    public static StoreSetDistributionChannelsActionBuilder of() {
        return new StoreSetDistributionChannelsActionBuilder();
    }

    public static StoreSetDistributionChannelsActionBuilder of(final StoreSetDistributionChannelsAction template) {
        StoreSetDistributionChannelsActionBuilder builder = new StoreSetDistributionChannelsActionBuilder();
        builder.distributionChannels = template.getDistributionChannels();
        return builder;
    }

}
