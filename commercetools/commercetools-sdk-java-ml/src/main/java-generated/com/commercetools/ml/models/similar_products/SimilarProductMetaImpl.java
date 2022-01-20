
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SimilarProductMetaImpl implements SimilarProductMeta, ModelBase {

    private com.commercetools.ml.models.common.LocalizedString name;

    private com.commercetools.ml.models.common.LocalizedString description;

    private com.commercetools.ml.models.common.Money price;

    private Long variantCount;

    @JsonCreator
    SimilarProductMetaImpl(@JsonProperty("name") final com.commercetools.ml.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.ml.models.common.LocalizedString description,
            @JsonProperty("price") final com.commercetools.ml.models.common.Money price,
            @JsonProperty("variantCount") final Long variantCount) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.variantCount = variantCount;
    }

    public SimilarProductMetaImpl() {
    }

    /**
    *  <p>Localized product name used for similarity estimation.</p>
    */
    public com.commercetools.ml.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
    *  <p>Localized product description used for similarity estimation.</p>
    */
    public com.commercetools.ml.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
    *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
    */
    public com.commercetools.ml.models.common.Money getPrice() {
        return this.price;
    }

    /**
    *  <p>Total number of variants associated with the product.</p>
    */
    public Long getVariantCount() {
        return this.variantCount;
    }

    public void setName(final com.commercetools.ml.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.ml.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setPrice(final com.commercetools.ml.models.common.Money price) {
        this.price = price;
    }

    public void setVariantCount(final Long variantCount) {
        this.variantCount = variantCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SimilarProductMetaImpl that = (SimilarProductMetaImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(price, that.price)
                .append(variantCount, that.variantCount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(description)
                .append(price)
                .append(variantCount)
                .toHashCode();
    }

}
