
package com.commercetools.api.models.cart;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCountryActionBuilder implements Builder<CartSetCountryAction> {

    @Nullable
    private String country;

    public CartSetCountryActionBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    public CartSetCountryAction build() {
        return new CartSetCountryActionImpl(country);
    }

    /**
     * builds CartSetCountryAction without checking for non null required values
     */
    public CartSetCountryAction buildUnchecked() {
        return new CartSetCountryActionImpl(country);
    }

    public static CartSetCountryActionBuilder of() {
        return new CartSetCountryActionBuilder();
    }

    public static CartSetCountryActionBuilder of(final CartSetCountryAction template) {
        CartSetCountryActionBuilder builder = new CartSetCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
