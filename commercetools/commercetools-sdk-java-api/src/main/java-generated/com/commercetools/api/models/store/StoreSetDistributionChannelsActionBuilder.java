
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
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreSetDistributionChannelsActionBuilder distributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param distributionChannels value to be set
     * @return Builder
     */

    public StoreSetDistributionChannelsActionBuilder distributionChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param distributionChannels value to be set
     * @return Builder
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
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
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
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreSetDistributionChannelsActionBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreSetDistributionChannelsActionBuilder addDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return plusDistributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @param builder function to build the distributionChannels value
     * @return Builder
     */

    public StoreSetDistributionChannelsActionBuilder setDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return distributionChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>distributionChannels</code> are unset.</p>
     * @return distributionChannels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels() {
        return this.distributionChannels;
    }

    /**
     * builds StoreSetDistributionChannelsAction with checking for non-null required values
     * @return StoreSetDistributionChannelsAction
     */
    public StoreSetDistributionChannelsAction build() {
        return new StoreSetDistributionChannelsActionImpl(distributionChannels);
    }

    /**
     * builds StoreSetDistributionChannelsAction without checking for non-null required values
     * @return StoreSetDistributionChannelsAction
     */
    public StoreSetDistributionChannelsAction buildUnchecked() {
        return new StoreSetDistributionChannelsActionImpl(distributionChannels);
    }

    /**
     * factory method for an instance of StoreSetDistributionChannelsActionBuilder
     * @return builder
     */
    public static StoreSetDistributionChannelsActionBuilder of() {
        return new StoreSetDistributionChannelsActionBuilder();
    }

    /**
     * create builder for StoreSetDistributionChannelsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetDistributionChannelsActionBuilder of(final StoreSetDistributionChannelsAction template) {
        StoreSetDistributionChannelsActionBuilder builder = new StoreSetDistributionChannelsActionBuilder();
        builder.distributionChannels = template.getDistributionChannels();
        return builder;
    }

}
