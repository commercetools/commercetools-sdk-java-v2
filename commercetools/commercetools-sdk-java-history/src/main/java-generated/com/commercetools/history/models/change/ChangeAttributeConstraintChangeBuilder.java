
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAttributeConstraintChangeBuilder implements Builder<ChangeAttributeConstraintChange> {

    private String change;

    private String attributeName;

    private com.commercetools.history.models.common.AttributeConstraintEnum previousValue;

    private com.commercetools.history.models.common.AttributeConstraintEnum nextValue;

    public ChangeAttributeConstraintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAttributeConstraintChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ChangeAttributeConstraintChangeBuilder previousValue(
            final com.commercetools.history.models.common.AttributeConstraintEnum previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeAttributeConstraintChangeBuilder nextValue(
            final com.commercetools.history.models.common.AttributeConstraintEnum nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.common.AttributeConstraintEnum getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.AttributeConstraintEnum getNextValue() {
        return this.nextValue;
    }

    public ChangeAttributeConstraintChange build() {
        Objects.requireNonNull(change, ChangeAttributeConstraintChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, ChangeAttributeConstraintChange.class + ": attributeName is missing");
        Objects.requireNonNull(previousValue, ChangeAttributeConstraintChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeAttributeConstraintChange.class + ": nextValue is missing");
        return new ChangeAttributeConstraintChangeImpl(change, attributeName, previousValue, nextValue);
    }

    /**
     * builds ChangeAttributeConstraintChange without checking for non null required values
     */
    public ChangeAttributeConstraintChange buildUnchecked() {
        return new ChangeAttributeConstraintChangeImpl(change, attributeName, previousValue, nextValue);
    }

    public static ChangeAttributeConstraintChangeBuilder of() {
        return new ChangeAttributeConstraintChangeBuilder();
    }

    public static ChangeAttributeConstraintChangeBuilder of(final ChangeAttributeConstraintChange template) {
        ChangeAttributeConstraintChangeBuilder builder = new ChangeAttributeConstraintChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
