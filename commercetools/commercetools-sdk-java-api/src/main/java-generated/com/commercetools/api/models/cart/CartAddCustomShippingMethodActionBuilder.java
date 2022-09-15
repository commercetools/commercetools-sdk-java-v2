
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
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .plusDeliveries(deliveriesBuilder -> deliveriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddCustomShippingMethodActionBuilder implements Builder<CartAddCustomShippingMethodAction> {

    private String shippingKey;

    private String shippingMethodName;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private String externalTaxRate;

    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

    @Nullable
    private String custom;

    /**
     *  <p>User-defined unique identifier of the custom Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Name of the custom Shipping Method.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier.</p>
     *  <ul>
     *   <li>Must be ClassificationShippingRateInput if ShippingRateInputType is CartClassificationType.</li>
     *   <li>Must be ScoreShippingRateInput if ShippingRateInputType is CartScoreType.</li>
     *  </ul>
     *  <p>The <code>shippingRateInput</code> cannot be set on the Cart if CartValueType is defined.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier.</p>
     *  <ul>
     *   <li>Must be ClassificationShippingRateInput if ShippingRateInputType is CartClassificationType.</li>
     *   <li>Must be ScoreShippingRateInput if ShippingRateInputType is CartScoreType.</li>
     *  </ul>
     *  <p>The <code>shippingRateInput</code> cannot be set on the Cart if CartValueType is defined.</p>
     */

    public CartAddCustomShippingMethodActionBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if a Cart has the <code>Platform</code> TaxMode.</p>
     */

    public CartAddCustomShippingMethodActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Category used to determine a shipping Tax Rate if a Cart has the <code>Platform</code> TaxMode.</p>
     */

    public CartAddCustomShippingMethodActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     */

    public CartAddCustomShippingMethodActionBuilder externalTaxRate(@Nullable final String externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddCustomShippingMethodActionBuilder deliveries(
            final com.commercetools.api.models.order.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddCustomShippingMethodActionBuilder deliveries(
            final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddCustomShippingMethodActionBuilder plusDeliveries(
            final com.commercetools.api.models.order.Delivery... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddCustomShippingMethodActionBuilder plusDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddCustomShippingMethodActionBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     */

    public CartAddCustomShippingMethodActionBuilder custom(@Nullable final String custom) {
        this.custom = custom;
        return this;
    }

    public String getShippingKey() {
        return this.shippingKey;
    }

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public String getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public java.util.List<com.commercetools.api.models.order.Delivery> getDeliveries() {
        return this.deliveries;
    }

    @Nullable
    public String getCustom() {
        return this.custom;
    }

    public CartAddCustomShippingMethodAction build() {
        Objects.requireNonNull(shippingKey, CartAddCustomShippingMethodAction.class + ": shippingKey is missing");
        Objects.requireNonNull(shippingMethodName,
            CartAddCustomShippingMethodAction.class + ": shippingMethodName is missing");
        Objects.requireNonNull(shippingRate, CartAddCustomShippingMethodAction.class + ": shippingRate is missing");
        Objects.requireNonNull(deliveries, CartAddCustomShippingMethodAction.class + ": deliveries is missing");
        return new CartAddCustomShippingMethodActionImpl(shippingKey, shippingMethodName, shippingAddress, shippingRate,
            shippingRateInput, taxCategory, externalTaxRate, deliveries, custom);
    }

    /**
     * builds CartAddCustomShippingMethodAction without checking for non null required values
     */
    public CartAddCustomShippingMethodAction buildUnchecked() {
        return new CartAddCustomShippingMethodActionImpl(shippingKey, shippingMethodName, shippingAddress, shippingRate,
            shippingRateInput, taxCategory, externalTaxRate, deliveries, custom);
    }

    public static CartAddCustomShippingMethodActionBuilder of() {
        return new CartAddCustomShippingMethodActionBuilder();
    }

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
