
package com.commercetools.ml.models.missing_data;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingImagesSearchRequestBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingImagesSearchRequest missingImagesSearchRequest = MissingImagesSearchRequest.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class MissingImagesSearchRequestBuilder implements Builder<MissingImagesSearchRequest> {

    @Nullable
    private Long limit;

    @Nullable
    private Long offset;

    @Nullable
    private Boolean staged;

    @Nullable
    private Long productSetLimit;

    @Nullable
    private Boolean includeVariants;

    @Nullable
    private Boolean autoThreshold;

    @Nullable
    private Long threshold;

    @Nullable
    private java.util.List<String> productIds;

    @Nullable
    private java.util.List<String> productTypeIds;

    /**
     *  <p>Number of results requested.</p>
     */

    public MissingImagesSearchRequestBuilder limit(@Nullable final Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public MissingImagesSearchRequestBuilder offset(@Nullable final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>If true, searches data from staged products in addition to published products.</p>
     */

    public MissingImagesSearchRequestBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Maximum number of products to scan.</p>
     */

    public MissingImagesSearchRequestBuilder productSetLimit(@Nullable final Long productSetLimit) {
        this.productSetLimit = productSetLimit;
        return this;
    }

    /**
     *  <p>If true, searches all product variants. If false, only searches master variants.</p>
     */

    public MissingImagesSearchRequestBuilder includeVariants(@Nullable final Boolean includeVariants) {
        this.includeVariants = includeVariants;
        return this;
    }

    /**
     *  <p>If true, uses the median number of images per product variant as a threshold value.</p>
     */

    public MissingImagesSearchRequestBuilder autoThreshold(@Nullable final Boolean autoThreshold) {
        this.autoThreshold = autoThreshold;
        return this;
    }

    /**
     *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
     */

    public MissingImagesSearchRequestBuilder threshold(@Nullable final Long threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingImagesSearchRequestBuilder productIds(@Nullable final String... productIds) {
        this.productIds = new ArrayList<>(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingImagesSearchRequestBuilder productIds(@Nullable final java.util.List<String> productIds) {
        this.productIds = productIds;
        return this;
    }

    /**
     *  <p>Filters results by the provided Product IDs. Cannot be applied in combination with any other filter.</p>
     */

    public MissingImagesSearchRequestBuilder plusProductIds(@Nullable final String... productIds) {
        if (this.productIds == null) {
            this.productIds = new ArrayList<>();
        }
        this.productIds.addAll(Arrays.asList(productIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. It cannot be applied in combination with any other filter.</p>
     */

    public MissingImagesSearchRequestBuilder productTypeIds(@Nullable final String... productTypeIds) {
        this.productTypeIds = new ArrayList<>(Arrays.asList(productTypeIds));
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. It cannot be applied in combination with any other filter.</p>
     */

    public MissingImagesSearchRequestBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
        this.productTypeIds = productTypeIds;
        return this;
    }

    /**
     *  <p>Filters results by the provided product type IDs. It cannot be applied in combination with any other filter.</p>
     */

    public MissingImagesSearchRequestBuilder plusProductTypeIds(@Nullable final String... productTypeIds) {
        if (this.productTypeIds == null) {
            this.productTypeIds = new ArrayList<>();
        }
        this.productTypeIds.addAll(Arrays.asList(productTypeIds));
        return this;
    }

    @Nullable
    public Long getLimit() {
        return this.limit;
    }

    @Nullable
    public Long getOffset() {
        return this.offset;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public Long getProductSetLimit() {
        return this.productSetLimit;
    }

    @Nullable
    public Boolean getIncludeVariants() {
        return this.includeVariants;
    }

    @Nullable
    public Boolean getAutoThreshold() {
        return this.autoThreshold;
    }

    @Nullable
    public Long getThreshold() {
        return this.threshold;
    }

    @Nullable
    public java.util.List<String> getProductIds() {
        return this.productIds;
    }

    @Nullable
    public java.util.List<String> getProductTypeIds() {
        return this.productTypeIds;
    }

    public MissingImagesSearchRequest build() {
        return new MissingImagesSearchRequestImpl(limit, offset, staged, productSetLimit, includeVariants,
            autoThreshold, threshold, productIds, productTypeIds);
    }

    /**
     * builds MissingImagesSearchRequest without checking for non null required values
     */
    public MissingImagesSearchRequest buildUnchecked() {
        return new MissingImagesSearchRequestImpl(limit, offset, staged, productSetLimit, includeVariants,
            autoThreshold, threshold, productIds, productTypeIds);
    }

    public static MissingImagesSearchRequestBuilder of() {
        return new MissingImagesSearchRequestBuilder();
    }

    public static MissingImagesSearchRequestBuilder of(final MissingImagesSearchRequest template) {
        MissingImagesSearchRequestBuilder builder = new MissingImagesSearchRequestBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.staged = template.getStaged();
        builder.productSetLimit = template.getProductSetLimit();
        builder.includeVariants = template.getIncludeVariants();
        builder.autoThreshold = template.getAutoThreshold();
        builder.threshold = template.getThreshold();
        builder.productIds = template.getProductIds();
        builder.productTypeIds = template.getProductTypeIds();
        return builder;
    }

}
