
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.customer.Customer obj;

    /**
     *  <p>Unique identifier of the referenced Customer.</p>
     * @param id
     * @return Builder
     */

    public CustomerReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Customer. Only present in responses to requests with Reference Expansion for Customers.</p>
     * @return Builder
     */

    public CustomerReferenceBuilder obj(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Customer. Only present in responses to requests with Reference Expansion for Customers.</p>
     * @param obj
     * @return Builder
     */

    public CustomerReferenceBuilder obj(@Nullable final com.commercetools.api.models.customer.Customer obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.customer.Customer getObj() {
        return this.obj;
    }

    public CustomerReference build() {
        Objects.requireNonNull(id, CustomerReference.class + ": id is missing");
        return new CustomerReferenceImpl(id, obj);
    }

    /**
     * builds CustomerReference without checking for non null required values
     */
    public CustomerReference buildUnchecked() {
        return new CustomerReferenceImpl(id, obj);
    }

    public static CustomerReferenceBuilder of() {
        return new CustomerReferenceBuilder();
    }

    public static CustomerReferenceBuilder of(final CustomerReference template) {
        CustomerReferenceBuilder builder = new CustomerReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
