
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>ResourceIdentifier to an InventoryEntry. Either <code>id</code> or <code>key</code> is required. If both are set, an InvalidJsonInput error is returned.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryResourceIdentifier inventoryEntryResourceIdentifier = InventoryEntryResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("inventory-entry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryResourceIdentifierImpl.class)
public interface InventoryEntryResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<InventoryEntry> {

    /**
     * discriminator value for InventoryEntryResourceIdentifier
     */
    String INVENTORY_ENTRY = "inventory-entry";

    /**
     *  <p>Unique identifier of the referenced InventoryEntry. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the referenced InventoryEntry. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced InventoryEntry. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the referenced InventoryEntry. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of InventoryEntryResourceIdentifier
     */
    public static InventoryEntryResourceIdentifier of() {
        return new InventoryEntryResourceIdentifierImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryResourceIdentifier of(final InventoryEntryResourceIdentifier template) {
        InventoryEntryResourceIdentifierImpl instance = new InventoryEntryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public InventoryEntryResourceIdentifier copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryResourceIdentifier deepCopy(@Nullable final InventoryEntryResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        InventoryEntryResourceIdentifierImpl instance = new InventoryEntryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryResourceIdentifier
     * @return builder
     */
    public static InventoryEntryResourceIdentifierBuilder builder() {
        return InventoryEntryResourceIdentifierBuilder.of();
    }

    /**
     * create builder for InventoryEntryResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryResourceIdentifierBuilder builder(final InventoryEntryResourceIdentifier template) {
        return InventoryEntryResourceIdentifierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryResourceIdentifier(Function<InventoryEntryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryResourceIdentifier>";
            }
        };
    }
}
