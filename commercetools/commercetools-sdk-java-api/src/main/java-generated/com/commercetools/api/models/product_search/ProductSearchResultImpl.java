
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

    private com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants;

    private com.commercetools.api.models.product.ProductProjection productProjection;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchResultImpl(@JsonProperty("id") final String id,
            @JsonProperty("matchingVariants") final com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants,
            @JsonProperty("productProjection") final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.id = id;
        this.matchingVariants = matchingVariants;
        this.productProjection = productProjection;
    }

    /**
     * create empty instance
     */
    public ProductSearchResultImpl() {
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that matches the search query.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Information about which Product Variants match the search query. Only present if <code>markMatchingVariants</code> is set to <code>true</code> in the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSearchRequest" rel="nofollow">ProductSearchRequest</a>.</p>
     */

    public com.commercetools.api.models.product_search.ProductSearchMatchingVariants getMatchingVariants() {
        return this.matchingVariants;
    }

    /**
     *  <p>Projected data of the Product with <code>id</code>. Only present if data integration <span>with Product Projection parameters</span> is requested.</p>
     */

    public com.commercetools.api.models.product.ProductProjection getProductProjection() {
        return this.productProjection;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setMatchingVariants(
            final com.commercetools.api.models.product_search.ProductSearchMatchingVariants matchingVariants) {
        this.matchingVariants = matchingVariants;
    }

    public void setProductProjection(final com.commercetools.api.models.product.ProductProjection productProjection) {
        this.productProjection = productProjection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchResultImpl that = (ProductSearchResultImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(matchingVariants, that.matchingVariants)
                .append(productProjection, that.productProjection)
                .append(id, that.id)
                .append(matchingVariants, that.matchingVariants)
                .append(productProjection, that.productProjection)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(matchingVariants).append(productProjection).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("matchingVariants", matchingVariants)
                .append("productProjection", productProjection)
                .build();
    }

    @Override
    public ProductSearchResult copyDeep() {
        return ProductSearchResult.deepCopy(this);
    }
}
