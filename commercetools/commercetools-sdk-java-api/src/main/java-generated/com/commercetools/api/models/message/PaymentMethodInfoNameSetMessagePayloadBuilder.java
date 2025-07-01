
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoNameSetMessagePayload paymentMethodInfoNameSetMessagePayload = PaymentMethodInfoNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoNameSetMessagePayloadBuilder implements Builder<PaymentMethodInfoNameSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldName;

    /**
     *  <p>Name of the Payment Method after the Set MethodInfo Name update action.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodInfoNameSetMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Payment Method after the Set MethodInfo Name update action.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodInfoNameSetMessagePayloadBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Payment Method after the Set MethodInfo Name update action.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodInfoNameSetMessagePayloadBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the Payment Method before the Set MethodInfo Name update action.</p>
     * @param builder function to build the oldName value
     * @return Builder
     */

    public PaymentMethodInfoNameSetMessagePayloadBuilder oldName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.oldName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Payment Method before the Set MethodInfo Name update action.</p>
     * @param builder function to build the oldName value
     * @return Builder
     */

    public PaymentMethodInfoNameSetMessagePayloadBuilder withOldName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.oldName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Payment Method before the Set MethodInfo Name update action.</p>
     * @param oldName value to be set
     * @return Builder
     */

    public PaymentMethodInfoNameSetMessagePayloadBuilder oldName(
            @Nullable final com.commercetools.api.models.common.LocalizedString oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     *  <p>Name of the Payment Method after the Set MethodInfo Name update action.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Name of the Payment Method before the Set MethodInfo Name update action.</p>
     * @return oldName
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getOldName() {
        return this.oldName;
    }

    /**
     * builds PaymentMethodInfoNameSetMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoNameSetMessagePayload
     */
    public PaymentMethodInfoNameSetMessagePayload build() {
        return new PaymentMethodInfoNameSetMessagePayloadImpl(name, oldName);
    }

    /**
     * builds PaymentMethodInfoNameSetMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoNameSetMessagePayload
     */
    public PaymentMethodInfoNameSetMessagePayload buildUnchecked() {
        return new PaymentMethodInfoNameSetMessagePayloadImpl(name, oldName);
    }

    /**
     * factory method for an instance of PaymentMethodInfoNameSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoNameSetMessagePayloadBuilder of() {
        return new PaymentMethodInfoNameSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoNameSetMessagePayloadBuilder of(
            final PaymentMethodInfoNameSetMessagePayload template) {
        PaymentMethodInfoNameSetMessagePayloadBuilder builder = new PaymentMethodInfoNameSetMessagePayloadBuilder();
        builder.name = template.getName();
        builder.oldName = template.getOldName();
        return builder;
    }

}
