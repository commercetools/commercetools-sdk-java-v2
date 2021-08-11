
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddToCategoryChangeBuilder implements Builder<AddToCategoryChange> {

    private String change;

    private com.commercetools.history.models.common.Reference category;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    public AddToCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddToCategoryChangeBuilder category(final com.commercetools.history.models.common.Reference category) {
        this.category = category;
        return this;
    }

    public AddToCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public AddToCategoryChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddToCategoryChangeBuilder nextValue(final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public AddToCategoryChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Reference> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getCategory() {
        return this.category;
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.Reference> getNextValue() {
        return this.nextValue;
    }

    public AddToCategoryChange build() {
        Objects.requireNonNull(change, AddToCategoryChange.class + ": change is missing");
        Objects.requireNonNull(category, AddToCategoryChange.class + ": category is missing");
        Objects.requireNonNull(previousValue, AddToCategoryChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddToCategoryChange.class + ": nextValue is missing");
        return new AddToCategoryChangeImpl(change, category, previousValue, nextValue);
    }

    /**
     * builds AddToCategoryChange without checking for non null required values
     */
    public AddToCategoryChange buildUnchecked() {
        return new AddToCategoryChangeImpl(change, category, previousValue, nextValue);
    }

    public static AddToCategoryChangeBuilder of() {
        return new AddToCategoryChangeBuilder();
    }

    public static AddToCategoryChangeBuilder of(final AddToCategoryChange template) {
        AddToCategoryChangeBuilder builder = new AddToCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.category = template.getCategory();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
