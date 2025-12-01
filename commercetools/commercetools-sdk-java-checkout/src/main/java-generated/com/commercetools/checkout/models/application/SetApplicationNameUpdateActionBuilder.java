
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationNameUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationNameUpdateAction setApplicationNameUpdateAction = SetApplicationNameUpdateAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationNameUpdateActionBuilder implements Builder<SetApplicationNameUpdateAction> {

    private String name;

    /**
     *  <p>New name to assign to the Application.</p>
     * @param name value to be set
     * @return Builder
     */

    public SetApplicationNameUpdateActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New name to assign to the Application.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds SetApplicationNameUpdateAction with checking for non-null required values
     * @return SetApplicationNameUpdateAction
     */
    public SetApplicationNameUpdateAction build() {
        Objects.requireNonNull(name, SetApplicationNameUpdateAction.class + ": name is missing");
        return new SetApplicationNameUpdateActionImpl(name);
    }

    /**
     * builds SetApplicationNameUpdateAction without checking for non-null required values
     * @return SetApplicationNameUpdateAction
     */
    public SetApplicationNameUpdateAction buildUnchecked() {
        return new SetApplicationNameUpdateActionImpl(name);
    }

    /**
     * factory method for an instance of SetApplicationNameUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationNameUpdateActionBuilder of() {
        return new SetApplicationNameUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationNameUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationNameUpdateActionBuilder of(final SetApplicationNameUpdateAction template) {
        SetApplicationNameUpdateActionBuilder builder = new SetApplicationNameUpdateActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
