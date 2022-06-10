
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
     *  <p>Any attempt to use Channel without the <code>InventorySupply</code> ChannelRoleEnum will fail with a MissingRoleOnChannel error.</p>
     */

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Any attempt to use Channel without the <code>InventorySupply</code> ChannelRoleEnum will fail with a MissingRoleOnChannel error.</p>
     */

    public StoreAddSupplyChannelActionBuilder supplyChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public StoreAddSupplyChannelAction build() {
        Objects.requireNonNull(supplyChannel, StoreAddSupplyChannelAction.class + ": supplyChannel is missing");
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
