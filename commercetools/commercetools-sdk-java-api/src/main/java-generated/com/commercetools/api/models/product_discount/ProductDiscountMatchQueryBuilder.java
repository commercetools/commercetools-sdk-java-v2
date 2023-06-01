package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.QueryPrice;
import com.commercetools.api.models.product_discount.ProductDiscountMatchQuery;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountMatchQueryBuilder
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountMatchQueryBuilder implements Builder<ProductDiscountMatchQuery> {

    
    
    private String productId;
    
    
    
    private Integer variantId;
    
    
    
    private Boolean staged;
    
    
    
    private com.commercetools.api.models.common.QueryPrice price;

    
    /**
     *  <p>ID of the specified Product.</p>
     * @param productId value to be set
     * @return Builder
     */
    
    public ProductDiscountMatchQueryBuilder productId( final String productId) {
        this.productId = productId;
        return this;
    }
    
    
    
    
    /**
     *  <p>ID of the specified Product Variant.</p>
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductDiscountMatchQueryBuilder variantId( final Integer variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Controls which projected representation is applied for the query. Set to <code>true</code> for the <code>staged</code> Product Projection of the specified Product Variant, set to <code>false</code> for the <code>current</code> one.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductDiscountMatchQueryBuilder staged( final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    
    
    
    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductDiscountMatchQueryBuilder price(Function<com.commercetools.api.models.common.QueryPriceBuilder, com.commercetools.api.models.common.QueryPriceBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.QueryPriceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public ProductDiscountMatchQueryBuilder withPrice(Function<com.commercetools.api.models.common.QueryPriceBuilder, com.commercetools.api.models.common.QueryPrice> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.QueryPriceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public ProductDiscountMatchQueryBuilder price( final com.commercetools.api.models.common.QueryPrice price) {
        this.price = price;
        return this;
    }
    
    

    /**
     *  <p>ID of the specified Product.</p>
     * @return productId
     */
    
    
    public String getProductId(){
        return this.productId;
    }
    
    /**
     *  <p>ID of the specified Product Variant.</p>
     * @return variantId
     */
    
    
    public Integer getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>Controls which projected representation is applied for the query. Set to <code>true</code> for the <code>staged</code> Product Projection of the specified Product Variant, set to <code>false</code> for the <code>current</code> one.</p>
     * @return staged
     */
    
    
    public Boolean getStaged(){
        return this.staged;
    }
    
    /**
     *  <p>Specified Price of the specified Product Variant.</p>
     * @return price
     */
    
    
    public com.commercetools.api.models.common.QueryPrice getPrice(){
        return this.price;
    }

    /**
     * builds ProductDiscountMatchQuery with checking for non-null required values
     * @return ProductDiscountMatchQuery
     */
    public ProductDiscountMatchQuery build() {
        Objects.requireNonNull(productId, ProductDiscountMatchQuery.class + ": productId is missing");
        Objects.requireNonNull(variantId, ProductDiscountMatchQuery.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductDiscountMatchQuery.class + ": staged is missing");
        Objects.requireNonNull(price, ProductDiscountMatchQuery.class + ": price is missing");
        return new ProductDiscountMatchQueryImpl(productId, variantId, staged, price);
    }
    
    /**
     * builds ProductDiscountMatchQuery without checking for non-null required values
     * @return ProductDiscountMatchQuery
     */
    public ProductDiscountMatchQuery buildUnchecked() {
        return new ProductDiscountMatchQueryImpl(productId, variantId, staged, price);
    }

    /**
     * factory method for an instance of ProductDiscountMatchQueryBuilder
     * @return builder 
     */
    public static ProductDiscountMatchQueryBuilder of() {
        return new ProductDiscountMatchQueryBuilder();
    }

    /**
     * create builder for ProductDiscountMatchQuery instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountMatchQueryBuilder of(final ProductDiscountMatchQuery template) {
        ProductDiscountMatchQueryBuilder builder = new ProductDiscountMatchQueryBuilder();
        builder.productId = template.getProductId();
        builder.variantId = template.getVariantId();
        builder.staged = template.getStaged();
        builder.price = template.getPrice();
        return builder;
    }

}
