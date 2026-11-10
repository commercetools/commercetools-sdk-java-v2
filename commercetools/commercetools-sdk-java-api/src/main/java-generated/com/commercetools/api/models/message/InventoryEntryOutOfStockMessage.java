
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> goes to 0.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryOutOfStockMessage inventoryEntryOutOfStockMessage = InventoryEntryOutOfStockMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .sku("{sku}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryOutOfStock")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryOutOfStockMessageImpl.class)
public interface InventoryEntryOutOfStockMessage extends Message {

    /**
     * discriminator value for InventoryEntryOutOfStockMessage
     */
    String INVENTORY_ENTRY_OUT_OF_STOCK = "InventoryEntryOutOfStock";

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> went to 0.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> went to 0.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> quantity on stock went to 0.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     * factory method
     * @return instance of InventoryEntryOutOfStockMessage
     */
    public static InventoryEntryOutOfStockMessage of() {
        return new InventoryEntryOutOfStockMessageImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryOutOfStockMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryOutOfStockMessage of(final InventoryEntryOutOfStockMessage template) {
        InventoryEntryOutOfStockMessageImpl instance = new InventoryEntryOutOfStockMessageImpl();
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
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public InventoryEntryOutOfStockMessage copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryOutOfStockMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryOutOfStockMessage deepCopy(@Nullable final InventoryEntryOutOfStockMessage template) {
        if (template == null) {
            return null;
        }
        InventoryEntryOutOfStockMessageImpl instance = new InventoryEntryOutOfStockMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setSku(template.getSku());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryOutOfStockMessage
     * @return builder
     */
    public static InventoryEntryOutOfStockMessageBuilder builder() {
        return InventoryEntryOutOfStockMessageBuilder.of();
    }

    /**
     * create builder for InventoryEntryOutOfStockMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryOutOfStockMessageBuilder builder(final InventoryEntryOutOfStockMessage template) {
        return InventoryEntryOutOfStockMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryOutOfStockMessage(Function<InventoryEntryOutOfStockMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<InventoryEntryOutOfStockMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<InventoryEntryOutOfStockMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryOutOfStockMessage>";
            }
        };
    }
}
