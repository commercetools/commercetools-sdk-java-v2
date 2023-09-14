
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeAssociateModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssociateModeChange changeAssociateModeChange = ChangeAssociateModeChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitAssociateMode.EXPLICIT)
 *             .nextValue(BusinessUnitAssociateMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeAssociateModeChangeBuilder implements Builder<ChangeAssociateModeChange> {

    private String change;

    private com.commercetools.history.models.common.BusinessUnitAssociateMode previousValue;

    private com.commercetools.history.models.common.BusinessUnitAssociateMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeAssociateModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeAssociateModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.BusinessUnitAssociateMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeAssociateModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.BusinessUnitAssociateMode nextValue) {
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

    public com.commercetools.history.models.common.BusinessUnitAssociateMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.BusinessUnitAssociateMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeAssociateModeChange with checking for non-null required values
     * @return ChangeAssociateModeChange
     */
    public ChangeAssociateModeChange build() {
        Objects.requireNonNull(change, ChangeAssociateModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeAssociateModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAssociateModeChange.class + ": nextValue is missing");
        return new ChangeAssociateModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeAssociateModeChange without checking for non-null required values
     * @return ChangeAssociateModeChange
     */
    public ChangeAssociateModeChange buildUnchecked() {
        return new ChangeAssociateModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeAssociateModeChangeBuilder
     * @return builder
     */
    public static ChangeAssociateModeChangeBuilder of() {
        return new ChangeAssociateModeChangeBuilder();
    }

    /**
     * create builder for ChangeAssociateModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssociateModeChangeBuilder of(final ChangeAssociateModeChange template) {
        ChangeAssociateModeChangeBuilder builder = new ChangeAssociateModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
