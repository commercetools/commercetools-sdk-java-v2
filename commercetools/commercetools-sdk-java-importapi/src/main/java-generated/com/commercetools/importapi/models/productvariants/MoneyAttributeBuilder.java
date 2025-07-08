
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyAttributeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MoneyAttribute moneyAttribute = MoneyAttribute.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneyAttributeBuilder implements Builder<MoneyAttribute> {

    @Nullable
    private String name;

    private com.commercetools.importapi.models.common.TypedMoney value;

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @param name value to be set
     * @return Builder
     */

    public MoneyAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>A money value in cent precision format.</p>
     * @param value value to be set
     * @return Builder
     */

    public MoneyAttributeBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>A money value in cent precision format.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public MoneyAttributeBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     * @return name
     */

    @Nullable
    public String getName() {
        return this.name;
    }

    /**
     *  <p>A money value in cent precision format.</p>
     * @return value
     */

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     * builds MoneyAttribute with checking for non-null required values
     * @return MoneyAttribute
     */
    public MoneyAttribute build() {
        Objects.requireNonNull(value, MoneyAttribute.class + ": value is missing");
        return new MoneyAttributeImpl(name, value);
    }

    /**
     * builds MoneyAttribute without checking for non-null required values
     * @return MoneyAttribute
     */
    public MoneyAttribute buildUnchecked() {
        return new MoneyAttributeImpl(name, value);
    }

    /**
     * factory method for an instance of MoneyAttributeBuilder
     * @return builder
     */
    public static MoneyAttributeBuilder of() {
        return new MoneyAttributeBuilder();
    }

    /**
     * create builder for MoneyAttribute instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MoneyAttributeBuilder of(final MoneyAttribute template) {
        MoneyAttributeBuilder builder = new MoneyAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
