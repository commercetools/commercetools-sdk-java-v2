
package com.commercetools.ml.models.image_search;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Response format from image search endpoint.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImageSearchResponseImpl.class)
public interface ImageSearchResponse {

    /**
    *  <p>The maximum number of results to return from a query.</p>
    */
    @NotNull
    @JsonProperty("count")
    public Integer getCount();

    /**
    *  <p>The offset into the results matching the query. An offset of 0 is the default value indicating that no results should be skipped.</p>
    */
    @NotNull
    @JsonProperty("offset")
    public Double getOffset();

    /**
    *  <p>The total number of product images that were have been analyzed.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Integer getTotal();

    /**
    *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("results")
    public List<ResultItem> getResults();

    public void setCount(final Integer count);

    public void setOffset(final Double offset);

    public void setTotal(final Integer total);

    @JsonIgnore
    public void setResults(final ResultItem... results);

    public void setResults(final List<ResultItem> results);

    public static ImageSearchResponse of() {
        return new ImageSearchResponseImpl();
    }

    public static ImageSearchResponse of(final ImageSearchResponse template) {
        ImageSearchResponseImpl instance = new ImageSearchResponseImpl();
        instance.setCount(template.getCount());
        instance.setOffset(template.getOffset());
        instance.setTotal(template.getTotal());
        instance.setResults(template.getResults());
        return instance;
    }

    public static ImageSearchResponseBuilder builder() {
        return ImageSearchResponseBuilder.of();
    }

    public static ImageSearchResponseBuilder builder(final ImageSearchResponse template) {
        return ImageSearchResponseBuilder.of(template);
    }

    default <T> T withImageSearchResponse(Function<ImageSearchResponse, T> helper) {
        return helper.apply(this);
    }
}
