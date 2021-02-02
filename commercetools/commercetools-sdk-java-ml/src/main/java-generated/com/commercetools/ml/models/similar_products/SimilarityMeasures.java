
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Specify which ProductData attributes to use for estimating similarity and how to weigh them. An attribute's weight can be any whole positive integer, starting with 0. The larger the integer, the higher its weight.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SimilarityMeasuresImpl.class)
public interface SimilarityMeasures {

    /**
    *  <p>Importance of the <code>name</code> attribute in overall similarity.</p>
    */

    @JsonProperty("name")
    public Long getName();

    /**
    *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
    */

    @JsonProperty("description")
    public Long getDescription();

    /**
    *  <p>Importance of the <code>description</code> attribute in overall similarity.</p>
    */

    @JsonProperty("attribute")
    public Long getAttribute();

    /**
    *  <p>Importance of the number of product variants in overall similarity.</p>
    */

    @JsonProperty("variantCount")
    public Long getVariantCount();

    /**
    *  <p>Importance of the <code>price</code> attribute in overall similarity.</p>
    */

    @JsonProperty("price")
    public Long getPrice();

    public void setName(final Long name);

    public void setDescription(final Long description);

    public void setAttribute(final Long attribute);

    public void setVariantCount(final Long variantCount);

    public void setPrice(final Long price);

    public static SimilarityMeasures of() {
        return new SimilarityMeasuresImpl();
    }

    public static SimilarityMeasures of(final SimilarityMeasures template) {
        SimilarityMeasuresImpl instance = new SimilarityMeasuresImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAttribute(template.getAttribute());
        instance.setVariantCount(template.getVariantCount());
        instance.setPrice(template.getPrice());
        return instance;
    }

    public static SimilarityMeasuresBuilder builder() {
        return SimilarityMeasuresBuilder.of();
    }

    public static SimilarityMeasuresBuilder builder(final SimilarityMeasures template) {
        return SimilarityMeasuresBuilder.of(template);
    }

    default <T> T withSimilarityMeasures(Function<SimilarityMeasures, T> helper) {
        return helper.apply(this);
    }
}
