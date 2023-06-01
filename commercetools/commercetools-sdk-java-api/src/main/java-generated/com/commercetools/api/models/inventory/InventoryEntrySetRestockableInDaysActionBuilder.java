package com.commercetools.api.models.inventory;

import com.commercetools.api.models.inventory.InventoryEntryUpdateAction;
import com.commercetools.api.models.inventory.InventoryEntrySetRestockableInDaysAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetRestockableInDaysActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetRestockableInDaysAction inventoryEntrySetRestockableInDaysAction = InventoryEntrySetRestockableInDaysAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InventoryEntrySetRestockableInDaysActionBuilder implements Builder<InventoryEntrySetRestockableInDaysAction> {

    
    @Nullable
    private Long restockableInDays;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param restockableInDays value to be set
     * @return Builder
     */
    
    public InventoryEntrySetRestockableInDaysActionBuilder restockableInDays(@Nullable final Long restockableInDays) {
        this.restockableInDays = restockableInDays;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return restockableInDays
     */
    
    @Nullable
    public Long getRestockableInDays(){
        return this.restockableInDays;
    }

    /**
     * builds InventoryEntrySetRestockableInDaysAction with checking for non-null required values
     * @return InventoryEntrySetRestockableInDaysAction
     */
    public InventoryEntrySetRestockableInDaysAction build() {
        return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
    }
    
    /**
     * builds InventoryEntrySetRestockableInDaysAction without checking for non-null required values
     * @return InventoryEntrySetRestockableInDaysAction
     */
    public InventoryEntrySetRestockableInDaysAction buildUnchecked() {
        return new InventoryEntrySetRestockableInDaysActionImpl(restockableInDays);
    }

    /**
     * factory method for an instance of InventoryEntrySetRestockableInDaysActionBuilder
     * @return builder 
     */
    public static InventoryEntrySetRestockableInDaysActionBuilder of() {
        return new InventoryEntrySetRestockableInDaysActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetRestockableInDaysAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetRestockableInDaysActionBuilder of(final InventoryEntrySetRestockableInDaysAction template) {
        InventoryEntrySetRestockableInDaysActionBuilder builder = new InventoryEntrySetRestockableInDaysActionBuilder();
        builder.restockableInDays = template.getRestockableInDays();
        return builder;
    }

}
