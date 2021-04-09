
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAttributeChangeBuilder {

    private String change;

    private String catalogData;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    public SetAttributeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAttributeChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public SetAttributeChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetAttributeChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public SetAttributeChange build() {
        return new SetAttributeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static SetAttributeChangeBuilder of() {
        return new SetAttributeChangeBuilder();
    }

    public static SetAttributeChangeBuilder of(final SetAttributeChange template) {
        SetAttributeChangeBuilder builder = new SetAttributeChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
