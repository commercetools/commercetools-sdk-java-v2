
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAttributeChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAttributeChange setAttributeChange = SetAttributeChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAttributeChangeBuilder implements Builder<SetAttributeChange> {

    private String change;

    private String catalogData;

    private com.commercetools.history.models.change_value.AttributeValue previousValue;

    private com.commercetools.history.models.change_value.AttributeValue nextValue;

    /**
     *  <p>Update action for <code>setAttribute</code></p>
     * @param change value to be set
     * @return Builder
     */

    public SetAttributeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */

    public SetAttributeChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public SetAttributeChangeBuilder previousValue(
            Function<com.commercetools.history.models.change_value.AttributeValueBuilder, com.commercetools.history.models.change_value.AttributeValueBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.change_value.AttributeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public SetAttributeChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.AttributeValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public SetAttributeChangeBuilder nextValue(
            Function<com.commercetools.history.models.change_value.AttributeValueBuilder, com.commercetools.history.models.change_value.AttributeValueBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.change_value.AttributeValueBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public SetAttributeChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.AttributeValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for <code>setAttribute</code></p>
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

    public com.commercetools.history.models.change_value.AttributeValue getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.change_value.AttributeValue getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetAttributeChange with checking for non-null required values
     * @return SetAttributeChange
     */
    public SetAttributeChange build() {
        Objects.requireNonNull(change, SetAttributeChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetAttributeChange.class + ": catalogData is missing");
        Objects.requireNonNull(previousValue, SetAttributeChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAttributeChange.class + ": nextValue is missing");
        return new SetAttributeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * builds SetAttributeChange without checking for non-null required values
     * @return SetAttributeChange
     */
    public SetAttributeChange buildUnchecked() {
        return new SetAttributeChangeImpl(change, catalogData, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetAttributeChangeBuilder
     * @return builder
     */
    public static SetAttributeChangeBuilder of() {
        return new SetAttributeChangeBuilder();
    }

    /**
     * create builder for SetAttributeChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAttributeChangeBuilder of(final SetAttributeChange template) {
        SetAttributeChangeBuilder builder = new SetAttributeChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
