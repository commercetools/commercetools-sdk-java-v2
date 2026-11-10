
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddProductSelectionChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddProductSelectionChange addProductSelectionChange = AddProductSelectionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@Deprecated
public class AddProductSelectionChangeBuilder implements Builder<AddProductSelectionChange> {

    private String change;

    private com.commercetools.history.models.common.ProductSelectionSetting previousValue;

    private com.commercetools.history.models.common.ProductSelectionSetting nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddProductSelectionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddProductSelectionChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public AddProductSelectionChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public AddProductSelectionChangeBuilder previousValue(
            final com.commercetools.history.models.common.ProductSelectionSetting previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddProductSelectionChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSettingBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddProductSelectionChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.ProductSelectionSettingBuilder, com.commercetools.history.models.common.ProductSelectionSetting> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ProductSelectionSettingBuilder.of());
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddProductSelectionChangeBuilder nextValue(
            final com.commercetools.history.models.common.ProductSelectionSetting nextValue) {
        this.nextValue = nextValue;
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
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.ProductSelectionSetting getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.ProductSelectionSetting getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddProductSelectionChange with checking for non-null required values
     * @return AddProductSelectionChange
     */
    public AddProductSelectionChange build() {
        Objects.requireNonNull(change, AddProductSelectionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, AddProductSelectionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, AddProductSelectionChange.class + ": nextValue is missing");
        return new AddProductSelectionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds AddProductSelectionChange without checking for non-null required values
     * @return AddProductSelectionChange
     */
    public AddProductSelectionChange buildUnchecked() {
        return new AddProductSelectionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * factory method for an instance of AddProductSelectionChangeBuilder
     * @return builder
     */
    public static AddProductSelectionChangeBuilder of() {
        return new AddProductSelectionChangeBuilder();
    }

    /**
     * create builder for AddProductSelectionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddProductSelectionChangeBuilder of(final AddProductSelectionChange template) {
        AddProductSelectionChangeBuilder builder = new AddProductSelectionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
