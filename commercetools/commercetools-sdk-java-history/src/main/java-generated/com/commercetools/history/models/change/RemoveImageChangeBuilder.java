
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveImageChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveImageChange removeImageChange = RemoveImageChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveImageChangeBuilder implements Builder<RemoveImageChange> {

    private String change;

    private String catalogData;

    private java.util.List<com.commercetools.history.models.common.Image> previousValue;

    private java.util.List<com.commercetools.history.models.common.Image> nextValue;

    /**
     *  <p>Update actions for removing images</p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveImageChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @param catalogData value to be set
     * @return Builder
     */

    public RemoveImageChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveImageChangeBuilder previousValue(
            final com.commercetools.history.models.common.Image... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveImageChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Image> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveImageChangeBuilder plusPreviousValue(
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

    public RemoveImageChangeBuilder plusPreviousValue(
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

    public RemoveImageChangeBuilder withPreviousValue(
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

    public RemoveImageChangeBuilder nextValue(final com.commercetools.history.models.common.Image... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveImageChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Image> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public RemoveImageChangeBuilder plusNextValue(final com.commercetools.history.models.common.Image... nextValue) {
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

    public RemoveImageChangeBuilder plusNextValue(
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

    public RemoveImageChangeBuilder withNextValue(
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
     * builds RemoveImageChange with checking for non-null required values
     * @return RemoveImageChange
     */
    public RemoveImageChange build() {
        Objects.requireNonNull(change, RemoveImageChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, RemoveImageChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, RemoveImageChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveImageChange.class + ": nextValue is missing");
        return new RemoveImageChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds RemoveImageChange without checking for non-null required values
     * @return RemoveImageChange
     */
    public RemoveImageChange buildUnchecked() {
        return new RemoveImageChangeImpl(change, catalogData, previousValue, nextValue);
    }

    public static RemoveImageChangeBuilder of() {
        return new RemoveImageChangeBuilder();
    }

    public static RemoveImageChangeBuilder of(final RemoveImageChange template) {
        RemoveImageChangeBuilder builder = new RemoveImageChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
