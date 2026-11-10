
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
     *  <p>User-defined unique identifier of the Shipping in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public ShippingBuilder shippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Automatically set when the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public ShippingBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Automatically set when the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public ShippingBuilder withShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfo> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Automatically set when the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public ShippingBuilder shippingInfo(final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public ShippingBuilder shippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @param builder function to build the shippingAddress value
     * @return Builder
     */

    public ShippingBuilder withShippingAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.shippingAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @param shippingAddress value to be set
     * @return Builder
     */

    public ShippingBuilder shippingAddress(final com.commercetools.api.models.common.Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    /**
     *  <p>Used as an input to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public ShippingBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>Used as an input to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public ShippingBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of Shipping with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param builder function to build the shippingCustomFields value
     * @return Builder
     */

    public ShippingBuilder shippingCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.shippingCustomFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of Shipping with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param builder function to build the shippingCustomFields value
     * @return Builder
     */

    public ShippingBuilder withShippingCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.shippingCustomFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of Shipping with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingCustomFields value to be set
     * @return Builder
     */

    public ShippingBuilder shippingCustomFields(
            @Nullable final com.commercetools.api.models.type.CustomFields shippingCustomFields) {
        this.shippingCustomFields = shippingCustomFields;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping in a Cart with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Automatically set when the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartAddShippingMethodAction" rel="nofollow">Shipping Method is added</a>.</p>
     * @return shippingInfo
     */

    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p>Determines the shipping rates and Tax Rates of associated Line Items.</p>
     * @return shippingAddress
     */

    public com.commercetools.api.models.common.Address getShippingAddress() {
        return this.shippingAddress;
    }

    /**
     *  <p>Used as an input to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInput" rel="nofollow">ClassificationShippingRateInput</a>.</li>
     *   <li>If <code>CartScore</code>, it is <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInput" rel="nofollow">ScoreShippingRateInput</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be used.</li>
     *  </ul>
     * @return shippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>Custom Fields of Shipping with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingCustomFields
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getShippingCustomFields() {
        return this.shippingCustomFields;
    }

    /**
     * builds Shipping with checking for non-null required values
     * @return Shipping
     */
    public Shipping build() {
        Objects.requireNonNull(shippingKey, Shipping.class + ": shippingKey is missing");
        Objects.requireNonNull(shippingInfo, Shipping.class + ": shippingInfo is missing");
        Objects.requireNonNull(shippingAddress, Shipping.class + ": shippingAddress is missing");
        return new ShippingImpl(shippingKey, shippingInfo, shippingAddress, shippingRateInput, shippingCustomFields);
    }

    /**
     * builds Shipping without checking for non-null required values
     * @return Shipping
     */
    public Shipping buildUnchecked() {
        return new ShippingImpl(shippingKey, shippingInfo, shippingAddress, shippingRateInput, shippingCustomFields);
    }

    /**
     * factory method for an instance of ShippingBuilder
     * @return builder
     */
    public static ShippingBuilder of() {
        return new ShippingBuilder();
    }

    /**
     * create builder for Shipping instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
