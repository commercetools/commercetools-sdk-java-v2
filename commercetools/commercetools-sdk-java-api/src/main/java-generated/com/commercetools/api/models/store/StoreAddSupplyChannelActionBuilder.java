
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreAddSupplyChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddSupplyChannelAction storeAddSupplyChannelAction = StoreAddSupplyChannelAction.builder()
 *             .supplyChannel(supplyChannelBuilder -> supplyChannelBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddSupplyChannelActionBuilder implements Builder<StoreAddSupplyChannelAction> {

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     *  <p>Value to append.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @return supplyChannel
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds StoreAddSupplyChannelAction with checking for non-null required values
     * @return StoreAddSupplyChannelAction
     */
    public StoreAddSupplyChannelAction build() {
        Objects.requireNonNull(supplyChannel, StoreAddSupplyChannelAction.class + ": supplyChannel is missing");
        return new StoreAddSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * builds StoreAddSupplyChannelAction without checking for non-null required values
     * @return StoreAddSupplyChannelAction
     */
    public StoreAddSupplyChannelAction buildUnchecked() {
        return new StoreAddSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * factory method for an instance of StoreAddSupplyChannelActionBuilder
     * @return builder
     */
    public static StoreAddSupplyChannelActionBuilder of() {
        return new StoreAddSupplyChannelActionBuilder();
    }

    /**
     * create builder for StoreAddSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddSupplyChannelActionBuilder of(final StoreAddSupplyChannelAction template) {
        StoreAddSupplyChannelActionBuilder builder = new StoreAddSupplyChannelActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
