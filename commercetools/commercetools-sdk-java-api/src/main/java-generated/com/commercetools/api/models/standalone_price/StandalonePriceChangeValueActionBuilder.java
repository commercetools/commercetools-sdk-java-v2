
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StandalonePriceChangeValueActionBuilder implements Builder<StandalonePriceChangeValueAction> {

    private com.commercetools.api.models.common.Money value;

    public StandalonePriceChangeValueActionBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public StandalonePriceChangeValueActionBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public StandalonePriceChangeValueAction build() {
        Objects.requireNonNull(value, StandalonePriceChangeValueAction.class + ": value is missing");
        return new StandalonePriceChangeValueActionImpl(value);
    }

    /**
     * builds StandalonePriceChangeValueAction without checking for non null required values
     */
    public StandalonePriceChangeValueAction buildUnchecked() {
        return new StandalonePriceChangeValueActionImpl(value);
    }

    public static StandalonePriceChangeValueActionBuilder of() {
        return new StandalonePriceChangeValueActionBuilder();
    }

    public static StandalonePriceChangeValueActionBuilder of(final StandalonePriceChangeValueAction template) {
        StandalonePriceChangeValueActionBuilder builder = new StandalonePriceChangeValueActionBuilder();
        builder.value = template.getValue();
        return builder;
    }

}
