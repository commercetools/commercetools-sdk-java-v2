
package com.commercetools.api.models.review;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReviewBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Review review = Review.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .includedInStatistics(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewBuilder implements Builder<Review> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

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
    private com.commercetools.api.models.common.Reference target;

    private Boolean includedInStatistics;

    @Nullable
    private Integer rating;

    @Nullable
    private com.commercetools.api.models.state.StateReference state;

    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    /**
     *  <p>Unique identifier of the Review.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReviewBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Review.</p>
     * @param version value to be set
     * @return Builder
     */

    public ReviewBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Review was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ReviewBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Review was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ReviewBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ReviewBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ReviewBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ReviewBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ReviewBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Review.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReviewBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Must be unique among Reviews. For example, if this value is set to Customer <code>id</code>&nbsp;+ Product <code>id</code>, only one Review per Customer and per Product is allowed.</p>
     * @param uniquenessValue value to be set
     * @return Builder
     */

    public ReviewBuilder uniquenessValue(@Nullable final String uniquenessValue) {
        this.uniquenessValue = uniquenessValue;
        return this;
    }

    /**
     *  <p>Language in which the content of the Review is written.</p>
     * @param locale value to be set
     * @return Builder
     */

    public ReviewBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    /**
     *  <p>Name of the author.</p>
     * @param authorName value to be set
     * @return Builder
     */

    public ReviewBuilder authorName(@Nullable final String authorName) {
        this.authorName = authorName;
        return this;
    }

    /**
     *  <p>Title of the Review.</p>
     * @param title value to be set
     * @return Builder
     */

    public ReviewBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }

    /**
     *  <p>Content of the Review.</p>
     * @param text value to be set
     * @return Builder
     */

    public ReviewBuilder text(@Nullable final String text) {
        this.text = text;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @param target value to be set
     * @return Builder
     */

    public ReviewBuilder target(@Nullable final com.commercetools.api.models.common.Reference target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public ReviewBuilder target(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.target = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Indicates if this Review is taken into account in the ratings statistics of the target. A Review is per default used in the statistics, unless the Review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>. If the role of a State is modified after the calculation of this field, the calculation is not updated.</p>
     * @param includedInStatistics value to be set
     * @return Builder
     */

    public ReviewBuilder includedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
        return this;
    }

    /**
     *  <p>Rating of the Product or Channel.</p>
     * @param rating value to be set
     * @return Builder
     */

    public ReviewBuilder rating(@Nullable final Integer rating) {
        this.rating = rating;
        return this;
    }

    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @param builder function to build the state value
     * @return Builder
     */

    public ReviewBuilder state(
            Function<com.commercetools.api.models.state.StateReferenceBuilder, com.commercetools.api.models.state.StateReferenceBuilder> builder) {
        this.state = builder.apply(com.commercetools.api.models.state.StateReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @param state value to be set
     * @return Builder
     */

    public ReviewBuilder state(@Nullable final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Customer who created the Review.</p>
     * @param builder function to build the customer value
     * @return Builder
     */

    public ReviewBuilder customer(
            Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Customer who created the Review.</p>
     * @param customer value to be set
     * @return Builder
     */

    public ReviewBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }

    /**
     *  <p>Custom Fields of the Review.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ReviewBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Review.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ReviewBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    @Nullable
    public String getUniquenessValue() {
        return this.uniquenessValue;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    @Nullable
    public String getAuthorName() {
        return this.authorName;
    }

    @Nullable
    public String getTitle() {
        return this.title;
    }

    @Nullable
    public String getText() {
        return this.text;
    }

    @Nullable
    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    @Nullable
    public Integer getRating() {
        return this.rating;
    }

    @Nullable
    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     * builds Review with checking for non-null required values
     * @return Review
     */
    public Review build() {
        Objects.requireNonNull(id, Review.class + ": id is missing");
        Objects.requireNonNull(version, Review.class + ": version is missing");
        Objects.requireNonNull(createdAt, Review.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Review.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(includedInStatistics, Review.class + ": includedInStatistics is missing");
        return new ReviewImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, uniquenessValue,
            locale, authorName, title, text, target, includedInStatistics, rating, state, customer, custom);
    }

    /**
     * builds Review without checking for non-null required values
     * @return Review
     */
    public Review buildUnchecked() {
        return new ReviewImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, uniquenessValue,
            locale, authorName, title, text, target, includedInStatistics, rating, state, customer, custom);
    }

    public static ReviewBuilder of() {
        return new ReviewBuilder();
    }

    public static ReviewBuilder of(final Review template) {
        ReviewBuilder builder = new ReviewBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.uniquenessValue = template.getUniquenessValue();
        builder.locale = template.getLocale();
        builder.authorName = template.getAuthorName();
        builder.title = template.getTitle();
        builder.text = template.getText();
        builder.target = template.getTarget();
        builder.includedInStatistics = template.getIncludedInStatistics();
        builder.rating = template.getRating();
        builder.state = template.getState();
        builder.customer = template.getCustomer();
        builder.custom = template.getCustom();
        return builder;
    }

}
