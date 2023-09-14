
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeParentUnitChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeParentUnitChange changeParentUnitChange = ChangeParentUnitChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeParentUnitChangeBuilder implements Builder<ChangeParentUnitChange> {

    private String change;

    private com.commercetools.history.models.common.KeyReference previousValue;

    private com.commercetools.history.models.common.KeyReference nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeParentUnitChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeParentUnitChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeParentUnitChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeParentUnitChangeBuilder previousValue(
            final com.commercetools.history.models.common.KeyReference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeParentUnitChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeParentUnitChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.KeyReferenceBuilder, com.commercetools.history.models.common.KeyReference> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.KeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeParentUnitChangeBuilder nextValue(
            final com.commercetools.history.models.common.KeyReference nextValue) {
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

    public com.commercetools.history.models.common.KeyReference getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.KeyReference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeParentUnitChange with checking for non-null required values
     * @return ChangeParentUnitChange
     */
    public ChangeParentUnitChange build() {
        Objects.requireNonNull(change, ChangeParentUnitChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeParentUnitChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeParentUnitChange.class + ": nextValue is missing");
        return new ChangeParentUnitChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeParentUnitChange without checking for non-null required values
     * @return ChangeParentUnitChange
     */
    public ChangeParentUnitChange buildUnchecked() {
        return new ChangeParentUnitChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeParentUnitChangeBuilder
     * @return builder
     */
    public static ChangeParentUnitChangeBuilder of() {
        return new ChangeParentUnitChangeBuilder();
    }

    /**
     * create builder for ChangeParentUnitChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeParentUnitChangeBuilder of(final ChangeParentUnitChange template) {
        ChangeParentUnitChangeBuilder builder = new ChangeParentUnitChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
