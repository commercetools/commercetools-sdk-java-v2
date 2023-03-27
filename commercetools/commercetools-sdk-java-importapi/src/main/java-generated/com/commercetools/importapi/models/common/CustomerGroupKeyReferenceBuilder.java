
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
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public CustomerGroupKeyReferenceBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     * value of key}
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     * builds CustomerGroupKeyReference with checking for non-null required values
     * @return CustomerGroupKeyReference
     */
    public CustomerGroupKeyReference build() {
        Objects.requireNonNull(key, CustomerGroupKeyReference.class + ": key is missing");
        return new CustomerGroupKeyReferenceImpl(key);
    }

    /**
     * builds CustomerGroupKeyReference without checking for non-null required values
     * @return CustomerGroupKeyReference
     */
    public CustomerGroupKeyReference buildUnchecked() {
        return new CustomerGroupKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of CustomerGroupKeyReferenceBuilder
     * @return builder
     */
    public static CustomerGroupKeyReferenceBuilder of() {
        return new CustomerGroupKeyReferenceBuilder();
    }

    /**
     * create builder for CustomerGroupKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupKeyReferenceBuilder of(final CustomerGroupKeyReference template) {
        CustomerGroupKeyReferenceBuilder builder = new CustomerGroupKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
