
package com.commercetools.api.models.customer;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerResourceIdentifier customerResourceIdentifier = CustomerResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerResourceIdentifierBuilder implements Builder<CustomerResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Unique identifier of the referenced Customer.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Customer.</p>
     * @param key value to be set
     * @return Builder
     */

    public CustomerResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Customer.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced Customer.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds CustomerResourceIdentifier with checking for non-null required values
     * @return CustomerResourceIdentifier
     */
    public CustomerResourceIdentifier build() {
        return new CustomerResourceIdentifierImpl(id, key);
    }

    /**
     * builds CustomerResourceIdentifier without checking for non-null required values
     * @return CustomerResourceIdentifier
     */
    public CustomerResourceIdentifier buildUnchecked() {
        return new CustomerResourceIdentifierImpl(id, key);
    }

    /**
     * factory method for an instance of CustomerResourceIdentifierBuilder
     * @return builder
     */
    public static CustomerResourceIdentifierBuilder of() {
        return new CustomerResourceIdentifierBuilder();
    }

    /**
     * create builder for CustomerResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerResourceIdentifierBuilder of(final CustomerResourceIdentifier template) {
        CustomerResourceIdentifierBuilder builder = new CustomerResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
