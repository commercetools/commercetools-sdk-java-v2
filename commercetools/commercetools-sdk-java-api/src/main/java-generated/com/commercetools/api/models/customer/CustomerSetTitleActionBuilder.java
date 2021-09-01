
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerSetTitleActionBuilder implements Builder<CustomerSetTitleAction> {

    @Nullable
    private String title;

    public CustomerSetTitleActionBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    public CustomerSetTitleAction build() {
        return new CustomerSetTitleActionImpl(title);
    }

    /**
     * builds CustomerSetTitleAction without checking for non null required values
     */
    public CustomerSetTitleAction buildUnchecked() {
        return new CustomerSetTitleActionImpl(title);
    }

    public static CustomerSetTitleActionBuilder of() {
        return new CustomerSetTitleActionBuilder();
    }

    public static CustomerSetTitleActionBuilder of(final CustomerSetTitleAction template) {
        CustomerSetTitleActionBuilder builder = new CustomerSetTitleActionBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
