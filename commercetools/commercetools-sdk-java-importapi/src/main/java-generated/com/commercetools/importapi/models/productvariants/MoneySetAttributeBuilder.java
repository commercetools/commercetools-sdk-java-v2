
package com.commercetools.importapi.models.productvariants;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class MoneySetAttributeBuilder implements Builder<MoneySetAttribute> {

    @Nullable
    private String name;

    private java.util.List<com.commercetools.importapi.models.common.TypedMoney> value;

    public MoneySetAttributeBuilder name(@Nullable final String name) {
        this.name = name;
        return this;
    }

    public MoneySetAttributeBuilder value(final com.commercetools.importapi.models.common.TypedMoney... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public MoneySetAttributeBuilder value(
            final java.util.List<com.commercetools.importapi.models.common.TypedMoney> value) {
        this.value = value;
        return this;
    }

    public MoneySetAttributeBuilder plusValue(final com.commercetools.importapi.models.common.TypedMoney... value) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.addAll(Arrays.asList(value));
        return this;
    }

    public MoneySetAttributeBuilder plusValue(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    public MoneySetAttributeBuilder withValue(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = new ArrayList<>();
        this.value.add(builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getName() {
        return this.name;
    }

    public java.util.List<com.commercetools.importapi.models.common.TypedMoney> getValue() {
        return this.value;
    }

    public MoneySetAttribute build() {
        Objects.requireNonNull(value, MoneySetAttribute.class + ": value is missing");
        return new MoneySetAttributeImpl(name, value);
    }

    /**
     * builds MoneySetAttribute without checking for non null required values
     */
    public MoneySetAttribute buildUnchecked() {
        return new MoneySetAttributeImpl(name, value);
    }

    public static MoneySetAttributeBuilder of() {
        return new MoneySetAttributeBuilder();
    }

    public static MoneySetAttributeBuilder of(final MoneySetAttribute template) {
        MoneySetAttributeBuilder builder = new MoneySetAttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
