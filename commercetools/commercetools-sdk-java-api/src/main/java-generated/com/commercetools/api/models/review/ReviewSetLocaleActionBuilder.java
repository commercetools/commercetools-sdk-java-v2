package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewSetLocaleAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewSetLocaleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewSetLocaleAction reviewSetLocaleAction = ReviewSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewSetLocaleActionBuilder implements Builder<ReviewSetLocaleAction> {

    
    @Nullable
    private String locale;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param locale value to be set
     * @return Builder
     */
    
    public ReviewSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return locale
     */
    
    @Nullable
    public String getLocale(){
        return this.locale;
    }

    /**
     * builds ReviewSetLocaleAction with checking for non-null required values
     * @return ReviewSetLocaleAction
     */
    public ReviewSetLocaleAction build() {
        return new ReviewSetLocaleActionImpl(locale);
    }
    
    /**
     * builds ReviewSetLocaleAction without checking for non-null required values
     * @return ReviewSetLocaleAction
     */
    public ReviewSetLocaleAction buildUnchecked() {
        return new ReviewSetLocaleActionImpl(locale);
    }

    /**
     * factory method for an instance of ReviewSetLocaleActionBuilder
     * @return builder 
     */
    public static ReviewSetLocaleActionBuilder of() {
        return new ReviewSetLocaleActionBuilder();
    }

    /**
     * create builder for ReviewSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewSetLocaleActionBuilder of(final ReviewSetLocaleAction template) {
        ReviewSetLocaleActionBuilder builder = new ReviewSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
