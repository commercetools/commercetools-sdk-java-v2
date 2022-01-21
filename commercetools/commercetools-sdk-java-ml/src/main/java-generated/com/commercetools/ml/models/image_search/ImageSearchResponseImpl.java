
package com.commercetools.ml.models.image_search;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Response format from image search endpoint.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ImageSearchResponseImpl implements ImageSearchResponse, ModelBase {

    private Integer count;

    private Double offset;

    private Integer total;

    private java.util.List<com.commercetools.ml.models.image_search.ResultItem> results;

    @JsonCreator
    ImageSearchResponseImpl(@JsonProperty("count") final Integer count, @JsonProperty("offset") final Double offset,
            @JsonProperty("total") final Integer total,
            @JsonProperty("results") final java.util.List<com.commercetools.ml.models.image_search.ResultItem> results) {
        this.count = count;
        this.offset = offset;
        this.total = total;
        this.results = results;
    }

    public ImageSearchResponseImpl() {
    }

    /**
    *  <p>The maximum number of results to return from a query.</p>
    */
    public Integer getCount() {
        return this.count;
    }

    /**
    *  <p>The offset into the results matching the query. An offset of 0 is the default value indicating that no results should be skipped.</p>
    */
    public Double getOffset() {
        return this.offset;
    }

    /**
    *  <p>The total number of product images that were have been analyzed.</p>
    */
    public Integer getTotal() {
        return this.total;
    }

    /**
    *  <p>An array of image URLs of images that are similar to the query image. If no matching images are found, results is empty.</p>
    */
    public java.util.List<com.commercetools.ml.models.image_search.ResultItem> getResults() {
        return this.results;
    }

    public void setCount(final Integer count) {
        this.count = count;
    }

    public void setOffset(final Double offset) {
        this.offset = offset;
    }

    public void setTotal(final Integer total) {
        this.total = total;
    }

    public void setResults(final com.commercetools.ml.models.image_search.ResultItem... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(final java.util.List<com.commercetools.ml.models.image_search.ResultItem> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ImageSearchResponseImpl that = (ImageSearchResponseImpl) o;

        return new EqualsBuilder().append(count, that.count)
                .append(offset, that.offset)
                .append(total, that.total)
                .append(results, that.results)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(count).append(offset).append(total).append(results).toHashCode();
    }

}
