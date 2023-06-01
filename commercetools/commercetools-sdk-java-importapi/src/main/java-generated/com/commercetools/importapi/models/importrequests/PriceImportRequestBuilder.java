package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.prices.PriceImport;
import com.commercetools.importapi.models.importrequests.PriceImportRequest;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceImportRequest priceImportRequest = PriceImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PriceImportRequestBuilder implements Builder<PriceImportRequest> {

    
    
    private java.util.List<com.commercetools.importapi.models.prices.PriceImport> resources;

    /**
     *  <p>The price import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public PriceImportRequestBuilder resources( final com.commercetools.importapi.models.prices.PriceImport ...resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }
    
    /**
     *  <p>The price import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public PriceImportRequestBuilder resources( final java.util.List<com.commercetools.importapi.models.prices.PriceImport> resources) {
        this.resources = resources;
        return this;
    }
    
    /**
     *  <p>The price import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */
    
    public PriceImportRequestBuilder plusResources( final com.commercetools.importapi.models.prices.PriceImport ...resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }
    
    
    
    /**
     *  <p>The price import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public PriceImportRequestBuilder plusResources(Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The price import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public PriceImportRequestBuilder withResources(Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The price import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public PriceImportRequestBuilder addResources(Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImport> builder) {
        return plusResources(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()));
    }
    
    /**
     *  <p>The price import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */
    
    public PriceImportRequestBuilder setResources(Function<com.commercetools.importapi.models.prices.PriceImportBuilder, com.commercetools.importapi.models.prices.PriceImport> builder) {
        return resources(builder.apply(com.commercetools.importapi.models.prices.PriceImportBuilder.of()));
    }
                    

    /**
     *  <p>The price import resources of this request.</p>
     * @return resources
     */
    
    
    public java.util.List<com.commercetools.importapi.models.prices.PriceImport> getResources(){
        return this.resources;
    }

    /**
     * builds PriceImportRequest with checking for non-null required values
     * @return PriceImportRequest
     */
    public PriceImportRequest build() {
        Objects.requireNonNull(resources, PriceImportRequest.class + ": resources is missing");
        return new PriceImportRequestImpl(resources);
    }
    
    /**
     * builds PriceImportRequest without checking for non-null required values
     * @return PriceImportRequest
     */
    public PriceImportRequest buildUnchecked() {
        return new PriceImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of PriceImportRequestBuilder
     * @return builder 
     */
    public static PriceImportRequestBuilder of() {
        return new PriceImportRequestBuilder();
    }

    /**
     * create builder for PriceImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceImportRequestBuilder of(final PriceImportRequest template) {
        PriceImportRequestBuilder builder = new PriceImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
