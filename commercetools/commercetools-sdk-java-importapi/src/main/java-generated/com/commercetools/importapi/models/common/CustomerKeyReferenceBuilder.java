
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerKeyReferenceBuilder {

    private String key;

    public CustomerKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public CustomerKeyReference build() {
        return new CustomerKeyReferenceImpl(key);
    }

    public static CustomerKeyReferenceBuilder of() {
        return new CustomerKeyReferenceBuilder();
    }

    public static CustomerKeyReferenceBuilder of(final CustomerKeyReference template) {
        CustomerKeyReferenceBuilder builder = new CustomerKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
