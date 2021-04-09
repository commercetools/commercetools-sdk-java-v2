
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeFieldDefinitionOrderChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> previousValue;

    private java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> nextValue;

    public ChangeFieldDefinitionOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.FieldDefinitionOrderValue> getNextValue() {
        return this.nextValue;
    }

    public ChangeFieldDefinitionOrderChange build() {
        return new ChangeFieldDefinitionOrderChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeFieldDefinitionOrderChangeBuilder of() {
        return new ChangeFieldDefinitionOrderChangeBuilder();
    }

    public static ChangeFieldDefinitionOrderChangeBuilder of(final ChangeFieldDefinitionOrderChange template) {
        ChangeFieldDefinitionOrderChangeBuilder builder = new ChangeFieldDefinitionOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
