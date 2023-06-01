package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.producttypes.ProductTypeImport;
import com.commercetools.importapi.models.importrequests.ProductTypeImportRequest;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeImportRequest productTypeImportRequest = ProductTypeImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeImportRequestBuilder implements Builder<ProductTypeImportRequest> {

    
    
    private java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources;

    /**
     *  <p>The product type import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public ProductTypeImportRequestBuilder resources( final com.commercetools.importapi.models.producttypes.ProductTypeImport ...resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }
    
    /**
     *  <p>The product type import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public ProductTypeImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> resources) {
        this.resources = resources;
        return this;
    }
    
    /**
     *  <p>The product type import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public ProductTypeImportRequestBuilder plusResources( final com.commercetools.importapi.models.producttypes.ProductTypeImport ...resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }
    
    
    
    /**
     *  <p>The product type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public ProductTypeImportRequestBuilder plusResources(Function<com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder, com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(builder.apply(com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The product type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public ProductTypeImportRequestBuilder withResources(Function<com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder, com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(builder.apply(com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The product type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public ProductTypeImportRequestBuilder addResources(Function<com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder, com.commercetools.importapi.models.producttypes.ProductTypeImport> builder) {
        return plusResources(builder.apply(com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder.of()));
    }
    
    /**
     *  <p>The product type import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public ProductTypeImportRequestBuilder setResources(Function<com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder, com.commercetools.importapi.models.producttypes.ProductTypeImport> builder) {
        return resources(builder.apply(com.commercetools.importapi.models.producttypes.ProductTypeImportBuilder.of()));
    }
                    

    /**
     *  <p>The product type import resources of this request.</p>
     * @return resources
     */
    
    
    public java.util.List<com.commercetools.importapi.models.producttypes.ProductTypeImport> getResources(){
        return this.resources;
    }

    /**
     * builds ProductTypeImportRequest with checking for non-null required values
     * @return ProductTypeImportRequest
     */
    public ProductTypeImportRequest build() {
        Objects.requireNonNull(resources, ProductTypeImportRequest.class + ": resources is missing");
        return new ProductTypeImportRequestImpl(resources);
    }
    
    /**
     * builds ProductTypeImportRequest without checking for non-null required values
     * @return ProductTypeImportRequest
     */
    public ProductTypeImportRequest buildUnchecked() {
        return new ProductTypeImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of ProductTypeImportRequestBuilder
     * @return builder 
     */
    public static ProductTypeImportRequestBuilder of() {
        return new ProductTypeImportRequestBuilder();
    }

    /**
     * create builder for ProductTypeImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeImportRequestBuilder of(final ProductTypeImportRequest template) {
        ProductTypeImportRequestBuilder builder = new ProductTypeImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
