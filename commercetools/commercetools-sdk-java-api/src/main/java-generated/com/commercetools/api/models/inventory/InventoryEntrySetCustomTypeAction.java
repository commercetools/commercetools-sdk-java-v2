
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetCustomTypeAction inventoryEntrySetCustomTypeAction = InventoryEntrySetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetCustomTypeActionImpl.class)
public interface InventoryEntrySetCustomTypeAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetCustomTypeAction
     */
    String SET_CUSTOM_TYPE = "setCustomType";

    /**
     *  <p>Defines the Type that extends the InventoryEntry with Custom Fields. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the InventoryEntry.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Defines the Type that extends the InventoryEntry with Custom Fields. If absent, any existing Type and Custom Fields are removed from the InventoryEntry.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the InventoryEntry.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of InventoryEntrySetCustomTypeAction
     */
    public static InventoryEntrySetCustomTypeAction of() {
        return new InventoryEntrySetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetCustomTypeAction of(final InventoryEntrySetCustomTypeAction template) {
        InventoryEntrySetCustomTypeActionImpl instance = new InventoryEntrySetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryEntrySetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetCustomTypeAction deepCopy(
            @Nullable final InventoryEntrySetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetCustomTypeActionImpl instance = new InventoryEntrySetCustomTypeActionImpl();
        instance.setType(Optional.ofNullable(template.getType())
                .map(com.commercetools.api.models.type.TypeResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setFields(Optional.ofNullable(template.getFields())
                .map(com.commercetools.api.models.type.FieldContainer::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetCustomTypeAction
     * @return builder
     */
    public static InventoryEntrySetCustomTypeActionBuilder builder() {
        return InventoryEntrySetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetCustomTypeActionBuilder builder(final InventoryEntrySetCustomTypeAction template) {
        return InventoryEntrySetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetCustomTypeAction(Function<InventoryEntrySetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetCustomTypeAction>";
            }
        };
    }
}
