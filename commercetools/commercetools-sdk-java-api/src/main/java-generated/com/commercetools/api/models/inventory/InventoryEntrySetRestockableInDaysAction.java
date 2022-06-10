
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetRestockableInDaysAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetRestockableInDaysAction inventoryEntrySetRestockableInDaysAction = InventoryEntrySetRestockableInDaysAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetRestockableInDaysActionImpl.class)
public interface InventoryEntrySetRestockableInDaysAction extends InventoryEntryUpdateAction {

    String SET_RESTOCKABLE_IN_DAYS = "setRestockableInDays";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("restockableInDays")
    public Long getRestockableInDays();

    public void setRestockableInDays(final Long restockableInDays);

    public static InventoryEntrySetRestockableInDaysAction of() {
        return new InventoryEntrySetRestockableInDaysActionImpl();
    }

    public static InventoryEntrySetRestockableInDaysAction of(final InventoryEntrySetRestockableInDaysAction template) {
        InventoryEntrySetRestockableInDaysActionImpl instance = new InventoryEntrySetRestockableInDaysActionImpl();
        instance.setRestockableInDays(template.getRestockableInDays());
        return instance;
    }

    public static InventoryEntrySetRestockableInDaysActionBuilder builder() {
        return InventoryEntrySetRestockableInDaysActionBuilder.of();
    }

    public static InventoryEntrySetRestockableInDaysActionBuilder builder(
            final InventoryEntrySetRestockableInDaysAction template) {
        return InventoryEntrySetRestockableInDaysActionBuilder.of(template);
    }

    default <T> T withInventoryEntrySetRestockableInDaysAction(
            Function<InventoryEntrySetRestockableInDaysAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetRestockableInDaysAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetRestockableInDaysAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetRestockableInDaysAction>";
            }
        };
    }
}
