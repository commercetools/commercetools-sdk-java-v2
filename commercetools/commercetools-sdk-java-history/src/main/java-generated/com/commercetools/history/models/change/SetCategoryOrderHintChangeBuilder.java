
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCategoryOrderHintChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCategoryOrderHintChange setCategoryOrderHintChange = SetCategoryOrderHintChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .categoryId("{categoryId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCategoryOrderHintChangeBuilder implements Builder<SetCategoryOrderHintChange> {

    private String change;

    private com.commercetools.history.models.common.CategoryOrderHints previousValue;

    private com.commercetools.history.models.common.CategoryOrderHints nextValue;

    private String catalogData;

    private String categoryId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CategoryOrderHintsBuilder, com.commercetools.history.models.common.CategoryOrderHintsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CategoryOrderHintsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CategoryOrderHintsBuilder, com.commercetools.history.models.common.CategoryOrderHints> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CategoryOrderHintsBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder previousValue(
            final com.commercetools.history.models.common.CategoryOrderHints previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CategoryOrderHintsBuilder, com.commercetools.history.models.common.CategoryOrderHintsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CategoryOrderHintsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CategoryOrderHintsBuilder, com.commercetools.history.models.common.CategoryOrderHints> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CategoryOrderHintsBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder nextValue(
            final com.commercetools.history.models.common.CategoryOrderHints nextValue) {
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

    public SetCategoryOrderHintChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p><code>id</code> of the updated Category.</p>
     * @param categoryId value to be set
     * @return Builder
     */

    public SetCategoryOrderHintChangeBuilder categoryId(final String categoryId) {
        this.categoryId = categoryId;
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

    public com.commercetools.history.models.common.CategoryOrderHints getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.CategoryOrderHints getNextValue() {
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
     *  <p><code>id</code> of the updated Category.</p>
     * @return categoryId
     */

    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * builds SetCategoryOrderHintChange with checking for non-null required values
     * @return SetCategoryOrderHintChange
     */
    public SetCategoryOrderHintChange build() {
        Objects.requireNonNull(change, SetCategoryOrderHintChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetCategoryOrderHintChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetCategoryOrderHintChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetCategoryOrderHintChange.class + ": catalogData is missing");
        Objects.requireNonNull(categoryId, SetCategoryOrderHintChange.class + ": categoryId is missing");
        return new SetCategoryOrderHintChangeImpl(change, previousValue, nextValue, catalogData, categoryId);
    }

    /**
     * builds SetCategoryOrderHintChange without checking for non-null required values
     * @return SetCategoryOrderHintChange
     */
    public SetCategoryOrderHintChange buildUnchecked() {
        return new SetCategoryOrderHintChangeImpl(change, previousValue, nextValue, catalogData, categoryId);
    }

    /**
     * factory method for an instance of SetCategoryOrderHintChangeBuilder
     * @return builder
     */
    public static SetCategoryOrderHintChangeBuilder of() {
        return new SetCategoryOrderHintChangeBuilder();
    }

    /**
     * create builder for SetCategoryOrderHintChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCategoryOrderHintChangeBuilder of(final SetCategoryOrderHintChange template) {
        SetCategoryOrderHintChangeBuilder builder = new SetCategoryOrderHintChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.categoryId = template.getCategoryId();
        return builder;
    }

}
