
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCategoryOrderHintChangeBuilder implements Builder<SetCategoryOrderHintChange> {

    private String change;

    private String catalogData;

    private String categoryId;

    private com.commercetools.history.models.common.CategoryOrderHints previousValue;

    private com.commercetools.history.models.common.CategoryOrderHints nextValue;

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
            Function<com.commercetools.history.models.common.CategoryOrderHintsBuilder, com.commercetools.history.models.common.CategoryOrderHintsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    public SetCategoryOrderHintChangeBuilder previousValue(
            final com.commercetools.history.models.common.CategoryOrderHints previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetCategoryOrderHintChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CategoryOrderHintsBuilder, com.commercetools.history.models.common.CategoryOrderHintsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CategoryOrderHintsBuilder.of()).build();
        return this;
    }

    public SetCategoryOrderHintChangeBuilder nextValue(
            final com.commercetools.history.models.common.CategoryOrderHints nextValue) {
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

    public com.commercetools.history.models.common.CategoryOrderHints getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.CategoryOrderHints getNextValue() {
        return this.nextValue;
    }

    public SetCategoryOrderHintChange build() {
        Objects.requireNonNull(change, SetCategoryOrderHintChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetCategoryOrderHintChange.class + ": catalogData is missing");
        Objects.requireNonNull(categoryId, SetCategoryOrderHintChange.class + ": categoryId is missing");
        Objects.requireNonNull(previousValue, SetCategoryOrderHintChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCategoryOrderHintChange.class + ": nextValue is missing");
        return new SetCategoryOrderHintChangeImpl(change, catalogData, categoryId, previousValue, nextValue);
    }

    /**
     * builds SetCategoryOrderHintChange without checking for non null required values
     */
    public SetCategoryOrderHintChange buildUnchecked() {
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
