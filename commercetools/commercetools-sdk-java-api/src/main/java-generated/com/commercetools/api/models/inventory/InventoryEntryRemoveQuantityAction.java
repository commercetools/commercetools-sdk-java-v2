
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Updates <code>availableQuantity</code> based on the new <code>quantityOnStock</code> and amount of active reservations.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryRemoveQuantityAction inventoryEntryRemoveQuantityAction = InventoryEntryRemoveQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryRemoveQuantityActionImpl.class)
public interface InventoryEntryRemoveQuantityAction extends InventoryEntryUpdateAction {

    String REMOVE_QUANTITY = "removeQuantity";

    /**
     *  <p>Value to remove from <code>quantityOnStock</code>.</p>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setQuantity(final Long quantity);

    public static InventoryEntryRemoveQuantityAction of() {
        return new InventoryEntryRemoveQuantityActionImpl();
    }

    public static InventoryEntryRemoveQuantityAction of(final InventoryEntryRemoveQuantityAction template) {
        InventoryEntryRemoveQuantityActionImpl instance = new InventoryEntryRemoveQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static InventoryEntryRemoveQuantityActionBuilder builder() {
        return InventoryEntryRemoveQuantityActionBuilder.of();
    }

    public static InventoryEntryRemoveQuantityActionBuilder builder(final InventoryEntryRemoveQuantityAction template) {
        return InventoryEntryRemoveQuantityActionBuilder.of(template);
    }

    default <T> T withInventoryEntryRemoveQuantityAction(Function<InventoryEntryRemoveQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryRemoveQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryRemoveQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryRemoveQuantityAction>";
            }
        };
    }
}
