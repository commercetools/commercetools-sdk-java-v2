
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryDeletedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryDeletedMessagePayload inventoryEntryDeletedMessagePayload = InventoryEntryDeletedMessagePayload.builder()
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryDeletedMessagePayloadImpl.class)
public interface InventoryEntryDeletedMessagePayload extends MessagePayload {

    String INVENTORY_ENTRY_DELETED = "InventoryEntryDeleted";

    /**
     *
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Reference to a Channel.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    public void setSku(final String sku);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public static InventoryEntryDeletedMessagePayload of() {
        return new InventoryEntryDeletedMessagePayloadImpl();
    }

    public static InventoryEntryDeletedMessagePayload of(final InventoryEntryDeletedMessagePayload template) {
        InventoryEntryDeletedMessagePayloadImpl instance = new InventoryEntryDeletedMessagePayloadImpl();
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static InventoryEntryDeletedMessagePayloadBuilder builder() {
        return InventoryEntryDeletedMessagePayloadBuilder.of();
    }

    public static InventoryEntryDeletedMessagePayloadBuilder builder(
            final InventoryEntryDeletedMessagePayload template) {
        return InventoryEntryDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withInventoryEntryDeletedMessagePayload(Function<InventoryEntryDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryDeletedMessagePayload>";
            }
        };
    }
}
