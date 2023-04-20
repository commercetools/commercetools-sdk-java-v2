
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductPriceCustomTypeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductPriceCustomTypeChange setProductPriceCustomTypeChange = SetProductPriceCustomTypeChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductPriceCustomTypeChangeBuilder implements Builder<SetProductPriceCustomTypeChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     *  <p>Update action for <code>setProductPriceCustomType</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder previousValue(
            final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFields> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductPriceCustomTypeChangeBuilder nextValue(
            final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setProductPriceCustomType</code></p>
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

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetProductPriceCustomTypeChange with checking for non-null required values
     * @return SetProductPriceCustomTypeChange
     */
    public SetProductPriceCustomTypeChange build() {
        Objects.requireNonNull(change, SetProductPriceCustomTypeChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetProductPriceCustomTypeChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetProductPriceCustomTypeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductPriceCustomTypeChange.class + ": nextValue is missing");
        return new SetProductPriceCustomTypeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetProductPriceCustomTypeChange without checking for non-null required values
     * @return SetProductPriceCustomTypeChange
     */
    public SetProductPriceCustomTypeChange buildUnchecked() {
        return new SetProductPriceCustomTypeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetProductPriceCustomTypeChangeBuilder
     * @return builder
     */
    public static SetProductPriceCustomTypeChangeBuilder of() {
        return new SetProductPriceCustomTypeChangeBuilder();
    }

    /**
     * create builder for SetProductPriceCustomTypeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductPriceCustomTypeChangeBuilder of(final SetProductPriceCustomTypeChange template) {
        SetProductPriceCustomTypeChangeBuilder builder = new SetProductPriceCustomTypeChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
