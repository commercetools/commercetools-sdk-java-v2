package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetTitleAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetTitleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTitleAction reviewSetTitleAction = ReviewSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewSetTitleActionBuilder implements Builder<ReviewSetTitleAction> {

    
    @Nullable
    private String title;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param title value to be set
     * @return Builder
     */
    
    public ReviewSetTitleActionBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return title
     */
    
    @Nullable
    public String getTitle(){
        return this.title;
    }

    /**
     * builds ReviewSetTitleAction with checking for non-null required values
     * @return ReviewSetTitleAction
     */
    public ReviewSetTitleAction build() {
        return new ReviewSetTitleActionImpl(title);
    }
    
    /**
     * builds ReviewSetTitleAction without checking for non-null required values
     * @return ReviewSetTitleAction
     */
    public ReviewSetTitleAction buildUnchecked() {
        return new ReviewSetTitleActionImpl(title);
    }

    /**
     * factory method for an instance of ReviewSetTitleActionBuilder
     * @return builder 
     */
    public static ReviewSetTitleActionBuilder of() {
        return new ReviewSetTitleActionBuilder();
    }

    /**
     * create builder for ReviewSetTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetTitleActionBuilder of(final ReviewSetTitleAction template) {
        ReviewSetTitleActionBuilder builder = new ReviewSetTitleActionBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
