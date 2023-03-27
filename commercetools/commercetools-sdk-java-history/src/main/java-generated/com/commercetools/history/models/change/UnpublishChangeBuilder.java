
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnpublishChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnpublishChange unpublishChange = UnpublishChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnpublishChangeBuilder implements Builder<UnpublishChange> {

    private String change;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public UnpublishChangeBuilder change(final String change) {
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
     * builds UnpublishChange with checking for non-null required values
     * @return UnpublishChange
     */
    public UnpublishChange build() {
        Objects.requireNonNull(change, UnpublishChange.class + ": change is missing");
        return new UnpublishChangeImpl(change);
    }

    /**
     * builds UnpublishChange without checking for non-null required values
     * @return UnpublishChange
     */
    public UnpublishChange buildUnchecked() {
        return new UnpublishChangeImpl(change);
    }

    /**
     * factory method for an instance of UnpublishChangeBuilder
     * @return builder
     */
    public static UnpublishChangeBuilder of() {
        return new UnpublishChangeBuilder();
    }

    /**
     * create builder for UnpublishChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnpublishChangeBuilder of(final UnpublishChange template) {
        UnpublishChangeBuilder builder = new UnpublishChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
