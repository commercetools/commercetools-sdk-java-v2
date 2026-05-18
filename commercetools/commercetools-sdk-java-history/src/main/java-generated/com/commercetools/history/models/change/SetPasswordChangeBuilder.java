
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPasswordChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPasswordChange setPasswordChange = SetPasswordChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPasswordChangeBuilder implements Builder<SetPasswordChange> {

    private String change;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetPasswordChangeBuilder change(final String change) {
        this.change = change;
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
     * builds SetPasswordChange with checking for non-null required values
     * @return SetPasswordChange
     */
    public SetPasswordChange build() {
        Objects.requireNonNull(change, SetPasswordChange.class + ": change is missing");
        return new SetPasswordChangeImpl(change);
    }

    /**
     * builds SetPasswordChange without checking for non-null required values
     * @return SetPasswordChange
     */
    public SetPasswordChange buildUnchecked() {
        return new SetPasswordChangeImpl(change);
    }

    /**
     * factory method for an instance of SetPasswordChangeBuilder
     * @return builder
     */
    public static SetPasswordChangeBuilder of() {
        return new SetPasswordChangeBuilder();
    }

    /**
     * create builder for SetPasswordChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPasswordChangeBuilder of(final SetPasswordChange template) {
        SetPasswordChangeBuilder builder = new SetPasswordChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
