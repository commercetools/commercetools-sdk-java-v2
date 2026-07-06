
package com.commercetools.checkout.models.application;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAllowedOriginUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAllowedOriginUpdateAction removeAllowedOriginUpdateAction = RemoveAllowedOriginUpdateAction.builder()
 *             .origin("{origin}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveAllowedOriginUpdateActionBuilder implements Builder<RemoveAllowedOriginUpdateAction> {

    private String origin;

    /**
     *  <p>Origin URL to remove from the allowed origins list.</p>
     * @param origin value to be set
     * @return Builder
     */

    public RemoveAllowedOriginUpdateActionBuilder origin(final String origin) {
        this.origin = origin;
        return this;
    }

    /**
     *  <p>Origin URL to remove from the allowed origins list.</p>
     * @return origin
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * builds RemoveAllowedOriginUpdateAction with checking for non-null required values
     * @return RemoveAllowedOriginUpdateAction
     */
    public RemoveAllowedOriginUpdateAction build() {
        Objects.requireNonNull(origin, RemoveAllowedOriginUpdateAction.class + ": origin is missing");
        return new RemoveAllowedOriginUpdateActionImpl(origin);
    }

    /**
     * builds RemoveAllowedOriginUpdateAction without checking for non-null required values
     * @return RemoveAllowedOriginUpdateAction
     */
    public RemoveAllowedOriginUpdateAction buildUnchecked() {
        return new RemoveAllowedOriginUpdateActionImpl(origin);
    }

    /**
     * factory method for an instance of RemoveAllowedOriginUpdateActionBuilder
     * @return builder
     */
    public static RemoveAllowedOriginUpdateActionBuilder of() {
        return new RemoveAllowedOriginUpdateActionBuilder();
    }

    /**
     * create builder for RemoveAllowedOriginUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAllowedOriginUpdateActionBuilder of(final RemoveAllowedOriginUpdateAction template) {
        RemoveAllowedOriginUpdateActionBuilder builder = new RemoveAllowedOriginUpdateActionBuilder();
        builder.origin = template.getOrigin();
        return builder;
    }

}
