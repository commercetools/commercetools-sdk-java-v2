
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RevertStagedChangesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RevertStagedChangesChange revertStagedChangesChange = RevertStagedChangesChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RevertStagedChangesChangeBuilder implements Builder<RevertStagedChangesChange> {

    private String change;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RevertStagedChangesChangeBuilder change(final String change) {
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
     * builds RevertStagedChangesChange with checking for non-null required values
     * @return RevertStagedChangesChange
     */
    public RevertStagedChangesChange build() {
        Objects.requireNonNull(change, RevertStagedChangesChange.class + ": change is missing");
        return new RevertStagedChangesChangeImpl(change);
    }

    /**
     * builds RevertStagedChangesChange without checking for non-null required values
     * @return RevertStagedChangesChange
     */
    public RevertStagedChangesChange buildUnchecked() {
        return new RevertStagedChangesChangeImpl(change);
    }

    /**
     * factory method for an instance of RevertStagedChangesChangeBuilder
     * @return builder
     */
    public static RevertStagedChangesChangeBuilder of() {
        return new RevertStagedChangesChangeBuilder();
    }

    /**
     * create builder for RevertStagedChangesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RevertStagedChangesChangeBuilder of(final RevertStagedChangesChange template) {
        RevertStagedChangesChangeBuilder builder = new RevertStagedChangesChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
