
package com.commercetools.api.models.product_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountValueAbsoluteDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountValueAbsoluteDraft productDiscountValueAbsoluteDraft = ProductDiscountValueAbsoluteDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductDiscountValueAbsoluteDraftBuilder implements Builder<ProductDiscountValueAbsoluteDraft> {

    private java.util.List<com.commercetools.api.models.common.Money> money;

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money value to be set
     * @return Builder
     */

    public ProductDiscountValueAbsoluteDraftBuilder money(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money value to be set
     * @return Builder
     */

    public ProductDiscountValueAbsoluteDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param money value to be set
     * @return Builder
     */

    public ProductDiscountValueAbsoluteDraftBuilder plusMoney(
            final com.commercetools.api.models.common.Money... money) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.addAll(Arrays.asList(money));
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public ProductDiscountValueAbsoluteDraftBuilder plusMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public ProductDiscountValueAbsoluteDraftBuilder withMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public ProductDiscountValueAbsoluteDraftBuilder addMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return plusMoney(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @param builder function to build the money value
     * @return Builder
     */

    public ProductDiscountValueAbsoluteDraftBuilder setMoney(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        return money(builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()));
    }

    /**
     *  <p>Money values in different currencies. An absolute Product Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be decreased by 10&euro; and the matching $ price will be decreased by 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     * @return money
     */

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    /**
     * builds ProductDiscountValueAbsoluteDraft with checking for non-null required values
     * @return ProductDiscountValueAbsoluteDraft
     */
    public ProductDiscountValueAbsoluteDraft build() {
        Objects.requireNonNull(money, ProductDiscountValueAbsoluteDraft.class + ": money is missing");
        return new ProductDiscountValueAbsoluteDraftImpl(money);
    }

    /**
     * builds ProductDiscountValueAbsoluteDraft without checking for non-null required values
     * @return ProductDiscountValueAbsoluteDraft
     */
    public ProductDiscountValueAbsoluteDraft buildUnchecked() {
        return new ProductDiscountValueAbsoluteDraftImpl(money);
    }

    /**
     * factory method for an instance of ProductDiscountValueAbsoluteDraftBuilder
     * @return builder
     */
    public static ProductDiscountValueAbsoluteDraftBuilder of() {
        return new ProductDiscountValueAbsoluteDraftBuilder();
    }

    /**
     * create builder for ProductDiscountValueAbsoluteDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountValueAbsoluteDraftBuilder of(final ProductDiscountValueAbsoluteDraft template) {
        ProductDiscountValueAbsoluteDraftBuilder builder = new ProductDiscountValueAbsoluteDraftBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
