package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodSetLocalizedDescriptionAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodSetLocalizedDescriptionActionBuilder implements Builder<ShippingMethodSetLocalizedDescriptionAction> {

    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString localizedDescription;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the localizedDescription value
     * @return Builder
     */
    
    public ShippingMethodSetLocalizedDescriptionActionBuilder localizedDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.localizedDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param builder function to build the localizedDescription value
     * @return Builder
     */
    
    public ShippingMethodSetLocalizedDescriptionActionBuilder withLocalizedDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.localizedDescription = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param localizedDescription value to be set
     * @return Builder
     */
    
    public ShippingMethodSetLocalizedDescriptionActionBuilder localizedDescription(@Nullable final com.commercetools.api.models.common.LocalizedString localizedDescription) {
        this.localizedDescription = localizedDescription;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return localizedDescription
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getLocalizedDescription(){
        return this.localizedDescription;
    }

    /**
     * builds ShippingMethodSetLocalizedDescriptionAction with checking for non-null required values
     * @return ShippingMethodSetLocalizedDescriptionAction
     */
    public ShippingMethodSetLocalizedDescriptionAction build() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl(localizedDescription);
    }
    
    /**
     * builds ShippingMethodSetLocalizedDescriptionAction without checking for non-null required values
     * @return ShippingMethodSetLocalizedDescriptionAction
     */
    public ShippingMethodSetLocalizedDescriptionAction buildUnchecked() {
        return new ShippingMethodSetLocalizedDescriptionActionImpl(localizedDescription);
    }

    /**
     * factory method for an instance of ShippingMethodSetLocalizedDescriptionActionBuilder
     * @return builder 
     */
    public static ShippingMethodSetLocalizedDescriptionActionBuilder of() {
        return new ShippingMethodSetLocalizedDescriptionActionBuilder();
    }

    /**
     * create builder for ShippingMethodSetLocalizedDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetLocalizedDescriptionActionBuilder of(final ShippingMethodSetLocalizedDescriptionAction template) {
        ShippingMethodSetLocalizedDescriptionActionBuilder builder = new ShippingMethodSetLocalizedDescriptionActionBuilder();
        builder.localizedDescription = template.getLocalizedDescription();
        return builder;
    }

}
