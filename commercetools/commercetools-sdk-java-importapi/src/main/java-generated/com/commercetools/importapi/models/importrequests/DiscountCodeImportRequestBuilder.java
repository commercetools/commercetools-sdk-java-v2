
package com.commercetools.importapi.models.importrequests;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeImportRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeImportRequest discountCodeImportRequest = DiscountCodeImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeImportRequestBuilder implements Builder<DiscountCodeImportRequest> {

    private java.util.List<com.commercetools.importapi.models.discount_codes.DiscountCodeImport> resources;

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public DiscountCodeImportRequestBuilder resources(
            final com.commercetools.importapi.models.discount_codes.DiscountCodeImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public DiscountCodeImportRequestBuilder resources(
            final java.util.List<com.commercetools.importapi.models.discount_codes.DiscountCodeImport> resources) {
        this.resources = resources;
        return this;
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param resources value to be set
     * @return Builder
     */

    public DiscountCodeImportRequestBuilder plusResources(
            final com.commercetools.importapi.models.discount_codes.DiscountCodeImport... resources) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.addAll(Arrays.asList(resources));
        return this;
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public DiscountCodeImportRequestBuilder plusResources(
            Function<com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder, com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder> builder) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public DiscountCodeImportRequestBuilder withResources(
            Function<com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder, com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder> builder) {
        this.resources = new ArrayList<>();
        this.resources.add(
            builder.apply(com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public DiscountCodeImportRequestBuilder addResources(
            Function<com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder, com.commercetools.importapi.models.discount_codes.DiscountCodeImport> builder) {
        return plusResources(
            builder.apply(com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder.of()));
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param builder function to build the resources value
     * @return Builder
     */

    public DiscountCodeImportRequestBuilder setResources(
            Function<com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder, com.commercetools.importapi.models.discount_codes.DiscountCodeImport> builder) {
        return resources(
            builder.apply(com.commercetools.importapi.models.discount_codes.DiscountCodeImportBuilder.of()));
    }

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @return resources
     */

    public java.util.List<com.commercetools.importapi.models.discount_codes.DiscountCodeImport> getResources() {
        return this.resources;
    }

    /**
     * builds DiscountCodeImportRequest with checking for non-null required values
     * @return DiscountCodeImportRequest
     */
    public DiscountCodeImportRequest build() {
        Objects.requireNonNull(resources, DiscountCodeImportRequest.class + ": resources is missing");
        return new DiscountCodeImportRequestImpl(resources);
    }

    /**
     * builds DiscountCodeImportRequest without checking for non-null required values
     * @return DiscountCodeImportRequest
     */
    public DiscountCodeImportRequest buildUnchecked() {
        return new DiscountCodeImportRequestImpl(resources);
    }

    /**
     * factory method for an instance of DiscountCodeImportRequestBuilder
     * @return builder
     */
    public static DiscountCodeImportRequestBuilder of() {
        return new DiscountCodeImportRequestBuilder();
    }

    /**
     * create builder for DiscountCodeImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeImportRequestBuilder of(final DiscountCodeImportRequest template) {
        DiscountCodeImportRequestBuilder builder = new DiscountCodeImportRequestBuilder();
        builder.resources = template.getResources();
        return builder;
    }

}
