
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
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   InventoryEntryQuantitySetMessage inventoryEntryQuantitySetMessage = InventoryEntryQuantitySetMessage.builder()
           .id("{id}")
           .version(0.3)
           .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .sequenceNumber(0.3)
           .resource(resourceBuilder -> resourceBuilder)
           .resourceVersion(0.3)
           .oldQuantityOnStock(0.3)
           .newQuantityOnStock(0.3)
           .oldAvailableQuantity(0.3)
           .newAvailableQuantity(0.3)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryQuantitySetMessageImpl.class)
public interface InventoryEntryQuantitySetMessage extends Message {

    String INVENTORY_ENTRY_QUANTITY_SET = "InventoryEntryQuantitySet";

    @NotNull
    @JsonProperty("oldQuantityOnStock")
    public Long getOldQuantityOnStock();

    @NotNull
    @JsonProperty("newQuantityOnStock")
    public Long getNewQuantityOnStock();

    @NotNull
    @JsonProperty("oldAvailableQuantity")
    public Long getOldAvailableQuantity();

    @NotNull
    @JsonProperty("newAvailableQuantity")
    public Long getNewAvailableQuantity();

    /**
     *  <p>Reference to a Channel.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    public void setOldQuantityOnStock(final Long oldQuantityOnStock);

    public void setNewQuantityOnStock(final Long newQuantityOnStock);

    public void setOldAvailableQuantity(final Long oldAvailableQuantity);

    public void setNewAvailableQuantity(final Long newAvailableQuantity);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public static InventoryEntryQuantitySetMessage of() {
        return new InventoryEntryQuantitySetMessageImpl();
    }

    public static InventoryEntryQuantitySetMessage of(final InventoryEntryQuantitySetMessage template) {
        InventoryEntryQuantitySetMessageImpl instance = new InventoryEntryQuantitySetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setOldQuantityOnStock(template.getOldQuantityOnStock());
        instance.setNewQuantityOnStock(template.getNewQuantityOnStock());
        instance.setOldAvailableQuantity(template.getOldAvailableQuantity());
        instance.setNewAvailableQuantity(template.getNewAvailableQuantity());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public static InventoryEntryQuantitySetMessageBuilder builder() {
        return InventoryEntryQuantitySetMessageBuilder.of();
    }

    public static InventoryEntryQuantitySetMessageBuilder builder(final InventoryEntryQuantitySetMessage template) {
        return InventoryEntryQuantitySetMessageBuilder.of(template);
    }

    default <T> T withInventoryEntryQuantitySetMessage(Function<InventoryEntryQuantitySetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryQuantitySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryQuantitySetMessage>";
            }
        };
    }
}
