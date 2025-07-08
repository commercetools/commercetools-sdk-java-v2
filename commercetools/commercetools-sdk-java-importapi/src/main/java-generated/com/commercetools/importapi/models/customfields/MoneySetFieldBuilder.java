
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

    private java.util.List<com.commercetools.importapi.models.common.TypedMoney> value;

    /**
     *  <p>JSON array of money values in cent precision format. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public MoneySetFieldBuilder value(final com.commercetools.importapi.models.common.TypedMoney... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of money values in cent precision format. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public MoneySetFieldBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.TypedMoney> value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>JSON array of money values in cent precision format. The order of items in the array is not fixed.</p>
     * @param value value to be set
     * @return Builder
     */

    public MoneySetFieldBuilder plusValue(final com.commercetools.importapi.models.common.TypedMoney... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     *  <p>JSON array of money values in cent precision format. The order of items in the array is not fixed.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetFieldBuilder plusValue(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>JSON array of money values in cent precision format. The order of items in the array is not fixed.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetFieldBuilder withValue(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>JSON array of money values in cent precision format. The order of items in the array is not fixed.</p>
     * @return value
     */

    public java.util.List<com.commercetools.importapi.models.common.TypedMoney> getValue() {
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
