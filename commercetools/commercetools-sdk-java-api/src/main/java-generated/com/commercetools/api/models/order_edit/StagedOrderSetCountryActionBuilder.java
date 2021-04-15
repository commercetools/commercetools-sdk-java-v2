
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetCountryActionBuilder {

    @Nullable
    private String country;

    public StagedOrderSetCountryActionBuilder country(@Nullable final String country) {
        this.country = country;
        return this;
    }

    @Nullable
    public String getCountry() {
        return this.country;
    }

    public StagedOrderSetCountryAction build() {
        return new StagedOrderSetCountryActionImpl(country);
    }

    public static StagedOrderSetCountryActionBuilder of() {
        return new StagedOrderSetCountryActionBuilder();
    }

    public static StagedOrderSetCountryActionBuilder of(final StagedOrderSetCountryAction template) {
        StagedOrderSetCountryActionBuilder builder = new StagedOrderSetCountryActionBuilder();
        builder.country = template.getCountry();
        return builder;
    }

}
