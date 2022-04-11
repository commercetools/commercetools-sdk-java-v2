
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MoneyFieldBuilder implements Builder<MoneyField> {

    private com.commercetools.importapi.models.common.TypedMoney value;

    public MoneyFieldBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public MoneyFieldBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
        return this.value;
    }

    public MoneyField build() {
        Objects.requireNonNull(value, MoneyField.class + ": value is missing");
        return new MoneyFieldImpl(value);
    }

    /**
     * builds MoneyField without checking for non null required values
     */
    public MoneyField buildUnchecked() {
        return new MoneyFieldImpl(value);
    }

    public static MoneyFieldBuilder of() {
        return new MoneyFieldBuilder();
    }

    public static MoneyFieldBuilder of(final MoneyField template) {
        MoneyFieldBuilder builder = new MoneyFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
