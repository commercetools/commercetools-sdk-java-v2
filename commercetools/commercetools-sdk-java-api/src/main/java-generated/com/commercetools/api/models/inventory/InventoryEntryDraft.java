
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
public interface InventoryEntryDraft extends com.commercetools.api.models.CustomizableDraft<InventoryEntryDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<InventoryEntryDraft> {

    /**
     *  <p>ProductVariant <code>sku</code> of the InventoryEntry.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Overall amount of stock.</p>
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

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
    public CustomFieldsDraft getCustom();

    /**
     *  <p>ProductVariant <code>sku</code> of the InventoryEntry.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Channel that supplies this InventoryEntry.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     *  <p>Overall amount of stock.</p>
     * @param quantityOnStock value to be set
     */

    public void setQuantityOnStock(final Long quantityOnStock);

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

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of InventoryEntryDraft
     */
    public static InventoryEntryDraft of() {
        return new InventoryEntryDraftImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryDraft
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of InventoryEntryDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryDraft deepCopy(@Nullable final InventoryEntryDraft template) {
        if (template == null) {
            return null;
        }
        InventoryEntryDraftImpl instance = new InventoryEntryDraftImpl();
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setSupplyChannel(
            com.commercetools.api.models.channel.ChannelResourceIdentifier.deepCopy(template.getSupplyChannel()));
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryDraft
     * @return builder
     */
    public static InventoryEntryDraftBuilder builder() {
        return InventoryEntryDraftBuilder.of();
    }

    /**
     * create builder for InventoryEntryDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryDraftBuilder builder(final InventoryEntryDraft template) {
        return InventoryEntryDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryDraft(Function<InventoryEntryDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryDraft>";
            }
        };
    }
}
