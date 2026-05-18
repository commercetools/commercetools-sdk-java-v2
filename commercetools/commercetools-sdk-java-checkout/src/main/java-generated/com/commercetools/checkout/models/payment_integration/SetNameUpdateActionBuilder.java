
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetNameUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetNameUpdateAction setNameUpdateAction = SetNameUpdateAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetNameUpdateActionBuilder implements Builder<SetNameUpdateAction> {

    private String name;

    /**
     *  <p>Value to set as the name of the PaymentIntegration.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetNameUpdateActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set as the name of the PaymentIntegration.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds SetNameUpdateAction with checking for non-null required values
     * @return SetNameUpdateAction
     */
    public SetNameUpdateAction build() {
        Objects.requireNonNull(name, SetNameUpdateAction.class + ": name is missing");
        return new SetNameUpdateActionImpl(name);
    }

    /**
     * builds SetNameUpdateAction without checking for non-null required values
     * @return SetNameUpdateAction
     */
    public SetNameUpdateAction buildUnchecked() {
        return new SetNameUpdateActionImpl(name);
    }

    /**
     * factory method for an instance of SetNameUpdateActionBuilder
     * @return builder
     */
    public static SetNameUpdateActionBuilder of() {
        return new SetNameUpdateActionBuilder();
    }

    /**
     * create builder for SetNameUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetNameUpdateActionBuilder of(final SetNameUpdateAction template) {
        SetNameUpdateActionBuilder builder = new SetNameUpdateActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
