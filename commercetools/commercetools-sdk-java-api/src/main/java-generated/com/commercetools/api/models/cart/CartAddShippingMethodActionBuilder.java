
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartAddShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartAddShippingMethodAction cartAddShippingMethodAction = CartAddShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingMethod(shippingMethodBuilder -> shippingMethodBuilder)
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddShippingMethodActionBuilder implements Builder<CartAddShippingMethodAction> {

    private String shippingKey;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>User-defined identifier for the Shipping that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a ShippingMethod to add to the Cart with <code>Multiple</code> ShippingMode. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a ShippingMethod to add to the Cart with <code>Multiple</code> ShippingMode. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder withShippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a ShippingMethod to add to the Cart with <code>Multiple</code> ShippingMode. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder shippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder shippingAddress(
            final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
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

    public CartAddShippingMethodActionBuilder shippingRateInput(
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

    public CartAddShippingMethodActionBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder deliveries(
            @Nullable final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder deliveries(
            @Nullable final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder plusDeliveries(
            @Nullable final com.commercetools.api.models.order.DeliveryDraft... deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder plusDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder addDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraft> builder) {
        return plusDeliveries(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()));
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder setDeliveries(
            Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraft> builder) {
        return deliveries(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()));
    }

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CartAddShippingMethodActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined identifier for the Shipping that must be unique across the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>ResourceIdentifier to a ShippingMethod to add to the Cart with <code>Multiple</code> ShippingMode. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @return shippingMethod
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     * @return shippingAddress
     */

    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
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
     *  <p>Tax Rate used to tax a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Deliveries to be shipped with the referenced Shipping Method.</p>
     * @return deliveries
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryDraft> getDeliveries() {
        return this.deliveries;
    }

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds CartAddShippingMethodAction with checking for non-null required values
     * @return CartAddShippingMethodAction
     */
    public CartAddShippingMethodAction build() {
        Objects.requireNonNull(shippingKey, CartAddShippingMethodAction.class + ": shippingKey is missing");
        Objects.requireNonNull(shippingMethod, CartAddShippingMethodAction.class + ": shippingMethod is missing");
        Objects.requireNonNull(shippingAddress, CartAddShippingMethodAction.class + ": shippingAddress is missing");
        return new CartAddShippingMethodActionImpl(shippingKey, shippingMethod, shippingAddress, shippingRateInput,
            externalTaxRate, deliveries, custom);
    }

    /**
     * builds CartAddShippingMethodAction without checking for non-null required values
     * @return CartAddShippingMethodAction
     */
    public CartAddShippingMethodAction buildUnchecked() {
        return new CartAddShippingMethodActionImpl(shippingKey, shippingMethod, shippingAddress, shippingRateInput,
            externalTaxRate, deliveries, custom);
    }

    /**
     * factory method for an instance of CartAddShippingMethodActionBuilder
     * @return builder
     */
    public static CartAddShippingMethodActionBuilder of() {
        return new CartAddShippingMethodActionBuilder();
    }

    /**
     * create builder for CartAddShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartAddShippingMethodActionBuilder of(final CartAddShippingMethodAction template) {
        CartAddShippingMethodActionBuilder builder = new CartAddShippingMethodActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.shippingMethod = template.getShippingMethod();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.deliveries = template.getDeliveries();
        builder.custom = template.getCustom();
        return builder;
    }

}
