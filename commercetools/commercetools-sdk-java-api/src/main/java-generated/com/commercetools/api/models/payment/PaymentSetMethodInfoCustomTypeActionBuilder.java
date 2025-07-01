
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoCustomTypeAction paymentSetMethodInfoCustomTypeAction = PaymentSetMethodInfoCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoCustomTypeActionBuilder implements Builder<PaymentSetMethodInfoCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the <code>paymentMethodInfo</code> with Custom Fields.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentSetMethodInfoCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>paymentMethodInfo</code> with Custom Fields.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentSetMethodInfoCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the <code>paymentMethodInfo</code> with Custom Fields.</p>
     * @param type value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>paymentMethodInfo</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentSetMethodInfoCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>paymentMethodInfo</code>.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentSetMethodInfoCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the <code>paymentMethodInfo</code>.</p>
     * @param fields value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoCustomTypeActionBuilder fields(
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
     * builds PaymentSetMethodInfoCustomTypeAction with checking for non-null required values
     * @return PaymentSetMethodInfoCustomTypeAction
     */
    public PaymentSetMethodInfoCustomTypeAction build() {
        return new PaymentSetMethodInfoCustomTypeActionImpl(type, fields);
    }

    /**
     * builds PaymentSetMethodInfoCustomTypeAction without checking for non-null required values
     * @return PaymentSetMethodInfoCustomTypeAction
     */
    public PaymentSetMethodInfoCustomTypeAction buildUnchecked() {
        return new PaymentSetMethodInfoCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of PaymentSetMethodInfoCustomTypeActionBuilder
     * @return builder
     */
    public static PaymentSetMethodInfoCustomTypeActionBuilder of() {
        return new PaymentSetMethodInfoCustomTypeActionBuilder();
    }

    /**
     * create builder for PaymentSetMethodInfoCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoCustomTypeActionBuilder of(final PaymentSetMethodInfoCustomTypeAction template) {
        PaymentSetMethodInfoCustomTypeActionBuilder builder = new PaymentSetMethodInfoCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
