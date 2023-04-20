
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetSupplyChannelsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetSupplyChannelsAction storeSetSupplyChannelsAction = StoreSetSupplyChannelsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetSupplyChannelsActionBuilder implements Builder<StoreSetSupplyChannelsAction> {

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreSetSupplyChannelsActionBuilder supplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreSetSupplyChannelsActionBuilder supplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param supplyChannels value to be set
     * @return Builder
     */

    public StoreSetSupplyChannelsActionBuilder plusSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels.addAll(Arrays.asList(supplyChannels));
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreSetSupplyChannelsActionBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreSetSupplyChannelsActionBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreSetSupplyChannelsActionBuilder addSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return plusSupplyChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @param builder function to build the supplyChannels value
     * @return Builder
     */

    public StoreSetSupplyChannelsActionBuilder setSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        return supplyChannels(
            builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Value to set. If not defined, the Store's <code>supplyChannels</code> are unset.</p>
     * @return supplyChannels
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels() {
        return this.supplyChannels;
    }

    /**
     * builds StoreSetSupplyChannelsAction with checking for non-null required values
     * @return StoreSetSupplyChannelsAction
     */
    public StoreSetSupplyChannelsAction build() {
        return new StoreSetSupplyChannelsActionImpl(supplyChannels);
    }

    /**
     * builds StoreSetSupplyChannelsAction without checking for non-null required values
     * @return StoreSetSupplyChannelsAction
     */
    public StoreSetSupplyChannelsAction buildUnchecked() {
        return new StoreSetSupplyChannelsActionImpl(supplyChannels);
    }

    /**
     * factory method for an instance of StoreSetSupplyChannelsActionBuilder
     * @return builder
     */
    public static StoreSetSupplyChannelsActionBuilder of() {
        return new StoreSetSupplyChannelsActionBuilder();
    }

    /**
     * create builder for StoreSetSupplyChannelsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetSupplyChannelsActionBuilder of(final StoreSetSupplyChannelsAction template) {
        StoreSetSupplyChannelsActionBuilder builder = new StoreSetSupplyChannelsActionBuilder();
        builder.supplyChannels = template.getSupplyChannels();
        return builder;
    }

}
