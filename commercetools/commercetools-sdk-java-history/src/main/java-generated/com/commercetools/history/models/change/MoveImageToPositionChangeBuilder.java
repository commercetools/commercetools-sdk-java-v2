
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoveImageToPositionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoveImageToPositionChange moveImageToPositionChange = MoveImageToPositionChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoveImageToPositionChangeBuilder implements Builder<MoveImageToPositionChange> {

    private String change;

    private java.util.List<com.commercetools.history.models.common.Image> previousValue;

    private java.util.List<com.commercetools.history.models.common.Image> nextValue;

    private String catalogData;

    private String variant;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder previousValue(
            final com.commercetools.history.models.common.Image... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.common.Image> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.common.Image... previousValue) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.addAll(Arrays.asList(previousValue));
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder addPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return plusPreviousValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder setPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return previousValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder nextValue(
            final com.commercetools.history.models.common.Image... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.common.Image> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder plusNextValue(
            final com.commercetools.history.models.common.Image... nextValue) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.addAll(Arrays.asList(nextValue));
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder addNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return plusNextValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder setNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        return nextValue(builder.apply(com.commercetools.history.models.common.ImageBuilder.of()));
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public MoveImageToPositionChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public java.util.List<com.commercetools.history.models.common.Image> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public java.util.List<com.commercetools.history.models.common.Image> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     * builds MoveImageToPositionChange with checking for non-null required values
     * @return MoveImageToPositionChange
     */
    public MoveImageToPositionChange build() {
        Objects.requireNonNull(change, MoveImageToPositionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, MoveImageToPositionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, MoveImageToPositionChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, MoveImageToPositionChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, MoveImageToPositionChange.class + ": variant is missing");
        return new MoveImageToPositionChangeImpl(change, previousValue, nextValue, catalogData, variant);
    }

    /**
     * builds MoveImageToPositionChange without checking for non-null required values
     * @return MoveImageToPositionChange
     */
    public MoveImageToPositionChange buildUnchecked() {
        return new MoveImageToPositionChangeImpl(change, previousValue, nextValue, catalogData, variant);
    }

    /**
     * factory method for an instance of MoveImageToPositionChangeBuilder
     * @return builder
     */
    public static MoveImageToPositionChangeBuilder of() {
        return new MoveImageToPositionChangeBuilder();
    }

    /**
     * create builder for MoveImageToPositionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoveImageToPositionChangeBuilder of(final MoveImageToPositionChange template) {
        MoveImageToPositionChangeBuilder builder = new MoveImageToPositionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        return builder;
    }

}
