
package com.commercetools.ml.models.similar_products;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.ml.models.common.LocalizedString;
import com.commercetools.ml.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SimilarProductMetaImpl.class)
public interface SimilarProductMeta {

    /**
    *  <p>Localized product name used for similarity estimation.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Localized product description used for similarity estimation.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
    */
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
    *  <p>Total number of variants associated with the product.</p>
    */

    @JsonProperty("variantCount")
    public Long getVariantCount();

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setPrice(final Money price);

    public void setVariantCount(final Long variantCount);

    public static SimilarProductMeta of() {
        return new SimilarProductMetaImpl();
    }

    public static SimilarProductMeta of(final SimilarProductMeta template) {
        SimilarProductMetaImpl instance = new SimilarProductMetaImpl();
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setPrice(template.getPrice());
        instance.setVariantCount(template.getVariantCount());
        return instance;
    }

    public static SimilarProductMetaBuilder builder() {
        return SimilarProductMetaBuilder.of();
    }

    public static SimilarProductMetaBuilder builder(final SimilarProductMeta template) {
        return SimilarProductMetaBuilder.of(template);
    }

    default <T> T withSimilarProductMeta(Function<SimilarProductMeta, T> helper) {
        return helper.apply(this);
    }
}
