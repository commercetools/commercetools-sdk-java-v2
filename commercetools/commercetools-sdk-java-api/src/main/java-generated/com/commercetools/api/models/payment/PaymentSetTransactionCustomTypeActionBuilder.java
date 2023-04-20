
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetTransactionCustomTypeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetTransactionCustomTypeAction paymentSetTransactionCustomTypeAction = PaymentSetTransactionCustomTypeAction.builder()
 *             .transactionId("{transactionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetTransactionCustomTypeActionBuilder implements Builder<PaymentSetTransactionCustomTypeAction> {

    private String transactionId;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>Unique identifier of the Transaction. If the specified <code>transactionId</code> does not exist, the request will fail with an InvalidOperation error.</p>
     * @param transactionId value to be set
     * @return Builder
     */

    public PaymentSetTransactionCustomTypeActionBuilder transactionId(final String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Transaction with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentSetTransactionCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Transaction with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentSetTransactionCustomTypeActionBuilder withType(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifier> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Defines the Type that extends the Transaction with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
     * @param type value to be set
     * @return Builder
     */

    public PaymentSetTransactionCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Transaction.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentSetTransactionCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Transaction.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentSetTransactionCustomTypeActionBuilder withFields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainer> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of());
        return this;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Transaction.</p>
     * @param fields value to be set
     * @return Builder
     */

    public PaymentSetTransactionCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>Unique identifier of the Transaction. If the specified <code>transactionId</code> does not exist, the request will fail with an InvalidOperation error.</p>
     * @return transactionId
     */

    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     *  <p>Defines the Type that extends the Transaction with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Transaction.</p>
     * @return type
     */

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Transaction.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds PaymentSetTransactionCustomTypeAction with checking for non-null required values
     * @return PaymentSetTransactionCustomTypeAction
     */
    public PaymentSetTransactionCustomTypeAction build() {
        Objects.requireNonNull(transactionId,
            PaymentSetTransactionCustomTypeAction.class + ": transactionId is missing");
        return new PaymentSetTransactionCustomTypeActionImpl(transactionId, type, fields);
    }

    /**
     * builds PaymentSetTransactionCustomTypeAction without checking for non-null required values
     * @return PaymentSetTransactionCustomTypeAction
     */
    public PaymentSetTransactionCustomTypeAction buildUnchecked() {
        return new PaymentSetTransactionCustomTypeActionImpl(transactionId, type, fields);
    }

    /**
     * factory method for an instance of PaymentSetTransactionCustomTypeActionBuilder
     * @return builder
     */
    public static PaymentSetTransactionCustomTypeActionBuilder of() {
        return new PaymentSetTransactionCustomTypeActionBuilder();
    }

    /**
     * create builder for PaymentSetTransactionCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetTransactionCustomTypeActionBuilder of(
            final PaymentSetTransactionCustomTypeAction template) {
        PaymentSetTransactionCustomTypeActionBuilder builder = new PaymentSetTransactionCustomTypeActionBuilder();
        builder.transactionId = template.getTransactionId();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
