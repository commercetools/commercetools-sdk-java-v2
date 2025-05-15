
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Adds all LineItems of a ShoppingList to the Cart.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("addShoppingList")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddShoppingListActionImpl.class)
public interface StagedOrderAddShoppingListAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderAddShoppingListAction
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
     *  <p><code>distributionChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @return distributionChannel
     */
    @Valid
    @JsonProperty("distributionChannel")
    public ChannelResourceIdentifier getDistributionChannel();

    /**
     *  <p><code>supplyChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
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
     *  <p><code>distributionChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</p>
     * @param distributionChannel value to be set
     */

    public void setDistributionChannel(final ChannelResourceIdentifier distributionChannel);

    /**
     *  <p><code>supplyChannel</code> to set for all LineItems that are added to the Cart. The Channel must have the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     * factory method
     * @return instance of StagedOrderAddShoppingListAction
     */
    public static StagedOrderAddShoppingListAction of() {
        return new StagedOrderAddShoppingListActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderAddShoppingListAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderAddShoppingListAction of(final StagedOrderAddShoppingListAction template) {
        StagedOrderAddShoppingListActionImpl instance = new StagedOrderAddShoppingListActionImpl();
        instance.setShoppingList(template.getShoppingList());
        instance.setDistributionChannel(template.getDistributionChannel());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public StagedOrderAddShoppingListAction copyDeep();

    /**
     * factory method to create a deep copy of StagedOrderAddShoppingListAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderAddShoppingListAction deepCopy(@Nullable final StagedOrderAddShoppingListAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderAddShoppingListActionImpl instance = new StagedOrderAddShoppingListActionImpl();
        instance.setShoppingList(com.commercetools.api.models.shopping_list.ShoppingListResourceIdentifier
                .deepCopy(template.getShoppingList()));
        instance.setDistributionChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getDistributionChannel()));
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for StagedOrderAddShoppingListAction
     * @return builder
     */
    public static StagedOrderAddShoppingListActionBuilder builder() {
        return StagedOrderAddShoppingListActionBuilder.of();
    }

    /**
     * create builder for StagedOrderAddShoppingListAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddShoppingListActionBuilder builder(final StagedOrderAddShoppingListAction template) {
        return StagedOrderAddShoppingListActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderAddShoppingListAction(Function<StagedOrderAddShoppingListAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddShoppingListAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddShoppingListAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddShoppingListAction>";
            }
        };
    }
}
