
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetCustomLineItemsChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetCustomLineItemsChangeValue changeTargetCustomLineItemsChangeValue = ChangeTargetCustomLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetCustomLineItemsChangeValueBuilder implements Builder<ChangeTargetCustomLineItemsChangeValue> {

    private String predicate;

    /**
     * set the value to the predicate
     * @param predicate value to be set
     * @return Builder
     */

    public ChangeTargetCustomLineItemsChangeValueBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     * value of predicate}
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     * builds ChangeTargetCustomLineItemsChangeValue with checking for non-null required values
     * @return ChangeTargetCustomLineItemsChangeValue
     */
    public ChangeTargetCustomLineItemsChangeValue build() {
        Objects.requireNonNull(predicate, ChangeTargetCustomLineItemsChangeValue.class + ": predicate is missing");
        return new ChangeTargetCustomLineItemsChangeValueImpl(predicate);
    }

    /**
     * builds ChangeTargetCustomLineItemsChangeValue without checking for non-null required values
     * @return ChangeTargetCustomLineItemsChangeValue
     */
    public ChangeTargetCustomLineItemsChangeValue buildUnchecked() {
        return new ChangeTargetCustomLineItemsChangeValueImpl(predicate);
    }

    /**
     * factory method for an instance of ChangeTargetCustomLineItemsChangeValueBuilder
     * @return builder
     */
    public static ChangeTargetCustomLineItemsChangeValueBuilder of() {
        return new ChangeTargetCustomLineItemsChangeValueBuilder();
    }

    /**
     * create builder for ChangeTargetCustomLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetCustomLineItemsChangeValueBuilder of(
            final ChangeTargetCustomLineItemsChangeValue template) {
        ChangeTargetCustomLineItemsChangeValueBuilder builder = new ChangeTargetCustomLineItemsChangeValueBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
