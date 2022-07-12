
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>If an entry with the same <code>sku</code> and <code>supplyChannel</code> already exists, this action will fail and a 400 Bad Request <code>DuplicateField</code> error will be returned.</p>
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

    String SET_SUPPLY_CHANNEL = "setSupplyChannel";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public static InventoryEntrySetSupplyChannelAction of() {
        return new InventoryEntrySetSupplyChannelActionImpl();
    }

    public static InventoryEntrySetSupplyChannelAction of(final InventoryEntrySetSupplyChannelAction template) {
        InventoryEntrySetSupplyChannelActionImpl instance = new InventoryEntrySetSupplyChannelActionImpl();
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static InventoryEntrySetSupplyChannelActionBuilder builder() {
        return InventoryEntrySetSupplyChannelActionBuilder.of();
    }

    public static InventoryEntrySetSupplyChannelActionBuilder builder(
            final InventoryEntrySetSupplyChannelAction template) {
        return InventoryEntrySetSupplyChannelActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetSupplyChannelAction(Function<InventoryEntrySetSupplyChannelAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetSupplyChannelAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetSupplyChannelAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetSupplyChannelAction>";
            }
        };
    }
}
