package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.inventories.InventoryImport;
import com.commercetools.importapi.models.importrequests.InventoryImportRequest;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryImportRequest inventoryImportRequest = InventoryImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class InventoryImportRequestBuilder implements Builder<InventoryImportRequest> {

    
    
    private java.util.List<com.commercetools.importapi.models.inventories.InventoryImport> resources;

    /**
     *  <p>The inventory import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public InventoryImportRequestBuilder resources( final com.commercetools.importapi.models.inventories.InventoryImport ...resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }
    
    /**
     *  <p>The inventory import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public InventoryImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.inventories.InventoryImport> resources) {
        this.resources = resources;
        return this;
    }
    
    /**
     *  <p>The inventory import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public InventoryImportRequestBuilder plusResources( final com.commercetools.importapi.models.inventories.InventoryImport ...resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }
    
    
    
    /**
     *  <p>The inventory import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public InventoryImportRequestBuilder plusResources(Function<com.commercetools.importapi.models.inventories.InventoryImportBuilder, com.commercetools.importapi.models.inventories.InventoryImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(builder.apply(com.commercetools.importapi.models.inventories.InventoryImportBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The inventory import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public InventoryImportRequestBuilder withResources(Function<com.commercetools.importapi.models.inventories.InventoryImportBuilder, com.commercetools.importapi.models.inventories.InventoryImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(builder.apply(com.commercetools.importapi.models.inventories.InventoryImportBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The inventory import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public InventoryImportRequestBuilder addResources(Function<com.commercetools.importapi.models.inventories.InventoryImportBuilder, com.commercetools.importapi.models.inventories.InventoryImport> builder) {
        return plusResources(builder.apply(com.commercetools.importapi.models.inventories.InventoryImportBuilder.of()));
    }
    
    /**
     *  <p>The inventory import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public InventoryImportRequestBuilder setResources(Function<com.commercetools.importapi.models.inventories.InventoryImportBuilder, com.commercetools.importapi.models.inventories.InventoryImport> builder) {
        return resources(builder.apply(com.commercetools.importapi.models.inventories.InventoryImportBuilder.of()));
    }
                    

    /**
     *  <p>The inventory import resources of this request.</p>
     * @return resources
     */
    
    
    public java.util.List<com.commercetools.importapi.models.inventories.InventoryImport> getResources(){
        return this.resources;
    }

    /**
     * builds InventoryImportRequest with checking for non-null required values
     * @return InventoryImportRequest
     */
    public InventoryImportRequest build() {
        Objects.requireNonNull(resources, InventoryImportRequest.class + ": resources is missing");
        return new InventoryImportRequestImpl(resources);
    }
    
    /**
     * builds InventoryImportRequest without checking for non-null required values
     * @return InventoryImportRequest
     */
    public InventoryImportRequest buildUnchecked() {
        return new InventoryImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of InventoryImportRequestBuilder
     * @return builder 
     */
    public static InventoryImportRequestBuilder of() {
        return new InventoryImportRequestBuilder();
    }

    /**
     * create builder for InventoryImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryImportRequestBuilder of(final InventoryImportRequest template) {
        InventoryImportRequestBuilder builder = new InventoryImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
