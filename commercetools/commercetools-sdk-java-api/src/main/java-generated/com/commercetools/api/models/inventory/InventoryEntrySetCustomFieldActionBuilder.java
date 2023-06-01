package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.inventory.InventoryEntrySetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetCustomFieldAction inventoryEntrySetCustomFieldAction = InventoryEntrySetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InventoryEntrySetCustomFieldActionBuilder implements Builder<InventoryEntrySetCustomFieldAction> {

    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public InventoryEntrySetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public InventoryEntrySetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }
    
    

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    /**
     * builds InventoryEntrySetCustomFieldAction with checking for non-null required values
     * @return InventoryEntrySetCustomFieldAction
     */
    public InventoryEntrySetCustomFieldAction build() {
        Objects.requireNonNull(name, InventoryEntrySetCustomFieldAction.class + ": name is missing");
        return new InventoryEntrySetCustomFieldActionImpl(name, value);
    }
    
    /**
     * builds InventoryEntrySetCustomFieldAction without checking for non-null required values
     * @return InventoryEntrySetCustomFieldAction
     */
    public InventoryEntrySetCustomFieldAction buildUnchecked() {
        return new InventoryEntrySetCustomFieldActionImpl(name, value);
    }

    /**
     * factory method for an instance of InventoryEntrySetCustomFieldActionBuilder
     * @return builder 
     */
    public static InventoryEntrySetCustomFieldActionBuilder of() {
        return new InventoryEntrySetCustomFieldActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetCustomFieldActionBuilder of(final InventoryEntrySetCustomFieldAction template) {
        InventoryEntrySetCustomFieldActionBuilder builder = new InventoryEntrySetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
