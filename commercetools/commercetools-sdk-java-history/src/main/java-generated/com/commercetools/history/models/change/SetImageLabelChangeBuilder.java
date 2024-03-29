
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
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetImageLabelChangeBuilder implements Builder<SetImageLabelChange> {

    private String change;

    private com.commercetools.history.models.common.Image previousValue;

    private com.commercetools.history.models.common.Image nextValue;

    private String catalogData;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder previousValue(final com.commercetools.history.models.common.Image previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.ImageBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetImageLabelChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ImageBuilder, com.commercetools.history.models.common.Image> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ImageBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder nextValue(final com.commercetools.history.models.common.Image nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public SetImageLabelChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
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

    public com.commercetools.history.models.common.Image getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Image getNextValue() {
        return this.nextValue;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     * builds SetImageLabelChange with checking for non-null required values
     * @return SetImageLabelChange
     */
    public SetImageLabelChange build() {
        Objects.requireNonNull(change, SetImageLabelChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetImageLabelChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetImageLabelChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetImageLabelChange.class + ": catalogData is missing");
        return new SetImageLabelChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * builds SetImageLabelChange without checking for non-null required values
     * @return SetImageLabelChange
     */
    public SetImageLabelChange buildUnchecked() {
        return new SetImageLabelChangeImpl(change, previousValue, nextValue, catalogData);
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
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        return builder;
    }

}
