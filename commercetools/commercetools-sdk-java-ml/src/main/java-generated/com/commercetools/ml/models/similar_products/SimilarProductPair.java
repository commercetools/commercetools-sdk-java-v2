
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A pair of SimilarProducts</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SimilarProductPairImpl.class)
public interface SimilarProductPair {

    /**
    *  <p>The probability of product similarity.</p>
    */
    @NotNull
    @JsonProperty("confidence")
    public Double getConfidence();

    @NotNull
    @Valid
    @JsonProperty("products")
    public List<SimilarProduct> getProducts();

    public void setConfidence(final Double confidence);

    @JsonIgnore
    public void setProducts(final SimilarProduct... products);

    public void setProducts(final List<SimilarProduct> products);

    public static SimilarProductPair of() {
        return new SimilarProductPairImpl();
    }

    public static SimilarProductPair of(final SimilarProductPair template) {
        SimilarProductPairImpl instance = new SimilarProductPairImpl();
        instance.setConfidence(template.getConfidence());
        instance.setProducts(template.getProducts());
        return instance;
    }

    public static SimilarProductPairBuilder builder() {
        return SimilarProductPairBuilder.of();
    }

    public static SimilarProductPairBuilder builder(final SimilarProductPair template) {
        return SimilarProductPairBuilder.of(template);
    }

    default <T> T withSimilarProductPair(Function<SimilarProductPair, T> helper) {
        return helper.apply(this);
    }
}
