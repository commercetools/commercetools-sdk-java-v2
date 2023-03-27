
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PublishChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PublishChange publishChange = PublishChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PublishChangeBuilder implements Builder<PublishChange> {

    private String change;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public PublishChangeBuilder change(final String change) {
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
     * builds PublishChange with checking for non-null required values
     * @return PublishChange
     */
    public PublishChange build() {
        Objects.requireNonNull(change, PublishChange.class + ": change is missing");
        return new PublishChangeImpl(change);
    }

    /**
     * builds PublishChange without checking for non-null required values
     * @return PublishChange
     */
    public PublishChange buildUnchecked() {
        return new PublishChangeImpl(change);
    }

    /**
     * factory method for an instance of PublishChangeBuilder
     * @return builder
     */
    public static PublishChangeBuilder of() {
        return new PublishChangeBuilder();
    }

    /**
     * create builder for PublishChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PublishChangeBuilder of(final PublishChange template) {
        PublishChangeBuilder builder = new PublishChangeBuilder();
        builder.change = template.getChange();
        return builder;
    }

}
