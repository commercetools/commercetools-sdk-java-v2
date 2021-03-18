
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeAssetOrderChangeBuilder {

    private String change;

    private java.util.List<com.commercetools.history.models.LocalizedString> previousValue;

    private java.util.List<com.commercetools.history.models.LocalizedString> nextValue;

    public ChangeAssetOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeAssetOrderChangeBuilder previousValue(
            final com.commercetools.history.models.LocalizedString... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public ChangeAssetOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.LocalizedString> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeAssetOrderChangeBuilder nextValue(
            final com.commercetools.history.models.LocalizedString... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public ChangeAssetOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.LocalizedString> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.util.List<com.commercetools.history.models.LocalizedString> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.LocalizedString> getNextValue() {
        return this.nextValue;
    }

    public ChangeAssetOrderChange build() {
        return new ChangeAssetOrderChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeAssetOrderChangeBuilder of() {
        return new ChangeAssetOrderChangeBuilder();
    }

    public static ChangeAssetOrderChangeBuilder of(final ChangeAssetOrderChange template) {
        ChangeAssetOrderChangeBuilder builder = new ChangeAssetOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
