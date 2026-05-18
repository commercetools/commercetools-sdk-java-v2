
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLastVariantIdChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLastVariantIdChange changeLastVariantIdChange = ChangeLastVariantIdChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeLastVariantIdChangeBuilder implements Builder<ChangeLastVariantIdChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeLastVariantIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeLastVariantIdChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeLastVariantIdChangeBuilder nextValue(final Integer nextValue) {
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

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeLastVariantIdChange with checking for non-null required values
     * @return ChangeLastVariantIdChange
     */
    public ChangeLastVariantIdChange build() {
        Objects.requireNonNull(change, ChangeLastVariantIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeLastVariantIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeLastVariantIdChange.class + ": nextValue is missing");
        return new ChangeLastVariantIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeLastVariantIdChange without checking for non-null required values
     * @return ChangeLastVariantIdChange
     */
    public ChangeLastVariantIdChange buildUnchecked() {
        return new ChangeLastVariantIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeLastVariantIdChangeBuilder
     * @return builder
     */
    public static ChangeLastVariantIdChangeBuilder of() {
        return new ChangeLastVariantIdChangeBuilder();
    }

    /**
     * create builder for ChangeLastVariantIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLastVariantIdChangeBuilder of(final ChangeLastVariantIdChange template) {
        ChangeLastVariantIdChangeBuilder builder = new ChangeLastVariantIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
