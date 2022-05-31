
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryDraft inventoryEntryDraft = InventoryEntryDraft.builder()
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryDraftImpl.class)
public interface InventoryEntryDraft extends com.commercetools.api.models.CustomizableDraft<InventoryEntryDraft> {

    /**
     *  <p>ProductVariant <code>sku</code> of the InventoryEntry.</p>
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Overall amount of stock.</p>
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

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
    public CustomFieldsDraft getCustom();

    public void setSku(final String sku);

    public void setKey(final String key);

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    public void setQuantityOnStock(final Long quantityOnStock);

    public void setRestockableInDays(final Long restockableInDays);

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    public void setCustom(final CustomFieldsDraft custom);

    public static InventoryEntryDraft of() {
        return new InventoryEntryDraftImpl();
    }

    public static InventoryEntryDraft of(final InventoryEntryDraft template) {
        InventoryEntryDraftImpl instance = new InventoryEntryDraftImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static InventoryEntryDraftBuilder builder() {
        return InventoryEntryDraftBuilder.of();
    }

    public static InventoryEntryDraftBuilder builder(final InventoryEntryDraft template) {
        return InventoryEntryDraftBuilder.of(template);
    }

    default <T> T withInventoryEntryDraft(Function<InventoryEntryDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryDraft>";
            }
        };
    }
}
