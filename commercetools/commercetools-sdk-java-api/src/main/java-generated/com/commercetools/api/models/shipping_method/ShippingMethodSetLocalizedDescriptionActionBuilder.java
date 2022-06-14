
package com.commercetools.api.models.shipping_method;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSetLocalizedDescriptionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedDescriptionAction shippingMethodSetLocalizedDescriptionAction = ShippingMethodSetLocalizedDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSetLocalizedDescriptionActionBuilder
        implements Builder<ShippingMethodSetLocalizedDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ShippingMethodSetLocalizedDescriptionActionBuilder localizedDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ShippingMethodSetLocalizedDescriptionActionBuilder localizedDescription(
            @Nullable final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription() {
        return this.localizedDescription;
    }

    public ShippingMethodSetLocalizedDescriptionAction build() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl(localizedDescription);
    }

    /**
     * builds ShippingMethodSetLocalizedDescriptionAction without checking for non null required values
     */
    public ShippingMethodSetLocalizedDescriptionAction buildUnchecked() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl(localizedDescription);
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder of() {
        return new ShippingMethodSetLocalizedDescriptionActionBuilder();
    }

    public static ShippingMethodSetLocalizedDescriptionActionBuilder of(
            final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionBuilder builder = new ShippingMethodSetLocalizedDescriptionActionBuilder();
        builder.localizedDescription = template.getLocalizedDescription();
        return builder;
    }

}
