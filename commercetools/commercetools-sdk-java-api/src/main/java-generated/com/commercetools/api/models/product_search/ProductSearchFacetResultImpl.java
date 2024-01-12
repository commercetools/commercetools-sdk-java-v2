
package com.commercetools.api.models.product_search;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProductSearchFacetResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchFacetResultImpl implements ProductSearchFacetResult, ModelBase {

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> results;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchFacetResultImpl(
            @JsonProperty("results") final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> results) {
        this.results = results;
    }

    /**
     * create empty instance
     */
    public ProductSearchFacetResultImpl() {
    }

    /**
     *  <p>Results of the facets.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> getResults() {
        return this.results;
    }

    public void setResults(
            final com.commercetools.api.models.product_search.ProductSearchFacetResultExpression... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
    }

    public void setResults(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchFacetResultExpression> results) {
        this.results = results;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchFacetResultImpl that = (ProductSearchFacetResultImpl) o;

        return new EqualsBuilder().append(results, that.results).append(results, that.results).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(results).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("results", results).build();
    }

}
