
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupReferenceBuilder implements Builder<CustomerGroupReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroup obj;

    public CustomerGroupReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public CustomerGroupReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroup obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroup getObj() {
        return this.obj;
    }

    public CustomerGroupReference build() {
        Objects.requireNonNull(id);
        return new CustomerGroupReferenceImpl(id, obj);
    }

    /**
     * builds CustomerGroupReference without checking for non null required values
     */
    public CustomerGroupReference buildUnchecked() {
        return new CustomerGroupReferenceImpl(id, obj);
    }

    public static CustomerGroupReferenceBuilder of() {
        return new CustomerGroupReferenceBuilder();
    }

    public static CustomerGroupReferenceBuilder of(final CustomerGroupReference template) {
        CustomerGroupReferenceBuilder builder = new CustomerGroupReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
