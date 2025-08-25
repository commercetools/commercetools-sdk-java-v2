
package com.commercetools.importapi.models.inventories;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Represents the data used to import an InventoryEntry. Once imported, this data is persisted as a <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryImport inventoryImport = InventoryImport.builder()
 *             .key("{key}")
 *             .sku("{sku}")
 *             .quantityOnStock(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryImportImpl.class)
public interface InventoryImport extends ImportResource {

    /**
     *  <p>User-defined unique identifier. If an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Maps to <code>InventoryEntry.sku</code></p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Maps to <code>InventoryEntry.quantityOnStock</code></p>
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

    /**
     *  <p>Maps to <code>InventoryEntry.restockableInDays</code></p>
     * @return restockableInDays
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Maps to <code>InventoryEntry.expectedDelivery</code></p>
     * @return expectedDelivery
     */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    /**
     *  <p>Maps to <code>InventoryEntry.supplyChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelKeyReference getSupplyChannel();

    /**
     *  <p>Maps to <code>InventoryEntry.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined unique identifier. If an <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> with this <code>key</code> exists, it is updated with the imported data.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Maps to <code>InventoryEntry.sku</code></p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Maps to <code>InventoryEntry.quantityOnStock</code></p>
     * @param quantityOnStock value to be set
     */

    public void setQuantityOnStock(final Long quantityOnStock);

    /**
     *  <p>Maps to <code>InventoryEntry.restockableInDays</code></p>
     * @param restockableInDays value to be set
     */

    public void setRestockableInDays(final Long restockableInDays);

    /**
     *  <p>Maps to <code>InventoryEntry.expectedDelivery</code></p>
     * @param expectedDelivery value to be set
     */

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    /**
     *  <p>Maps to <code>InventoryEntry.supplyChannel</code>. If the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a> does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Channel is created.</p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelKeyReference supplyChannel);

    /**
     *  <p>Maps to <code>InventoryEntry.custom</code>.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of InventoryImport
     */
    public static InventoryImport of() {
        return new InventoryImportImpl();
    }

    /**
     * factory method to create a shallow copy InventoryImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryImport of(final InventoryImport template) {
        InventoryImportImpl instance = new InventoryImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setSupplyChannel(template.getSupplyChannel());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public InventoryImport copyDeep();

    /**
     * factory method to create a deep copy of InventoryImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryImport deepCopy(@Nullable final InventoryImport template) {
        if (template == null) {
            return null;
        }
        InventoryImportImpl instance = new InventoryImportImpl();
        instance.setKey(template.getKey());
        instance.setSku(template.getSku());
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setRestockableInDays(template.getRestockableInDays());
        instance.setExpectedDelivery(template.getExpectedDelivery());
        instance.setSupplyChannel(
            com.commercetools.importapi.models.common.ChannelKeyReference.deepCopy(template.getSupplyChannel()));
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for InventoryImport
     * @return builder
     */
    public static InventoryImportBuilder builder() {
        return InventoryImportBuilder.of();
    }

    /**
     * create builder for InventoryImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryImportBuilder builder(final InventoryImport template) {
        return InventoryImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryImport(Function<InventoryImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryImport>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryImport>";
            }
        };
    }
}
