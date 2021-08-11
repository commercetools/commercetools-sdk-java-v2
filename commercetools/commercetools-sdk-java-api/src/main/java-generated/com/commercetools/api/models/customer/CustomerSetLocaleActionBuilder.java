
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetLocaleActionBuilder implements Builder<CustomerSetLocaleAction> {

    @Nullable
    private String locale;

    public CustomerSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public CustomerSetLocaleAction build() {
        return new CustomerSetLocaleActionImpl(locale);
    }

    /**
     * builds CustomerSetLocaleAction without checking for non null required values
     */
    public CustomerSetLocaleAction buildUnchecked() {
        return new CustomerSetLocaleActionImpl(locale);
    }

    public static CustomerSetLocaleActionBuilder of() {
        return new CustomerSetLocaleActionBuilder();
    }

    public static CustomerSetLocaleActionBuilder of(final CustomerSetLocaleAction template) {
        CustomerSetLocaleActionBuilder builder = new CustomerSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
