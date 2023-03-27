
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryUpdate inventoryEntryUpdate = InventoryEntryUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryUpdateImpl.class)
public interface InventoryEntryUpdate extends
        com.commercetools.api.models.ResourceUpdate<InventoryEntryUpdate, InventoryEntryUpdateAction, InventoryEntryUpdateBuilder> {

    /**
     *  <p>Expected version of the InventoryEntry on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<InventoryEntryUpdateAction> getActions();

    /**
     *  <p>Expected version of the InventoryEntry on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final InventoryEntryUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     * @param actions values to be set
     */

    public void setActions(final List<InventoryEntryUpdateAction> actions);

    /**
     * factory method
     * @return instance of InventoryEntryUpdate
     */
    public static InventoryEntryUpdate of() {
        return new InventoryEntryUpdateImpl();
    }

    /**
     * factory method to copy an instance of InventoryEntryUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryUpdate of(final InventoryEntryUpdate template) {
        InventoryEntryUpdateImpl instance = new InventoryEntryUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryUpdate
     * @return builder
     */
    public static InventoryEntryUpdateBuilder builder() {
        return InventoryEntryUpdateBuilder.of();
    }

    /**
     * create builder for InventoryEntryUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryUpdateBuilder builder(final InventoryEntryUpdate template) {
        return InventoryEntryUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryUpdate(Function<InventoryEntryUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryUpdate>";
            }
        };
    }
}
