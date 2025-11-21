
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RevertStagedVariantChangesChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RevertStagedVariantChangesChange revertStagedVariantChangesChange = RevertStagedVariantChangesChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RevertStagedVariantChangesChangeBuilder implements Builder<RevertStagedVariantChangesChange> {

    private String change;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public RevertStagedVariantChangesChangeBuilder change(final String change) {
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
     * builds RevertStagedVariantChangesChange with checking for non-null required values
     * @return RevertStagedVariantChangesChange
     */
    public RevertStagedVariantChangesChange build() {
        Objects.requireNonNull(change, RevertStagedVariantChangesChange.class + ": change is missing");
        return new RevertStagedVariantChangesChangeImpl(change);
    }

    /**
     * builds RevertStagedVariantChangesChange without checking for non-null required values
     * @return RevertStagedVariantChangesChange
     */
    public RevertStagedVariantChangesChange buildUnchecked() {
        return new RevertStagedVariantChangesChangeImpl(change);
    }

    /**
     * factory method for an instance of RevertStagedVariantChangesChangeBuilder
     * @return builder
     */
    public static RevertStagedVariantChangesChangeBuilder of() {
        return new RevertStagedVariantChangesChangeBuilder();
    }

    /**
     * create builder for RevertStagedVariantChangesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RevertStagedVariantChangesChangeBuilder of(final RevertStagedVariantChangesChange template) {
        RevertStagedVariantChangesChangeBuilder builder = new RevertStagedVariantChangesChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
