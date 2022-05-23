
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MoneyAttribute moneyAttribute = MoneyAttribute.builder()
           .value(valueBuilder -> valueBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneyAttributeBuilder implements Builder<MoneyAttribute> {

    @Nullable
    private String name;

    private com.commercetools.importapi.models.common.TypedMoney value;

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public MoneyAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public MoneyAttributeBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public MoneyAttributeBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    public MoneyAttribute build() {
        Objects.requireNonNull(value, MoneyAttribute.class + ": value is missing");
        return new MoneyAttributeImpl(name, value);
    }

    /**
     * builds MoneyAttribute without checking for non null required values
     */
    public MoneyAttribute buildUnchecked() {
        return new MoneyAttributeImpl(name, value);
    }

    public static MoneyAttributeBuilder of() {
        return new MoneyAttributeBuilder();
    }

    public static MoneyAttributeBuilder of(final MoneyAttribute template) {
        MoneyAttributeBuilder builder = new MoneyAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
