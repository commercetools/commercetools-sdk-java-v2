
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>This update action produces the StoreSupplyChannelsChanged Message.</p>
 *
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreRemoveSupplyChannelActionImpl.class)
public interface StoreRemoveSupplyChannelAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreRemoveSupplyChannelAction
     */
    String REMOVE_SUPPLY_CHANNEL = "removeSupplyChannel";

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @return supplyChannel
     */
    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Value to remove. ResourceIdentifier of a Channel with the <code>InventorySupply</code> ChannelRoleEnum.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     * factory method
     * @return instance of StoreRemoveSupplyChannelAction
     */
    public static StoreRemoveSupplyChannelAction of() {
        return new StoreRemoveSupplyChannelActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreRemoveSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreRemoveSupplyChannelAction of(final StoreRemoveSupplyChannelAction template) {
        StoreRemoveSupplyChannelActionImpl instance = new StoreRemoveSupplyChannelActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of StoreRemoveSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreRemoveSupplyChannelAction deepCopy(@Nullable final StoreRemoveSupplyChannelAction template) {
        if (template == null) {
            return null;
        }
        StoreRemoveSupplyChannelActionImpl instance = new StoreRemoveSupplyChannelActionImpl();
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for StoreRemoveSupplyChannelAction
     * @return builder
     */
    public static StoreRemoveSupplyChannelActionBuilder builder() {
        return StoreRemoveSupplyChannelActionBuilder.of();
    }

    /**
     * create builder for StoreRemoveSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreRemoveSupplyChannelActionBuilder builder(final StoreRemoveSupplyChannelAction template) {
        return StoreRemoveSupplyChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreRemoveSupplyChannelAction(Function<StoreRemoveSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreRemoveSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreRemoveSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreRemoveSupplyChannelAction>";
            }
        };
    }
}
