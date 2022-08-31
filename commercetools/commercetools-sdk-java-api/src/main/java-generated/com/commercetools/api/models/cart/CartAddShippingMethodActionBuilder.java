
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
 *             .plusDeliveries(deliveriesBuilder -> deliveriesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddShippingMethodActionBuilder implements Builder<CartAddShippingMethodAction> {

    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress shippingAddress;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    @Nullable
    private String externalTaxRate;

    private java.util.List<com.commercetools.api.models.order.Delivery> deliveries;

    @Nullable
    private String custom;

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multi</code> ShippingMode.</p>
     */

    public CartAddShippingMethodActionBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public CartAddShippingMethodActionBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder, com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public CartAddShippingMethodActionBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     */

    public CartAddShippingMethodActionBuilder shippingAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determines the shipping rate and Tax Rate of the Line Items.</p>
     */

    public CartAddShippingMethodActionBuilder shippingAddress(
            @Nullable final com.commercetools.api.models.common.BaseAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
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

    public CartAddShippingMethodActionBuilder shippingRateInput(
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

    public CartAddShippingMethodActionBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Rate used to tax a shipping expense if a Cart has the <code>External</code> TaxMode.</p>
     */

    public CartAddShippingMethodActionBuilder externalTaxRate(@Nullable final String externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddShippingMethodActionBuilder deliveries(
            final com.commercetools.api.models.order.Delivery... deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddShippingMethodActionBuilder deliveries(
            final java.util.List<com.commercetools.api.models.order.Delivery> deliveries) {
        this.deliveries = deliveries;
        return this;
    }

    /**
     *  <p>Deliveries tied to a Shipping Method in a multi-shipping method Cart. It holds information on how items are delivered to customers.</p>
     */

    public CartAddShippingMethodActionBuilder plusDeliveries(
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

    public CartAddShippingMethodActionBuilder plusDeliveries(
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

    public CartAddShippingMethodActionBuilder withDeliveries(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields for the Shipping Method.</p>
     */

    public CartAddShippingMethodActionBuilder custom(@Nullable final String custom) {
        this.custom = custom;
        return this;
    }

    public String getShippingKey() {
        return this.shippingKey;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodReference getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
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

    public CartAddShippingMethodAction build() {
        Objects.requireNonNull(shippingKey, CartAddShippingMethodAction.class + ": shippingKey is missing");
        Objects.requireNonNull(deliveries, CartAddShippingMethodAction.class + ": deliveries is missing");
        return new CartAddShippingMethodActionImpl(shippingKey, shippingMethod, shippingAddress, shippingRateInput,
            externalTaxRate, deliveries, custom);
    }

    /**
     * builds CartAddShippingMethodAction without checking for non null required values
     */
    public CartAddShippingMethodAction buildUnchecked() {
        return new CartAddShippingMethodActionImpl(shippingKey, shippingMethod, shippingAddress, shippingRateInput,
            externalTaxRate, deliveries, custom);
    }

    public static CartAddShippingMethodActionBuilder of() {
        return new CartAddShippingMethodActionBuilder();
    }

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
