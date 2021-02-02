
package com.commercetools.importapi.models.customfields;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MoneySetFieldBuilder {

    private java.util.List<com.commercetools.importapi.models.common.Money> value;

    public MoneySetFieldBuilder value(final com.commercetools.importapi.models.common.Money... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
        return this;
    }

    public MoneySetFieldBuilder value(final java.util.List<com.commercetools.importapi.models.common.Money> value) {
        this.value = value;
        return this;
    }

    public java.util.List<com.commercetools.importapi.models.common.Money> getValue() {
        return this.value;
    }

    public MoneySetField build() {
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
