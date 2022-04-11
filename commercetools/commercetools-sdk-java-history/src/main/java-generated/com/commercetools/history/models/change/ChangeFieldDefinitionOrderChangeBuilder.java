
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeFieldDefinitionOrderChangeBuilder implements Builder<ChangeFieldDefinitionOrderChange> {

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

    public ChangeFieldDefinitionOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
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

    public ChangeFieldDefinitionOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.change_value.FieldDefinitionOrderValue... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
        return this;
    }

    public ChangeFieldDefinitionOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder, com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(
            builder.apply(com.commercetools.history.models.change_value.FieldDefinitionOrderValueBuilder.of()).build());
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
        Objects.requireNonNull(change, ChangeFieldDefinitionOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeFieldDefinitionOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeFieldDefinitionOrderChange.class + ": nextValue is missing");
        return new ChangeFieldDefinitionOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeFieldDefinitionOrderChange without checking for non null required values
     */
    public ChangeFieldDefinitionOrderChange buildUnchecked() {
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
