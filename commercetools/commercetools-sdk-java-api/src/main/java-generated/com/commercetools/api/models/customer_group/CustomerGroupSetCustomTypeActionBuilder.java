
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
   CustomerGroupSetCustomTypeAction customerGroupSetCustomTypeAction = CustomerGroupSetCustomTypeAction.builder()
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupSetCustomTypeActionBuilder implements Builder<CustomerGroupSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     */

    public CustomerGroupSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     */

    public CustomerGroupSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     */

    public CustomerGroupSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     */

    public CustomerGroupSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public CustomerGroupSetCustomTypeAction build() {
        return new CustomerGroupSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CustomerGroupSetCustomTypeAction without checking for non null required values
     */
    public CustomerGroupSetCustomTypeAction buildUnchecked() {
        return new CustomerGroupSetCustomTypeActionImpl(type, fields);
    }

    public static CustomerGroupSetCustomTypeActionBuilder of() {
        return new CustomerGroupSetCustomTypeActionBuilder();
    }

    public static CustomerGroupSetCustomTypeActionBuilder of(final CustomerGroupSetCustomTypeAction template) {
        CustomerGroupSetCustomTypeActionBuilder builder = new CustomerGroupSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
