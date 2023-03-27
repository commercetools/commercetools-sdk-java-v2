
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddCustomShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddCustomShippingMethodAction cartAddCustomShippingMethodAction = CartAddCustomShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddCustomShippingMethodActionBuilder implements Builder<CartAddCustomShippingMethodAction> {

    private String shippingKey;

    private String shippingMethodName;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined identifier for the custom Shipping Method that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @param shippingMethodName value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingAddress(
            final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @param shippingRate value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if the Cart has the <code>Platform</code> TaxMode.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if the Cart has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder deliveries(
            @Nullable final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder plusDeliveries(
            @Nullable final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder plusDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CartAddCustomShippingMethodActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined identifier for the custom Shipping Method that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @return shippingMethodName
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @return shippingAddress
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @return shippingRate
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Input used to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be ClassificationShippingRateInputDraft.</li>
     *   <li>If <code>CartScore</code>, it must be ScoreShippingRateInputDraft.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     * @return shippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if the Cart has the <code>Platform</code> TaxMode.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Deliveries to be shipped with the custom Shipping Method.</p>
     * @return deliveries
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryDraft> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds CartAddCustomShippingMethodAction with checking for non-null required values
     * @return CartAddCustomShippingMethodAction
     */
    public CartAddCustomShippingMethodAction build() {
        Objects.requireNonNull(shippingKey, CartAddCustomShippingMethodAction.class + ": shippingKey is missing");
        Objects.requireNonNull(shippingMethodName,
            CartAddCustomShippingMethodAction.class + ": shippingMethodName is missing");
        Objects.requireNonNull(shippingAddress,
            CartAddCustomShippingMethodAction.class + ": shippingAddress is missing");
        Objects.requireNonNull(shippingRate, CartAddCustomShippingMethodAction.class + ": shippingRate is missing");
        return new CartAddCustomShippingMethodActionImpl(shippingKey, shippingMethodName, shippingAddress, shippingRate,
            shippingRateInput, taxCategory, externalTaxRate, deliveries, custom);
    }

    /**
     * builds CartAddCustomShippingMethodAction without checking for non-null required values
     * @return CartAddCustomShippingMethodAction
     */
    public CartAddCustomShippingMethodAction buildUnchecked() {
        return new CartAddCustomShippingMethodActionImpl(shippingKey, shippingMethodName, shippingAddress, shippingRate,
            shippingRateInput, taxCategory, externalTaxRate, deliveries, custom);
    }

    /**
     * factory method for an instance of CartAddCustomShippingMethodActionBuilder
     * @return builder
     */
    public static CartAddCustomShippingMethodActionBuilder of() {
        return new CartAddCustomShippingMethodActionBuilder();
    }

    /**
     * create builder for CartAddCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddCustomShippingMethodActionBuilder of(final CartAddCustomShippingMethodAction template) {
        CartAddCustomShippingMethodActionBuilder builder = new CartAddCustomShippingMethodActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingRate = template.getShippingRate();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.taxCategory = template.getTaxCategory();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.deliveries = template.getDeliveries();
        builder.custom = template.getCustom();
        return builder;
    }

}
