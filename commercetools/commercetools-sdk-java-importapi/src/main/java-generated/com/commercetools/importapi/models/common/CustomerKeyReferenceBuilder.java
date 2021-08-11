
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomerKeyReferenceBuilder implements Builder<CustomerKeyReference> {

    private String key;

    public CustomerKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public CustomerKeyReference build() {
        Objects.requireNonNull(key, CustomerKeyReference.class + ": key is missing");
        return new CustomerKeyReferenceImpl(key);
    }

    /**
     * builds CustomerKeyReference without checking for non null required values
     */
    public CustomerKeyReference buildUnchecked() {
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
