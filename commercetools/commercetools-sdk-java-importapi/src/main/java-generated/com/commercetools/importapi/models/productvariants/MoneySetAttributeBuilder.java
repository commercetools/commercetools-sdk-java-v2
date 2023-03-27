
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneySetAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneySetAttribute moneySetAttribute = MoneySetAttribute.builder()
 *             .plusValue(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneySetAttributeBuilder implements Builder<MoneySetAttribute> {

    @Nullable
    private String name;

    private java.util.List<com.commercetools.importapi.models.common.TypedMoney> value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @param name value to be set
     * @return Builder
     */

    public MoneySetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     * set values to the value
     * @param value value to be set
     * @return Builder
     */

    public MoneySetAttributeBuilder value(final com.commercetools.importapi.models.common.TypedMoney... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    /**
     * set value to the value
     * @param value value to be set
     * @return Builder
     */

    public MoneySetAttributeBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.TypedMoney> value) {
        this.value = value;
        return this;
    }

    /**
     * add values to the value
     * @param value value to be set
     * @return Builder
     */

    public MoneySetAttributeBuilder plusValue(final com.commercetools.importapi.models.common.TypedMoney... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    /**
     * add a value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetAttributeBuilder plusValue(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the value using the builder function
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneySetAttributeBuilder withValue(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     * value of value}
     * @return value
     */

    public java.util.List<com.commercetools.importapi.models.common.TypedMoney> getValue() {
        return this.value;
    }

    /**
     * builds MoneySetAttribute with checking for non-null required values
     * @return MoneySetAttribute
     */
    public MoneySetAttribute build() {
        Objects.requireNonNull(value, MoneySetAttribute.class + ": value is missing");
        return new MoneySetAttributeImpl(name, value);
    }

    /**
     * builds MoneySetAttribute without checking for non-null required values
     * @return MoneySetAttribute
     */
    public MoneySetAttribute buildUnchecked() {
        return new MoneySetAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of MoneySetAttributeBuilder
     * @return builder
     */
    public static MoneySetAttributeBuilder of() {
        return new MoneySetAttributeBuilder();
    }

    /**
     * create builder for MoneySetAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneySetAttributeBuilder of(final MoneySetAttribute template) {
        MoneySetAttributeBuilder builder = new MoneySetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
