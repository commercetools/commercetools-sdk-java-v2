
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddShoppingListActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddShoppingListAction cartAddShoppingListAction = CartAddShoppingListAction.builder()
 *             .shoppingList(shoppingListBuilder -> shoppingListBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddShoppingListActionBuilder implements Builder<CartAddShoppingListAction> {

    private com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    @Nullable
    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     * @param builder function to build the shoppingList value
     * @return Builder
     */

    public CartAddShoppingListActionBuilder shoppingList(
            Function<com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder, com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder> builder) {
        this.shoppingList = builder
                .apply(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     * @param builder function to build the shoppingList value
     * @return Builder
     */

    public CartAddShoppingListActionBuilder withShoppingList(
            Function<com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder, com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier> builder) {
        this.shoppingList = builder
                .apply(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     * @param shoppingList value to be set
     * @return Builder
     */

    public CartAddShoppingListActionBuilder shoppingList(
            final com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier shoppingList) {
        this.shoppingList = shoppingList;
        return this;
    }

    /**
     *  <p><code>distributionChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartAddShoppingListActionBuilder distributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><code>distributionChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param builder function to build the distributionChannel value
     * @return Builder
     */

    public CartAddShoppingListActionBuilder withDistributionChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.distributionChannel = builder
                .apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><code>distributionChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannel value to be set
     * @return Builder
     */

    public CartAddShoppingListActionBuilder distributionChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
        return this;
    }

    /**
     *  <p><code>supplyChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartAddShoppingListActionBuilder supplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><code>supplyChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param builder function to build the supplyChannel value
     * @return Builder
     */

    public CartAddShoppingListActionBuilder withSupplyChannel(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifier> builder) {
        this.supplyChannel = builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p><code>supplyChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel value to be set
     * @return Builder
     */

    public CartAddShoppingListActionBuilder supplyChannel(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
        return this;
    }

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     * @return shoppingList
     */

    public com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier getShoppingList() {
        return this.shoppingList;
    }

    /**
     *  <p><code>distributionChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @return distributionChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    /**
     *  <p><code>supplyChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannel
     */

    @Nullable
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    /**
     * builds CartAddShoppingListAction with checking for non-null required values
     * @return CartAddShoppingListAction
     */
    public CartAddShoppingListAction build() {
        Objects.requireNonNull(shoppingList, CartAddShoppingListAction.class + ": shoppingList is missing");
        return new CartAddShoppingListActionImpl(shoppingList, distributionChannel, supplyChannel);
    }

    /**
     * builds CartAddShoppingListAction without checking for non-null required values
     * @return CartAddShoppingListAction
     */
    public CartAddShoppingListAction buildUnchecked() {
        return new CartAddShoppingListActionImpl(shoppingList, distributionChannel, supplyChannel);
    }

    /**
     * factory method for an instance of CartAddShoppingListActionBuilder
     * @return builder
     */
    public static CartAddShoppingListActionBuilder of() {
        return new CartAddShoppingListActionBuilder();
    }

    /**
     * create builder for CartAddShoppingListAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddShoppingListActionBuilder of(final CartAddShoppingListAction template) {
        CartAddShoppingListActionBuilder builder = new CartAddShoppingListActionBuilder();
        builder.shoppingList = template.getShoppingList();
        builder.distributionChannel = template.getDistributionChannel();
        builder.supplyChannel = template.getSupplyChannel();
        return builder;
    }

}
