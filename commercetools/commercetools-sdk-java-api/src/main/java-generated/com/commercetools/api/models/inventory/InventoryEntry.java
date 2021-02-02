
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryEntryImpl.class)
public interface InventoryEntry extends BaseResource, com.commercetools.api.models.DomainResource<InventoryEntry> {

    /**
    *  <p>The unique ID of the inventory entry.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>Optional connection to a particular supplier.</p>
    */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
    *  <p>Overall amount of stock.
    *  (available + reserved)</p>
    */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

    /**
    *  <p>Available amount of stock.
    *  (available means: <code>quantityOnStock</code> - reserved quantity)</p>
    */
    @NotNull
    @JsonProperty("availableQuantity")
    public Long getAvailableQuantity();

    /**
    *  <p>The time period in days, that tells how often this inventory entry is restocked.</p>
    */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
    *  <p>The date and time of the next restock.</p>
    */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setSku(final String sku);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

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
}
