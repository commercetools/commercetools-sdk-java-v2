
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItem customLineItem = CustomLineItem.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .taxedPrice(taxedPriceBuilder -> taxedPriceBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .slug("{slug}")
 *             .quantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemBuilder implements Builder<CustomLineItem> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.Money money;

    private com.commercetools.history.models.common.TaxedItemPrice taxedPrice;

    private com.commercetools.history.models.common.Money totalPrice;

    private String slug;

    private Integer quantity;

    /**
     *  <p>The unique ID of this CustomLineItem.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomLineItemBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */

    public CustomLineItemBuilder withName(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */

    public CustomLineItemBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     * set the value to the money using the builder function
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemBuilder money(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the money using the builder function
     * @param builder function to build the money value
     * @return Builder
     */

    public CustomLineItemBuilder withMoney(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.money = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     * set the value to the money
     * @param money value to be set
     * @return Builder
     */

    public CustomLineItemBuilder money(final com.commercetools.history.models.common.Money money) {
        this.money = money;
        return this;
    }

    /**
     * set the value to the taxedPrice using the builder function
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemBuilder taxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPriceBuilder> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the taxedPrice using the builder function
     * @param builder function to build the taxedPrice value
     * @return Builder
     */

    public CustomLineItemBuilder withTaxedPrice(
            Function<com.commercetools.history.models.common.TaxedItemPriceBuilder, com.commercetools.history.models.common.TaxedItemPrice> builder) {
        this.taxedPrice = builder.apply(com.commercetools.history.models.common.TaxedItemPriceBuilder.of());
        return this;
    }

    /**
     * set the value to the taxedPrice
     * @param taxedPrice value to be set
     * @return Builder
     */

    public CustomLineItemBuilder taxedPrice(final com.commercetools.history.models.common.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
        return this;
    }

    /**
     * set the value to the totalPrice using the builder function
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CustomLineItemBuilder totalPrice(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.totalPrice = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the totalPrice using the builder function
     * @param builder function to build the totalPrice value
     * @return Builder
     */

    public CustomLineItemBuilder withTotalPrice(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.Money> builder) {
        this.totalPrice = builder.apply(com.commercetools.history.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     * set the value to the totalPrice
     * @param totalPrice value to be set
     * @return Builder
     */

    public CustomLineItemBuilder totalPrice(final com.commercetools.history.models.common.Money totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     *  <p>A unique String in the cart to identify this CustomLineItem.</p>
     * @param slug value to be set
     * @return Builder
     */

    public CustomLineItemBuilder slug(final String slug) {
        this.slug = slug;
        return this;
    }

    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public CustomLineItemBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>The unique ID of this CustomLineItem.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * value of name}
     * @return name
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * value of money}
     * @return money
     */

    public com.commercetools.history.models.common.Money getMoney() {
        return this.money;
    }

    /**
     * value of taxedPrice}
     * @return taxedPrice
     */

    public com.commercetools.history.models.common.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    /**
     * value of totalPrice}
     * @return totalPrice
     */

    public com.commercetools.history.models.common.Money getTotalPrice() {
        return this.totalPrice;
    }

    /**
     *  <p>A unique String in the cart to identify this CustomLineItem.</p>
     * @return slug
     */

    public String getSlug() {
        return this.slug;
    }

    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @return quantity
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * builds CustomLineItem with checking for non-null required values
     * @return CustomLineItem
     */
    public CustomLineItem build() {
        Objects.requireNonNull(id, CustomLineItem.class + ": id is missing");
        Objects.requireNonNull(name, CustomLineItem.class + ": name is missing");
        Objects.requireNonNull(money, CustomLineItem.class + ": money is missing");
        Objects.requireNonNull(taxedPrice, CustomLineItem.class + ": taxedPrice is missing");
        Objects.requireNonNull(totalPrice, CustomLineItem.class + ": totalPrice is missing");
        Objects.requireNonNull(slug, CustomLineItem.class + ": slug is missing");
        Objects.requireNonNull(quantity, CustomLineItem.class + ": quantity is missing");
        return new CustomLineItemImpl(id, name, money, taxedPrice, totalPrice, slug, quantity);
    }

    /**
     * builds CustomLineItem without checking for non-null required values
     * @return CustomLineItem
     */
    public CustomLineItem buildUnchecked() {
        return new CustomLineItemImpl(id, name, money, taxedPrice, totalPrice, slug, quantity);
    }

    /**
     * factory method for an instance of CustomLineItemBuilder
     * @return builder
     */
    public static CustomLineItemBuilder of() {
        return new CustomLineItemBuilder();
    }

    /**
     * create builder for CustomLineItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemBuilder of(final CustomLineItem template) {
        CustomLineItemBuilder builder = new CustomLineItemBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.money = template.getMoney();
        builder.taxedPrice = template.getTaxedPrice();
        builder.totalPrice = template.getTotalPrice();
        builder.slug = template.getSlug();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
