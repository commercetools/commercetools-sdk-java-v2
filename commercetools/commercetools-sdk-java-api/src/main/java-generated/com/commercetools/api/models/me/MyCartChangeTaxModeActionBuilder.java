
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartChangeTaxModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartChangeTaxModeAction myCartChangeTaxModeAction = MyCartChangeTaxModeAction.builder()
 *             .taxMode(TaxMode.PLATFORM)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartChangeTaxModeActionBuilder implements Builder<MyCartChangeTaxModeAction> {

    private com.commercetools.api.models.cart.TaxMode taxMode;

    /**
     *  <p>The new TaxMode.</p>
     * @param taxMode
     * @return Builder
     */

    public MyCartChangeTaxModeActionBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    public MyCartChangeTaxModeAction build() {
        Objects.requireNonNull(taxMode, MyCartChangeTaxModeAction.class + ": taxMode is missing");
        return new MyCartChangeTaxModeActionImpl(taxMode);
    }

    /**
     * builds MyCartChangeTaxModeAction without checking for non null required values
     */
    public MyCartChangeTaxModeAction buildUnchecked() {
        return new MyCartChangeTaxModeActionImpl(taxMode);
    }

    public static MyCartChangeTaxModeActionBuilder of() {
        return new MyCartChangeTaxModeActionBuilder();
    }

    public static MyCartChangeTaxModeActionBuilder of(final MyCartChangeTaxModeAction template) {
        MyCartChangeTaxModeActionBuilder builder = new MyCartChangeTaxModeActionBuilder();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
