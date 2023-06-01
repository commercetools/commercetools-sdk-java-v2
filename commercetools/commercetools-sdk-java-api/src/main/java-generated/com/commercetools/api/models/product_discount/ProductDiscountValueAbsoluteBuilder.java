package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.CentPrecisionMoney;
import com.commercetools.api.models.product_discount.ProductDiscountValue;
import com.commercetools.api.models.product_discount.ProductDiscountValueAbsolute;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueAbsoluteBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueAbsolute productDiscountValueAbsolute = ProductDiscountValueAbsolute.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountValueAbsoluteBuilder implements Builder<ProductDiscountValueAbsolute> {

    
    
    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public ProductDiscountValueAbsoluteBuilder money( final com.commercetools.api.models.common.CentPrecisionMoney ...money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public ProductDiscountValueAbsoluteBuilder money( final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
        this.money = money;
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public ProductDiscountValueAbsoluteBuilder plusMoney( final com.commercetools.api.models.common.CentPrecisionMoney ...money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }
    
    
    
    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ProductDiscountValueAbsoluteBuilder plusMoney(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ProductDiscountValueAbsoluteBuilder withMoney(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ProductDiscountValueAbsoluteBuilder addMoney(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        return plusMoney(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()));
    }
    
    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public ProductDiscountValueAbsoluteBuilder setMoney(Function<com.commercetools.api.models.common.CentPrecisionMoneyBuilder, com.commercetools.api.models.common.CentPrecisionMoney> builder) {
        return money(builder.apply(com.commercetools.api.models.common.CentPrecisionMoneyBuilder.of()));
    }
                    

    /**
     *  <p>Money values in different currencies. An absolute ProductDiscount will only match a price if this array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     * @return money
     */
    
    
    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney(){
        return this.money;
    }

    /**
     * builds ProductDiscountValueAbsolute with checking for non-null required values
     * @return ProductDiscountValueAbsolute
     */
    public ProductDiscountValueAbsolute build() {
        Objects.requireNonNull(money, ProductDiscountValueAbsolute.class + ": money is missing");
        return new ProductDiscountValueAbsoluteImpl(money);
    }
    
    /**
     * builds ProductDiscountValueAbsolute without checking for non-null required values
     * @return ProductDiscountValueAbsolute
     */
    public ProductDiscountValueAbsolute buildUnchecked() {
        return new ProductDiscountValueAbsoluteImpl(money);
    }

    /**
     * factory method for an instance of ProductDiscountValueAbsoluteBuilder
     * @return builder 
     */
    public static ProductDiscountValueAbsoluteBuilder of() {
        return new ProductDiscountValueAbsoluteBuilder();
    }

    /**
     * create builder for ProductDiscountValueAbsolute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueAbsoluteBuilder of(final ProductDiscountValueAbsolute template) {
        ProductDiscountValueAbsoluteBuilder builder = new ProductDiscountValueAbsoluteBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
