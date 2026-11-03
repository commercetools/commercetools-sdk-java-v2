
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetMethodInfoTokenChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoTokenChange setMethodInfoTokenChange = SetMethodInfoTokenChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetMethodInfoTokenChangeBuilder implements Builder<SetMethodInfoTokenChange> {

    private String change;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetMethodInfoTokenChangeBuilder change(final String change) {
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
     * builds SetMethodInfoTokenChange with checking for non-null required values
     * @return SetMethodInfoTokenChange
     */
    public SetMethodInfoTokenChange build() {
        Objects.requireNonNull(change, SetMethodInfoTokenChange.class + ": change is missing");
        return new SetMethodInfoTokenChangeImpl(change);
    }

    /**
     * builds SetMethodInfoTokenChange without checking for non-null required values
     * @return SetMethodInfoTokenChange
     */
    public SetMethodInfoTokenChange buildUnchecked() {
        return new SetMethodInfoTokenChangeImpl(change);
    }

    /**
     * factory method for an instance of SetMethodInfoTokenChangeBuilder
     * @return builder
     */
    public static SetMethodInfoTokenChangeBuilder of() {
        return new SetMethodInfoTokenChangeBuilder();
    }

    /**
     * create builder for SetMethodInfoTokenChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoTokenChangeBuilder of(final SetMethodInfoTokenChange template) {
        SetMethodInfoTokenChangeBuilder builder = new SetMethodInfoTokenChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
