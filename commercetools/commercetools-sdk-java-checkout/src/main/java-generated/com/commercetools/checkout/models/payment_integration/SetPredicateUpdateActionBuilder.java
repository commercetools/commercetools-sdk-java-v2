
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPredicateUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPredicateUpdateAction setPredicateUpdateAction = SetPredicateUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPredicateUpdateActionBuilder implements Builder<SetPredicateUpdateAction> {

    @Nullable
    private String predicate;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public SetPredicateUpdateActionBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return predicate
     */

    @Nullable
    public String getPredicate() {
        return this.predicate;
    }

    /**
     * builds SetPredicateUpdateAction with checking for non-null required values
     * @return SetPredicateUpdateAction
     */
    public SetPredicateUpdateAction build() {
        return new SetPredicateUpdateActionImpl(predicate);
    }

    /**
     * builds SetPredicateUpdateAction without checking for non-null required values
     * @return SetPredicateUpdateAction
     */
    public SetPredicateUpdateAction buildUnchecked() {
        return new SetPredicateUpdateActionImpl(predicate);
    }

    /**
     * factory method for an instance of SetPredicateUpdateActionBuilder
     * @return builder
     */
    public static SetPredicateUpdateActionBuilder of() {
        return new SetPredicateUpdateActionBuilder();
    }

    /**
     * create builder for SetPredicateUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPredicateUpdateActionBuilder of(final SetPredicateUpdateAction template) {
        SetPredicateUpdateActionBuilder builder = new SetPredicateUpdateActionBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
