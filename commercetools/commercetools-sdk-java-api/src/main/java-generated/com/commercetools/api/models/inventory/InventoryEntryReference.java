
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to an InventoryEntry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryReference inventoryEntryReference = InventoryEntryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("inventory-entry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryReferenceImpl.class)
public interface InventoryEntryReference extends Reference, com.commercetools.api.models.Identifiable<InventoryEntry>,
        com.commercetools.api.models.IdentifiableObjHolder<InventoryEntry> {

    /**
     * discriminator value for InventoryEntryReference
     */
    String INVENTORY_ENTRY = "inventory-entry";

    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public InventoryEntry getObj();

    /**
     *  <p>Unique identifier of the referenced InventoryEntry.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     * @param obj value to be set
     */

    public void setObj(final InventoryEntry obj);

    /**
     *  <p>Unique identifier of the referenced InventoryEntry.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of InventoryEntryReference
     */
    public static InventoryEntryReference of() {
        return new InventoryEntryReferenceImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryReference of(final InventoryEntryReference template) {
        InventoryEntryReferenceImpl instance = new InventoryEntryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public InventoryEntryReference copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryReference deepCopy(@Nullable final InventoryEntryReference template) {
        if (template == null) {
            return null;
        }
        InventoryEntryReferenceImpl instance = new InventoryEntryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.inventory.InventoryEntry.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for InventoryEntryReference
     * @return builder
     */
    public static InventoryEntryReferenceBuilder builder() {
        return InventoryEntryReferenceBuilder.of();
    }

    /**
     * create builder for InventoryEntryReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryReferenceBuilder builder(final InventoryEntryReference template) {
        return InventoryEntryReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryReference(Function<InventoryEntryReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReference>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryReference>";
            }
        };
    }
}
