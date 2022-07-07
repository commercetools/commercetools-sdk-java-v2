
package com.commercetools.api.models.review;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.product.ProductReference;
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
public interface Review extends BaseResource, com.commercetools.api.models.DomainResource<Review>,
        com.commercetools.api.models.Referencable<Review>, com.commercetools.api.models.ResourceIdentifiable<Review>,
        com.commercetools.api.models.Customizable<Review> {

    /**
     *  <p>Unique identifier of the Review.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Review.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Review was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Review was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Review.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Must be unique among Reviews. For example, if this value is set to Customer <code>id</code>&nbsp;+ Product <code>id</code>, only one Review per Customer and per Product is allowed.</p>
     */

    @JsonProperty("uniquenessValue")
    public String getUniquenessValue();

    /**
     *  <p>Language in which the content of the Review is written.</p>
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Name of the author.</p>
     */

    @JsonProperty("authorName")
    public String getAuthorName();

    /**
     *  <p>Title of the Review.</p>
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Content of the Review.</p>
     */

    @JsonProperty("text")
    public String getText();

    /**
     *  <p>Identifies the target of the Review. Can be a Product or a Channel, specified as ProductReference or ChannelReference, respectively.</p>
     */

    @JsonProperty("target")
    public Object getTarget();

    /**
     *  <p>Indicates if this Review is taken into account in the ratings statistics of the target. A Review is per default used in the statistics, unless the Review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>. If the role of a State is modified after the calculation of this field, the calculation is not updated.</p>
     */
    @NotNull
    @JsonProperty("includedInStatistics")
    public Boolean getIncludedInStatistics();

    /**
     *  <p>Rating of the Product or Channel.</p>
     */

    @JsonProperty("rating")
    public Integer getRating();

    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Customer who created the Review.</p>
     */
    @Valid
    @JsonProperty("customer")
    public CustomerReference getCustomer();

    /**
     *  <p>Custom Fields of the Review.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setUniquenessValue(final String uniquenessValue);

    public void setLocale(final String locale);

    public void setAuthorName(final String authorName);

    public void setTitle(final String title);

    public void setText(final String text);

    public void setTarget(final ProductReference target);

    public void setTarget(final ChannelReference target);

    public void setTarget(final Object target);

    public void setIncludedInStatistics(final Boolean includedInStatistics);

    public void setRating(final Integer rating);

    public void setState(final StateReference state);

    public void setCustomer(final CustomerReference customer);

    public void setCustom(final CustomFields custom);

    public static Review of() {
        return new ReviewImpl();
    }

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

    public static ReviewBuilder builder() {
        return ReviewBuilder.of();
    }

    public static ReviewBuilder builder(final Review template) {
        return ReviewBuilder.of(template);
    }

    default <T> T withReview(Function<Review, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.review.ReviewResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.review.ReviewReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Review> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Review>() {
            @Override
            public String toString() {
                return "TypeReference<Review>";
            }
        };
    }
}
