
package com.commercetools.ml.models.image_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Response format from image search endpoint.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImageSearchResponse imageSearchResponse = ImageSearchResponse.builder()
 *             .count(0.3)
 *             .offset(0.3)
 *             .total(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImageSearchResponseImpl.class)
public interface ImageSearchResponse {

    /**
     *  <p>The maximum number of results to return from a query.</p>
     * @return count
     */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    @NotNull
    @JsonProperty("offset")
    public Double getOffset();

    /**
     *  <p>The total number of product images that were have been analyzed.</p>
     * @return total
     */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @return results
     */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ResultItem> getResults();

    /**
     *  <p>The maximum number of results to return from a query.</p>
     * @param count value to be set
     */

    public void setCount(final Integer count);

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     */

    public void setOffset(final Double offset);

    /**
     *  <p>The total number of product images that were have been analyzed.</p>
     * @param total value to be set
     */

    public void setTotal(final Integer total);

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param results values to be set
     */

    @JsonIgnore
    public void setResults(final ResultItem... results);

    /**
     *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
     * @param results values to be set
     */

    public void setResults(final List<ResultItem> results);

    /**
     * factory method
     * @return instance of ImageSearchResponse
     */
    public static ImageSearchResponse of() {
        return new ImageSearchResponseImpl();
    }

    /**
     * factory method to create a shallow copy ImageSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    public static ImageSearchResponse of(final ImageSearchResponse template) {
        ImageSearchResponseImpl instance = new ImageSearchResponseImpl();
        instance.setCount(template.getCount());
        instance.setOffset(template.getOffset());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    /**
     * factory method to create a deep copy of ImageSearchResponse
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ImageSearchResponse deepCopy(@Nullable final ImageSearchResponse template) {
        if (template == null) {
            return null;
        }
        ImageSearchResponseImpl instance = new ImageSearchResponseImpl();
        instance.setCount(template.getCount());
        instance.setOffset(template.getOffset());
        instance.setTotal(template.getTotal());
        instance.setResults(Optional.ofNullable(template.getResults())
                .map(t -> t.stream()
                        .map(com.commercetools.ml.models.image_search.ResultItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ImageSearchResponse
     * @return builder
     */
    public static ImageSearchResponseBuilder builder() {
        return ImageSearchResponseBuilder.of();
    }

    /**
     * create builder for ImageSearchResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImageSearchResponseBuilder builder(final ImageSearchResponse template) {
        return ImageSearchResponseBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withImageSearchResponse(Function<ImageSearchResponse, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ImageSearchResponse> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImageSearchResponse>() {
            @Override
            public String toString() {
                return "TypeReference<ImageSearchResponse>";
            }
        };
    }
}
