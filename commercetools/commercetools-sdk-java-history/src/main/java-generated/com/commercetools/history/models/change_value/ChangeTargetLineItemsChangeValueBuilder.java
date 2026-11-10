
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeTargetLineItemsChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeTargetLineItemsChangeValue changeTargetLineItemsChangeValue = ChangeTargetLineItemsChangeValue.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeTargetLineItemsChangeValueBuilder implements Builder<ChangeTargetLineItemsChangeValue> {

    private String predicate;

    /**
     *  <p>Valid <span>LineItem target predicate</span>.</p>
     * @param predicate value to be set
     * @return Builder
     */

    public ChangeTargetLineItemsChangeValueBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    /**
     *  <p>Valid <span>LineItem target predicate</span>.</p>
     * @return predicate
     */

    public String getPredicate() {
        return this.predicate;
    }

    /**
     * builds ChangeTargetLineItemsChangeValue with checking for non-null required values
     * @return ChangeTargetLineItemsChangeValue
     */
    public ChangeTargetLineItemsChangeValue build() {
        Objects.requireNonNull(predicate, ChangeTargetLineItemsChangeValue.class + ": predicate is missing");
        return new ChangeTargetLineItemsChangeValueImpl(predicate);
    }

    /**
     * builds ChangeTargetLineItemsChangeValue without checking for non-null required values
     * @return ChangeTargetLineItemsChangeValue
     */
    public ChangeTargetLineItemsChangeValue buildUnchecked() {
        return new ChangeTargetLineItemsChangeValueImpl(predicate);
    }

    /**
     * factory method for an instance of ChangeTargetLineItemsChangeValueBuilder
     * @return builder
     */
    public static ChangeTargetLineItemsChangeValueBuilder of() {
        return new ChangeTargetLineItemsChangeValueBuilder();
    }

    /**
     * create builder for ChangeTargetLineItemsChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeTargetLineItemsChangeValueBuilder of(final ChangeTargetLineItemsChangeValue template) {
        ChangeTargetLineItemsChangeValueBuilder builder = new ChangeTargetLineItemsChangeValueBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
