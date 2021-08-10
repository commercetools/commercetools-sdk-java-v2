
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetCountryActionBuilder implements Builder<MyCartSetCountryAction> {

    @Nullable
    private String country;

    public MyCartSetCountryActionBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    public MyCartSetCountryAction build() {
        return new MyCartSetCountryActionImpl(country);
    }

    /**
     * builds MyCartSetCountryAction without checking for non null required values
     */
    public MyCartSetCountryAction buildUnchecked() {
        return new MyCartSetCountryActionImpl(country);
    }

    public static MyCartSetCountryActionBuilder of() {
        return new MyCartSetCountryActionBuilder();
    }

    public static MyCartSetCountryActionBuilder of(final MyCartSetCountryAction template) {
        MyCartSetCountryActionBuilder builder = new MyCartSetCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
