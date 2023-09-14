
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeInheritedAssociateChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeInheritedAssociateChange changeInheritedAssociateChange = ChangeInheritedAssociateChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeInheritedAssociateChangeBuilder implements Builder<ChangeInheritedAssociateChange> {

    private String change;

    private com.commercetools.history.models.common.InheritedAssociate previousValue;

    private com.commercetools.history.models.common.InheritedAssociate nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeInheritedAssociateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeInheritedAssociateChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeInheritedAssociateChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeInheritedAssociateChangeBuilder previousValue(
            final com.commercetools.history.models.common.InheritedAssociate previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeInheritedAssociateChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociateBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeInheritedAssociateChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.InheritedAssociateBuilder, com.commercetools.history.models.common.InheritedAssociate> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.InheritedAssociateBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeInheritedAssociateChangeBuilder nextValue(
            final com.commercetools.history.models.common.InheritedAssociate nextValue) {
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

    public com.commercetools.history.models.common.InheritedAssociate getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.InheritedAssociate getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeInheritedAssociateChange with checking for non-null required values
     * @return ChangeInheritedAssociateChange
     */
    public ChangeInheritedAssociateChange build() {
        Objects.requireNonNull(change, ChangeInheritedAssociateChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeInheritedAssociateChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeInheritedAssociateChange.class + ": nextValue is missing");
        return new ChangeInheritedAssociateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeInheritedAssociateChange without checking for non-null required values
     * @return ChangeInheritedAssociateChange
     */
    public ChangeInheritedAssociateChange buildUnchecked() {
        return new ChangeInheritedAssociateChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeInheritedAssociateChangeBuilder
     * @return builder
     */
    public static ChangeInheritedAssociateChangeBuilder of() {
        return new ChangeInheritedAssociateChangeBuilder();
    }

    /**
     * create builder for ChangeInheritedAssociateChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeInheritedAssociateChangeBuilder of(final ChangeInheritedAssociateChange template) {
        ChangeInheritedAssociateChangeBuilder builder = new ChangeInheritedAssociateChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
