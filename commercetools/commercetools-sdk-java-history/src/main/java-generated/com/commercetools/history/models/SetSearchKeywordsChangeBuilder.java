
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetSearchKeywordsChangeBuilder {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.SearchKeywords previousValue;

    private com.commercetools.history.models.SearchKeywords nextValue;

    public SetSearchKeywordsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetSearchKeywordsChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetSearchKeywordsChangeBuilder previousValue(
            final com.commercetools.history.models.SearchKeywords previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetSearchKeywordsChangeBuilder nextValue(final com.commercetools.history.models.SearchKeywords nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public com.commercetools.history.models.SearchKeywords getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.SearchKeywords getNextValue() {
        return this.nextValue;
    }

    public SetSearchKeywordsChange build() {
        return new SetSearchKeywordsChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetSearchKeywordsChangeBuilder of() {
        return new SetSearchKeywordsChangeBuilder();
    }

    public static SetSearchKeywordsChangeBuilder of(final SetSearchKeywordsChange template) {
        SetSearchKeywordsChangeBuilder builder = new SetSearchKeywordsChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
