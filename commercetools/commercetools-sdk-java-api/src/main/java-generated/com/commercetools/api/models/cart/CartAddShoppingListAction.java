
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adds all LineItems of a ShoppingList to the Cart.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartAddShoppingListActionImpl.class)
public interface CartAddShoppingListAction extends CartUpdateAction {

    String ADD_SHOPPING_LIST = "addShoppingList";

    /**
     *  <p>Shopping List that contains the Line Items to be added.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("shoppingList")
    public ShoppingListResourceIdentifier getShoppingList();

    /**
     *  <p><code>distributionChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p><code>supplyChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setShoppingList(final ShoppingListResourceIdentifier shoppingList);

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static CartAddShoppingListAction of() {
        return new CartAddShoppingListActionImpl();
    }

    public static CartAddShoppingListAction of(final CartAddShoppingListAction template) {
        CartAddShoppingListActionImpl instance = new CartAddShoppingListActionImpl();
        instance.setShoppingList(template.getShoppingList());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static CartAddShoppingListActionBuilder builder() {
        return CartAddShoppingListActionBuilder.of();
    }

    public static CartAddShoppingListActionBuilder builder(final CartAddShoppingListAction template) {
        return CartAddShoppingListActionBuilder.of(template);
    }

    default <T> T withCartAddShoppingListAction(Function<CartAddShoppingListAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartAddShoppingListAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartAddShoppingListAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartAddShoppingListAction>";
            }
        };
    }
}
