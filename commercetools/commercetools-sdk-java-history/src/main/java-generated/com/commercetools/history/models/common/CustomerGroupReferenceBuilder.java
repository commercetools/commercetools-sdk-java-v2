
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupReference customerGroupReference = CustomerGroupReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupReferenceBuilder implements Builder<CustomerGroupReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerGroupReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds CustomerGroupReference with checking for non-null required values
     * @return CustomerGroupReference
     */
    public CustomerGroupReference build() {
        Objects.requireNonNull(id, CustomerGroupReference.class + ": id is missing");
        return new CustomerGroupReferenceImpl(id);
    }

    /**
     * builds CustomerGroupReference without checking for non-null required values
     * @return CustomerGroupReference
     */
    public CustomerGroupReference buildUnchecked() {
        return new CustomerGroupReferenceImpl(id);
    }

    /**
     * factory method for an instance of CustomerGroupReferenceBuilder
     * @return builder
     */
    public static CustomerGroupReferenceBuilder of() {
        return new CustomerGroupReferenceBuilder();
    }

    /**
     * create builder for CustomerGroupReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupReferenceBuilder of(final CustomerGroupReference template) {
        CustomerGroupReferenceBuilder builder = new CustomerGroupReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
