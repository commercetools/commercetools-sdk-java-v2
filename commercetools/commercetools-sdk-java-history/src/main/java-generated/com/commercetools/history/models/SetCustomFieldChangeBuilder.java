
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetCustomFieldChangeBuilder {

    private String change;

    private String name;

    private String customTypeId;

    private java.lang.Object nextValue;

    private java.lang.Object previousValue;

    public SetCustomFieldChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetCustomFieldChangeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public SetCustomFieldChangeBuilder customTypeId(final String customTypeId) {
        this.customTypeId = customTypeId;
        return this;
    }

    public SetCustomFieldChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetCustomFieldChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getName() {
        return this.name;
    }

    public String getCustomTypeId() {
        return this.customTypeId;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public SetCustomFieldChange build() {
        return new SetCustomFieldChangeImpl(change, name, customTypeId, nextValue, previousValue);
    }

    public static SetCustomFieldChangeBuilder of() {
        return new SetCustomFieldChangeBuilder();
    }

    public static SetCustomFieldChangeBuilder of(final SetCustomFieldChange template) {
        SetCustomFieldChangeBuilder builder = new SetCustomFieldChangeBuilder();
        builder.change = template.getChange();
        builder.name = template.getName();
        builder.customTypeId = template.getCustomTypeId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
