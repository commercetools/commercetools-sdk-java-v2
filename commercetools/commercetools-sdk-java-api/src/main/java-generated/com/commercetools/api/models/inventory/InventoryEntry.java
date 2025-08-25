
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * InventoryEntry
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntry inventoryEntry = InventoryEntry.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .availableQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryImpl.class)
public interface InventoryEntry
        extends BaseResource, InventoryEntryMixin, com.commercetools.api.models.DomainResource<InventoryEntry>,
        com.commercetools.api.models.Referencable<InventoryEntry>,
        com.commercetools.api.models.ResourceIdentifiable<InventoryEntry>,
        com.commercetools.api.models.Customizable<InventoryEntry>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the InventoryEntry.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the InventoryEntry was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the InventoryEntry was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the InventoryEntry.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the InventoryEntry.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the InventoryEntry.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> <code>sku</code> of the InventoryEntry.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     * @return availableQuantity
     */
    @NotNull
    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    /**
     *  <p>Minimum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @return minCartQuantity
     */

    @JsonProperty("minCartQuantity")
    public Integer getMinCartQuantity();

    /**
     *  <p>Maximum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @return maxCartQuantity
     */

    @JsonProperty("maxCartQuantity")
    public Integer getMaxCartQuantity();

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     * @return restockableInDays
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Date and time of the next restock.</p>
     * @return expectedDelivery
     */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the InventoryEntry.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the InventoryEntry was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the InventoryEntry was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the InventoryEntry.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the InventoryEntry.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the InventoryEntry.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> <code>sku</code> of the InventoryEntry.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelReference supplyChannel);

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     * @param quantityOnStock value to be set
     */

    public void setQuantityOnStock(final Long quantityOnStock);

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     * @param availableQuantity value to be set
     */

    public void setAvailableQuantity(final Long availableQuantity);

    /**
     *  <p>Minimum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @param minCartQuantity value to be set
     */

    public void setMinCartQuantity(final Integer minCartQuantity);

    /**
     *  <p>Maximum quantity that can be added to a Cart. See <span>Quantity limits</span>.</p>
     * @param maxCartQuantity value to be set
     */

    public void setMaxCartQuantity(final Integer maxCartQuantity);

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     * @param restockableInDays value to be set
     */

    public void setRestockableInDays(final Long restockableInDays);

    /**
     *  <p>Date and time of the next restock.</p>
     * @param expectedDelivery value to be set
     */

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of InventoryEntry
     */
    public static InventoryEntry of() {
        return new InventoryEntryImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntry
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntry of(final InventoryEntry template) {
        InventoryEntryImpl instance = new InventoryEntryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public InventoryEntry copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntry
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntry deepCopy(@Nullable final InventoryEntry template) {
        if (template == null) {
            return null;
        }
        InventoryEntryImpl instance = new InventoryEntryImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelReference.deepCopy(template.getSupplyChannel()));
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntry
     * @return builder
     */
    public static InventoryEntryBuilder builder() {
        return InventoryEntryBuilder.of();
    }

    /**
     * create builder for InventoryEntry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryBuilder builder(final InventoryEntry template) {
        return InventoryEntryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntry(Function<InventoryEntry, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.INVENTORY_ENTRY;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntry> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntry>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntry>";
            }
        };
    }
}
