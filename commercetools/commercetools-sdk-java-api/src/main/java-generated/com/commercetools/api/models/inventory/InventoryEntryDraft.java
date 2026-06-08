
package com.commercetools.api.models.inventory;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.JsonDeserialize;

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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> <code>sku</code> of the InventoryEntry.</p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing InventoryEntries with the <span>Import API</span> and the <span>Merchant Center</span>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelResourceIdentifier getSupplyChannel();

    /**
     *  <p>Overall amount of stock. See <span>Inventory checks and consistency</span> for consistency information.</p>
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

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
     *  <p>Expiration time of <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> reservations associated with this InventoryEntry.</p>
     *  <ul>
     *   <li>A Reservation is <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> if it was created for a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> that is using the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode.</li>
     *   <li>If this field is empty, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>-level reservation expiration time applies.</li>
     *  </ul>
     * @return reservationExpirationInMinutes
     */

    @JsonProperty("reservationExpirationInMinutes")
    public Integer getReservationExpirationInMinutes();

    /**
     *  <p>Configuration of stock levels for the InventoryEntry. Corresponding <span>Messages</span> are triggered when the <code>quantityOnStock</code> reaches the configured levels.</p>
     * @return stockLevels
     */
    @Valid
    @JsonProperty("stockLevels")
    public InventoryEntryStockLevels getStockLevels();

    /**
     *  <p>Custom Fields for the InventoryEntry.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> <code>sku</code> of the InventoryEntry.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>User-defined unique identifier for the InventoryEntry.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing InventoryEntries with the <span>Import API</span> and the <span>Merchant Center</span>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> that supplies this InventoryEntry.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelResourceIdentifier supplyChannel);

    /**
     *  <p>Overall amount of stock. See <span>Inventory checks and consistency</span> for consistency information.</p>
     * @param quantityOnStock value to be set
     */

    public void setQuantityOnStock(final Long quantityOnStock);

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
     *  <p>Expiration time of <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> reservations associated with this InventoryEntry.</p>
     *  <ul>
     *   <li>A Reservation is <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> if it was created for a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> that is using the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode.</li>
     *   <li>If this field is empty, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>-level reservation expiration time applies.</li>
     *  </ul>
     * @param reservationExpirationInMinutes value to be set
     */

    public void setReservationExpirationInMinutes(final Integer reservationExpirationInMinutes);

    /**
     *  <p>Configuration of stock levels for the InventoryEntry. Corresponding <span>Messages</span> are triggered when the <code>quantityOnStock</code> reaches the configured levels.</p>
     * @param stockLevels value to be set
     */

    public void setStockLevels(final InventoryEntryStockLevels stockLevels);

    /**
     *  <p>Custom Fields for the InventoryEntry.</p>
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
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        instance.setStockLevels(template.getStockLevels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public InventoryEntryDraft copyDeep();

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
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        instance.setStockLevels(
            com.commercetools.api.models.inventory.InventoryEntryStockLevels.deepCopy(template.getStockLevels()));
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
    public static tools.jackson.core.type.TypeReference<InventoryEntryDraft> typeReference() {
        return new tools.jackson.core.type.TypeReference<InventoryEntryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryDraft>";
            }
        };
    }
}
