
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerReference customerReference = CustomerReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerReferenceBuilder implements Builder<CustomerReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds CustomerReference with checking for non-null required values
     * @return CustomerReference
     */
    public CustomerReference build() {
        Objects.requireNonNull(id, CustomerReference.class + ": id is missing");
        return new CustomerReferenceImpl(id);
    }

    /**
     * builds CustomerReference without checking for non-null required values
     * @return CustomerReference
     */
    public CustomerReference buildUnchecked() {
        return new CustomerReferenceImpl(id);
    }

    /**
     * factory method for an instance of CustomerReferenceBuilder
     * @return builder
     */
    public static CustomerReferenceBuilder of() {
        return new CustomerReferenceBuilder();
    }

    /**
     * create builder for CustomerReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerReferenceBuilder of(final CustomerReference template) {
        CustomerReferenceBuilder builder = new CustomerReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
