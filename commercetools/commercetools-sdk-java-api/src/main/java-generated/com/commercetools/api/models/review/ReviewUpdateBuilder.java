package com.commercetools.api.models.review;

import com.commercetools.api.models.review.ReviewUpdateAction;
import com.commercetools.api.models.review.ReviewUpdate;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewUpdate reviewUpdate = ReviewUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewUpdateBuilder implements Builder<ReviewUpdate> {

    
    
    private Long version;
    
    
    
    private java.util.List<com.commercetools.api.models.review.ReviewUpdateAction> actions;

    
    /**
     *  <p>The expected version of the review on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public ReviewUpdateBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ReviewUpdateBuilder actions( final com.commercetools.api.models.review.ReviewUpdateAction ...actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }
    
    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ReviewUpdateBuilder actions( final java.util.List<com.commercetools.api.models.review.ReviewUpdateAction> actions) {
        this.actions = actions;
        return this;
    }
    
    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @param actions value to be set
     * @return Builder
     */
    
    public ReviewUpdateBuilder plusActions( final com.commercetools.api.models.review.ReviewUpdateAction ...actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }
    
    
    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public ReviewUpdateBuilder plusActions(Function<com.commercetools.api.models.review.ReviewUpdateActionBuilder, Builder<? extends com.commercetools.api.models.review.ReviewUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.review.ReviewUpdateActionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @param builder function to build the actions value
     * @return Builder
     */
    
    public ReviewUpdateBuilder withActions(Function<com.commercetools.api.models.review.ReviewUpdateActionBuilder, Builder<? extends com.commercetools.api.models.review.ReviewUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.review.ReviewUpdateActionBuilder.of()).build());
        return this;
    }
                    
    

    /**
     *  <p>The expected version of the review on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>The list of update actions to be performed on the review.</p>
     * @return actions
     */
    
    
    public java.util.List<com.commercetools.api.models.review.ReviewUpdateAction> getActions(){
        return this.actions;
    }

    /**
     * builds ReviewUpdate with checking for non-null required values
     * @return ReviewUpdate
     */
    public ReviewUpdate build() {
        Objects.requireNonNull(version, ReviewUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, ReviewUpdate.class + ": actions is missing");
        return new ReviewUpdateImpl(version, actions);
    }
    
    /**
     * builds ReviewUpdate without checking for non-null required values
     * @return ReviewUpdate
     */
    public ReviewUpdate buildUnchecked() {
        return new ReviewUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of ReviewUpdateBuilder
     * @return builder 
     */
    public static ReviewUpdateBuilder of() {
        return new ReviewUpdateBuilder();
    }

    /**
     * create builder for ReviewUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewUpdateBuilder of(final ReviewUpdate template) {
        ReviewUpdateBuilder builder = new ReviewUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
