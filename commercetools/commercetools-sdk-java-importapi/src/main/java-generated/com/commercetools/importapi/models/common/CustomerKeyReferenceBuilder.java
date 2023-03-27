
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerKeyReference customerKeyReference = CustomerKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerKeyReferenceBuilder implements Builder<CustomerKeyReference> {

    private String key;

    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */

    public CustomerKeyReferenceBuilder key(final String key) {
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
     * builds CustomerKeyReference with checking for non-null required values
     * @return CustomerKeyReference
     */
    public CustomerKeyReference build() {
        Objects.requireNonNull(key, CustomerKeyReference.class + ": key is missing");
        return new CustomerKeyReferenceImpl(key);
    }

    /**
     * builds CustomerKeyReference without checking for non-null required values
     * @return CustomerKeyReference
     */
    public CustomerKeyReference buildUnchecked() {
        return new CustomerKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of CustomerKeyReferenceBuilder
     * @return builder
     */
    public static CustomerKeyReferenceBuilder of() {
        return new CustomerKeyReferenceBuilder();
    }

    /**
     * create builder for CustomerKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerKeyReferenceBuilder of(final CustomerKeyReference template) {
        CustomerKeyReferenceBuilder builder = new CustomerKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
