
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveFromCategoryChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.Reference category;

    private java.util.List<com.commercetools.history.models.common.Reference> previousValue;

    private java.util.List<com.commercetools.history.models.common.Reference> nextValue;

    public RemoveFromCategoryChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveFromCategoryChangeBuilder category(final com.commercetools.history.models.common.Reference category) {
        this.category = category;
        return this;
    }

    public RemoveFromCategoryChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public RemoveFromCategoryChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Reference> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveFromCategoryChangeBuilder nextValue(
            final com.commercetools.history.models.common.Reference... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public RemoveFromCategoryChangeBuilder nextValue(
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

    public RemoveFromCategoryChange build() {
        return new RemoveFromCategoryChangeImpl(change, category, previousValue, nextValue);
    }

    public static RemoveFromCategoryChangeBuilder of() {
        return new RemoveFromCategoryChangeBuilder();
    }

    public static RemoveFromCategoryChangeBuilder of(final RemoveFromCategoryChange template) {
        RemoveFromCategoryChangeBuilder builder = new RemoveFromCategoryChangeBuilder();
        builder.change = template.getChange();
        builder.category = template.getCategory();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
