
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreAddDistributionChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddDistributionChannelAction storeAddDistributionChannelAction = StoreAddDistributionChannelAction.builder()
 *             .distributionChannel(distributionChannelBuilder -> distributionChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddDistributionChannelActionBuilder implements Builder<StoreAddDistributionChannelAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     *  <p>Value to append.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public StoreAddDistributionChannelActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public StoreAddDistributionChannelActionBuilder distributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @return distributionChannel
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     * builds StoreAddDistributionChannelAction with checking for non-null required values
     * @return StoreAddDistributionChannelAction
     */
    public StoreAddDistributionChannelAction build() {
        Objects.requireNonNull(distributionChannel,
            StoreAddDistributionChannelAction.class + ": distributionChannel is missing");
        return new StoreAddDistributionChannelActionImpl(distributionChannel);
    }

    /**
     * builds StoreAddDistributionChannelAction without checking for non-null required values
     * @return StoreAddDistributionChannelAction
     */
    public StoreAddDistributionChannelAction buildUnchecked() {
        return new StoreAddDistributionChannelActionImpl(distributionChannel);
    }

    /**
     * factory method for an instance of StoreAddDistributionChannelActionBuilder
     * @return builder
     */
    public static StoreAddDistributionChannelActionBuilder of() {
        return new StoreAddDistributionChannelActionBuilder();
    }

    /**
     * create builder for StoreAddDistributionChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddDistributionChannelActionBuilder of(final StoreAddDistributionChannelAction template) {
        StoreAddDistributionChannelActionBuilder builder = new StoreAddDistributionChannelActionBuilder();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
