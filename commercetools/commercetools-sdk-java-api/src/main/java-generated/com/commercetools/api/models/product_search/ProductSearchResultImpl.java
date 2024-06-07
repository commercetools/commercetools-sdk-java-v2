
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
 * ProductSearchResult
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchResultImpl implements ProductSearchResult, ModelBase {

    private String id;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    private com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchResultImpl(@JsonProperty("id") final String id,
            @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection,
            @JsonProperty("matchingVariants") final com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants) {
        this.id = id;
        this.productProjection = productProjection;
        this.matchingVariants = matchingVariants;
    }

    /**
     * create empty instance
     */
    public ProductSearchResultImpl() {
    }

    /**
     *  <p>Unique identifier of the Product.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains Product Projection data for Products matching the <code>projection</code> field in the Search Products request.</p>
     */

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    /**
     *  <p>Describes the variants that matched the search criteria.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchMatchingVariants getMatchingVariants() {
        return this.matchingVariants;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
    }

    public void setMatchingVariants(
            final com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants) {
        this.matchingVariants = matchingVariants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchResultImpl that = (ProductSearchResultImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(productProjection, that.productProjection)
                .append(matchingVariants, that.matchingVariants)
                .append(id, that.id)
                .append(productProjection, that.productProjection)
                .append(matchingVariants, that.matchingVariants)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(productProjection).append(matchingVariants).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("productProjection", productProjection)
                .append("matchingVariants", matchingVariants)
                .build();
    }

}
