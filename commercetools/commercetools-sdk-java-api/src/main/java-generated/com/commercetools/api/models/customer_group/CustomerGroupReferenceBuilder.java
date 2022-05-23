
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerGroupReference customerGroupReference = CustomerGroupReference.builder()
           .id("{id}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupReferenceBuilder implements Builder<CustomerGroupReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroup obj;

    /**
     *  <p>Platform-generated unique identifier of the referenced CustomerGroup.</p>
     */

    public CustomerGroupReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with Reference Expansion for CustomerGroups.</p>
     */

    public CustomerGroupReferenceBuilder obj(
            Function<com.commercetools.api.models.customer_group.CustomerGroupBuilder, com.commercetools.api.models.customer_group.CustomerGroupBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with Reference Expansion for CustomerGroups.</p>
     */

    public CustomerGroupReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.customer_group.CustomerGroup obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroup getObj() {
        return this.obj;
    }

    public CustomerGroupReference build() {
        Objects.requireNonNull(id, CustomerGroupReference.class + ": id is missing");
        return new CustomerGroupReferenceImpl(id, obj);
    }

    /**
     * builds CustomerGroupReference without checking for non null required values
     */
    public CustomerGroupReference buildUnchecked() {
        return new CustomerGroupReferenceImpl(id, obj);
    }

    public static CustomerGroupReferenceBuilder of() {
        return new CustomerGroupReferenceBuilder();
    }

    public static CustomerGroupReferenceBuilder of(final CustomerGroupReference template) {
        CustomerGroupReferenceBuilder builder = new CustomerGroupReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
