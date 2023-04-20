
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneySetFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneySetField moneySetField = MoneySetField.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneySetFieldBuilder implements Builder<MoneySetField> {

    private java.util.List<com.commercetools.importapi.models.common.Money> value;

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */

    public MoneySetFieldBuilder value(final com.commercetools.importapi.models.common.Money... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */

    public MoneySetFieldBuilder value(final java.util.List<com.commercetools.importapi.models.common.Money> value) {
        this.value = value;
        return this;
    }

    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */

    public MoneySetFieldBuilder plusValue(final com.commercetools.importapi.models.common.Money... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     * add the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetFieldBuilder plusValue(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetFieldBuilder withValue(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetFieldBuilder addValue(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.Money> builder) {
        return plusValue(builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()));
    }

    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetFieldBuilder setValue(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.Money> builder) {
        return value(builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()));
    }

    /**
     * value of value}
     * @return value
     */

    public java.util.List<com.commercetools.importapi.models.common.Money> getValue() {
        return this.value;
    }

    /**
     * builds MoneySetField with checking for non-null required values
     * @return MoneySetField
     */
    public MoneySetField build() {
        Objects.requireNonNull(value, MoneySetField.class + ": value is missing");
        return new MoneySetFieldImpl(value);
    }

    /**
     * builds MoneySetField without checking for non-null required values
     * @return MoneySetField
     */
    public MoneySetField buildUnchecked() {
        return new MoneySetFieldImpl(value);
    }

    /**
     * factory method for an instance of MoneySetFieldBuilder
     * @return builder
     */
    public static MoneySetFieldBuilder of() {
        return new MoneySetFieldBuilder();
    }

    /**
     * create builder for MoneySetField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneySetFieldBuilder of(final MoneySetField template) {
        MoneySetFieldBuilder builder = new MoneySetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
