
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetSupplyChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetSupplyChannelAction inventoryEntrySetSupplyChannelAction = InventoryEntrySetSupplyChannelAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetSupplyChannelActionBuilder implements Builder<InventoryEntrySetSupplyChannelAction> {

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntrySetSupplyChannelActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public InventoryEntrySetSupplyChannelActionBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public InventoryEntrySetSupplyChannelActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds InventoryEntrySetSupplyChannelAction with checking for non-null required values
     * @return InventoryEntrySetSupplyChannelAction
     */
    public InventoryEntrySetSupplyChannelAction build() {
        return new InventoryEntrySetSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * builds InventoryEntrySetSupplyChannelAction without checking for non-null required values
     * @return InventoryEntrySetSupplyChannelAction
     */
    public InventoryEntrySetSupplyChannelAction buildUnchecked() {
        return new InventoryEntrySetSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * factory method for an instance of InventoryEntrySetSupplyChannelActionBuilder
     * @return builder
     */
    public static InventoryEntrySetSupplyChannelActionBuilder of() {
        return new InventoryEntrySetSupplyChannelActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetSupplyChannelActionBuilder of(final InventoryEntrySetSupplyChannelAction template) {
        InventoryEntrySetSupplyChannelActionBuilder builder = new InventoryEntrySetSupplyChannelActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
