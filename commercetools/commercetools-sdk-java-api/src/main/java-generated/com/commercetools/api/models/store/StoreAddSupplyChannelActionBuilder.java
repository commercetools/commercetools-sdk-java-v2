
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreAddSupplyChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreAddSupplyChannelAction storeAddSupplyChannelAction = StoreAddSupplyChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreAddSupplyChannelActionBuilder implements Builder<StoreAddSupplyChannelAction> {

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     *
     */

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public StoreAddSupplyChannelAction build() {
        return new StoreAddSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * builds StoreAddSupplyChannelAction without checking for non null required values
     */
    public StoreAddSupplyChannelAction buildUnchecked() {
        return new StoreAddSupplyChannelActionImpl(supplyChannel);
    }

    public static StoreAddSupplyChannelActionBuilder of() {
        return new StoreAddSupplyChannelActionBuilder();
    }

    public static StoreAddSupplyChannelActionBuilder of(final StoreAddSupplyChannelAction template) {
        StoreAddSupplyChannelActionBuilder builder = new StoreAddSupplyChannelActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
