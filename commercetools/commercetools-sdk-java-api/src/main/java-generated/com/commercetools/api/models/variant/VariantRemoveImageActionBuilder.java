
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantRemoveImageActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantRemoveImageAction variantRemoveImageAction = VariantRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantRemoveImageActionBuilder implements Builder<VariantRemoveImageAction> {

    private String imageUrl;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The URL of the image to remove.</p>
     * @param imageUrl value to be set
     * @return Builder
     */

    public VariantRemoveImageActionBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantRemoveImageActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The URL of the image to remove.</p>
     * @return imageUrl
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantRemoveImageAction with checking for non-null required values
     * @return VariantRemoveImageAction
     */
    public VariantRemoveImageAction build() {
        Objects.requireNonNull(imageUrl, VariantRemoveImageAction.class + ": imageUrl is missing");
        return new VariantRemoveImageActionImpl(imageUrl, staged);
    }

    /**
     * builds VariantRemoveImageAction without checking for non-null required values
     * @return VariantRemoveImageAction
     */
    public VariantRemoveImageAction buildUnchecked() {
        return new VariantRemoveImageActionImpl(imageUrl, staged);
    }

    /**
     * factory method for an instance of VariantRemoveImageActionBuilder
     * @return builder
     */
    public static VariantRemoveImageActionBuilder of() {
        return new VariantRemoveImageActionBuilder();
    }

    /**
     * create builder for VariantRemoveImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantRemoveImageActionBuilder of(final VariantRemoveImageAction template) {
        VariantRemoveImageActionBuilder builder = new VariantRemoveImageActionBuilder();
        builder.imageUrl = template.getImageUrl();
        builder.staged = template.getStaged();
        return builder;
    }

}
