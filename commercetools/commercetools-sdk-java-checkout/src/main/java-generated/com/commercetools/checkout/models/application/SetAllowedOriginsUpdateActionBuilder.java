
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAllowedOriginsUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAllowedOriginsUpdateAction setAllowedOriginsUpdateAction = SetAllowedOriginsUpdateAction.builder()
 *             .allowedOrigins(allowedOriginsBuilder -> allowedOriginsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetAllowedOriginsUpdateActionBuilder implements Builder<SetAllowedOriginsUpdateAction> {

    private com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins;

    /**
     *  <p>New allowed origins configuration.</p>
     * @param builder function to build the allowedOrigins value
     * @return Builder
     */

    public SetAllowedOriginsUpdateActionBuilder allowedOrigins(
            Function<com.commercetools.checkout.models.application.AllowedOriginsBuilder, com.commercetools.checkout.models.application.AllowedOriginsBuilder> builder) {
        this.allowedOrigins = builder.apply(com.commercetools.checkout.models.application.AllowedOriginsBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New allowed origins configuration.</p>
     * @param builder function to build the allowedOrigins value
     * @return Builder
     */

    public SetAllowedOriginsUpdateActionBuilder withAllowedOrigins(
            Function<com.commercetools.checkout.models.application.AllowedOriginsBuilder, com.commercetools.checkout.models.application.AllowedOrigins> builder) {
        this.allowedOrigins = builder.apply(com.commercetools.checkout.models.application.AllowedOriginsBuilder.of());
        return this;
    }

    /**
     *  <p>New allowed origins configuration.</p>
     * @param allowedOrigins value to be set
     * @return Builder
     */

    public SetAllowedOriginsUpdateActionBuilder allowedOrigins(
            final com.commercetools.checkout.models.application.AllowedOrigins allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
        return this;
    }

    /**
     *  <p>New allowed origins configuration.</p>
     * @return allowedOrigins
     */

    public com.commercetools.checkout.models.application.AllowedOrigins getAllowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * builds SetAllowedOriginsUpdateAction with checking for non-null required values
     * @return SetAllowedOriginsUpdateAction
     */
    public SetAllowedOriginsUpdateAction build() {
        Objects.requireNonNull(allowedOrigins, SetAllowedOriginsUpdateAction.class + ": allowedOrigins is missing");
        return new SetAllowedOriginsUpdateActionImpl(allowedOrigins);
    }

    /**
     * builds SetAllowedOriginsUpdateAction without checking for non-null required values
     * @return SetAllowedOriginsUpdateAction
     */
    public SetAllowedOriginsUpdateAction buildUnchecked() {
        return new SetAllowedOriginsUpdateActionImpl(allowedOrigins);
    }

    /**
     * factory method for an instance of SetAllowedOriginsUpdateActionBuilder
     * @return builder
     */
    public static SetAllowedOriginsUpdateActionBuilder of() {
        return new SetAllowedOriginsUpdateActionBuilder();
    }

    /**
     * create builder for SetAllowedOriginsUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAllowedOriginsUpdateActionBuilder of(final SetAllowedOriginsUpdateAction template) {
        SetAllowedOriginsUpdateActionBuilder builder = new SetAllowedOriginsUpdateActionBuilder();
        builder.allowedOrigins = template.getAllowedOrigins();
        return builder;
    }

}
