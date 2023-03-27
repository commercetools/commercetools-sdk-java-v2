
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
     * @param taxMode value to be set
     * @return Builder
     */

    public MyCartChangeTaxModeActionBuilder taxMode(final com.commercetools.api.models.cart.TaxMode taxMode) {
        this.taxMode = taxMode;
        return this;
    }

    /**
     *  <p>The new TaxMode.</p>
     * @return taxMode
     */

    public com.commercetools.api.models.cart.TaxMode getTaxMode() {
        return this.taxMode;
    }

    /**
     * builds MyCartChangeTaxModeAction with checking for non-null required values
     * @return MyCartChangeTaxModeAction
     */
    public MyCartChangeTaxModeAction build() {
        Objects.requireNonNull(taxMode, MyCartChangeTaxModeAction.class + ": taxMode is missing");
        return new MyCartChangeTaxModeActionImpl(taxMode);
    }

    /**
     * builds MyCartChangeTaxModeAction without checking for non-null required values
     * @return MyCartChangeTaxModeAction
     */
    public MyCartChangeTaxModeAction buildUnchecked() {
        return new MyCartChangeTaxModeActionImpl(taxMode);
    }

    /**
     * factory method for an instance of MyCartChangeTaxModeActionBuilder
     * @return builder
     */
    public static MyCartChangeTaxModeActionBuilder of() {
        return new MyCartChangeTaxModeActionBuilder();
    }

    /**
     * create builder for MyCartChangeTaxModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartChangeTaxModeActionBuilder of(final MyCartChangeTaxModeAction template) {
        MyCartChangeTaxModeActionBuilder builder = new MyCartChangeTaxModeActionBuilder();
        builder.taxMode = template.getTaxMode();
        return builder;
    }

}
