
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetLocalizedNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedNameAction shippingMethodSetLocalizedNameAction = ShippingMethodSetLocalizedNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetLocalizedNameActionBuilder implements Builder<ShippingMethodSetLocalizedNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedName;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the localizedName value
     * @return Builder
     */

    public ShippingMethodSetLocalizedNameActionBuilder localizedName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the localizedName value
     * @return Builder
     */

    public ShippingMethodSetLocalizedNameActionBuilder withLocalizedName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.localizedName = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param localizedName value to be set
     * @return Builder
     */

    public ShippingMethodSetLocalizedNameActionBuilder localizedName(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return localizedName
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedName() {
        return this.localizedName;
    }

    /**
     * builds ShippingMethodSetLocalizedNameAction with checking for non-null required values
     * @return ShippingMethodSetLocalizedNameAction
     */
    public ShippingMethodSetLocalizedNameAction build() {
        return new ShippingMethodSetLocalizedNameActionImpl(localizedName);
    }

    /**
     * builds ShippingMethodSetLocalizedNameAction without checking for non-null required values
     * @return ShippingMethodSetLocalizedNameAction
     */
    public ShippingMethodSetLocalizedNameAction buildUnchecked() {
        return new ShippingMethodSetLocalizedNameActionImpl(localizedName);
    }

    /**
     * factory method for an instance of ShippingMethodSetLocalizedNameActionBuilder
     * @return builder
     */
    public static ShippingMethodSetLocalizedNameActionBuilder of() {
        return new ShippingMethodSetLocalizedNameActionBuilder();
    }

    /**
     * create builder for ShippingMethodSetLocalizedNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetLocalizedNameActionBuilder of(final ShippingMethodSetLocalizedNameAction template) {
        ShippingMethodSetLocalizedNameActionBuilder builder = new ShippingMethodSetLocalizedNameActionBuilder();
        builder.localizedName = template.getLocalizedName();
        return builder;
    }

}
