
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
 *     InventoryEntryChangeQuantityAction inventoryEntryChangeQuantityAction = InventoryEntryChangeQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryChangeQuantityActionImpl.class)
public interface InventoryEntryChangeQuantityAction extends InventoryEntryUpdateAction {

    String CHANGE_QUANTITY = "changeQuantity";

    /**
     *  <p>Value to set for <code>quantityOnStock</code>.</p>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setQuantity(final Long quantity);

    public static InventoryEntryChangeQuantityAction of() {
        return new InventoryEntryChangeQuantityActionImpl();
    }

    public static InventoryEntryChangeQuantityAction of(final InventoryEntryChangeQuantityAction template) {
        InventoryEntryChangeQuantityActionImpl instance = new InventoryEntryChangeQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static InventoryEntryChangeQuantityActionBuilder builder() {
        return InventoryEntryChangeQuantityActionBuilder.of();
    }

    public static InventoryEntryChangeQuantityActionBuilder builder(final InventoryEntryChangeQuantityAction template) {
        return InventoryEntryChangeQuantityActionBuilder.of(template);
    }

    default <T> T withInventoryEntryChangeQuantityAction(Function<InventoryEntryChangeQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryChangeQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryChangeQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryChangeQuantityAction>";
            }
        };
    }
}
