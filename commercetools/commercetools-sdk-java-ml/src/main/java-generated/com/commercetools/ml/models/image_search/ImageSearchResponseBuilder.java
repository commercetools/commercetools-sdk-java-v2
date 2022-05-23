
package com.commercetools.ml.models.image_search;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ImageSearchResponse imageSearchResponse = ImageSearchResponse.builder()
           .count(0.3)
           .offset(0.3)
           .total(0.3)
           .plusResults(resultsBuilder -> resultsBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ImageSearchResponseBuilder implements Builder<ImageSearchResponse> {

    private Integer count;

    private Double offset;

    private Integer total;

    private java.util.List<com.commercetools.ml.models.image_search.ResultItem> results;

    /**
     *  <p>The maximum number of results to return from a query.</p>
     */

    public ImageSearchResponseBuilder count(final Integer count) {
        this.count = count;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     */

    public ImageSearchResponseBuilder offset(final Double offset) {
        this.offset = offset;
        return this;
    }

    /**
     *  <p>The total number of product images that were have been analyzed.</p>
     */

    public ImageSearchResponseBuilder total(final Integer total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     */

    public ImageSearchResponseBuilder results(final com.commercetools.ml.models.image_search.ResultItem... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     */

    public ImageSearchResponseBuilder results(
            final java.util.List<com.commercetools.ml.models.image_search.ResultItem> results) {
        this.results = results;
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     */

    public ImageSearchResponseBuilder plusResults(
            final com.commercetools.ml.models.image_search.ResultItem... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     */

    public ImageSearchResponseBuilder plusResults(
            Function<com.commercetools.ml.models.image_search.ResultItemBuilder, com.commercetools.ml.models.image_search.ResultItemBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.ml.models.image_search.ResultItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     */

    public ImageSearchResponseBuilder withResults(
            Function<com.commercetools.ml.models.image_search.ResultItemBuilder, com.commercetools.ml.models.image_search.ResultItemBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.ml.models.image_search.ResultItemBuilder.of()).build());
        return this;
    }

    public Integer getCount() {
        return this.count;
    }

    public Double getOffset() {
        return this.offset;
    }

    public Integer getTotal() {
        return this.total;
    }

    public java.util.List<com.commercetools.ml.models.image_search.ResultItem> getResults() {
        return this.results;
    }

    public ImageSearchResponse build() {
        Objects.requireNonNull(count, ImageSearchResponse.class + ": count is missing");
        Objects.requireNonNull(offset, ImageSearchResponse.class + ": offset is missing");
        Objects.requireNonNull(total, ImageSearchResponse.class + ": total is missing");
        Objects.requireNonNull(results, ImageSearchResponse.class + ": results is missing");
        return new ImageSearchResponseImpl(count, offset, total, results);
    }

    /**
     * builds ImageSearchResponse without checking for non null required values
     */
    public ImageSearchResponse buildUnchecked() {
        return new ImageSearchResponseImpl(count, offset, total, results);
    }

    public static ImageSearchResponseBuilder of() {
        return new ImageSearchResponseBuilder();
    }

    public static ImageSearchResponseBuilder of(final ImageSearchResponse template) {
        ImageSearchResponseBuilder builder = new ImageSearchResponseBuilder();
        builder.count = template.getCount();
        builder.offset = template.getOffset();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
