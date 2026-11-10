
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetImageLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetImageLabelAction variantSetImageLabelAction = VariantSetImageLabelAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetImageLabelActionBuilder implements Builder<VariantSetImageLabelAction> {

    private String imageUrl;

    @Nullable
    private String label;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The URL of the image to set the label.</p>
     * @param imageUrl value to be set
     * @return Builder
     */

    public VariantSetImageLabelActionBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @param label value to be set
     * @return Builder
     */

    public VariantSetImageLabelActionBuilder label(@Nullable final String label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetImageLabelActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The URL of the image to set the label.</p>
     * @return imageUrl
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @return label
     */

    @Nullable
    public String getLabel() {
        return this.label;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantSetImageLabelAction with checking for non-null required values
     * @return VariantSetImageLabelAction
     */
    public VariantSetImageLabelAction build() {
        Objects.requireNonNull(imageUrl, VariantSetImageLabelAction.class + ": imageUrl is missing");
        return new VariantSetImageLabelActionImpl(imageUrl, label, staged);
    }

    /**
     * builds VariantSetImageLabelAction without checking for non-null required values
     * @return VariantSetImageLabelAction
     */
    public VariantSetImageLabelAction buildUnchecked() {
        return new VariantSetImageLabelActionImpl(imageUrl, label, staged);
    }

    /**
     * factory method for an instance of VariantSetImageLabelActionBuilder
     * @return builder
     */
    public static VariantSetImageLabelActionBuilder of() {
        return new VariantSetImageLabelActionBuilder();
    }

    /**
     * create builder for VariantSetImageLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetImageLabelActionBuilder of(final VariantSetImageLabelAction template) {
        VariantSetImageLabelActionBuilder builder = new VariantSetImageLabelActionBuilder();
        builder.imageUrl = template.getImageUrl();
        builder.label = template.getLabel();
        builder.staged = template.getStaged();
        return builder;
    }

}
