
package com.commercetools.checkout.models.application;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetApplicationLogoUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetApplicationLogoUpdateAction setApplicationLogoUpdateAction = SetApplicationLogoUpdateAction.builder()
 *             .logo(logoBuilder -> logoBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetApplicationLogoUpdateActionBuilder implements Builder<SetApplicationLogoUpdateAction> {

    private com.commercetools.checkout.models.application.ApplicationLogo logo;

    /**
     *  <p>New logo to assign to the Application, which must be a valid url.</p>
     * @param builder function to build the logo value
     * @return Builder
     */

    public SetApplicationLogoUpdateActionBuilder logo(
            Function<com.commercetools.checkout.models.application.ApplicationLogoBuilder, com.commercetools.checkout.models.application.ApplicationLogoBuilder> builder) {
        this.logo = builder.apply(com.commercetools.checkout.models.application.ApplicationLogoBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New logo to assign to the Application, which must be a valid url.</p>
     * @param builder function to build the logo value
     * @return Builder
     */

    public SetApplicationLogoUpdateActionBuilder withLogo(
            Function<com.commercetools.checkout.models.application.ApplicationLogoBuilder, com.commercetools.checkout.models.application.ApplicationLogo> builder) {
        this.logo = builder.apply(com.commercetools.checkout.models.application.ApplicationLogoBuilder.of());
        return this;
    }

    /**
     *  <p>New logo to assign to the Application, which must be a valid url.</p>
     * @param logo value to be set
     * @return Builder
     */

    public SetApplicationLogoUpdateActionBuilder logo(
            final com.commercetools.checkout.models.application.ApplicationLogo logo) {
        this.logo = logo;
        return this;
    }

    /**
     *  <p>New logo to assign to the Application, which must be a valid url.</p>
     * @return logo
     */

    public com.commercetools.checkout.models.application.ApplicationLogo getLogo() {
        return this.logo;
    }

    /**
     * builds SetApplicationLogoUpdateAction with checking for non-null required values
     * @return SetApplicationLogoUpdateAction
     */
    public SetApplicationLogoUpdateAction build() {
        Objects.requireNonNull(logo, SetApplicationLogoUpdateAction.class + ": logo is missing");
        return new SetApplicationLogoUpdateActionImpl(logo);
    }

    /**
     * builds SetApplicationLogoUpdateAction without checking for non-null required values
     * @return SetApplicationLogoUpdateAction
     */
    public SetApplicationLogoUpdateAction buildUnchecked() {
        return new SetApplicationLogoUpdateActionImpl(logo);
    }

    /**
     * factory method for an instance of SetApplicationLogoUpdateActionBuilder
     * @return builder
     */
    public static SetApplicationLogoUpdateActionBuilder of() {
        return new SetApplicationLogoUpdateActionBuilder();
    }

    /**
     * create builder for SetApplicationLogoUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetApplicationLogoUpdateActionBuilder of(final SetApplicationLogoUpdateAction template) {
        SetApplicationLogoUpdateActionBuilder builder = new SetApplicationLogoUpdateActionBuilder();
        builder.logo = template.getLogo();
        return builder;
    }

}
