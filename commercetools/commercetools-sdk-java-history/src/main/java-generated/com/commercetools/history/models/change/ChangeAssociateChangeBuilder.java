
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAssociateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssociateChange changeAssociateChange = ChangeAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAssociateChangeBuilder implements Builder<ChangeAssociateChange> {

    private String change;

    private com.commercetools.history.models.common.Associate previousValue;

    private com.commercetools.history.models.common.Associate nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeAssociateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAssociateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeAssociateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAssociateChangeBuilder previousValue(
            final com.commercetools.history.models.common.Associate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAssociateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.AssociateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeAssociateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.AssociateBuilder, com.commercetools.history.models.common.Associate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.AssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAssociateChangeBuilder nextValue(final com.commercetools.history.models.common.Associate nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public com.commercetools.history.models.common.Associate getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Associate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeAssociateChange with checking for non-null required values
     * @return ChangeAssociateChange
     */
    public ChangeAssociateChange build() {
        Objects.requireNonNull(change, ChangeAssociateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAssociateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAssociateChange.class + ": nextValue is missing");
        return new ChangeAssociateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAssociateChange without checking for non-null required values
     * @return ChangeAssociateChange
     */
    public ChangeAssociateChange buildUnchecked() {
        return new ChangeAssociateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeAssociateChangeBuilder
     * @return builder
     */
    public static ChangeAssociateChangeBuilder of() {
        return new ChangeAssociateChangeBuilder();
    }

    /**
     * create builder for ChangeAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssociateChangeBuilder of(final ChangeAssociateChange template) {
        ChangeAssociateChangeBuilder builder = new ChangeAssociateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
