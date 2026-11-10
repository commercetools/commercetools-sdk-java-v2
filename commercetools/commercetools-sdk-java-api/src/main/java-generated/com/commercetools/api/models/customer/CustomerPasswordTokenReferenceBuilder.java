
package com.commercetools.api.models.customer;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerPasswordTokenReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordTokenReference customerPasswordTokenReference = CustomerPasswordTokenReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerPasswordTokenReferenceBuilder implements Builder<CustomerPasswordTokenReference> {

    private String id;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerToken</a>.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerPasswordTokenReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerToken" rel="nofollow">CustomerToken</a>.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     * builds CustomerPasswordTokenReference with checking for non-null required values
     * @return CustomerPasswordTokenReference
     */
    public CustomerPasswordTokenReference build() {
        Objects.requireNonNull(id, CustomerPasswordTokenReference.class + ": id is missing");
        return new CustomerPasswordTokenReferenceImpl(id);
    }

    /**
     * builds CustomerPasswordTokenReference without checking for non-null required values
     * @return CustomerPasswordTokenReference
     */
    public CustomerPasswordTokenReference buildUnchecked() {
        return new CustomerPasswordTokenReferenceImpl(id);
    }

    /**
     * factory method for an instance of CustomerPasswordTokenReferenceBuilder
     * @return builder
     */
    public static CustomerPasswordTokenReferenceBuilder of() {
        return new CustomerPasswordTokenReferenceBuilder();
    }

    /**
     * create builder for CustomerPasswordTokenReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordTokenReferenceBuilder of(final CustomerPasswordTokenReference template) {
        CustomerPasswordTokenReferenceBuilder builder = new CustomerPasswordTokenReferenceBuilder();
        builder.id = template.getId();
        return builder;
    }

}
