
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceImportRequest standalonePriceImportRequest = StandalonePriceImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceImportRequestBuilder implements Builder<StandalonePriceImportRequest> {

    private java.util.List<com.commercetools.importapi.models.standalone_prices.StandalonePriceImport> resources;

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     */

    public StandalonePriceImportRequestBuilder resources(
            final com.commercetools.importapi.models.standalone_prices.StandalonePriceImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     */

    public StandalonePriceImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.standalone_prices.StandalonePriceImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     */

    public StandalonePriceImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.standalone_prices.StandalonePriceImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     */

    public StandalonePriceImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.standalone_prices.StandalonePriceImportBuilder, com.commercetools.importapi.models.standalone_prices.StandalonePriceImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.standalone_prices.StandalonePriceImportBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     */

    public StandalonePriceImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.standalone_prices.StandalonePriceImportBuilder, com.commercetools.importapi.models.standalone_prices.StandalonePriceImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.standalone_prices.StandalonePriceImportBuilder.of())
                    .build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.standalone_prices.StandalonePriceImport> getResources() {
        return this.resources;
    }

    public StandalonePriceImportRequest build() {
        Objects.requireNonNull(resources, StandalonePriceImportRequest.class + ": resources is missing");
        return new StandalonePriceImportRequestImpl(resources);
    }

    /**
     * builds StandalonePriceImportRequest without checking for non null required values
     */
    public StandalonePriceImportRequest buildUnchecked() {
        return new StandalonePriceImportRequestImpl(resources);
    }

    public static StandalonePriceImportRequestBuilder of() {
        return new StandalonePriceImportRequestBuilder();
    }

    public static StandalonePriceImportRequestBuilder of(final StandalonePriceImportRequest template) {
        StandalonePriceImportRequestBuilder builder = new StandalonePriceImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
