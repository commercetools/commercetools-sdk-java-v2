
package com.commercetools.checkout.models.payment_integration;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetDisplayInfoUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDisplayInfoUpdateAction setDisplayInfoUpdateAction = SetDisplayInfoUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDisplayInfoUpdateActionBuilder implements Builder<SetDisplayInfoUpdateAction> {

    @Nullable
    private com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the displayInfo value
     * @return Builder
     */

    public SetDisplayInfoUpdateActionBuilder displayInfo(
            Function<com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder, com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder> builder) {
        this.displayInfo = builder.apply(com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the displayInfo value
     * @return Builder
     */

    public SetDisplayInfoUpdateActionBuilder withDisplayInfo(
            Function<com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder, com.commercetools.checkout.models.payment_integration.DisplayInfo> builder) {
        this.displayInfo = builder.apply(com.commercetools.checkout.models.payment_integration.DisplayInfoBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param displayInfo value to be set
     * @return Builder
     */

    public SetDisplayInfoUpdateActionBuilder displayInfo(
            @Nullable final com.commercetools.checkout.models.payment_integration.DisplayInfo displayInfo) {
        this.displayInfo = displayInfo;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return displayInfo
     */

    @Nullable
    public com.commercetools.checkout.models.payment_integration.DisplayInfo getDisplayInfo() {
        return this.displayInfo;
    }

    /**
     * builds SetDisplayInfoUpdateAction with checking for non-null required values
     * @return SetDisplayInfoUpdateAction
     */
    public SetDisplayInfoUpdateAction build() {
        return new SetDisplayInfoUpdateActionImpl(displayInfo);
    }

    /**
     * builds SetDisplayInfoUpdateAction without checking for non-null required values
     * @return SetDisplayInfoUpdateAction
     */
    public SetDisplayInfoUpdateAction buildUnchecked() {
        return new SetDisplayInfoUpdateActionImpl(displayInfo);
    }

    /**
     * factory method for an instance of SetDisplayInfoUpdateActionBuilder
     * @return builder
     */
    public static SetDisplayInfoUpdateActionBuilder of() {
        return new SetDisplayInfoUpdateActionBuilder();
    }

    /**
     * create builder for SetDisplayInfoUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDisplayInfoUpdateActionBuilder of(final SetDisplayInfoUpdateAction template) {
        SetDisplayInfoUpdateActionBuilder builder = new SetDisplayInfoUpdateActionBuilder();
        builder.displayInfo = template.getDisplayInfo();
        return builder;
    }

}
