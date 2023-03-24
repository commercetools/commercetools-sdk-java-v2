
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddExternalImageChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddExternalImageChange addExternalImageChange = AddExternalImageChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddExternalImageChangeBuilder implements Builder<AddExternalImageChange> {

    private String change;

    private String catalogData;

    private java.util.List<com.commercetools.history.models.common.Image> previousValue;

    private java.util.List<com.commercetools.history.models.common.Image> nextValue;

    /**
     *  <p>Update actions for adding an external image</p>
     * @param change value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param catalogData value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder previousValue(
            final com.commercetools.history.models.common.Image... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Image> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Image... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddExternalImageChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddExternalImageChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder nextValue(final com.commercetools.history.models.common.Image... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Image> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public AddExternalImageChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Image... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddExternalImageChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddExternalImageChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
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

    /**
     * builds AddExternalImageChange with checking for non-null required values
     * @return AddExternalImageChange
     */
    public AddExternalImageChange build() {
        Objects.requireNonNull(change, AddExternalImageChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, AddExternalImageChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, AddExternalImageChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddExternalImageChange.class + ": nextValue is missing");
        return new AddExternalImageChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds AddExternalImageChange without checking for non-null required values
     * @return AddExternalImageChange
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
