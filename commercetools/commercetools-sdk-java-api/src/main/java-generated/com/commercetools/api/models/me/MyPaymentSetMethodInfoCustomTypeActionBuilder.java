
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoCustomTypeAction myPaymentSetMethodInfoCustomTypeAction = MyPaymentSetMethodInfoCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetMethodInfoCustomTypeActionBuilder implements Builder<MyPaymentSetMethodInfoCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the <code>paymentMethodInfo</code> with Custom Fields.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>paymentMethodInfo</code> with Custom Fields.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>paymentMethodInfo</code> with Custom Fields.</p>
     * @param type value to be set
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>paymentMethodInfo</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>paymentMethodInfo</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>paymentMethodInfo</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public MyPaymentSetMethodInfoCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>paymentMethodInfo</code> with Custom Fields.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>paymentMethodInfo</code>.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds MyPaymentSetMethodInfoCustomTypeAction with checking for non-null required values
     * @return MyPaymentSetMethodInfoCustomTypeAction
     */
    public MyPaymentSetMethodInfoCustomTypeAction build() {
        return new MyPaymentSetMethodInfoCustomTypeActionImpl(type, fields);
    }

    /**
     * builds MyPaymentSetMethodInfoCustomTypeAction without checking for non-null required values
     * @return MyPaymentSetMethodInfoCustomTypeAction
     */
    public MyPaymentSetMethodInfoCustomTypeAction buildUnchecked() {
        return new MyPaymentSetMethodInfoCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of MyPaymentSetMethodInfoCustomTypeActionBuilder
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomTypeActionBuilder of() {
        return new MyPaymentSetMethodInfoCustomTypeActionBuilder();
    }

    /**
     * create builder for MyPaymentSetMethodInfoCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoCustomTypeActionBuilder of(
            final MyPaymentSetMethodInfoCustomTypeAction template) {
        MyPaymentSetMethodInfoCustomTypeActionBuilder builder = new MyPaymentSetMethodInfoCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
