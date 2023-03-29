
package com.commercetools.api.models.review;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * Review
 *
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
@JsonDeserialize(as = ReviewImpl.class)
public interface Review extends BaseResource, ReviewMixin, com.commercetools.api.models.DomainResource<Review>,
        com.commercetools.api.models.Referencable<Review>, com.commercetools.api.models.ResourceIdentifiable<Review>,
        com.commercetools.api.models.Customizable<Review>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Review.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Review.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Review was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Review was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Review.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Must be unique among Reviews. For example, if this value is set to Customer <code>id</code>&nbsp;+ Product <code>id</code>, only one Review per Customer and per Product is allowed.</p>
     * @return uniquenessValue
     */

    @JsonProperty("uniquenessValue")
    public String getUniquenessValue();

    /**
     *  <p>Language in which the content of the Review is written.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Name of the author.</p>
     * @return authorName
     */

    @JsonProperty("authorName")
    public String getAuthorName();

    /**
     *  <p>Title of the Review.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Content of the Review.</p>
     * @return text
     */

    @JsonProperty("text")
    public String getText();

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @return target
     */
    @Valid
    @JsonProperty("target")
    public Reference getTarget();

    /**
     *  <p>Indicates if this Review is taken into account in the ratings statistics of the target. A Review is per default used in the statistics, unless the Review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>. If the role of a State is modified after the calculation of this field, the calculation is not updated.</p>
     * @return includedInStatistics
     */
    @NotNull
    @JsonProperty("includedInStatistics")
    public Boolean getIncludedInStatistics();

    /**
     *  <p>Rating of the Product or Channel.</p>
     * @return rating
     */

    @JsonProperty("rating")
    public Integer getRating();

    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Customer who created the Review.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Custom Fields of the Review.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the Review.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Review.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Review was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Review was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the Review.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Must be unique among Reviews. For example, if this value is set to Customer <code>id</code>&nbsp;+ Product <code>id</code>, only one Review per Customer and per Product is allowed.</p>
     * @param uniquenessValue value to be set
     */

    public void setUniquenessValue(final String uniquenessValue);

    /**
     *  <p>Language in which the content of the Review is written.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Name of the author.</p>
     * @param authorName value to be set
     */

    public void setAuthorName(final String authorName);

    /**
     *  <p>Title of the Review.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     *  <p>Content of the Review.</p>
     * @param text value to be set
     */

    public void setText(final String text);

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     * @param target value to be set
     */

    public void setTarget(final Reference target);

    /**
     *  <p>Indicates if this Review is taken into account in the ratings statistics of the target. A Review is per default used in the statistics, unless the Review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>. If the role of a State is modified after the calculation of this field, the calculation is not updated.</p>
     * @param includedInStatistics value to be set
     */

    public void setIncludedInStatistics(final Boolean includedInStatistics);

    /**
     *  <p>Rating of the Product or Channel.</p>
     * @param rating value to be set
     */

    public void setRating(final Integer rating);

    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Customer who created the Review.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerReference customer);

    /**
     *  <p>Custom Fields of the Review.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of Review
     */
    public static Review of() {
        return new ReviewImpl();
    }

    /**
     * factory method to create a shallow copy Review
     * @param template instance to be copied
     * @return copy instance
     */
    public static Review of(final Review template) {
        ReviewImpl instance = new ReviewImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setUniquenessValue(template.getUniquenessValue());
        instance.setLocale(template.getLocale());
        instance.setAuthorName(template.getAuthorName());
        instance.setTitle(template.getTitle());
        instance.setText(template.getText());
        instance.setTarget(template.getTarget());
        instance.setIncludedInStatistics(template.getIncludedInStatistics());
        instance.setRating(template.getRating());
        instance.setState(template.getState());
        instance.setCustomer(template.getCustomer());
        instance.setCustom(template.getCustom());
        return instance;
    }

    /**
     * factory method to create a deep copy of Review
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Review deepCopy(@Nullable final Review template) {
        if (template == null) {
            return null;
        }
        ReviewImpl instance = new ReviewImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setUniquenessValue(template.getUniquenessValue());
        instance.setLocale(template.getLocale());
        instance.setAuthorName(template.getAuthorName());
        instance.setTitle(template.getTitle());
        instance.setText(template.getText());
        instance.setTarget(com.commercetools.api.models.common.Reference.deepCopy(template.getTarget()));
        instance.setIncludedInStatistics(template.getIncludedInStatistics());
        instance.setRating(template.getRating());
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setCustomer(com.commercetools.api.models.customer.CustomerReference.deepCopy(template.getCustomer()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Review
     * @return builder
     */
    public static ReviewBuilder builder() {
        return ReviewBuilder.of();
    }

    /**
     * create builder for Review instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReviewBuilder builder(final Review template) {
        return ReviewBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReview(Function<Review, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.REVIEW;
    }

    @Deprecated
    @JsonIgnore
    public default void setTarget(final Object target) {
        setTarget((Reference) target);
    };

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Review> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Review>() {
            @Override
            public String toString() {
                return "TypeReference<Review>";
            }
        };
    }
}
