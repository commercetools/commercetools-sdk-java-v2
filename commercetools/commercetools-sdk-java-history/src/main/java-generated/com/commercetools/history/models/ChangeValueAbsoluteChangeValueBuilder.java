
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueAbsoluteChangeValueBuilder {

    private java.util.List<com.commercetools.history.models.Money> money;

    public ChangeValueAbsoluteChangeValueBuilder money(final com.commercetools.history.models.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public ChangeValueAbsoluteChangeValueBuilder money(
            final java.util.List<com.commercetools.history.models.Money> money) {
        this.money = money;
        return this;
    }

    public java.util.List<com.commercetools.history.models.Money> getMoney() {
        return this.money;
    }

    public ChangeValueAbsoluteChangeValue build() {
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
