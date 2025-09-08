
package com.commercetools.api.models.payment_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodSetCustomTypeAction paymentMethodSetCustomTypeAction = PaymentMethodSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodSetCustomTypeActionBuilder implements Builder<PaymentMethodSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the PaymentMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the PaymentMethod.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentMethodSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the PaymentMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the PaymentMethod.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentMethodSetCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the PaymentMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the PaymentMethod.</p>
     * @param type value to be set
     * @return Builder
     */

    public PaymentMethodSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the PaymentMethod.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentMethodSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the PaymentMethod.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentMethodSetCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the PaymentMethod.</p>
     * @param fields value to be set
     * @return Builder
     */

    public PaymentMethodSetCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the PaymentMethod with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the PaymentMethod.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the PaymentMethod.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds PaymentMethodSetCustomTypeAction with checking for non-null required values
     * @return PaymentMethodSetCustomTypeAction
     */
    public PaymentMethodSetCustomTypeAction build() {
        return new PaymentMethodSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds PaymentMethodSetCustomTypeAction without checking for non-null required values
     * @return PaymentMethodSetCustomTypeAction
     */
    public PaymentMethodSetCustomTypeAction buildUnchecked() {
        return new PaymentMethodSetCustomTypeActionImpl(type, fields);
    }

    /**
     * factory method for an instance of PaymentMethodSetCustomTypeActionBuilder
     * @return builder
     */
    public static PaymentMethodSetCustomTypeActionBuilder of() {
        return new PaymentMethodSetCustomTypeActionBuilder();
    }

    /**
     * create builder for PaymentMethodSetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodSetCustomTypeActionBuilder of(final PaymentMethodSetCustomTypeAction template) {
        PaymentMethodSetCustomTypeActionBuilder builder = new PaymentMethodSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
