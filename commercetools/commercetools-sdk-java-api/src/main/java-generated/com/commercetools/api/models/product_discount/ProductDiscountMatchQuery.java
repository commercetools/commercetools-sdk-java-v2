
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.QueryPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ProductDiscountMatchQuery
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountMatchQuery productDiscountMatchQuery = ProductDiscountMatchQuery.builder()
 *             .productId("{productId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountMatchQueryImpl.class)
public interface ProductDiscountMatchQuery {

    /**
     *  <p>ID of the specified Product.</p>
     * @return productId
     */
    @NotNull
    @JsonProperty("productId")
    public String getProductId();

    /**
     *  <p>ID of the specified Product Variant.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *  <p>Controls which <span>projected representation</span> is applied for the query. Set to <code>true</code> for the <code>staged</code> Product Projection of the specified Product Variant, set to <code>false</code> for the <code>current</code> one.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public QueryPrice getPrice();

    /**
     *  <p>ID of the specified Product.</p>
     * @param productId value to be set
     */

    public void setProductId(final String productId);

    /**
     *  <p>ID of the specified Product Variant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Integer variantId);

    /**
     *  <p>Controls which <span>projected representation</span> is applied for the query. Set to <code>true</code> for the <code>staged</code> Product Projection of the specified Product Variant, set to <code>false</code> for the <code>current</code> one.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     * @param price value to be set
     */

    public void setPrice(final QueryPrice price);

    /**
     * factory method
     * @return instance of ProductDiscountMatchQuery
     */
    public static ProductDiscountMatchQuery of() {
        return new ProductDiscountMatchQueryImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountMatchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountMatchQuery of(final ProductDiscountMatchQuery template) {
        ProductDiscountMatchQueryImpl instance = new ProductDiscountMatchQueryImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setPrice(template.getPrice());
        return instance;
    }

    public ProductDiscountMatchQuery copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountMatchQuery
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountMatchQuery deepCopy(@Nullable final ProductDiscountMatchQuery template) {
        if (template == null) {
            return null;
        }
        ProductDiscountMatchQueryImpl instance = new ProductDiscountMatchQueryImpl();
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        instance.setPrice(com.commercetools.api.models.common.QueryPrice.deepCopy(template.getPrice()));
        return instance;
    }

    /**
     * builder factory method for ProductDiscountMatchQuery
     * @return builder
     */
    public static ProductDiscountMatchQueryBuilder builder() {
        return ProductDiscountMatchQueryBuilder.of();
    }

    /**
     * create builder for ProductDiscountMatchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountMatchQueryBuilder builder(final ProductDiscountMatchQuery template) {
        return ProductDiscountMatchQueryBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountMatchQuery(Function<ProductDiscountMatchQuery, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountMatchQuery> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountMatchQuery>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountMatchQuery>";
            }
        };
    }
}
