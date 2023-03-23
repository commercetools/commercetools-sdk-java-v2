
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
     *
     * @param key
     * @return Builder
     */

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
