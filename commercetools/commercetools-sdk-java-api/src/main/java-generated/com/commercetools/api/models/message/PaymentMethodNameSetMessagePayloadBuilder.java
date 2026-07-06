
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodNameSetMessagePayload paymentMethodNameSetMessagePayload = PaymentMethodNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodNameSetMessagePayloadBuilder implements Builder<PaymentMethodNameSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString oldName;

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodNameSetMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public PaymentMethodNameSetMessagePayloadBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param name value to be set
     * @return Builder
     */

    public PaymentMethodNameSetMessagePayloadBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the oldName value
     * @return Builder
     */

    public PaymentMethodNameSetMessagePayloadBuilder oldName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.oldName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param builder function to build the oldName value
     * @return Builder
     */

    public PaymentMethodNameSetMessagePayloadBuilder withOldName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.oldName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param oldName value to be set
     * @return Builder
     */

    public PaymentMethodNameSetMessagePayloadBuilder oldName(
            @Nullable final com.commercetools.api.models.common.LocalizedString oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     *  <p>Name of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Name of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @return oldName
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getOldName() {
        return this.oldName;
    }

    /**
     * builds PaymentMethodNameSetMessagePayload with checking for non-null required values
     * @return PaymentMethodNameSetMessagePayload
     */
    public PaymentMethodNameSetMessagePayload build() {
        return new PaymentMethodNameSetMessagePayloadImpl(name, oldName);
    }

    /**
     * builds PaymentMethodNameSetMessagePayload without checking for non-null required values
     * @return PaymentMethodNameSetMessagePayload
     */
    public PaymentMethodNameSetMessagePayload buildUnchecked() {
        return new PaymentMethodNameSetMessagePayloadImpl(name, oldName);
    }

    /**
     * factory method for an instance of PaymentMethodNameSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodNameSetMessagePayloadBuilder of() {
        return new PaymentMethodNameSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodNameSetMessagePayloadBuilder of(final PaymentMethodNameSetMessagePayload template) {
        PaymentMethodNameSetMessagePayloadBuilder builder = new PaymentMethodNameSetMessagePayloadBuilder();
        builder.name = template.getName();
        builder.oldName = template.getOldName();
        return builder;
    }

}
