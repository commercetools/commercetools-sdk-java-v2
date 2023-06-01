package com.commercetools.api.models.inventory;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.inventory.InventoryEntry;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryReferenceBuilder
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InventoryEntryReferenceBuilder implements Builder<InventoryEntryReference> {

    
    
    private String id;
    
    
    @Nullable
    private com.commercetools.api.models.inventory.InventoryEntry obj;

    
    /**
     *  <p>Unique identifier of the referenced InventoryEntry.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public InventoryEntryReferenceBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public InventoryEntryReferenceBuilder obj(Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntryBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     * @param builder function to build the obj value
     * @return Builder
     */
    
    public InventoryEntryReferenceBuilder withObj(Function<com.commercetools.api.models.inventory.InventoryEntryBuilder, com.commercetools.api.models.inventory.InventoryEntry> builder) {
        this.obj = builder.apply(com.commercetools.api.models.inventory.InventoryEntryBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     * @param obj value to be set
     * @return Builder
     */
    
    public InventoryEntryReferenceBuilder obj(@Nullable final com.commercetools.api.models.inventory.InventoryEntry obj) {
        this.obj = obj;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the referenced InventoryEntry.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Contains the representation of the expanded InventoryEntry. Only present in responses to requests with Reference Expansion for InventoryEntries.</p>
     * @return obj
     */
    
    @Nullable
    public com.commercetools.api.models.inventory.InventoryEntry getObj(){
        return this.obj;
    }

    /**
     * builds InventoryEntryReference with checking for non-null required values
     * @return InventoryEntryReference
     */
    public InventoryEntryReference build() {
        Objects.requireNonNull(id, InventoryEntryReference.class + ": id is missing");
        return new InventoryEntryReferenceImpl(id, obj);
    }
    
    /**
     * builds InventoryEntryReference without checking for non-null required values
     * @return InventoryEntryReference
     */
    public InventoryEntryReference buildUnchecked() {
        return new InventoryEntryReferenceImpl(id, obj);
    }

    /**
     * factory method for an instance of InventoryEntryReferenceBuilder
     * @return builder 
     */
    public static InventoryEntryReferenceBuilder of() {
        return new InventoryEntryReferenceBuilder();
    }

    /**
     * create builder for InventoryEntryReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryReferenceBuilder of(final InventoryEntryReference template) {
        InventoryEntryReferenceBuilder builder = new InventoryEntryReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
