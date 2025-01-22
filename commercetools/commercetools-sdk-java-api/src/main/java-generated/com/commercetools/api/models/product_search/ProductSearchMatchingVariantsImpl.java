
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
 * ProductSearchMatchingVariants
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSearchMatchingVariantsImpl implements ProductSearchMatchingVariants, ModelBase {

    private Boolean allMatched;

    private java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> matchedVariants;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSearchMatchingVariantsImpl(@JsonProperty("allMatched") final Boolean allMatched,
            @JsonProperty("matchedVariants") final java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> matchedVariants) {
        this.allMatched = allMatched;
        this.matchedVariants = matchedVariants;
    }

    /**
     * create empty instance
     */
    public ProductSearchMatchingVariantsImpl() {
    }

    /**
     *  <p><code>true</code> if all Variants of the returned Product match the search query, or if search query does not specify any expression for a Product Variant field.</p>
     *  <p><code>false</code> if only a subset of the Product Variants match the search query.</p>
     *  <p>Is always <code>false</code> for query expressions on Product Variant fields.</p>
     */

    public Boolean getAllMatched() {
        return this.allMatched;
    }

    /**
     *  <p>Identifiers of the Product Variants that match the search query.</p>
     *  <p>Empty if all Product Variants of the returned Product match.</p>
     */

    public java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> getMatchedVariants() {
        return this.matchedVariants;
    }

    public void setAllMatched(final Boolean allMatched) {
        this.allMatched = allMatched;
    }

    public void setMatchedVariants(
            final com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry... matchedVariants) {
        this.matchedVariants = new ArrayList<>(Arrays.asList(matchedVariants));
    }

    public void setMatchedVariants(
            final java.util.List<com.commercetools.api.models.product_search.ProductSearchMatchingVariantEntry> matchedVariants) {
        this.matchedVariants = matchedVariants;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSearchMatchingVariantsImpl that = (ProductSearchMatchingVariantsImpl) o;

        return new EqualsBuilder().append(allMatched, that.allMatched)
                .append(matchedVariants, that.matchedVariants)
                .append(allMatched, that.allMatched)
                .append(matchedVariants, that.matchedVariants)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(allMatched).append(matchedVariants).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("allMatched", allMatched)
                .append("matchedVariants", matchedVariants)
                .build();
    }

}
