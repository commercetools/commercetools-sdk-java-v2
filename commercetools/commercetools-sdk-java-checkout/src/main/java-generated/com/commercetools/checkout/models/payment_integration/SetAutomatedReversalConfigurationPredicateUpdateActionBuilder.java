
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAutomatedReversalConfigurationPredicateUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAutomatedReversalConfigurationPredicateUpdateAction setAutomatedReversalConfigurationPredicateUpdateAction = SetAutomatedReversalConfigurationPredicateUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAutomatedReversalConfigurationPredicateUpdateActionBuilder
        implements Builder<SetAutomatedReversalConfigurationPredicateUpdateAction> {

    @Nullable
    private String predicate;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public SetAutomatedReversalConfigurationPredicateUpdateActionBuilder predicate(@Nullable final String predicate) {
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
     * builds SetAutomatedReversalConfigurationPredicateUpdateAction with checking for non-null required values
     * @return SetAutomatedReversalConfigurationPredicateUpdateAction
     */
    public SetAutomatedReversalConfigurationPredicateUpdateAction build() {
        return new SetAutomatedReversalConfigurationPredicateUpdateActionImpl(predicate);
    }

    /**
     * builds SetAutomatedReversalConfigurationPredicateUpdateAction without checking for non-null required values
     * @return SetAutomatedReversalConfigurationPredicateUpdateAction
     */
    public SetAutomatedReversalConfigurationPredicateUpdateAction buildUnchecked() {
        return new SetAutomatedReversalConfigurationPredicateUpdateActionImpl(predicate);
    }

    /**
     * factory method for an instance of SetAutomatedReversalConfigurationPredicateUpdateActionBuilder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationPredicateUpdateActionBuilder of() {
        return new SetAutomatedReversalConfigurationPredicateUpdateActionBuilder();
    }

    /**
     * create builder for SetAutomatedReversalConfigurationPredicateUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAutomatedReversalConfigurationPredicateUpdateActionBuilder of(
            final SetAutomatedReversalConfigurationPredicateUpdateAction template) {
        SetAutomatedReversalConfigurationPredicateUpdateActionBuilder builder = new SetAutomatedReversalConfigurationPredicateUpdateActionBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
