
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeApprovalRuleModeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeApprovalRuleModeChange changeApprovalRuleModeChange = ChangeApprovalRuleModeChange.builder()
 *             .change("{change}")
 *             .previousValue(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .nextValue(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeApprovalRuleModeChangeBuilder implements Builder<ChangeApprovalRuleModeChange> {

    private String change;

    private com.commercetools.history.models.common.BusinessUnitApprovalRuleMode previousValue;

    private com.commercetools.history.models.common.BusinessUnitApprovalRuleMode nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeApprovalRuleModeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeApprovalRuleModeChangeBuilder previousValue(
            final com.commercetools.history.models.common.BusinessUnitApprovalRuleMode previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeApprovalRuleModeChangeBuilder nextValue(
            final com.commercetools.history.models.common.BusinessUnitApprovalRuleMode nextValue) {
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

    public com.commercetools.history.models.common.BusinessUnitApprovalRuleMode getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.BusinessUnitApprovalRuleMode getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeApprovalRuleModeChange with checking for non-null required values
     * @return ChangeApprovalRuleModeChange
     */
    public ChangeApprovalRuleModeChange build() {
        Objects.requireNonNull(change, ChangeApprovalRuleModeChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeApprovalRuleModeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeApprovalRuleModeChange.class + ": nextValue is missing");
        return new ChangeApprovalRuleModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeApprovalRuleModeChange without checking for non-null required values
     * @return ChangeApprovalRuleModeChange
     */
    public ChangeApprovalRuleModeChange buildUnchecked() {
        return new ChangeApprovalRuleModeChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of ChangeApprovalRuleModeChangeBuilder
     * @return builder
     */
    public static ChangeApprovalRuleModeChangeBuilder of() {
        return new ChangeApprovalRuleModeChangeBuilder();
    }

    /**
     * create builder for ChangeApprovalRuleModeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeApprovalRuleModeChangeBuilder of(final ChangeApprovalRuleModeChange template) {
        ChangeApprovalRuleModeChangeBuilder builder = new ChangeApprovalRuleModeChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
