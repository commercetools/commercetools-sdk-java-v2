package com.commercetools.api.models.review;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.review.ReviewDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReviewDraft reviewDraft = ReviewDraft.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ReviewDraftBuilder implements Builder<ReviewDraft> {

    
    @Nullable
    private String key;
    
    
    @Nullable
    private String uniquenessValue;
    
    
    @Nullable
    private String locale;
    
    
    @Nullable
    private String authorName;
    
    
    @Nullable
    private String title;
    
    
    @Nullable
    private String text;
    
    
    @Nullable
    private com.commercetools.api.models.common.ResourceIdentifier target;
    
    
    @Nullable
    private com.commercetools.api.models.state.StateResourceIdentifier state;
    
    
    @Nullable
    private Integer rating;
    
    
    @Nullable
    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    
    /**
     *  <p>User-defined unique identifier for the Review.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>If set, this value must be unique among Reviews. For example, if you want to have only one Review per Customer and per Product, you can set the value to Customer <code>id</code>&nbsp;+ Product <code>id</code>.</p>
     * @param uniquenessValue value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder uniquenessValue(@Nullable final String uniquenessValue) {
        this.uniquenessValue = uniquenessValue;
        return this;
    }
    
    
    
    
    /**
     *  <p>Language in which the content of the Review is written.</p>
     * @param locale value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the author.</p>
     * @param authorName value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder authorName(@Nullable final String authorName) {
        this.authorName = authorName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Title of the Review.</p>
     * @param title value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }
    
    
    
    
    /**
     *  <p>Content of the Review.</p>
     * @param text value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder text(@Nullable final String text) {
        this.text = text;
        return this;
    }
    
    
    
    
    /**
     *  <p>Draft type to create a Reference or a KeyReference to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a CategoryDraft takes a ResourceIdentifier for its value while the value of the corresponding field of a Category is a Reference.</p>
     *  <p>Each resource type has its corresponding ResourceIdentifier, like ChannelResourceIdentifier.</p>
     * @param target value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder target(@Nullable final com.commercetools.api.models.common.ResourceIdentifier target) {
        this.target = target;
        return this;
    }
    
    
    /**
     *  <p>Draft type to create a Reference or a KeyReference to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a CategoryDraft takes a ResourceIdentifier for its value while the value of the corresponding field of a Category is a Reference.</p>
     *  <p>Each resource type has its corresponding ResourceIdentifier, like ChannelResourceIdentifier.</p>
     * @param builder function to build the target value
     * @return Builder
     */
    
    public ReviewDraftBuilder target(Function<com.commercetools.api.models.common.ResourceIdentifierBuilder, Builder<? extends com.commercetools.api.models.common.ResourceIdentifier>> builder) {
        this.target = builder.apply(com.commercetools.api.models.common.ResourceIdentifierBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @param builder function to build the state value
     * @return Builder
     */
    
    public ReviewDraftBuilder state(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifierBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @param builder function to build the state value
     * @return Builder
     */
    
    public ReviewDraftBuilder withState(Function<com.commercetools.api.models.state.StateResourceIdentifierBuilder, com.commercetools.api.models.state.StateResourceIdentifier> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @param state value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder state(@Nullable final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
        return this;
    }
    
    
    
    
    /**
     *  <p>Rating of the targeted Product or Channel. This rating can represent the number of stars, a percentage, or a like (+1)/dislike (-1). A rating is used in the ratings statistics of the targeted object, unless the Review is in a State that does not have the role <code>ReviewIncludedInStatistics</code>.</p>
     * @param rating value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }
    
    
    
    
    /**
     *  <p>Customer who created the Review.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public ReviewDraftBuilder customer(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Customer who created the Review.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public ReviewDraftBuilder withCustomer(Function<com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder, com.commercetools.api.models.customer.CustomerResourceIdentifier> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Customer who created the Review.</p>
     * @param customer value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields for the Review.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ReviewDraftBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields for the Review.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ReviewDraftBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields for the Review.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public ReviewDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }
    
    

    /**
     *  <p>User-defined unique identifier for the Review.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>If set, this value must be unique among Reviews. For example, if you want to have only one Review per Customer and per Product, you can set the value to Customer <code>id</code>&nbsp;+ Product <code>id</code>.</p>
     * @return uniquenessValue
     */
    
    @Nullable
    public String getUniquenessValue(){
        return this.uniquenessValue;
    }
    
    /**
     *  <p>Language in which the content of the Review is written.</p>
     * @return locale
     */
    
    @Nullable
    public String getLocale(){
        return this.locale;
    }
    
    /**
     *  <p>Name of the author.</p>
     * @return authorName
     */
    
    @Nullable
    public String getAuthorName(){
        return this.authorName;
    }
    
    /**
     *  <p>Title of the Review.</p>
     * @return title
     */
    
    @Nullable
    public String getTitle(){
        return this.title;
    }
    
    /**
     *  <p>Content of the Review.</p>
     * @return text
     */
    
    @Nullable
    public String getText(){
        return this.text;
    }
    
    /**
     *  <p>Draft type to create a Reference or a KeyReference to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a CategoryDraft takes a ResourceIdentifier for its value while the value of the corresponding field of a Category is a Reference.</p>
     *  <p>Each resource type has its corresponding ResourceIdentifier, like ChannelResourceIdentifier.</p>
     * @return target
     */
    
    @Nullable
    public com.commercetools.api.models.common.ResourceIdentifier getTarget(){
        return this.target;
    }
    
    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @return state
     */
    
    @Nullable
    public com.commercetools.api.models.state.StateResourceIdentifier getState(){
        return this.state;
    }
    
    /**
     *  <p>Rating of the targeted Product or Channel. This rating can represent the number of stars, a percentage, or a like (+1)/dislike (-1). A rating is used in the ratings statistics of the targeted object, unless the Review is in a State that does not have the role <code>ReviewIncludedInStatistics</code>.</p>
     * @return rating
     */
    
    @Nullable
    public Integer getRating(){
        return this.rating;
    }
    
    /**
     *  <p>Customer who created the Review.</p>
     * @return customer
     */
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>Custom Fields for the Review.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
        return this.custom;
    }

    /**
     * builds ReviewDraft with checking for non-null required values
     * @return ReviewDraft
     */
    public ReviewDraft build() {
        return new ReviewDraftImpl(key, uniquenessValue, locale, authorName, title, text, target, state, rating, customer, custom);
    }
    
    /**
     * builds ReviewDraft without checking for non-null required values
     * @return ReviewDraft
     */
    public ReviewDraft buildUnchecked() {
        return new ReviewDraftImpl(key, uniquenessValue, locale, authorName, title, text, target, state, rating, customer, custom);
    }

    /**
     * factory method for an instance of ReviewDraftBuilder
     * @return builder 
     */
    public static ReviewDraftBuilder of() {
        return new ReviewDraftBuilder();
    }

    /**
     * create builder for ReviewDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewDraftBuilder of(final ReviewDraft template) {
        ReviewDraftBuilder builder = new ReviewDraftBuilder();
        builder.key = template.getKey();
        builder.uniquenessValue = template.getUniquenessValue();
        builder.locale = template.getLocale();
        builder.authorName = template.getAuthorName();
        builder.title = template.getTitle();
        builder.text = template.getText();
        builder.target = template.getTarget();
        builder.state = template.getState();
        builder.rating = template.getRating();
        builder.customer = template.getCustomer();
        builder.custom = template.getCustom();
        return builder;
    }

}
