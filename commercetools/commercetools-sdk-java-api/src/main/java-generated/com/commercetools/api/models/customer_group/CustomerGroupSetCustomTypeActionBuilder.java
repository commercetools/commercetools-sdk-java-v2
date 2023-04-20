
package com.commercetools.api.models.customer_group;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetCustomTypeAction customerGroupSetCustomTypeAction = CustomerGroupSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerGroupSetCustomTypeActionBuilder implements Builder<CustomerGroupSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomerGroupSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomerGroupSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     * @param type value to be set
     * @return Builder
     */

    public CustomerGroupSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomerGroupSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomerGroupSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CustomerGroupSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the CustomerGroup with Custom Fields. If absent, any existing Type and Custom Fields are removed from the CustomerGroup.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the CustomerGroup.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CustomerGroupSetCustomTypeAction with checking for non-null required values
     * @return CustomerGroupSetCustomTypeAction
     */
    public CustomerGroupSetCustomTypeAction build() {
        return new CustomerGroupSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CustomerGroupSetCustomTypeAction without checking for non-null required values
     * @return CustomerGroupSetCustomTypeAction
     */
    public CustomerGroupSetCustomTypeAction buildUnchecked() {
        return new CustomerGroupSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of CustomerGroupSetCustomTypeActionBuilder
     * @return builder
     */
    public static CustomerGroupSetCustomTypeActionBuilder of() {
        return new CustomerGroupSetCustomTypeActionBuilder();
    }

    /**
     * create builder for CustomerGroupSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetCustomTypeActionBuilder of(final CustomerGroupSetCustomTypeAction template) {
        CustomerGroupSetCustomTypeActionBuilder builder = new CustomerGroupSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
