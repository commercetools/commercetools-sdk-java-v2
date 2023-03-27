
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentAddInterfaceInteractionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentAddInterfaceInteractionAction paymentAddInterfaceInteractionAction = PaymentAddInterfaceInteractionAction.builder()
 *             .type(typeBuilder -> typeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentAddInterfaceInteractionActionBuilder implements Builder<PaymentAddInterfaceInteractionAction> {

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    /**
     *  <p>ResourceIdentifier of a Type.</p>
     * @param builder function to build the type value
     * @return Builder
     */

    public PaymentAddInterfaceInteractionActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Type.</p>
     * @param type value to be set
     * @return Builder
     */

    public PaymentAddInterfaceInteractionActionBuilder type(
            final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    /**
     *  <p>Custom Fields as per FieldDefinitions of the Type.</p>
     * @param builder function to build the fields value
     * @return Builder
     */

    public PaymentAddInterfaceInteractionActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields as per FieldDefinitions of the Type.</p>
     * @param fields value to be set
     * @return Builder
     */

    public PaymentAddInterfaceInteractionActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Type.</p>
     * @return type
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Custom Fields as per FieldDefinitions of the Type.</p>
     * @return fields
     */

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    /**
     * builds PaymentAddInterfaceInteractionAction with checking for non-null required values
     * @return PaymentAddInterfaceInteractionAction
     */
    public PaymentAddInterfaceInteractionAction build() {
        Objects.requireNonNull(type, PaymentAddInterfaceInteractionAction.class + ": type is missing");
        return new PaymentAddInterfaceInteractionActionImpl(type, fields);
    }

    /**
     * builds PaymentAddInterfaceInteractionAction without checking for non-null required values
     * @return PaymentAddInterfaceInteractionAction
     */
    public PaymentAddInterfaceInteractionAction buildUnchecked() {
        return new PaymentAddInterfaceInteractionActionImpl(type, fields);
    }

    /**
     * factory method for an instance of PaymentAddInterfaceInteractionActionBuilder
     * @return builder
     */
    public static PaymentAddInterfaceInteractionActionBuilder of() {
        return new PaymentAddInterfaceInteractionActionBuilder();
    }

    /**
     * create builder for PaymentAddInterfaceInteractionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentAddInterfaceInteractionActionBuilder of(final PaymentAddInterfaceInteractionAction template) {
        PaymentAddInterfaceInteractionActionBuilder builder = new PaymentAddInterfaceInteractionActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
