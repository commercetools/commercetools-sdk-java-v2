package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CustomLineItemPriceMode;
import com.commercetools.api.models.cart.ItemShippingDetailsDraft;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.order.ItemState;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.tax_category.TaxRate;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.cart.CustomLineItemImportDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomLineItemImportDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomLineItemImportDraft customLineItemImportDraft = CustomLineItemImportDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .quantity(0.3)
 *             .money(moneyBuilder -> moneyBuilder)
 *             .slug("{slug}")
 *             .priceMode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomLineItemImportDraftBuilder implements Builder<CustomLineItemImportDraft> {

    
    
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    
    private Long quantity;
    
    
    
    private com.commercetools.api.models.common.Money money;
    
    
    
    private String slug;
    
    
    @Nullable
    private java.util.List<com.commercetools.api.models.order.ItemState> state;
    
    
    @Nullable
    private com.commercetools.api.models.tax_category.TaxRate taxRate;
    
    
    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails;
    
    
    
    private com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode;

    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the name using the builder function
     * @param builder function to build the name value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the name
     * @param name value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder name( final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @param quantity value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder quantity( final Long quantity) {
        this.quantity = quantity;
        return this;
    }
    
    
    
    
    /**
     *  <p>The cost to add to the cart. The amount can be negative.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder money(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The cost to add to the cart. The amount can be negative.</p>
     * @param builder function to build the money value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder withMoney(Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.money = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The cost to add to the cart. The amount can be negative.</p>
     * @param money value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder money( final com.commercetools.api.models.common.Money money) {
        this.money = money;
        return this;
    }
    
    
    
    
    /**
     * set the value to the slug
     * @param slug value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder slug( final String slug) {
        this.slug = slug;
        return this;
    }
    
    
    
    /**
     * set values to the state
     * @param state value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder state(@Nullable final com.commercetools.api.models.order.ItemState ...state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }
    
    /**
     * set value to the state
     * @param state value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder state(@Nullable final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }
    
    /**
     * add values to the state
     * @param state value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder plusState(@Nullable final com.commercetools.api.models.order.ItemState ...state) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.addAll(Arrays.asList(state));
        return this;
    }
    
    
    
    /**
     * add the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder plusState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }
    
    /**
     * set the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder withState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemStateBuilder> builder) {
        this.state = new ArrayList<>();
        this.state.add(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()).build());
        return this;
    }
    
    /**
     * add the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder addState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return plusState(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }
    
    /**
     * set the value to the state using the builder function
     * @param builder function to build the state value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder setState(Function<com.commercetools.api.models.order.ItemStateBuilder, com.commercetools.api.models.order.ItemState> builder) {
        return state(builder.apply(com.commercetools.api.models.order.ItemStateBuilder.of()));
    }
                    
    
    
    /**
     * set the value to the taxRate using the builder function
     * @param builder function to build the taxRate value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder taxRate(Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRateBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the taxRate using the builder function
     * @param builder function to build the taxRate value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder withTaxRate(Function<com.commercetools.api.models.tax_category.TaxRateBuilder, com.commercetools.api.models.tax_category.TaxRate> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.tax_category.TaxRateBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the taxRate
     * @param taxRate value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder taxRate(@Nullable final com.commercetools.api.models.tax_category.TaxRate taxRate) {
        this.taxRate = taxRate;
        return this;
    }
    
    
    
    
    /**
     * set the value to the taxCategory using the builder function
     * @param builder function to build the taxCategory value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder taxCategory(Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the taxCategory using the builder function
     * @param builder function to build the taxCategory value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder withTaxCategory(Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the taxCategory
     * @param taxCategory value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder taxCategory(@Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }
    
    
    
    
    /**
     *  <p>The custom fields.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>The custom fields.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>The custom fields.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    
    
    
    /**
     * set the value to the shippingDetails using the builder function
     * @param builder function to build the shippingDetails value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder shippingDetails(Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the shippingDetails using the builder function
     * @param builder function to build the shippingDetails value
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder withShippingDetails(Function<com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder, com.commercetools.api.models.cart.ItemShippingDetailsDraft> builder) {
        this.shippingDetails = builder.apply(com.commercetools.api.models.cart.ItemShippingDetailsDraftBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the shippingDetails
     * @param shippingDetails value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder shippingDetails(@Nullable final com.commercetools.api.models.cart.ItemShippingDetailsDraft shippingDetails) {
        this.shippingDetails = shippingDetails;
        return this;
    }
    
    
    
    
    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @param priceMode value to be set
     * @return Builder
     */
    
    public CustomLineItemImportDraftBuilder priceMode( final com.commercetools.api.models.cart.CustomLineItemPriceMode priceMode) {
        this.priceMode = priceMode;
        return this;
    }
    
    

    /**
     * value of name}
     * @return name
     */
    
    
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>The amount of a CustomLineItem in the cart. Must be a positive integer.</p>
     * @return quantity
     */
    
    
    public Long getQuantity(){
        return this.quantity;
    }
    
    /**
     *  <p>The cost to add to the cart. The amount can be negative.</p>
     * @return money
     */
    
    
    public com.commercetools.api.models.common.Money getMoney(){
        return this.money;
    }
    
    /**
     * value of slug}
     * @return slug
     */
    
    
    public String getSlug(){
        return this.slug;
    }
    
    /**
     * value of state}
     * @return state
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.order.ItemState> getState(){
        return this.state;
    }
    
    /**
     * value of taxRate}
     * @return taxRate
     */
    
    @Nullable
    public com.commercetools.api.models.tax_category.TaxRate getTaxRate(){
        return this.taxRate;
    }
    
    /**
     * value of taxCategory}
     * @return taxCategory
     */
    
    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }
    
    /**
     *  <p>The custom fields.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }
    
    /**
     * value of shippingDetails}
     * @return shippingDetails
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ItemShippingDetailsDraft getShippingDetails(){
        return this.shippingDetails;
    }
    
    /**
     *  <ul>
     *   <li>If <code>Standard</code>, Cart Discounts with a matching CartDiscountCustomLineItemsTarget are applied to the Custom Line Item.</li>
     *   <li>If <code>External</code>, Cart Discounts are not considered on the Custom Line Item.</li>
     *  </ul>
     * @return priceMode
     */
    
    
    public com.commercetools.api.models.cart.CustomLineItemPriceMode getPriceMode(){
        return this.priceMode;
    }

    /**
     * builds CustomLineItemImportDraft with checking for non-null required values
     * @return CustomLineItemImportDraft
     */
    public CustomLineItemImportDraft build() {
        Objects.requireNonNull(name, CustomLineItemImportDraft.class + ": name is missing");
        Objects.requireNonNull(quantity, CustomLineItemImportDraft.class + ": quantity is missing");
        Objects.requireNonNull(money, CustomLineItemImportDraft.class + ": money is missing");
        Objects.requireNonNull(slug, CustomLineItemImportDraft.class + ": slug is missing");
        Objects.requireNonNull(priceMode, CustomLineItemImportDraft.class + ": priceMode is missing");
        return new CustomLineItemImportDraftImpl(name, quantity, money, slug, state, taxRate, taxCategory, custom, shippingDetails, priceMode);
    }
    
    /**
     * builds CustomLineItemImportDraft without checking for non-null required values
     * @return CustomLineItemImportDraft
     */
    public CustomLineItemImportDraft buildUnchecked() {
        return new CustomLineItemImportDraftImpl(name, quantity, money, slug, state, taxRate, taxCategory, custom, shippingDetails, priceMode);
    }

    /**
     * factory method for an instance of CustomLineItemImportDraftBuilder
     * @return builder 
     */
    public static CustomLineItemImportDraftBuilder of() {
        return new CustomLineItemImportDraftBuilder();
    }

    /**
     * create builder for CustomLineItemImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomLineItemImportDraftBuilder of(final CustomLineItemImportDraft template) {
        CustomLineItemImportDraftBuilder builder = new CustomLineItemImportDraftBuilder();
        builder.name = template.getName();
        builder.quantity = template.getQuantity();
        builder.money = template.getMoney();
        builder.slug = template.getSlug();
        builder.state = template.getState();
        builder.taxRate = template.getTaxRate();
        builder.taxCategory = template.getTaxCategory();
        builder.custom = template.getCustom();
        builder.shippingDetails = template.getShippingDetails();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
