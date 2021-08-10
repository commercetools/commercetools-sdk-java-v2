
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCustomerSetSalutationActionBuilder implements Builder<MyCustomerSetSalutationAction> {

    @Nullable
    private String salutation;

    public MyCustomerSetSalutationActionBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }

    @Nullable
    public String getSalutation() {
        return this.salutation;
    }

    public MyCustomerSetSalutationAction build() {
        return new MyCustomerSetSalutationActionImpl(salutation);
    }

    /**
     * builds MyCustomerSetSalutationAction without checking for non null required values
     */
    public MyCustomerSetSalutationAction buildUnchecked() {
        return new MyCustomerSetSalutationActionImpl(salutation);
    }

    public static MyCustomerSetSalutationActionBuilder of() {
        return new MyCustomerSetSalutationActionBuilder();
    }

    public static MyCustomerSetSalutationActionBuilder of(final MyCustomerSetSalutationAction template) {
        MyCustomerSetSalutationActionBuilder builder = new MyCustomerSetSalutationActionBuilder();
        builder.salutation = template.getSalutation();
        return builder;
    }

}
