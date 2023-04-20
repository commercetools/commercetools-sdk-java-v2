
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetImageLabelChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetImageLabelChange setImageLabelChange = SetImageLabelChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetImageLabelChangeBuilder implements Builder<SetImageLabelChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Image previousValue;

    private com.commercetools.history.models.common.Image nextValue;

    /**
     *  <p>Update action for <code>setImageLabel</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder previousValue(final com.commercetools.history.models.common.Image previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder nextValue(final com.commercetools.history.models.common.Image nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setImageLabel</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of catalogData}
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Image getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Image getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetImageLabelChange with checking for non-null required values
     * @return SetImageLabelChange
     */
    public SetImageLabelChange build() {
        Objects.requireNonNull(change, SetImageLabelChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetImageLabelChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetImageLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetImageLabelChange.class + ": nextValue is missing");
        return new SetImageLabelChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetImageLabelChange without checking for non-null required values
     * @return SetImageLabelChange
     */
    public SetImageLabelChange buildUnchecked() {
        return new SetImageLabelChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetImageLabelChangeBuilder
     * @return builder
     */
    public static SetImageLabelChangeBuilder of() {
        return new SetImageLabelChangeBuilder();
    }

    /**
     * create builder for SetImageLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetImageLabelChangeBuilder of(final SetImageLabelChange template) {
        SetImageLabelChangeBuilder builder = new SetImageLabelChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
