
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCategoryOrderHintChangeBuilder {

    private String change;

    private String catalogData;

    private String categoryId;

    private com.commercetools.history.models.CategoryOrderHints previousValue;

    private com.commercetools.history.models.CategoryOrderHints nextValue;

    public SetCategoryOrderHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCategoryOrderHintChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetCategoryOrderHintChangeBuilder categoryId(final String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public SetCategoryOrderHintChangeBuilder previousValue(
            final com.commercetools.history.models.CategoryOrderHints previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCategoryOrderHintChangeBuilder nextValue(
            final com.commercetools.history.models.CategoryOrderHints nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public com.commercetools.history.models.CategoryOrderHints getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.CategoryOrderHints getNextValue() {
        return this.nextValue;
    }

    public SetCategoryOrderHintChange build() {
        return new SetCategoryOrderHintChangeImpl(change, catalogData, categoryId, previousValue, nextValue);
    }

    public static SetCategoryOrderHintChangeBuilder of() {
        return new SetCategoryOrderHintChangeBuilder();
    }

    public static SetCategoryOrderHintChangeBuilder of(final SetCategoryOrderHintChange template) {
        SetCategoryOrderHintChangeBuilder builder = new SetCategoryOrderHintChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.categoryId = template.getCategoryId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
