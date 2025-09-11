
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">ShoppingList</a> to the Cart.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("addShoppingList")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddShoppingListActionImpl.class)
public interface CartAddShoppingListAction extends CartUpdateAction {

    /**
     * discriminator value for CartAddShoppingListAction
     */
    String ADD_SHOPPING_LIST = "addShoppingList";

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     * @return shoppingList
     */
    @NotNull
    @Valid
    @JsonProperty("shoppingList")
    public ShoppingListResourceIdentifier getShoppingList();

    /**
     *  <p><code>distributionChannel</code> to set for all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> that are added to the Cart. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p><code>supplyChannel</code> to set for all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> that are added to the Cart. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     * @param shoppingList value to be set
     */

    public void setShoppingList(final ShoppingListResourceIdentifier shoppingList);

    /**
     *  <p><code>distributionChannel</code> to set for all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> that are added to the Cart. The Channel must have the <code>ProductDistribution</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     *  <p><code>supplyChannel</code> to set for all <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> that are added to the Cart. The Channel must have the <code>InventorySupply</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelRoleEnum" rel="nofollow">ChannelRoleEnum</a>.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     * factory method
     * @return instance of CartAddShoppingListAction
     */
    public static CartAddShoppingListAction of() {
        return new CartAddShoppingListActionImpl();
    }

    /**
     * factory method to create a shallow copy CartAddShoppingListAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartAddShoppingListAction of(final CartAddShoppingListAction template) {
        CartAddShoppingListActionImpl instance = new CartAddShoppingListActionImpl();
        instance.setShoppingList(template.getShoppingList());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public CartAddShoppingListAction copyDeep();

    /**
     * factory method to create a deep copy of CartAddShoppingListAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartAddShoppingListAction deepCopy(@Nullable final CartAddShoppingListAction template) {
        if (template == null) {
            return null;
        }
        CartAddShoppingListActionImpl instance = new CartAddShoppingListActionImpl();
        instance.setShoppingList(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier
                .deepCopy(template.getShoppingList()));
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for CartAddShoppingListAction
     * @return builder
     */
    public static CartAddShoppingListActionBuilder builder() {
        return CartAddShoppingListActionBuilder.of();
    }

    /**
     * create builder for CartAddShoppingListAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddShoppingListActionBuilder builder(final CartAddShoppingListAction template) {
        return CartAddShoppingListActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartAddShoppingListAction(Function<CartAddShoppingListAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartAddShoppingListAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddShoppingListAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddShoppingListAction>";
            }
        };
    }
}
