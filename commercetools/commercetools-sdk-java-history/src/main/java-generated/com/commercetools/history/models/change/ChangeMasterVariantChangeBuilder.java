
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
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeMasterVariantChangeBuilder implements Builder<ChangeMasterVariantChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.Variant previousValue;

    private com.commercetools.history.models.common.Variant nextValue;

    /**
     *  <p>Update action for <code>changeMasterVariant</code></p>
     * @param change value to be set
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder previousValue(
            final com.commercetools.history.models.common.Variant previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.VariantBuilder, com.commercetools.history.models.common.VariantBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.VariantBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangeMasterVariantChangeBuilder nextValue(final com.commercetools.history.models.common.Variant nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>changeMasterVariant</code></p>
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

    public com.commercetools.history.models.common.Variant getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Variant getNextValue() {
        return this.nextValue;
    }

    /**
     * builds ChangeMasterVariantChange with checking for non-null required values
     * @return ChangeMasterVariantChange
     */
    public ChangeMasterVariantChange build() {
        Objects.requireNonNull(change, ChangeMasterVariantChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, ChangeMasterVariantChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, ChangeMasterVariantChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeMasterVariantChange.class + ": nextValue is missing");
        return new ChangeMasterVariantChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds ChangeMasterVariantChange without checking for non-null required values
     * @return ChangeMasterVariantChange
     */
    public ChangeMasterVariantChange buildUnchecked() {
        return new ChangeMasterVariantChangeImpl(change, catalogData, previousValue, nextValue);
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
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
