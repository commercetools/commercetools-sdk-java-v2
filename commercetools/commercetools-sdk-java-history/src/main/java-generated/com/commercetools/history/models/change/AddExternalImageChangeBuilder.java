
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddExternalImageChangeBuilder implements Builder<AddExternalImageChange> {

    private String change;

    private String catalogData;

    private java.util.List<com.commercetools.history.models.common.Image> previousValue;

    private java.util.List<com.commercetools.history.models.common.Image> nextValue;

    public AddExternalImageChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddExternalImageChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public AddExternalImageChangeBuilder previousValue(
            final com.commercetools.history.models.common.Image... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public AddExternalImageChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Image> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public AddExternalImageChangeBuilder nextValue(final com.commercetools.history.models.common.Image... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public AddExternalImageChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Image> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getCatalogData() {
        return this.catalogData;
    }

    public java.util.List<com.commercetools.history.models.common.Image> getPreviousValue() {
        return this.previousValue;
    }

    public java.util.List<com.commercetools.history.models.common.Image> getNextValue() {
        return this.nextValue;
    }

    public AddExternalImageChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(catalogData);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
        return new AddExternalImageChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds AddExternalImageChange without checking for non null required values
     */
    public AddExternalImageChange buildUnchecked() {
        return new AddExternalImageChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static AddExternalImageChangeBuilder of() {
        return new AddExternalImageChangeBuilder();
    }

    public static AddExternalImageChangeBuilder of(final AddExternalImageChange template) {
        AddExternalImageChangeBuilder builder = new AddExternalImageChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
