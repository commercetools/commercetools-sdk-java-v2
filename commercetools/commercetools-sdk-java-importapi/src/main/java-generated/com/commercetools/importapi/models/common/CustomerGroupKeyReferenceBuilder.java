
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerGroupKeyReferenceBuilder {

    private String key;

    public CustomerGroupKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public CustomerGroupKeyReference build() {
        return new CustomerGroupKeyReferenceImpl(key);
    }

    public static CustomerGroupKeyReferenceBuilder of() {
        return new CustomerGroupKeyReferenceBuilder();
    }

    public static CustomerGroupKeyReferenceBuilder of(final CustomerGroupKeyReference template) {
        CustomerGroupKeyReferenceBuilder builder = new CustomerGroupKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
