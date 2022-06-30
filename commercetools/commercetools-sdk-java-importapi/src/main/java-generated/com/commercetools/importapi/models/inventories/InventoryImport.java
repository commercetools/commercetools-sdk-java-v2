
package com.commercetools.importapi.models.inventories;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

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
     */
    @NotNull
    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>Maps to <code>Inventory.quantityOnStock</code></p>
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Long getQuantityOnStock();

    /**
     *  <p>Maps to <code>Inventory.restockableInDays</code></p>
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    /**
     *  <p>Maps to <code>Inventory.expectedDelivery</code></p>
     */

    @JsonProperty("expectedDelivery")
    public ZonedDateTime getExpectedDelivery();

    /**
     *  <p>Maps to <code>Inventory.supplyChannel</code></p>
     */
    @Valid
    @JsonProperty("supplyChannel")
    public ChannelKeyReference getSupplyChannel();

    /**
     *  <p>Maps to <code>Inventory.custom</code>.</p>
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setSku(final String sku);

    public void setQuantityOnStock(final Long quantityOnStock);

    public void setRestockableInDays(final Long restockableInDays);

    public void setExpectedDelivery(final ZonedDateTime expectedDelivery);

    public void setSupplyChannel(final ChannelKeyReference supplyChannel);

    public void setCustom(final Custom custom);

    public static InventoryImport of() {
        return new InventoryImportImpl();
    }

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

    public static InventoryImportBuilder builder() {
        return InventoryImportBuilder.of();
    }

    public static InventoryImportBuilder builder(final InventoryImport template) {
        return InventoryImportBuilder.of(template);
    }

    default <T> T withInventoryImport(Function<InventoryImport, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryImport>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryImport>";
            }
        };
    }
}
