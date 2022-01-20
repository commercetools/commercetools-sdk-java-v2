
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

/**
*  <p>Specify which ProductData attributes to use for estimating similarity and how to weigh them. An attribute's weight can be any whole positive integer, starting with 0. The larger the integer, the higher its weight.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class SimilarityMeasuresImpl implements SimilarityMeasures, ModelBase {

    private Long name;

    private Long description;

    private Long attribute;

    private Long variantCount;

    private Long price;

    @JsonCreator
    SimilarityMeasuresImpl(@JsonProperty("name") final Long name, @JsonProperty("description") final Long description,
            @JsonProperty("attribute") final Long attribute, @JsonProperty("variantCount") final Long variantCount,
            @JsonProperty("price") final Long price) {
        this.name = name;
        this.description = description;
        this.attribute = attribute;
        this.variantCount = variantCount;
        this.price = price;
    }

    public SimilarityMeasuresImpl() {
    }

    /**
    *  <p>Importance of the <code>name</code> attribute in overall similarity.</p>
    */
    public Long getName() {
        return this.name;
    }

    /**
    *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
    */
    public Long getDescription() {
        return this.description;
    }

    /**
    *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
    */
    public Long getAttribute() {
        return this.attribute;
    }

    /**
    *  <p>Importance of the number of product variants in overall similarity.</p>
    */
    public Long getVariantCount() {
        return this.variantCount;
    }

    /**
    *  <p>Importance of the <code>price</code> attribute in overall similarity.</p>
    */
    public Long getPrice() {
        return this.price;
    }

    public void setName(final Long name) {
        this.name = name;
    }

    public void setDescription(final Long description) {
        this.description = description;
    }

    public void setAttribute(final Long attribute) {
        this.attribute = attribute;
    }

    public void setVariantCount(final Long variantCount) {
        this.variantCount = variantCount;
    }

    public void setPrice(final Long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SimilarityMeasuresImpl that = (SimilarityMeasuresImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(description, that.description)
                .append(attribute, that.attribute)
                .append(variantCount, that.variantCount)
                .append(price, that.price)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name)
                .append(description)
                .append(attribute)
                .append(variantCount)
                .append(price)
                .toHashCode();
    }

}
