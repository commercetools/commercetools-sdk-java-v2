
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueAbsoluteChangeValueBuilder implements Builder<ChangeValueAbsoluteChangeValue> {

    private java.util.List<com.commercetools.history.models.common.Money> money;

    public ChangeValueAbsoluteChangeValueBuilder money(final com.commercetools.history.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public ChangeValueAbsoluteChangeValueBuilder withMoney(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        this.money = new ArrayList<>();
        this.money.add(builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build());
        return this;
    }

    public ChangeValueAbsoluteChangeValueBuilder plusMoney(
            Function<com.commercetools.history.models.common.MoneyBuilder, com.commercetools.history.models.common.MoneyBuilder> builder) {
        if (this.money == null) {
            this.money = new ArrayList<>();
        }
        this.money.add(builder.apply(com.commercetools.history.models.common.MoneyBuilder.of()).build());
        return this;
    }

    public ChangeValueAbsoluteChangeValueBuilder money(
            final java.util.List<com.commercetools.history.models.common.Money> money) {
        this.money = money;
        return this;
    }

    public java.util.List<com.commercetools.history.models.common.Money> getMoney() {
        return this.money;
    }

    public ChangeValueAbsoluteChangeValue build() {
        Objects.requireNonNull(money, ChangeValueAbsoluteChangeValue.class + ": money is missing");
        return new ChangeValueAbsoluteChangeValueImpl(money);
    }

    /**
     * builds ChangeValueAbsoluteChangeValue without checking for non null required values
     */
    public ChangeValueAbsoluteChangeValue buildUnchecked() {
        return new ChangeValueAbsoluteChangeValueImpl(money);
    }

    public static ChangeValueAbsoluteChangeValueBuilder of() {
        return new ChangeValueAbsoluteChangeValueBuilder();
    }

    public static ChangeValueAbsoluteChangeValueBuilder of(final ChangeValueAbsoluteChangeValue template) {
        ChangeValueAbsoluteChangeValueBuilder builder = new ChangeValueAbsoluteChangeValueBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
