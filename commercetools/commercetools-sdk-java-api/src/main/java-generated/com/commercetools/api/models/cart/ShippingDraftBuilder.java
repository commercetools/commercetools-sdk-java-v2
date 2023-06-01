package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryDraft;
import com.commercetools.api.models.shipping_method.ShippingMethodReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.cart.ShippingDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingDraft shippingDraft = ShippingDraft.builder()
 *             .key("{key}")
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingDraftBuilder implements Builder<ShippingDraft> {

    
    
    private String key;
    
    
    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod;
    
    
    
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
     *  <p>User-defined unique identifier for the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */
    
    public ShippingDraftBuilder shippingMethod(Function<com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder, com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder> builder) {
        this.shippingMethod = builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */
    
    public ShippingDraftBuilder withShippingMethod(Function<com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder, com.commercetools.api.models.shipping_method.ShippingMethodReference> builder) {
        this.shippingMethod = builder.apply(com.commercetools.api.models.shipping_method.ShippingMethodReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder shippingMethod(@Nullable final com.commercetools.api.models.shipping_method.ShippingMethodReference shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }
    
    
    
    
    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */
    
    public ShippingDraftBuilder shippingAddress(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */
    
    public ShippingDraftBuilder withShippingAddress(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder shippingAddress( final com.commercetools.api.models.common.BaseAddress shippingAddress) {
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
    
    public ShippingDraftBuilder shippingRateInput(@Nullable final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
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
    
    public ShippingDraftBuilder shippingRateInput(Function<com.commercetools.api.models.cart.ShippingRateInputDraftBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInputDraft>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputDraftBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public ShippingDraftBuilder externalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public ShippingDraftBuilder withExternalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }
    
    
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder deliveries(@Nullable final com.commercetools.api.models.order.DeliveryDraft ...deliveries) {
        this.deliveries = new ArrayList<>(Arrays.asList(deliveries));
        return this;
    }
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder deliveries(@Nullable final java.util.List<com.commercetools.api.models.order.DeliveryDraft> deliveries) {
        this.deliveries = deliveries;
        return this;
    }
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param deliveries value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder plusDeliveries(@Nullable final com.commercetools.api.models.order.DeliveryDraft ...deliveries) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.addAll(Arrays.asList(deliveries));
        return this;
    }
    
    
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */
    
    public ShippingDraftBuilder plusDeliveries(Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        if (this.deliveries == null) {
            this.deliveries = new ArrayList<>();
        }
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */
    
    public ShippingDraftBuilder withDeliveries(Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraftBuilder> builder) {
        this.deliveries = new ArrayList<>();
        this.deliveries.add(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */
    
    public ShippingDraftBuilder addDeliveries(Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraft> builder) {
        return plusDeliveries(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()));
    }
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @param builder function to build the deliveries value
     * @return Builder
     */
    
    public ShippingDraftBuilder setDeliveries(Function<com.commercetools.api.models.order.DeliveryDraftBuilder, com.commercetools.api.models.order.DeliveryDraft> builder) {
        return deliveries(builder.apply(com.commercetools.api.models.order.DeliveryDraftBuilder.of()));
    }
                    
    
    
    /**
     *  <p>Custom Fields for Shipping.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ShippingDraftBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields for Shipping.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ShippingDraftBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields for Shipping.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public ShippingDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>User-defined unique identifier for the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Shipping Methods added to the Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethod
     */
    
    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodReference getShippingMethod(){
        return this.shippingMethod;
    }
    
    /**
     *  <p>Determines the shipping rate and Tax Rate of the associated Line Items.</p>
     * @return shippingAddress
     */
    
    
    public com.commercetools.api.models.common.BaseAddress getShippingAddress(){
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
    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput(){
        return this.shippingRateInput;
    }
    
    /**
     *  <p>Tax Rate used for taxing a shipping expense if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }
    
    /**
     *  <p>Deliveries to be shipped with the Shipping Method.</p>
     * @return deliveries
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.order.DeliveryDraft> getDeliveries(){
        return this.deliveries;
    }
    
    /**
     *  <p>Custom Fields for Shipping.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    /**
     * builds ShippingDraft with checking for non-null required values
     * @return ShippingDraft
     */
    public ShippingDraft build() {
        Objects.requireNonNull(key, ShippingDraft.class + ": key is missing");
        Objects.requireNonNull(shippingAddress, ShippingDraft.class + ": shippingAddress is missing");
        return new ShippingDraftImpl(key, shippingMethod, shippingAddress, shippingRateInput, externalTaxRate, deliveries, custom);
    }
    
    /**
     * builds ShippingDraft without checking for non-null required values
     * @return ShippingDraft
     */
    public ShippingDraft buildUnchecked() {
        return new ShippingDraftImpl(key, shippingMethod, shippingAddress, shippingRateInput, externalTaxRate, deliveries, custom);
    }

    /**
     * factory method for an instance of ShippingDraftBuilder
     * @return builder 
     */
    public static ShippingDraftBuilder of() {
        return new ShippingDraftBuilder();
    }

    /**
     * create builder for ShippingDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingDraftBuilder of(final ShippingDraft template) {
        ShippingDraftBuilder builder = new ShippingDraftBuilder();
        builder.key = template.getKey();
        builder.shippingMethod = template.getShippingMethod();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.deliveries = template.getDeliveries();
        builder.custom = template.getCustom();
        return builder;
    }

}
