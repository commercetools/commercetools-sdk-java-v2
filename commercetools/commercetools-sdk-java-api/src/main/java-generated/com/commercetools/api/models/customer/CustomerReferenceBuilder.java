
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
     * @param id value to be set
     * @return Builder
     */

    public CustomerReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Customer. Only present in responses to requests with Reference Expansion for Customers.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public CustomerReferenceBuilder obj(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.CustomerBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Customer. Only present in responses to requests with Reference Expansion for Customers.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public CustomerReferenceBuilder withObj(
            Function<com.commercetools.api.models.customer.CustomerBuilder, com.commercetools.api.models.customer.Customer> builder) {
        this.obj = builder.apply(com.commercetools.api.models.customer.CustomerBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded Customer. Only present in responses to requests with Reference Expansion for Customers.</p>
     * @param obj value to be set
     * @return Builder
     */

    public CustomerReferenceBuilder obj(@Nullable final com.commercetools.api.models.customer.Customer obj) {
        this.obj = obj;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced Customer.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Contains the representation of the expanded Customer. Only present in responses to requests with Reference Expansion for Customers.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.customer.Customer getObj() {
        return this.obj;
    }

    /**
     * builds CustomerReference with checking for non-null required values
     * @return CustomerReference
     */
    public CustomerReference build() {
        Objects.requireNonNull(id, CustomerReference.class + ": id is missing");
        return new CustomerReferenceImpl(id, obj);
    }

    /**
     * builds CustomerReference without checking for non-null required values
     * @return CustomerReference
     */
    public CustomerReference buildUnchecked() {
        return new CustomerReferenceImpl(id, obj);
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
        builder.obj = template.getObj();
        return builder;
    }

}
