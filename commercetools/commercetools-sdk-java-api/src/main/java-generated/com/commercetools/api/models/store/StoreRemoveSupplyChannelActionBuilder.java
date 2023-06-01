package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.store.StoreUpdateAction;
import com.commercetools.api.models.store.StoreRemoveSupplyChannelAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreRemoveSupplyChannelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreRemoveSupplyChannelAction storeRemoveSupplyChannelAction = StoreRemoveSupplyChannelAction.builder()
 *             .supplyChannel(supplyChannelBuilder -> supplyChannelBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StoreRemoveSupplyChannelActionBuilder implements Builder<StoreRemoveSupplyChannelAction> {

    
    
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    
    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */
    
    public StoreRemoveSupplyChannelActionBuilder supplyChannel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */
    
    public StoreRemoveSupplyChannelActionBuilder withSupplyChannel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */
    
    public StoreRemoveSupplyChannelActionBuilder supplyChannel( final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }
    
    

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannel
     */
    
    
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }

    /**
     * builds StoreRemoveSupplyChannelAction with checking for non-null required values
     * @return StoreRemoveSupplyChannelAction
     */
    public StoreRemoveSupplyChannelAction build() {
        Objects.requireNonNull(supplyChannel, StoreRemoveSupplyChannelAction.class + ": supplyChannel is missing");
        return new StoreRemoveSupplyChannelActionImpl(supplyChannel);
    }
    
    /**
     * builds StoreRemoveSupplyChannelAction without checking for non-null required values
     * @return StoreRemoveSupplyChannelAction
     */
    public StoreRemoveSupplyChannelAction buildUnchecked() {
        return new StoreRemoveSupplyChannelActionImpl(supplyChannel);
    }

    /**
     * factory method for an instance of StoreRemoveSupplyChannelActionBuilder
     * @return builder 
     */
    public static StoreRemoveSupplyChannelActionBuilder of() {
        return new StoreRemoveSupplyChannelActionBuilder();
    }

    /**
     * create builder for StoreRemoveSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRemoveSupplyChannelActionBuilder of(final StoreRemoveSupplyChannelAction template) {
        StoreRemoveSupplyChannelActionBuilder builder = new StoreRemoveSupplyChannelActionBuilder();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
