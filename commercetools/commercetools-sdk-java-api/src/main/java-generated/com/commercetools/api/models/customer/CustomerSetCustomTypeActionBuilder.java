
package com.commercetools.api.models.customer;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomTypeAction customerSetCustomTypeAction = CustomerSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerSetCustomTypeActionBuilder implements Builder<CustomerSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the Customer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Customer.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomerSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Customer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Customer.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public CustomerSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Customer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Customer.</p>
     * @param type value to be set
     * @return Builder
     */

    public CustomerSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Customer.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomerSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Customer.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public CustomerSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Customer.</p>
     * @param fields value to be set
     * @return Builder
     */

    public CustomerSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Customer with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Customer.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Customer.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds CustomerSetCustomTypeAction with checking for non-null required values
     * @return CustomerSetCustomTypeAction
     */
    public CustomerSetCustomTypeAction build() {
        return new CustomerSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds CustomerSetCustomTypeAction without checking for non-null required values
     * @return CustomerSetCustomTypeAction
     */
    public CustomerSetCustomTypeAction buildUnchecked() {
        return new CustomerSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of CustomerSetCustomTypeActionBuilder
     * @return builder
     */
    public static CustomerSetCustomTypeActionBuilder of() {
        return new CustomerSetCustomTypeActionBuilder();
    }

    /**
     * create builder for CustomerSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomTypeActionBuilder of(final CustomerSetCustomTypeAction template) {
        CustomerSetCustomTypeActionBuilder builder = new CustomerSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
