package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.models.shipping_method.CartClassificationTier;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartClassificationTierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartClassificationTier cartClassificationTier = CartClassificationTier.builder()
 *             .value("{value}")
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartClassificationTierBuilder implements Builder<CartClassificationTier> {

    
    
    private String value;
    
    
    
    private com.commercetools.api.models.common.Money price;
    
    
    @Nullable
    private Boolean isMatching;

    
    /**
     *  <p><code>key</code> selected from the <code>values</code> of the CartClassificationType configured in the Project.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public CartClassificationTierBuilder value( final String value) {
        this.value = value;
        return this;
    }
    
    
    
    
    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public CartClassificationTierBuilder price(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     * @param builder function to build the price value
     * @return Builder
     */
    
    public CartClassificationTierBuilder withPrice(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.price = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     * @param price value to be set
     * @return Builder
     */
    
    public CartClassificationTierBuilder price( final com.commercetools.api.models.common.Money price) {
        this.price = price;
        return this;
    }
    
    
    
    
    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @param isMatching value to be set
     * @return Builder
     */
    
    public CartClassificationTierBuilder isMatching(@Nullable final Boolean isMatching) {
        this.isMatching = isMatching;
        return this;
    }
    
    

    /**
     *  <p><code>key</code> selected from the <code>values</code> of the CartClassificationType configured in the Project.</p>
     * @return value
     */
    
    
    public String getValue(){
        return this.value;
    }
    
    /**
     *  <p>Fixed shipping rate for the selected classification.</p>
     * @return price
     */
    
    
    public com.commercetools.api.models.common.Money getPrice(){
        return this.price;
    }
    
    /**
     *  <p>Appears in response to Get ShippingMethods for a Cart if the shipping rate matches the search query.</p>
     * @return isMatching
     */
    
    @Nullable
    public Boolean getIsMatching(){
        return this.isMatching;
    }

    /**
     * builds CartClassificationTier with checking for non-null required values
     * @return CartClassificationTier
     */
    public CartClassificationTier build() {
        Objects.requireNonNull(value, CartClassificationTier.class + ": value is missing");
        Objects.requireNonNull(price, CartClassificationTier.class + ": price is missing");
        return new CartClassificationTierImpl(value, price, isMatching);
    }
    
    /**
     * builds CartClassificationTier without checking for non-null required values
     * @return CartClassificationTier
     */
    public CartClassificationTier buildUnchecked() {
        return new CartClassificationTierImpl(value, price, isMatching);
    }

    /**
     * factory method for an instance of CartClassificationTierBuilder
     * @return builder 
     */
    public static CartClassificationTierBuilder of() {
        return new CartClassificationTierBuilder();
    }

    /**
     * create builder for CartClassificationTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartClassificationTierBuilder of(final CartClassificationTier template) {
        CartClassificationTierBuilder builder = new CartClassificationTierBuilder();
        builder.value = template.getValue();
        builder.price = template.getPrice();
        builder.isMatching = template.getIsMatching();
        return builder;
    }

}
