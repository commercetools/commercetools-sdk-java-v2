
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroup obj;

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
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with <span>Reference Expansion</span> for CustomerGroups.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public CustomerGroupReferenceBuilder obj(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroupBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with <span>Reference Expansion</span> for CustomerGroups.</p>
     * @param builder function to build the obj value
     * @return Builder
     */

    public CustomerGroupReferenceBuilder withObj(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroup> builder) {
        this.obj = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with <span>Reference Expansion</span> for CustomerGroups.</p>
     * @param obj value to be set
     * @return Builder
     */

    public CustomerGroupReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroup obj) {
        this.obj = obj;
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
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with <span>Reference Expansion</span> for CustomerGroups.</p>
     * @return obj
     */

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroup getObj() {
        return this.obj;
    }

    /**
     * builds CustomerGroupReference with checking for non-null required values
     * @return CustomerGroupReference
     */
    public CustomerGroupReference build() {
        Objects.requireNonNull(id, CustomerGroupReference.class + ": id is missing");
        return new CustomerGroupReferenceImpl(id, obj);
    }

    /**
     * builds CustomerGroupReference without checking for non-null required values
     * @return CustomerGroupReference
     */
    public CustomerGroupReference buildUnchecked() {
        return new CustomerGroupReferenceImpl(id, obj);
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
        builder.obj = template.getObj();
        return builder;
    }

}
