
package com.commercetools.importapi.models.customfields;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MoneySetFieldBuilder implements Builder<MoneySetField> {

    private java.util.List<com.commercetools.importapi.models.common.Money> value;

    public MoneySetFieldBuilder value(final com.commercetools.importapi.models.common.Money... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public MoneySetFieldBuilder value(final java.util.List<com.commercetools.importapi.models.common.Money> value) {
        this.value = value;
        return this;
    }

    public MoneySetFieldBuilder plusValue(final com.commercetools.importapi.models.common.Money... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public MoneySetFieldBuilder plusValue(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build());
        return this;
    }

    public MoneySetFieldBuilder withValue(
            Function<com.commercetools.importapi.models.common.MoneyBuilder, com.commercetools.importapi.models.common.MoneyBuilder> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.MoneyBuilder.of()).build());
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.common.Money> getValue() {
        return this.value;
    }

    public MoneySetField build() {
        Objects.requireNonNull(value, MoneySetField.class + ": value is missing");
        return new MoneySetFieldImpl(value);
    }

    /**
     * builds MoneySetField without checking for non null required values
     */
    public MoneySetField buildUnchecked() {
        return new MoneySetFieldImpl(value);
    }

    public static MoneySetFieldBuilder of() {
        return new MoneySetFieldBuilder();
    }

    public static MoneySetFieldBuilder of(final MoneySetField template) {
        MoneySetFieldBuilder builder = new MoneySetFieldBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
