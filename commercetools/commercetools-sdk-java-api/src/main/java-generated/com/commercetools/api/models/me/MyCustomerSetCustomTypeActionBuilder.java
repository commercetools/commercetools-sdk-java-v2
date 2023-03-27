
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetCustomTypeAction myCustomerSetCustomTypeAction = MyCustomerSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCustomerSetCustomTypeActionBuilder implements Builder<MyCustomerSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the MyCustomer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyCustomer.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyCustomerSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the MyCustomer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyCustomer.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyCustomerSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the MyCustomer.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyCustomerSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the MyCustomer.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyCustomerSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the MyCustomer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the MyCustomer.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the MyCustomer.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds MyCustomerSetCustomTypeAction with checking for non-null required values
     * @return MyCustomerSetCustomTypeAction
     */
    public MyCustomerSetCustomTypeAction build() {
        return new MyCustomerSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds MyCustomerSetCustomTypeAction without checking for non-null required values
     * @return MyCustomerSetCustomTypeAction
     */
    public MyCustomerSetCustomTypeAction buildUnchecked() {
        return new MyCustomerSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of MyCustomerSetCustomTypeActionBuilder
     * @return builder
     */
    public static MyCustomerSetCustomTypeActionBuilder of() {
        return new MyCustomerSetCustomTypeActionBuilder();
    }

    /**
     * create builder for MyCustomerSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetCustomTypeActionBuilder of(final MyCustomerSetCustomTypeAction template) {
        MyCustomerSetCustomTypeActionBuilder builder = new MyCustomerSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
