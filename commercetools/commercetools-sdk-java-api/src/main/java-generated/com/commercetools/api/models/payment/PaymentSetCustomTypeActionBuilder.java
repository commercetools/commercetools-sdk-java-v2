
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetCustomTypeAction paymentSetCustomTypeAction = PaymentSetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetCustomTypeActionBuilder implements Builder<PaymentSetCustomTypeAction> {

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Defines the Type that extends the Payment with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Payment.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentSetCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Payment with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Payment.</p>
     * @param type value to be set
     * @return Builder
     */

    public PaymentSetCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Payment.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentSetCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Payment.</p>
     * @param fields value to be set
     * @return Builder
     */

    public PaymentSetCustomTypeActionBuilder fields(
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

    /**
     * builds PaymentSetCustomTypeAction with checking for non-null required values
     * @return PaymentSetCustomTypeAction
     */
    public PaymentSetCustomTypeAction build() {
        return new PaymentSetCustomTypeActionImpl(type, fields);
    }

    /**
     * builds PaymentSetCustomTypeAction without checking for non-null required values
     * @return PaymentSetCustomTypeAction
     */
    public PaymentSetCustomTypeAction buildUnchecked() {
        return new PaymentSetCustomTypeActionImpl(type, fields);
    }

    public static PaymentSetCustomTypeActionBuilder of() {
        return new PaymentSetCustomTypeActionBuilder();
    }

    public static PaymentSetCustomTypeActionBuilder of(final PaymentSetCustomTypeAction template) {
        PaymentSetCustomTypeActionBuilder builder = new PaymentSetCustomTypeActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
