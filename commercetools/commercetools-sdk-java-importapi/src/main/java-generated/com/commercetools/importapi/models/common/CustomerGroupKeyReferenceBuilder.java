
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupKeyReference customerGroupKeyReference = CustomerGroupKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupKeyReferenceBuilder implements Builder<CustomerGroupKeyReference> {

    private String key;

    /**
     *
     */

    public CustomerGroupKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public CustomerGroupKeyReference build() {
        Objects.requireNonNull(key, CustomerGroupKeyReference.class + ": key is missing");
        return new CustomerGroupKeyReferenceImpl(key);
    }

    /**
     * builds CustomerGroupKeyReference without checking for non null required values
     */
    public CustomerGroupKeyReference buildUnchecked() {
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
