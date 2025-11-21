
package com.commercetools.checkout.models.payment_integration;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AutomatedReversalConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AutomatedReversalConfiguration automatedReversalConfiguration = AutomatedReversalConfiguration.builder()
 *             .status("{status}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AutomatedReversalConfigurationBuilder implements Builder<AutomatedReversalConfiguration> {

    private String status;

    @Nullable
    private String predicate;

    /**
     *  <p>Indicates whether the automated reversal configuration is active or not.</p>
     * @param status value to be set
     * @return Builder
     */

    public AutomatedReversalConfigurationBuilder status(final String status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Cart-based predicate in JSONata format to determine when automated reversal should be applied.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public AutomatedReversalConfigurationBuilder predicate(@Nullable final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Indicates whether the automated reversal configuration is active or not.</p>
     * @return status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     *  <p>Cart-based predicate in JSONata format to determine when automated reversal should be applied.</p>
     * @return predicate
     */

    @Nullable
    public String getPredicate() {
        return this.predicate;
    }

    /**
     * builds AutomatedReversalConfiguration with checking for non-null required values
     * @return AutomatedReversalConfiguration
     */
    public AutomatedReversalConfiguration build() {
        Objects.requireNonNull(status, AutomatedReversalConfiguration.class + ": status is missing");
        return new AutomatedReversalConfigurationImpl(status, predicate);
    }

    /**
     * builds AutomatedReversalConfiguration without checking for non-null required values
     * @return AutomatedReversalConfiguration
     */
    public AutomatedReversalConfiguration buildUnchecked() {
        return new AutomatedReversalConfigurationImpl(status, predicate);
    }

    /**
     * factory method for an instance of AutomatedReversalConfigurationBuilder
     * @return builder
     */
    public static AutomatedReversalConfigurationBuilder of() {
        return new AutomatedReversalConfigurationBuilder();
    }

    /**
     * create builder for AutomatedReversalConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AutomatedReversalConfigurationBuilder of(final AutomatedReversalConfiguration template) {
        AutomatedReversalConfigurationBuilder builder = new AutomatedReversalConfigurationBuilder();
        builder.status = template.getStatus();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
