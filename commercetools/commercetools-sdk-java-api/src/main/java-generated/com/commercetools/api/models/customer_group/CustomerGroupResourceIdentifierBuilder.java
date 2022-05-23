
package com.commercetools.api.models.customer_group;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomerGroupResourceIdentifier customerGroupResourceIdentifier = CustomerGroupResourceIdentifier.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupResourceIdentifierBuilder implements Builder<CustomerGroupResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Platform-generated unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public CustomerGroupResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced CustomerGroup. Either <code>id</code> or <code>key</code> is required.</p>
     */

    public CustomerGroupResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public CustomerGroupResourceIdentifier build() {
        return new CustomerGroupResourceIdentifierImpl(id, key);
    }

    /**
     * builds CustomerGroupResourceIdentifier without checking for non null required values
     */
    public CustomerGroupResourceIdentifier buildUnchecked() {
        return new CustomerGroupResourceIdentifierImpl(id, key);
    }

    public static CustomerGroupResourceIdentifierBuilder of() {
        return new CustomerGroupResourceIdentifierBuilder();
    }

    public static CustomerGroupResourceIdentifierBuilder of(final CustomerGroupResourceIdentifier template) {
        CustomerGroupResourceIdentifierBuilder builder = new CustomerGroupResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
