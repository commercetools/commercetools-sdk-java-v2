
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingMethodAction stagedOrderSetShippingMethodAction = StagedOrderSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetShippingMethodActionBuilder implements Builder<StagedOrderSetShippingMethodAction> {

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     *  <p>Value to set. If empty, any existing value will be removed. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public StagedOrderSetShippingMethodActionBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param builder function to build the shippingMethod value
     * @return Builder
     */

    public StagedOrderSetShippingMethodActionBuilder withShippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @param shippingMethod value to be set
     * @return Builder
     */

    public StagedOrderSetShippingMethodActionBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetShippingMethodActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderSetShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     * @return shippingMethod
     */

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     * builds StagedOrderSetShippingMethodAction with checking for non-null required values
     * @return StagedOrderSetShippingMethodAction
     */
    public StagedOrderSetShippingMethodAction build() {
        return new StagedOrderSetShippingMethodActionImpl(shippingMethod, externalTaxRate);
    }

    /**
     * builds StagedOrderSetShippingMethodAction without checking for non-null required values
     * @return StagedOrderSetShippingMethodAction
     */
    public StagedOrderSetShippingMethodAction buildUnchecked() {
        return new StagedOrderSetShippingMethodActionImpl(shippingMethod, externalTaxRate);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingMethodActionBuilder
     * @return builder
     */
    public static StagedOrderSetShippingMethodActionBuilder of() {
        return new StagedOrderSetShippingMethodActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingMethodActionBuilder of(final StagedOrderSetShippingMethodAction template) {
        StagedOrderSetShippingMethodActionBuilder builder = new StagedOrderSetShippingMethodActionBuilder();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
