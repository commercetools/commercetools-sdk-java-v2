
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTypeUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTypeUpdateAction setTypeUpdateAction = SetTypeUpdateAction.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetTypeUpdateActionBuilder implements Builder<SetTypeUpdateAction> {

    private String type;

    /**
     *  <p>Value to set as the type of the PaymentIntegration.</p>
     * @param type value to be set
     * @return Builder
     */

    public SetTypeUpdateActionBuilder type(final String type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Value to set as the type of the PaymentIntegration.</p>
     * @return type
     */

    public String getType() {
        return this.type;
    }

    /**
     * builds SetTypeUpdateAction with checking for non-null required values
     * @return SetTypeUpdateAction
     */
    public SetTypeUpdateAction build() {
        Objects.requireNonNull(type, SetTypeUpdateAction.class + ": type is missing");
        return new SetTypeUpdateActionImpl(type);
    }

    /**
     * builds SetTypeUpdateAction without checking for non-null required values
     * @return SetTypeUpdateAction
     */
    public SetTypeUpdateAction buildUnchecked() {
        return new SetTypeUpdateActionImpl(type);
    }

    /**
     * factory method for an instance of SetTypeUpdateActionBuilder
     * @return builder
     */
    public static SetTypeUpdateActionBuilder of() {
        return new SetTypeUpdateActionBuilder();
    }

    /**
     * create builder for SetTypeUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTypeUpdateActionBuilder of(final SetTypeUpdateAction template) {
        SetTypeUpdateActionBuilder builder = new SetTypeUpdateActionBuilder();
        builder.type = template.getType();
        return builder;
    }

}
