
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action has no effect if a given supply channel is already present in a Store.</p>
 *  <p>Adding a supply channel produces the StoreSupplyChannelsChanged Message.</p>
 *  <p>Adding a Channel without the <code>InventorySupply</code> ChannelRoleEnum returns a MissingRoleOnChannel error.</p>
 *
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
@JsonDeserialize(as = StoreAddSupplyChannelActionImpl.class)
public interface StoreAddSupplyChannelAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreAddSupplyChannelAction
     */
    String ADD_SUPPLY_CHANNEL = "addSupplyChannel";

    /**
     *  <p>Value to append.</p>
     * @return supplyChannel
     */
    @NotNull
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Value to append.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     * factory method
     * @return instance of StoreAddSupplyChannelAction
     */
    public static StoreAddSupplyChannelAction of() {
        return new StoreAddSupplyChannelActionImpl();
    }

    /**
     * factory method to copy an instance of StoreAddSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreAddSupplyChannelAction of(final StoreAddSupplyChannelAction template) {
        StoreAddSupplyChannelActionImpl instance = new StoreAddSupplyChannelActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    /**
     * builder factory method for StoreAddSupplyChannelAction
     * @return builder
     */
    public static StoreAddSupplyChannelActionBuilder builder() {
        return StoreAddSupplyChannelActionBuilder.of();
    }

    /**
     * create builder for StoreAddSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreAddSupplyChannelActionBuilder builder(final StoreAddSupplyChannelAction template) {
        return StoreAddSupplyChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreAddSupplyChannelAction(Function<StoreAddSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StoreAddSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreAddSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreAddSupplyChannelAction>";
            }
        };
    }
}
