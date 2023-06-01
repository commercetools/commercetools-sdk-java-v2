package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetTextAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetTextActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetTextAction reviewSetTextAction = ReviewSetTextAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewSetTextActionBuilder implements Builder<ReviewSetTextAction> {

    
    @Nullable
    private String text;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param text value to be set
     * @return Builder
     */
    
    public ReviewSetTextActionBuilder text(@Nullable final String text) {
        this.text = text;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return text
     */
    
    @Nullable
    public String getText(){
        return this.text;
    }

    /**
     * builds ReviewSetTextAction with checking for non-null required values
     * @return ReviewSetTextAction
     */
    public ReviewSetTextAction build() {
        return new ReviewSetTextActionImpl(text);
    }
    
    /**
     * builds ReviewSetTextAction without checking for non-null required values
     * @return ReviewSetTextAction
     */
    public ReviewSetTextAction buildUnchecked() {
        return new ReviewSetTextActionImpl(text);
    }

    /**
     * factory method for an instance of ReviewSetTextActionBuilder
     * @return builder 
     */
    public static ReviewSetTextActionBuilder of() {
        return new ReviewSetTextActionBuilder();
    }

    /**
     * create builder for ReviewSetTextAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetTextActionBuilder of(final ReviewSetTextAction template) {
        ReviewSetTextActionBuilder builder = new ReviewSetTextActionBuilder();
        builder.text = template.getText();
        return builder;
    }

}
