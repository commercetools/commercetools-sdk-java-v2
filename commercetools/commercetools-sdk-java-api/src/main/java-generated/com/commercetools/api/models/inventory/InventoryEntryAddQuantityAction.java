
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
 *     InventoryEntryAddQuantityAction inventoryEntryAddQuantityAction = InventoryEntryAddQuantityAction.builder()
 *             .quantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryAddQuantityActionImpl.class)
public interface InventoryEntryAddQuantityAction extends InventoryEntryUpdateAction {

    String ADD_QUANTITY = "addQuantity";

    /**
     *  <p>Value to add to <code>quantityOnStock</code>.</p>
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    public void setQuantity(final Long quantity);

    public static InventoryEntryAddQuantityAction of() {
        return new InventoryEntryAddQuantityActionImpl();
    }

    public static InventoryEntryAddQuantityAction of(final InventoryEntryAddQuantityAction template) {
        InventoryEntryAddQuantityActionImpl instance = new InventoryEntryAddQuantityActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public static InventoryEntryAddQuantityActionBuilder builder() {
        return InventoryEntryAddQuantityActionBuilder.of();
    }

    public static InventoryEntryAddQuantityActionBuilder builder(final InventoryEntryAddQuantityAction template) {
        return InventoryEntryAddQuantityActionBuilder.of(template);
    }

    default <T> T withInventoryEntryAddQuantityAction(Function<InventoryEntryAddQuantityAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryAddQuantityAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryAddQuantityAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryAddQuantityAction>";
            }
        };
    }
}
