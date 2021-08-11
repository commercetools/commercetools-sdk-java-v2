
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTargetLineItemsChangeValueBuilder implements Builder<ChangeTargetLineItemsChangeValue> {

    private String predicate;

    public ChangeTargetLineItemsChangeValueBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public ChangeTargetLineItemsChangeValue build() {
        Objects.requireNonNull(predicate, ChangeTargetLineItemsChangeValue.class + ": predicate is missing");
        return new ChangeTargetLineItemsChangeValueImpl(predicate);
    }

    /**
     * builds ChangeTargetLineItemsChangeValue without checking for non null required values
     */
    public ChangeTargetLineItemsChangeValue buildUnchecked() {
        return new ChangeTargetLineItemsChangeValueImpl(predicate);
    }

    public static ChangeTargetLineItemsChangeValueBuilder of() {
        return new ChangeTargetLineItemsChangeValueBuilder();
    }

    public static ChangeTargetLineItemsChangeValueBuilder of(final ChangeTargetLineItemsChangeValue template) {
        ChangeTargetLineItemsChangeValueBuilder builder = new ChangeTargetLineItemsChangeValueBuilder();
        builder.predicate = template.getPredicate();
        return builder;
    }

}
