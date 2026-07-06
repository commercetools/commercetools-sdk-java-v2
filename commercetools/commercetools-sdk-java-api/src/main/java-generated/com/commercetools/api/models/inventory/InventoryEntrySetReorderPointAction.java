
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the reorder point level for a specific InventoryEntry. When the stock reaches this level, a corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReorderPointMessage" rel="nofollow">InventoryEntryReorderPoint</a> Message is generated.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetReorderPointAction inventoryEntrySetReorderPointAction = InventoryEntrySetReorderPointAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setReorderPoint")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetReorderPointActionImpl.class)
public interface InventoryEntrySetReorderPointAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetReorderPointAction
     */
    String SET_REORDER_POINT = "setReorderPoint";

    /**
     *  <p>Sets the configured inventory stock level for reorder point. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @return quantity
     */

    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *  <p>Sets the configured inventory stock level for reorder point. If the value is absent or <code>null</code> the configured inventory stock level is removed.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     * factory method
     * @return instance of InventoryEntrySetReorderPointAction
     */
    public static InventoryEntrySetReorderPointAction of() {
        return new InventoryEntrySetReorderPointActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetReorderPointAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetReorderPointAction of(final InventoryEntrySetReorderPointAction template) {
        InventoryEntrySetReorderPointActionImpl instance = new InventoryEntrySetReorderPointActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    public InventoryEntrySetReorderPointAction copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntrySetReorderPointAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetReorderPointAction deepCopy(
            @Nullable final InventoryEntrySetReorderPointAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetReorderPointActionImpl instance = new InventoryEntrySetReorderPointActionImpl();
        instance.setQuantity(template.getQuantity());
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetReorderPointAction
     * @return builder
     */
    public static InventoryEntrySetReorderPointActionBuilder builder() {
        return InventoryEntrySetReorderPointActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetReorderPointAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetReorderPointActionBuilder builder(
            final InventoryEntrySetReorderPointAction template) {
        return InventoryEntrySetReorderPointActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetReorderPointAction(Function<InventoryEntrySetReorderPointAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<InventoryEntrySetReorderPointAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<InventoryEntrySetReorderPointAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetReorderPointAction>";
            }
        };
    }
}
