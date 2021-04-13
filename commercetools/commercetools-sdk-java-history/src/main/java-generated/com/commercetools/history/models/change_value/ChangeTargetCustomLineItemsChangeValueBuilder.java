
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeTargetCustomLineItemsChangeValueBuilder {

    private String predicate;

    public ChangeTargetCustomLineItemsChangeValueBuilder predicate(final String predicate) {
        this.predicate = predicate;
        return this;
    }

    public String getPredicate() {
        return this.predicate;
    }

    public ChangeTargetCustomLineItemsChangeValue build() {
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
