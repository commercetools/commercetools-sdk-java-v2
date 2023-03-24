
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMaxApplicationsChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMaxApplicationsChange setMaxApplicationsChange = SetMaxApplicationsChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMaxApplicationsChangeBuilder implements Builder<SetMaxApplicationsChange> {

    private String change;

    private Integer previousValue;

    private Integer nextValue;

    /**
     *  <p>Shape of the action for <code>setMaxApplications</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetMaxApplicationsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public SetMaxApplicationsChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public SetMaxApplicationsChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetMaxApplicationsChange with checking for non-null required values
     * @return SetMaxApplicationsChange
     */
    public SetMaxApplicationsChange build() {
        Objects.requireNonNull(change, SetMaxApplicationsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMaxApplicationsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMaxApplicationsChange.class + ": nextValue is missing");
        return new SetMaxApplicationsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMaxApplicationsChange without checking for non-null required values
     * @return SetMaxApplicationsChange
     */
    public SetMaxApplicationsChange buildUnchecked() {
        return new SetMaxApplicationsChangeImpl(change, previousValue, nextValue);
    }

    public static SetMaxApplicationsChangeBuilder of() {
        return new SetMaxApplicationsChangeBuilder();
    }

    public static SetMaxApplicationsChangeBuilder of(final SetMaxApplicationsChange template) {
        SetMaxApplicationsChangeBuilder builder = new SetMaxApplicationsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
