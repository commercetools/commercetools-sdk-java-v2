
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.product.ProductResourceIdentifier;
import com.commercetools.api.models.state.StateResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReviewDraftImpl.class)
public interface ReviewDraft extends com.commercetools.api.models.CustomizableDraft<ReviewDraft> {

    /**
    *  <p>User-defined unique identifier for the Review.</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>If set, this value must be unique among reviews.
    *  For example, if you want to have only one review per customer and per product, you can set the value to <code>customer's id</code> and <code>product's id</code>.</p>
    */

    @JsonProperty("uniquenessValue")
    public String getUniquenessValue();

    @JsonProperty("locale")
    public String getLocale();

    @JsonProperty("authorName")
    public String getAuthorName();

    @JsonProperty("title")
    public String getTitle();

    @JsonProperty("text")
    public String getText();

    /**
    *  <p>Identifies the target of the review.
    *  Can be a Product or a Channel</p>
    */

    @JsonProperty("target")
    public Object getTarget();

    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    /**
    *  <p>Number between -100 and 100 included.
    *  Rating of the targeted object, like a product.
    *  This rating can represent the number of stars, or a percentage, or a like (+1)/dislike (-1)
    *  A rating is used in the ratings statistics of the targeted object, unless the review is in a state that does not have the role <code>ReviewIncludedInStatistics</code>.</p>
    */

    @JsonProperty("rating")
    public Integer getRating();

    /**
    *  <p>The customer who created the review.</p>
    */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setUniquenessValue(final String uniquenessValue);

    public void setLocale(final String locale);

    public void setAuthorName(final String authorName);

    public void setTitle(final String title);

    public void setText(final String text);

    public void setTarget(final ProductResourceIdentifier target);

    public void setTarget(final ChannelResourceIdentifier target);

    public void setTarget(final Object target);

    public void setState(final StateResourceIdentifier state);

    public void setRating(final Integer rating);

    public void setCustomer(final CustomerResourceIdentifier customer);

    public void setCustom(final CustomFieldsDraft custom);

    public static ReviewDraft of() {
        return new ReviewDraftImpl();
    }

    public static ReviewDraft of(final ReviewDraft template) {
        ReviewDraftImpl instance = new ReviewDraftImpl();
        instance.setKey(template.getKey());
        instance.setUniquenessValue(template.getUniquenessValue());
        instance.setLocale(template.getLocale());
        instance.setAuthorName(template.getAuthorName());
        instance.setTitle(template.getTitle());
        instance.setText(template.getText());
        instance.setTarget(template.getTarget());
        instance.setState(template.getState());
        instance.setRating(template.getRating());
        instance.setCustomer(template.getCustomer());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static ReviewDraftBuilder builder() {
        return ReviewDraftBuilder.of();
    }

    public static ReviewDraftBuilder builder(final ReviewDraft template) {
        return ReviewDraftBuilder.of(template);
    }

    default <T> T withReviewDraft(Function<ReviewDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewDraft>";
            }
        };
    }
}
