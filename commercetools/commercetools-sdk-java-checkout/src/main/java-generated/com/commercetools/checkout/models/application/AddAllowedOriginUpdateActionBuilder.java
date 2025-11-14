
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddAllowedOriginUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddAllowedOriginUpdateAction addAllowedOriginUpdateAction = AddAllowedOriginUpdateAction.builder()
 *             .origin("{origin}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddAllowedOriginUpdateActionBuilder implements Builder<AddAllowedOriginUpdateAction> {

    private String origin;

    /**
     *  <p>Origin URL to add to the allowed origins list.</p>
     * @param origin value to be set
     * @return Builder
     */

    public AddAllowedOriginUpdateActionBuilder origin(final String origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Origin URL to add to the allowed origins list.</p>
     * @return origin
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * builds AddAllowedOriginUpdateAction with checking for non-null required values
     * @return AddAllowedOriginUpdateAction
     */
    public AddAllowedOriginUpdateAction build() {
        Objects.requireNonNull(origin, AddAllowedOriginUpdateAction.class + ": origin is missing");
        return new AddAllowedOriginUpdateActionImpl(origin);
    }

    /**
     * builds AddAllowedOriginUpdateAction without checking for non-null required values
     * @return AddAllowedOriginUpdateAction
     */
    public AddAllowedOriginUpdateAction buildUnchecked() {
        return new AddAllowedOriginUpdateActionImpl(origin);
    }

    /**
     * factory method for an instance of AddAllowedOriginUpdateActionBuilder
     * @return builder
     */
    public static AddAllowedOriginUpdateActionBuilder of() {
        return new AddAllowedOriginUpdateActionBuilder();
    }

    /**
     * create builder for AddAllowedOriginUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddAllowedOriginUpdateActionBuilder of(final AddAllowedOriginUpdateAction template) {
        AddAllowedOriginUpdateActionBuilder builder = new AddAllowedOriginUpdateActionBuilder();
        builder.origin = template.getOrigin();
        return builder;
    }

}
