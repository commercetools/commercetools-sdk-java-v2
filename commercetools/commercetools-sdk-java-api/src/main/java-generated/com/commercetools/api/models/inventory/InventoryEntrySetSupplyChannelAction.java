
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If an entry with the same <code>sku</code> and <code>supplyChannel</code> already exists, an DuplicateField error is returned.</p>
 *
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
@JsonDeserialize(as = InventoryEntrySetSupplyChannelActionImpl.class)
public interface InventoryEntrySetSupplyChannelAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetSupplyChannelAction
     */
    String SET_SUPPLY_CHANNEL = "setSupplyChannel";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     * factory method
     * @return instance of InventoryEntrySetSupplyChannelAction
     */
    public static InventoryEntrySetSupplyChannelAction of() {
        return new InventoryEntrySetSupplyChannelActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetSupplyChannelAction of(final InventoryEntrySetSupplyChannelAction template) {
        InventoryEntrySetSupplyChannelActionImpl instance = new InventoryEntrySetSupplyChannelActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntrySetSupplyChannelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetSupplyChannelAction deepCopy(
            @Nullable final InventoryEntrySetSupplyChannelAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetSupplyChannelActionImpl instance = new InventoryEntrySetSupplyChannelActionImpl();
        instance.setSupplyChannel(Optional.ofNullable(template.getSupplyChannel())
                .map(com.commercetools.api.models.channel.ChannelResourceIdentifier::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetSupplyChannelAction
     * @return builder
     */
    public static InventoryEntrySetSupplyChannelActionBuilder builder() {
        return InventoryEntrySetSupplyChannelActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetSupplyChannelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetSupplyChannelActionBuilder builder(
            final InventoryEntrySetSupplyChannelAction template) {
        return InventoryEntrySetSupplyChannelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetSupplyChannelAction(Function<InventoryEntrySetSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetSupplyChannelAction>";
            }
        };
    }
}
