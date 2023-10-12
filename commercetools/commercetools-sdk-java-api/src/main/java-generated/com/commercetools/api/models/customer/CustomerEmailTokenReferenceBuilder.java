
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerEmailTokenReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailTokenReference customerEmailTokenReference = CustomerEmailTokenReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailTokenReferenceBuilder implements Builder<CustomerEmailTokenReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced CustomerToken.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerEmailTokenReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced CustomerToken.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds CustomerEmailTokenReference with checking for non-null required values
     * @return CustomerEmailTokenReference
     */
    public CustomerEmailTokenReference build() {
        Objects.requireNonNull(id, CustomerEmailTokenReference.class + ": id is missing");
        return new CustomerEmailTokenReferenceImpl(id);
    }

    /**
     * builds CustomerEmailTokenReference without checking for non-null required values
     * @return CustomerEmailTokenReference
     */
    public CustomerEmailTokenReference buildUnchecked() {
        return new CustomerEmailTokenReferenceImpl(id);
    }

    /**
     * factory method for an instance of CustomerEmailTokenReferenceBuilder
     * @return builder
     */
    public static CustomerEmailTokenReferenceBuilder of() {
        return new CustomerEmailTokenReferenceBuilder();
    }

    /**
     * create builder for CustomerEmailTokenReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailTokenReferenceBuilder of(final CustomerEmailTokenReference template) {
        CustomerEmailTokenReferenceBuilder builder = new CustomerEmailTokenReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
