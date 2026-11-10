
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeIncludedInStatisticsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeIncludedInStatisticsChange changeIncludedInStatisticsChange = ChangeIncludedInStatisticsChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeIncludedInStatisticsChangeBuilder implements Builder<ChangeIncludedInStatisticsChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeIncludedInStatisticsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeIncludedInStatisticsChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeIncludedInStatisticsChangeBuilder nextValue(final Boolean nextValue) {
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

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public Boolean getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeIncludedInStatisticsChange with checking for non-null required values
     * @return ChangeIncludedInStatisticsChange
     */
    public ChangeIncludedInStatisticsChange build() {
        Objects.requireNonNull(change, ChangeIncludedInStatisticsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeIncludedInStatisticsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeIncludedInStatisticsChange.class + ": nextValue is missing");
        return new ChangeIncludedInStatisticsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeIncludedInStatisticsChange without checking for non-null required values
     * @return ChangeIncludedInStatisticsChange
     */
    public ChangeIncludedInStatisticsChange buildUnchecked() {
        return new ChangeIncludedInStatisticsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeIncludedInStatisticsChangeBuilder
     * @return builder
     */
    public static ChangeIncludedInStatisticsChangeBuilder of() {
        return new ChangeIncludedInStatisticsChangeBuilder();
    }

    /**
     * create builder for ChangeIncludedInStatisticsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeIncludedInStatisticsChangeBuilder of(final ChangeIncludedInStatisticsChange template) {
        ChangeIncludedInStatisticsChangeBuilder builder = new ChangeIncludedInStatisticsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
