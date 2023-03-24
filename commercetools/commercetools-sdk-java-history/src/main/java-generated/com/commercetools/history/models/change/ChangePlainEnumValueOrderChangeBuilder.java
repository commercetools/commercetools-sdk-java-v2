
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePlainEnumValueOrderChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePlainEnumValueOrderChange changePlainEnumValueOrderChange = ChangePlainEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangePlainEnumValueOrderChangeBuilder implements Builder<ChangePlainEnumValueOrderChange> {

    private String change;

    private String attributeName;

    private java.util.List<com.commercetools.history.models.change_value.EnumValue> nextValue;

    private java.util.List<com.commercetools.history.models.change_value.EnumValue> previousValue;

    /**
     *  <p>Update action for <code>changePlainEnumValueOrder</code> on product types</p>
     * @param change value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder attributeName(final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.EnumValue... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder nextValue(
            final java.util.List<com.commercetools.history.models.change_value.EnumValue> nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *
     * @param nextValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder plusNextValue(
            final com.commercetools.history.models.change_value.EnumValue... nextValue) {
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

    public ChangePlainEnumValueOrderChangeBuilder plusNextValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        if (this.nextValue == null) {
            this.nextValue = new ArrayList<>();
        }
        this.nextValue.add(builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder withNextValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.nextValue = new ArrayList<>();
        this.nextValue.add(builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.EnumValue... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder previousValue(
            final java.util.List<com.commercetools.history.models.change_value.EnumValue> previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @param previousValue value to be set
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder plusPreviousValue(
            final com.commercetools.history.models.change_value.EnumValue... previousValue) {
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

    public ChangePlainEnumValueOrderChangeBuilder plusPreviousValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        if (this.previousValue == null) {
            this.previousValue = new ArrayList<>();
        }
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build());
        return this;
    }

    /**
     *
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public ChangePlainEnumValueOrderChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.change_value.EnumValueBuilder, com.commercetools.history.models.change_value.EnumValueBuilder> builder) {
        this.previousValue = new ArrayList<>();
        this.previousValue
                .add(builder.apply(com.commercetools.history.models.change_value.EnumValueBuilder.of()).build());
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public java.util.List<com.commercetools.history.models.change_value.EnumValue> getNextValue() {
        return this.nextValue;
    }

    public java.util.List<com.commercetools.history.models.change_value.EnumValue> getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds ChangePlainEnumValueOrderChange with checking for non-null required values
     * @return ChangePlainEnumValueOrderChange
     */
    public ChangePlainEnumValueOrderChange build() {
        Objects.requireNonNull(change, ChangePlainEnumValueOrderChange.class + ": change is missing");
        Objects.requireNonNull(attributeName, ChangePlainEnumValueOrderChange.class + ": attributeName is missing");
        Objects.requireNonNull(nextValue, ChangePlainEnumValueOrderChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, ChangePlainEnumValueOrderChange.class + ": previousValue is missing");
        return new ChangePlainEnumValueOrderChangeImpl(change, attributeName, nextValue, previousValue);
    }

    /**
     * builds ChangePlainEnumValueOrderChange without checking for non-null required values
     * @return ChangePlainEnumValueOrderChange
     */
    public ChangePlainEnumValueOrderChange buildUnchecked() {
        return new ChangePlainEnumValueOrderChangeImpl(change, attributeName, nextValue, previousValue);
    }

    public static ChangePlainEnumValueOrderChangeBuilder of() {
        return new ChangePlainEnumValueOrderChangeBuilder();
    }

    public static ChangePlainEnumValueOrderChangeBuilder of(final ChangePlainEnumValueOrderChange template) {
        ChangePlainEnumValueOrderChangeBuilder builder = new ChangePlainEnumValueOrderChangeBuilder();
        builder.change = template.getChange();
        builder.attributeName = template.getAttributeName();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
