
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeMasterVariantChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeMasterVariantChange changeMasterVariantChange = ChangeMasterVariantChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeMasterVariantChangeBuilder implements Builder<ChangeMasterVariantChange> {

    private String change;

    private com.commercetools.history.models.common.Variant previousValue;

    private com.commercetools.history.models.common.Variant nextValue;

    private String catalogData;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.Variant> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of());
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder previousValue(
            final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.Variant> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder nextValue(final com.commercetools.history.models.common.Variant nextValue) {
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

    public ChangeMasterVariantChangeBuilder catalogData(final String catalogData) {
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

    public com.commercetools.history.models.common.Variant getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Variant getNextValue() {
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
     * builds ChangeMasterVariantChange with checking for non-null required values
     * @return ChangeMasterVariantChange
     */
    public ChangeMasterVariantChange build() {
        Objects.requireNonNull(change, ChangeMasterVariantChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeMasterVariantChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeMasterVariantChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, ChangeMasterVariantChange.class + ": catalogData is missing");
        return new ChangeMasterVariantChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * builds ChangeMasterVariantChange without checking for non-null required values
     * @return ChangeMasterVariantChange
     */
    public ChangeMasterVariantChange buildUnchecked() {
        return new ChangeMasterVariantChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * factory method for an instance of ChangeMasterVariantChangeBuilder
     * @return builder
     */
    public static ChangeMasterVariantChangeBuilder of() {
        return new ChangeMasterVariantChangeBuilder();
    }

    /**
     * create builder for ChangeMasterVariantChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeMasterVariantChangeBuilder of(final ChangeMasterVariantChange template) {
        ChangeMasterVariantChangeBuilder builder = new ChangeMasterVariantChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        return builder;
    }

}
