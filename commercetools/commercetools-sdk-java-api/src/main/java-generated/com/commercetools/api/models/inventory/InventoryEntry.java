
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
public interface InventoryEntry extends BaseResource, com.commercetools.api.models.DomainResource<InventoryEntry>,
        com.commercetools.api.models.Customizable<InventoryEntry> {

    /**
     *  <p>Unique identifier of the InventoryEntry.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the InventoryEntry.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the InventoryEntry was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the InventoryEntry was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the InventoryEntry.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>ProductVariant <code>sku</code> of the InventoryEntry.</p>
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelReference getSupplyChannel();

    /**
     *  <p>Overall amount of stock (<code>availableQuantity</code> + reserved).</p>
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

    /**
     *  <p>Available amount of stock (<code>quantityOnStock</code> - reserved).</p>
     */
    @NotNull
    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    /**
     *  <p>How often the InventoryEntry is restocked (in days).</p>
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Date and time of the next restock.</p>
     */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    /**
     *  <p>Custom Fields of the InventoryEntry.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setSku(final String sku);

    public void setSupplyChannel(final ChannelReference supplyChannel);

    public void setQuantityOnStock(final Long quantityOnStock);

    public void setAvailableQuantity(final Long availableQuantity);

    public void setRestockableInDays(final Long restockableInDays);

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    public void setCustom(final CustomFields custom);

    public static InventoryEntry of() {
        return new InventoryEntryImpl();
    }

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
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static InventoryEntryBuilder builder() {
        return InventoryEntryBuilder.of();
    }

    public static InventoryEntryBuilder builder(final InventoryEntry template) {
        return InventoryEntryBuilder.of(template);
    }

    default <T> T withInventoryEntry(Function<InventoryEntry, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntry> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntry>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntry>";
            }
        };
    }
}
