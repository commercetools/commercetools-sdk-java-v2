
package com.commercetools.api.models.variant;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantMoveImageToPositionActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantMoveImageToPositionAction variantMoveImageToPositionAction = VariantMoveImageToPositionAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .position(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantMoveImageToPositionActionBuilder implements Builder<VariantMoveImageToPositionAction> {

    private String imageUrl;

    private Long position;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The URL of the image to update.</p>
     * @param imageUrl value to be set
     * @return Builder
     */

    public VariantMoveImageToPositionActionBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @param position value to be set
     * @return Builder
     */

    public VariantMoveImageToPositionActionBuilder position(final Long position) {
        this.position = position;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantMoveImageToPositionActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The URL of the image to update.</p>
     * @return imageUrl
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>Position in <code>images</code> where the image should be moved. Must be between <code>0</code> and the total number of images minus <code>1</code>.</p>
     * @return position
     */

    public Long getPosition() {
        return this.position;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>images</code> is updated. If <code>false</code>, both the current and staged <code>images</code> is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantMoveImageToPositionAction with checking for non-null required values
     * @return VariantMoveImageToPositionAction
     */
    public VariantMoveImageToPositionAction build() {
        Objects.requireNonNull(imageUrl, VariantMoveImageToPositionAction.class + ": imageUrl is missing");
        Objects.requireNonNull(position, VariantMoveImageToPositionAction.class + ": position is missing");
        return new VariantMoveImageToPositionActionImpl(imageUrl, position, staged);
    }

    /**
     * builds VariantMoveImageToPositionAction without checking for non-null required values
     * @return VariantMoveImageToPositionAction
     */
    public VariantMoveImageToPositionAction buildUnchecked() {
        return new VariantMoveImageToPositionActionImpl(imageUrl, position, staged);
    }

    /**
     * factory method for an instance of VariantMoveImageToPositionActionBuilder
     * @return builder
     */
    public static VariantMoveImageToPositionActionBuilder of() {
        return new VariantMoveImageToPositionActionBuilder();
    }

    /**
     * create builder for VariantMoveImageToPositionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantMoveImageToPositionActionBuilder of(final VariantMoveImageToPositionAction template) {
        VariantMoveImageToPositionActionBuilder builder = new VariantMoveImageToPositionActionBuilder();
        builder.imageUrl = template.getImageUrl();
        builder.position = template.getPosition();
        builder.staged = template.getStaged();
        return builder;
    }

}
