
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MethodExternalTaxRateDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MethodExternalTaxRateDraft methodExternalTaxRateDraft = MethodExternalTaxRateDraft.builder()
 *             .shippingMethodKey("{shippingMethodKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MethodExternalTaxRateDraftBuilder implements Builder<MethodExternalTaxRateDraft> {

    private String shippingMethodKey;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @param shippingMethodKey value to be set
     * @return Builder
     */

    public MethodExternalTaxRateDraftBuilder shippingMethodKey(final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
        return this;
    }

    /**
     *  <p>External Tax Rate for the Shipping Method, if the Cart has <code>External</code> TaxMode.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public MethodExternalTaxRateDraftBuilder taxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>External Tax Rate for the Shipping Method, if the Cart has <code>External</code> TaxMode.</p>
     * @param builder function to build the taxRate value
     * @return Builder
     */

    public MethodExternalTaxRateDraftBuilder withTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.taxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>External Tax Rate for the Shipping Method, if the Cart has <code>External</code> TaxMode.</p>
     * @param taxRate value to be set
     * @return Builder
     */

    public MethodExternalTaxRateDraftBuilder taxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     * @return shippingMethodKey
     */

    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    /**
     *  <p>External Tax Rate for the Shipping Method, if the Cart has <code>External</code> TaxMode.</p>
     * @return taxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    /**
     * builds MethodExternalTaxRateDraft with checking for non-null required values
     * @return MethodExternalTaxRateDraft
     */
    public MethodExternalTaxRateDraft build() {
        Objects.requireNonNull(shippingMethodKey, MethodExternalTaxRateDraft.class + ": shippingMethodKey is missing");
        return new MethodExternalTaxRateDraftImpl(shippingMethodKey, taxRate);
    }

    /**
     * builds MethodExternalTaxRateDraft without checking for non-null required values
     * @return MethodExternalTaxRateDraft
     */
    public MethodExternalTaxRateDraft buildUnchecked() {
        return new MethodExternalTaxRateDraftImpl(shippingMethodKey, taxRate);
    }

    /**
     * factory method for an instance of MethodExternalTaxRateDraftBuilder
     * @return builder
     */
    public static MethodExternalTaxRateDraftBuilder of() {
        return new MethodExternalTaxRateDraftBuilder();
    }

    /**
     * create builder for MethodExternalTaxRateDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MethodExternalTaxRateDraftBuilder of(final MethodExternalTaxRateDraft template) {
        MethodExternalTaxRateDraftBuilder builder = new MethodExternalTaxRateDraftBuilder();
        builder.shippingMethodKey = template.getShippingMethodKey();
        builder.taxRate = template.getTaxRate();
        return builder;
    }

}
