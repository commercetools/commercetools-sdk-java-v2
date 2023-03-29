
package com.commercetools.importapi.models.inventories;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for an Inventory to be imported that is persisted as a Inventory in the Project.</p>
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
     *  <p>Maps to <code>Inventory.sku</code></p>
     * @return sku
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Maps to <code>Inventory.quantityOnStock</code></p>
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

    /**
     *  <p>Maps to <code>Inventory.restockableInDays</code></p>
     * @return restockableInDays
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Maps to <code>Inventory.expectedDelivery</code></p>
     * @return expectedDelivery
     */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    /**
     *  <p>Maps to <code>Inventory.supplyChannel</code></p>
     * @return supplyChannel
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelKeyReference getSupplyChannel();

    /**
     *  <p>Maps to <code>Inventory.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>Maps to <code>Inventory.sku</code></p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>Maps to <code>Inventory.quantityOnStock</code></p>
     * @param quantityOnStock value to be set
     */

    public void setQuantityOnStock(final Long quantityOnStock);

    /**
     *  <p>Maps to <code>Inventory.restockableInDays</code></p>
     * @param restockableInDays value to be set
     */

    public void setRestockableInDays(final Long restockableInDays);

    /**
     *  <p>Maps to <code>Inventory.expectedDelivery</code></p>
     * @param expectedDelivery value to be set
     */

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    /**
     *  <p>Maps to <code>Inventory.supplyChannel</code></p>
     * @param supplyChannel value to be set
     */

    public void setSupplyChannel(final ChannelKeyReference supplyChannel);

    /**
     *  <p>Maps to <code>Inventory.custom</code>.</p>
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
