
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingAddressAndShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAndShippingMethodAction stagedOrderSetShippingAddressAndShippingMethodAction = StagedOrderSetShippingAddressAndShippingMethodAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingAddressAndShippingMethodActionBuilder
        implements Builder<StagedOrderSetShippingAddressAndShippingMethodAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder withAddress(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     * @param address value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder withShippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Value to set for <code>shippingAddress</code>.</p>
     * @return address
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     *  <p>Value to set.</p>
     * @return shippingMethod
     */

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     * builds StagedOrderSetShippingAddressAndShippingMethodAction with checking for non-null required values
     * @return StagedOrderSetShippingAddressAndShippingMethodAction
     */
    public StagedOrderSetShippingAddressAndShippingMethodAction build() {
        Objects.requireNonNull(address,
            StagedOrderSetShippingAddressAndShippingMethodAction.class + ": address is missing");
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl(address, shippingMethod, externalTaxRate);
    }

    /**
     * builds StagedOrderSetShippingAddressAndShippingMethodAction without checking for non-null required values
     * @return StagedOrderSetShippingAddressAndShippingMethodAction
     */
    public StagedOrderSetShippingAddressAndShippingMethodAction buildUnchecked() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl(address, shippingMethod, externalTaxRate);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingAddressAndShippingMethodActionBuilder
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder of() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingAddressAndShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder of(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder = new StagedOrderSetShippingAddressAndShippingMethodActionBuilder();
        builder.address = template.getAddress();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
