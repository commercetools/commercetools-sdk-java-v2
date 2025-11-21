
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAllowAllOriginsUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAllowAllOriginsUpdateAction setAllowAllOriginsUpdateAction = SetAllowAllOriginsUpdateAction.builder()
 *             .allowAll(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAllowAllOriginsUpdateActionBuilder implements Builder<SetAllowAllOriginsUpdateAction> {

    private Boolean allowAll;

    /**
     *  <p>Whether to allow all origins or not.</p>
     * @param allowAll value to be set
     * @return Builder
     */

    public SetAllowAllOriginsUpdateActionBuilder allowAll(final Boolean allowAll) {
        this.allowAll = allowAll;
        return this;
    }

    /**
     *  <p>Whether to allow all origins or not.</p>
     * @return allowAll
     */

    public Boolean getAllowAll() {
        return this.allowAll;
    }

    /**
     * builds SetAllowAllOriginsUpdateAction with checking for non-null required values
     * @return SetAllowAllOriginsUpdateAction
     */
    public SetAllowAllOriginsUpdateAction build() {
        Objects.requireNonNull(allowAll, SetAllowAllOriginsUpdateAction.class + ": allowAll is missing");
        return new SetAllowAllOriginsUpdateActionImpl(allowAll);
    }

    /**
     * builds SetAllowAllOriginsUpdateAction without checking for non-null required values
     * @return SetAllowAllOriginsUpdateAction
     */
    public SetAllowAllOriginsUpdateAction buildUnchecked() {
        return new SetAllowAllOriginsUpdateActionImpl(allowAll);
    }

    /**
     * factory method for an instance of SetAllowAllOriginsUpdateActionBuilder
     * @return builder
     */
    public static SetAllowAllOriginsUpdateActionBuilder of() {
        return new SetAllowAllOriginsUpdateActionBuilder();
    }

    /**
     * create builder for SetAllowAllOriginsUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAllowAllOriginsUpdateActionBuilder of(final SetAllowAllOriginsUpdateAction template) {
        SetAllowAllOriginsUpdateActionBuilder builder = new SetAllowAllOriginsUpdateActionBuilder();
        builder.allowAll = template.getAllowAll();
        return builder;
    }

}
