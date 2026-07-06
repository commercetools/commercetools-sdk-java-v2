
package com.commercetools.checkout.models.application;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AllowedOriginsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AllowedOrigins allowedOrigins = AllowedOrigins.builder()
 *             .allowAll(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AllowedOriginsBuilder implements Builder<AllowedOrigins> {

    private Boolean allowAll;

    @Nullable
    private java.util.List<String> origins;

    /**
     *  <p>Indicates whether all the origin URLs are allowed or not.</p>
     * @param allowAll value to be set
     * @return Builder
     */

    public AllowedOriginsBuilder allowAll(final Boolean allowAll) {
        this.allowAll = allowAll;
        return this;
    }

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     * @param origins value to be set
     * @return Builder
     */

    public AllowedOriginsBuilder origins(@Nullable final String... origins) {
        this.origins = new ArrayList<>(Arrays.asList(origins));
        return this;
    }

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     * @param origins value to be set
     * @return Builder
     */

    public AllowedOriginsBuilder origins(@Nullable final java.util.List<String> origins) {
        this.origins = origins;
        return this;
    }

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     * @param origins value to be set
     * @return Builder
     */

    public AllowedOriginsBuilder plusOrigins(@Nullable final String... origins) {
        if (this.origins == null) {
            this.origins = new ArrayList<>();
        }
        this.origins.addAll(Arrays.asList(origins));
        return this;
    }

    /**
     *  <p>Indicates whether all the origin URLs are allowed or not.</p>
     * @return allowAll
     */

    public Boolean getAllowAll() {
        return this.allowAll;
    }

    /**
     *  <p>Value of the URL to set. If empty, any existing value will be removed.</p>
     * @return origins
     */

    @Nullable
    public java.util.List<String> getOrigins() {
        return this.origins;
    }

    /**
     * builds AllowedOrigins with checking for non-null required values
     * @return AllowedOrigins
     */
    public AllowedOrigins build() {
        Objects.requireNonNull(allowAll, AllowedOrigins.class + ": allowAll is missing");
        return new AllowedOriginsImpl(allowAll, origins);
    }

    /**
     * builds AllowedOrigins without checking for non-null required values
     * @return AllowedOrigins
     */
    public AllowedOrigins buildUnchecked() {
        return new AllowedOriginsImpl(allowAll, origins);
    }

    /**
     * factory method for an instance of AllowedOriginsBuilder
     * @return builder
     */
    public static AllowedOriginsBuilder of() {
        return new AllowedOriginsBuilder();
    }

    /**
     * create builder for AllowedOrigins instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AllowedOriginsBuilder of(final AllowedOrigins template) {
        AllowedOriginsBuilder builder = new AllowedOriginsBuilder();
        builder.allowAll = template.getAllowAll();
        builder.origins = template.getOrigins();
        return builder;
    }

}
