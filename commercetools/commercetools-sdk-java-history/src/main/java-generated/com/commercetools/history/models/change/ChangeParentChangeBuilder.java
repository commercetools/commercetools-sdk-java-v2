
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeParentChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeParentChange changeParentChange = ChangeParentChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeParentChangeBuilder implements Builder<ChangeParentChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     *  <p>Shape of the action for <code>changeParent</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeParentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeParentChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeParentChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeParentChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeParentChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeParentChange with checking for non-null required values
     * @return ChangeParentChange
     */
    public ChangeParentChange build() {
        Objects.requireNonNull(change, ChangeParentChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeParentChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeParentChange.class + ": nextValue is missing");
        return new ChangeParentChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeParentChange without checking for non-null required values
     * @return ChangeParentChange
     */
    public ChangeParentChange buildUnchecked() {
        return new ChangeParentChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeParentChangeBuilder of() {
        return new ChangeParentChangeBuilder();
    }

    public static ChangeParentChangeBuilder of(final ChangeParentChange template) {
        ChangeParentChangeBuilder builder = new ChangeParentChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
