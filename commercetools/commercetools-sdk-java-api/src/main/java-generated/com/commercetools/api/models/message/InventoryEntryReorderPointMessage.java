
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reaches the configured reorder point level. For more information, see <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryStockLevels" rel="nofollow">InventoryEntryStockLevels</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryReorderPointMessage inventoryEntryReorderPointMessage = InventoryEntryReorderPointMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryReorderPoint")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryReorderPointMessageImpl.class)
public interface InventoryEntryReorderPointMessage extends Message {

    /**
     * discriminator value for InventoryEntryReorderPointMessage
     */
    String INVENTORY_ENTRY_REORDER_POINT = "InventoryEntryReorderPoint";

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the reorder point level was reached.</p>
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Integer getQuantityOnStock();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>The <code>sku</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> whose <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>The <code>quantityOnStock</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> at the time the reorder point level was reached.</p>
     * @param quantityOnStock value to be set
     */

    public void setQuantityOnStock(final Integer quantityOnStock);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> where the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> <code>quantityOnStock</code> reached the configured reorder point level.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     * factory method
     * @return instance of InventoryEntryReorderPointMessage
     */
    public static InventoryEntryReorderPointMessage of() {
        return new InventoryEntryReorderPointMessageImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryReorderPointMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryReorderPointMessage of(final InventoryEntryReorderPointMessage template) {
        InventoryEntryReorderPointMessageImpl instance = new InventoryEntryReorderPointMessageImpl();
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
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setSupplyChannel(template.getSupplyChannel());
        return instance;
    }

    public InventoryEntryReorderPointMessage copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryReorderPointMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryReorderPointMessage deepCopy(
            @Nullable final InventoryEntryReorderPointMessage template) {
        if (template == null) {
            return null;
        }
        InventoryEntryReorderPointMessageImpl instance = new InventoryEntryReorderPointMessageImpl();
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
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryReorderPointMessage
     * @return builder
     */
    public static InventoryEntryReorderPointMessageBuilder builder() {
        return InventoryEntryReorderPointMessageBuilder.of();
    }

    /**
     * create builder for InventoryEntryReorderPointMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryReorderPointMessageBuilder builder(final InventoryEntryReorderPointMessage template) {
        return InventoryEntryReorderPointMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryReorderPointMessage(Function<InventoryEntryReorderPointMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReorderPointMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReorderPointMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryReorderPointMessage>";
            }
        };
    }
}
