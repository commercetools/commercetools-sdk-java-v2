
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
     *
     */

    public ChangeTargetCustomLineItemsChangeValueBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public ChangeTargetCustomLineItemsChangeValue build() {
        Objects.requireNonNull(predicate, ChangeTargetCustomLineItemsChangeValue.class + ": predicate is missing");
        return new ChangeTargetCustomLineItemsChangeValueImpl(predicate);
    }

    /**
     * builds ChangeTargetCustomLineItemsChangeValue without checking for non null required values
     */
    public ChangeTargetCustomLineItemsChangeValue buildUnchecked() {
        return new ChangeTargetCustomLineItemsChangeValueImpl(predicate);
    }

    public static ChangeTargetCustomLineItemsChangeValueBuilder of() {
        return new ChangeTargetCustomLineItemsChangeValueBuilder();
    }

    public static ChangeTargetCustomLineItemsChangeValueBuilder of(
            final ChangeTargetCustomLineItemsChangeValue template) {
        ChangeTargetCustomLineItemsChangeValueBuilder builder = new ChangeTargetCustomLineItemsChangeValueBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
