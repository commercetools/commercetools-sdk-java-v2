
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetKeyAction inventoryEntrySetKeyAction = InventoryEntrySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetKeyActionImpl.class)
public interface InventoryEntrySetKeyAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of InventoryEntrySetKeyAction
     */
    public static InventoryEntrySetKeyAction of() {
        return new InventoryEntrySetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetKeyAction of(final InventoryEntrySetKeyAction template) {
        InventoryEntrySetKeyActionImpl instance = new InventoryEntrySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public InventoryEntrySetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntrySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetKeyAction deepCopy(@Nullable final InventoryEntrySetKeyAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetKeyActionImpl instance = new InventoryEntrySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetKeyAction
     * @return builder
     */
    public static InventoryEntrySetKeyActionBuilder builder() {
        return InventoryEntrySetKeyActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetKeyActionBuilder builder(final InventoryEntrySetKeyAction template) {
        return InventoryEntrySetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetKeyAction(Function<InventoryEntrySetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static InventoryEntrySetKeyAction ofUnset() {
        return InventoryEntrySetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetKeyAction>";
            }
        };
    }
}
