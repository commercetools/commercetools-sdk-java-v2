
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLabelChangeBuilder implements Builder<ChangeLabelChange> {

    private String change;

    private String fieldName;

    private String attributeName;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    public ChangeLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeLabelChangeBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public ChangeLabelChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    public ChangeLabelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLabelChangeBuilder nextValue(final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeLabelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ChangeLabelChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public ChangeLabelChange build() {
        Objects.requireNonNull(change, ChangeLabelChange.class + ": change is missing");
        Objects.requireNonNull(fieldName, ChangeLabelChange.class + ": fieldName is missing");
        Objects.requireNonNull(attributeName, ChangeLabelChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangeLabelChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangeLabelChange.class + ": previousValue is missing");
        return new ChangeLabelChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangeLabelChange without checking for non null required values
     */
    public ChangeLabelChange buildUnchecked() {
        return new ChangeLabelChangeImpl(change, fieldName, attributeName, nextValue, previousValue);
    }

    public static ChangeLabelChangeBuilder of() {
        return new ChangeLabelChangeBuilder();
    }

    public static ChangeLabelChangeBuilder of(final ChangeLabelChange template) {
        ChangeLabelChangeBuilder builder = new ChangeLabelChangeBuilder();
        builder.change = template.getChange();
        builder.fieldName = template.getFieldName();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
