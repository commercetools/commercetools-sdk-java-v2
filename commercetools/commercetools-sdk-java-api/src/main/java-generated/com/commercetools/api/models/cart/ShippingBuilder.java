
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Shipping shipping = Shipping.builder()
 *             .shippingKey("{shippingKey}")
 *             .shippingInfo(shippingInfoBuilder -> shippingInfoBuilder)
 *             .shippingAddress(shippingAddressBuilder -> shippingAddressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingBuilder implements Builder<Shipping> {

    private String shippingKey;

    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    private com.commercetools.api.models.common.Address shippingAddress;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    @Nullable
    private com.commercetools.api.models.type.CustomFields shippingCustomFields;

    /**
     *  <p>User-defined unique identifier of the Shipping in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey
     * @return Builder
     */

    public ShippingBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Automatically set when the Shipping Method is added.</p>
     * @return Builder
     */

    public ShippingBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set when the Shipping Method is added.</p>
     * @param shippingInfo
     * @return Builder
     */

    public ShippingBuilder shippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @return Builder
     */

    public ShippingBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @param shippingAddress
     * @return Builder
     */

    public ShippingBuilder shippingAddress(final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput
     * @return Builder
     */

    public ShippingBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Used as an input to select a ShippingRatePriceTier. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the Project:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is ClassificationShippingRateInput.</li>
     *   <li>If <code>CartScore</code>, it is ScoreShippingRateInput.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @return Builder
     */

    public ShippingBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of Shipping.</p>
     * @return Builder
     */

    public ShippingBuilder shippingCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.shippingCustomFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of Shipping.</p>
     * @param shippingCustomFields
     * @return Builder
     */

    public ShippingBuilder shippingCustomFields(
            @Nullable final com.commercetools.api.models.type.CustomFields shippingCustomFields) {
        this.shippingCustomFields = shippingCustomFields;
        return this;
    }

    public String getShippingKey() {
        return this.shippingKey;
    }

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getShippingCustomFields() {
        return this.shippingCustomFields;
    }

    public Shipping build() {
        Objects.requireNonNull(shippingKey, Shipping.class + ": shippingKey is missing");
        Objects.requireNonNull(shippingInfo, Shipping.class + ": shippingInfo is missing");
        Objects.requireNonNull(shippingAddress, Shipping.class + ": shippingAddress is missing");
        return new ShippingImpl(shippingKey, shippingInfo, shippingAddress, shippingRateInput, shippingCustomFields);
    }

    /**
     * builds Shipping without checking for non null required values
     */
    public Shipping buildUnchecked() {
        return new ShippingImpl(shippingKey, shippingInfo, shippingAddress, shippingRateInput, shippingCustomFields);
    }

    public static ShippingBuilder of() {
        return new ShippingBuilder();
    }

    public static ShippingBuilder of(final Shipping template) {
        ShippingBuilder builder = new ShippingBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.shippingInfo = template.getShippingInfo();
        builder.shippingAddress = template.getShippingAddress();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.shippingCustomFields = template.getShippingCustomFields();
        return builder;
    }

}
