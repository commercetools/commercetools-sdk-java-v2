
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceFunctionBuilder {

    private String currencyCode;

    private String function;

    public PriceFunctionBuilder currencyCode(final String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public PriceFunctionBuilder function(final String function) {
        this.function = function;
        return this;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getFunction() {
        return this.function;
    }

    public PriceFunction build() {
        return new PriceFunctionImpl(currencyCode, function);
    }

    public static PriceFunctionBuilder of() {
        return new PriceFunctionBuilder();
    }

    public static PriceFunctionBuilder of(final PriceFunction template) {
        PriceFunctionBuilder builder = new PriceFunctionBuilder();
        builder.currencyCode = template.getCurrencyCode();
        builder.function = template.getFunction();
        return builder;
    }

}
