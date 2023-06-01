package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderAddShoppingListAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddShoppingListActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddShoppingListAction stagedOrderAddShoppingListAction = StagedOrderAddShoppingListAction.builder()
 *             .shoppingList(shoppingListBuilder -> shoppingListBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderAddShoppingListActionBuilder implements Builder<StagedOrderAddShoppingListAction> {

    
    
    private com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList;
    
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;
    
    
    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    
    /**
     *  <p>ResourceIdentifier to a ShoppingList.</p>
     * @param builder function to build the shoppingList value
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder shoppingList(Function<com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder, com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder> builder) {
        this.shoppingList = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a ShoppingList.</p>
     * @param builder function to build the shoppingList value
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder withShoppingList(Function<com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder, com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier> builder) {
        this.shoppingList = builder.apply(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a ShoppingList.</p>
     * @param shoppingList value to be set
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder shoppingList( final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
        this.shoppingList = shoppingList;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder supplyChannel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder withSupplyChannel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder supplyChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder distributionChannel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder withDistributionChannel(Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */
    
    public StagedOrderAddShoppingListActionBuilder distributionChannel(@Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }
    
    

    /**
     *  <p>ResourceIdentifier to a ShoppingList.</p>
     * @return shoppingList
     */
    
    
    public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier getShoppingList(){
        return this.shoppingList;
    }
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @return supplyChannel
     */
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel(){
        return this.supplyChannel;
    }
    
    /**
     *  <p>ResourceIdentifier to a Channel.</p>
     * @return distributionChannel
     */
    
    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel(){
        return this.distributionChannel;
    }

    /**
     * builds StagedOrderAddShoppingListAction with checking for non-null required values
     * @return StagedOrderAddShoppingListAction
     */
    public StagedOrderAddShoppingListAction build() {
        Objects.requireNonNull(shoppingList, StagedOrderAddShoppingListAction.class + ": shoppingList is missing");
        return new StagedOrderAddShoppingListActionImpl(shoppingList, supplyChannel, distributionChannel);
    }
    
    /**
     * builds StagedOrderAddShoppingListAction without checking for non-null required values
     * @return StagedOrderAddShoppingListAction
     */
    public StagedOrderAddShoppingListAction buildUnchecked() {
        return new StagedOrderAddShoppingListActionImpl(shoppingList, supplyChannel, distributionChannel);
    }

    /**
     * factory method for an instance of StagedOrderAddShoppingListActionBuilder
     * @return builder 
     */
    public static StagedOrderAddShoppingListActionBuilder of() {
        return new StagedOrderAddShoppingListActionBuilder();
    }

    /**
     * create builder for StagedOrderAddShoppingListAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddShoppingListActionBuilder of(final StagedOrderAddShoppingListAction template) {
        StagedOrderAddShoppingListActionBuilder builder = new StagedOrderAddShoppingListActionBuilder();
        builder.shoppingList = template.getShoppingList();
        builder.supplyChannel = template.getSupplyChannel();
        builder.distributionChannel = template.getDistributionChannel();
        return builder;
    }

}
