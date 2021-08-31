
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MoveImageToPositionChangeBuilder implements Builder<MoveImageToPositionChange> {

    private String change;

    private String catalogData;

    private java.util.List<com.commercetools.history.models.common.Image> previousValue;

    private java.util.List<com.commercetools.history.models.common.Image> nextValue;

    public MoveImageToPositionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public MoveImageToPositionChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    public MoveImageToPositionChangeBuilder previousValue(
            final com.commercetools.history.models.common.Image... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    public MoveImageToPositionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    public MoveImageToPositionChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    public MoveImageToPositionChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Image> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public MoveImageToPositionChangeBuilder nextValue(
            final com.commercetools.history.models.common.Image... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    public MoveImageToPositionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    public MoveImageToPositionChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    public MoveImageToPositionChangeBuilder nextValue(
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

    public MoveImageToPositionChange build() {
        Objects.requireNonNull(change, MoveImageToPositionChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, MoveImageToPositionChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, MoveImageToPositionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, MoveImageToPositionChange.class + ": nextValue is missing");
        return new MoveImageToPositionChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds MoveImageToPositionChange without checking for non null required values
     */
    public MoveImageToPositionChange buildUnchecked() {
        return new MoveImageToPositionChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static MoveImageToPositionChangeBuilder of() {
        return new MoveImageToPositionChangeBuilder();
    }

    public static MoveImageToPositionChangeBuilder of(final MoveImageToPositionChange template) {
        MoveImageToPositionChangeBuilder builder = new MoveImageToPositionChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
