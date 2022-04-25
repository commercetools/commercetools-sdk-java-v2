
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.QueryPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountMatchQueryImpl.class)
public interface ProductDiscountMatchQuery {

    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    @NotNull
    @Valid
    @JsonProperty("price")
    public QueryPrice getPrice();

    public void setProductId(final String productId);

    public void setVariantId(final Integer variantId);

    public void setStaged(final Boolean staged);

    public void setPrice(final QueryPrice price);

    public static ProductDiscountMatchQuery of() {
        return new ProductDiscountMatchQueryImpl();
    }

    public static ProductDiscountMatchQuery of(final ProductDiscountMatchQuery template) {
        ProductDiscountMatchQueryImpl instance = new ProductDiscountMatchQueryImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setPrice(template.getPrice());
        return instance;
    }

    public static ProductDiscountMatchQueryBuilder builder() {
        return ProductDiscountMatchQueryBuilder.of();
    }

    public static ProductDiscountMatchQueryBuilder builder(final ProductDiscountMatchQuery template) {
        return ProductDiscountMatchQueryBuilder.of(template);
    }

    default <T> T withProductDiscountMatchQuery(Function<ProductDiscountMatchQuery, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountMatchQuery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountMatchQuery>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountMatchQuery>";
            }
        };
    }
}
