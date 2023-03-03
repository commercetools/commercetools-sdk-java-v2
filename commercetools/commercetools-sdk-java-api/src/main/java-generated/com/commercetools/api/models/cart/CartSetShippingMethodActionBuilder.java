
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetShippingMethodAction cartSetShippingMethodAction = CartSetShippingMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingMethodActionBuilder implements Builder<CartSetShippingMethodAction> {

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     */

    public CartSetShippingMethodActionBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     *  <p>If the referenced Shipping Method has a predicate that does not match the Cart, an InvalidOperation error is returned.</p>
     */

    public CartSetShippingMethodActionBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     */

    public CartSetShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
     */

    public CartSetShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public CartSetShippingMethodAction build() {
        return new CartSetShippingMethodActionImpl(shippingMethod, externalTaxRate);
    }

    /**
     * builds CartSetShippingMethodAction without checking for non null required values
     */
    public CartSetShippingMethodAction buildUnchecked() {
        return new CartSetShippingMethodActionImpl(shippingMethod, externalTaxRate);
    }

    public static CartSetShippingMethodActionBuilder of() {
        return new CartSetShippingMethodActionBuilder();
    }

    public static CartSetShippingMethodActionBuilder of(final CartSetShippingMethodAction template) {
        CartSetShippingMethodActionBuilder builder = new CartSetShippingMethodActionBuilder();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
