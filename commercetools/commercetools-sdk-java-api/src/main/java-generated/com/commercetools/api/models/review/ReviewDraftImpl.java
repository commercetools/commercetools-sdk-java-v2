
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>When creating a new Review, at least one of <code>title</code>, <code>text</code> or <code>rating</code> should be set.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewDraftImpl implements ReviewDraft, ModelBase {

    private String key;

    private String uniquenessValue;

    private String locale;

    private String authorName;

    private String title;

    private String text;

    private com.commercetools.api.models.common.ResourceIdentifier target;

    private com.commercetools.api.models.state.StateResourceIdentifier state;

    private Integer rating;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier customer;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("uniquenessValue") final String uniquenessValue, @JsonProperty("locale") final String locale,
            @JsonProperty("authorName") final String authorName, @JsonProperty("title") final String title,
            @JsonProperty("text") final String text,
            @JsonProperty("target") final com.commercetools.api.models.common.ResourceIdentifier target,
            @JsonProperty("state") final com.commercetools.api.models.state.StateResourceIdentifier state,
            @JsonProperty("rating") final Integer rating,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerResourceIdentifier customer,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.uniquenessValue = uniquenessValue;
        this.locale = locale;
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.target = target;
        this.state = state;
        this.rating = rating;
        this.customer = customer;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ReviewDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Review.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>If set, this value must be unique among Reviews. For example, if you want to have only one Review per Customer and per Product, you can set the value to Customer <code>id</code>&nbsp;+ Product <code>id</code>.</p>
     */

    public String getUniquenessValue() {
        return this.uniquenessValue;
    }

    /**
     *  <p>Language in which the content of the Review is written.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Name of the author.</p>
     */

    public String getAuthorName() {
        return this.authorName;
    }

    /**
     *  <p>Title of the Review.</p>
     */

    public String getTitle() {
        return this.title;
    }

    /**
     *  <p>Content of the Review.</p>
     */

    public String getText() {
        return this.text;
    }

    /**
     *  <p>Draft type to create a Reference or a KeyReference to a resource. Provide either the <code>id</code> or (wherever supported) the <code>key</code> of the resource to reference, but depending on the API endpoint the response returns either a Reference or a KeyReference. For example, the field <code>parent</code> of a CategoryDraft takes a ResourceIdentifier for its value while the value of the corresponding field of a Category is a Reference.</p>
     *  <p>Each resource type has its corresponding ResourceIdentifier, like ChannelResourceIdentifier.</p>
     */

    public com.commercetools.api.models.common.ResourceIdentifier getTarget() {
        return this.target;
    }

    /**
     *  <p>State of the Review. Used for approval processes, see Review approval process for details.</p>
     */

    public com.commercetools.api.models.state.StateResourceIdentifier getState() {
        return this.state;
    }

    /**
     *  <p>Rating of the targeted Product or Channel. This rating can represent the number of stars, a percentage, or a like (+1)/dislike (-1). A rating is used in the ratings statistics of the targeted object, unless the Review is in a State that does not have the role <code>ReviewIncludedInStatistics</code>.</p>
     */

    public Integer getRating() {
        return this.rating;
    }

    /**
     *  <p>Customer who created the Review.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Custom Fields for the Review.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setUniquenessValue(final String uniquenessValue) {
        this.uniquenessValue = uniquenessValue;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setAuthorName(final String authorName) {
        this.authorName = authorName;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void setTarget(final com.commercetools.api.models.common.ResourceIdentifier target) {
        this.target = target;
    }

    public void setState(final com.commercetools.api.models.state.StateResourceIdentifier state) {
        this.state = state;
    }

    public void setRating(final Integer rating) {
        this.rating = rating;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerResourceIdentifier customer) {
        this.customer = customer;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewDraftImpl that = (ReviewDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(uniquenessValue, that.uniquenessValue)
                .append(locale, that.locale)
                .append(authorName, that.authorName)
                .append(title, that.title)
                .append(text, that.text)
                .append(target, that.target)
                .append(state, that.state)
                .append(rating, that.rating)
                .append(customer, that.customer)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(uniquenessValue, that.uniquenessValue)
                .append(locale, that.locale)
                .append(authorName, that.authorName)
                .append(title, that.title)
                .append(text, that.text)
                .append(target, that.target)
                .append(state, that.state)
                .append(rating, that.rating)
                .append(customer, that.customer)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(uniquenessValue)
                .append(locale)
                .append(authorName)
                .append(title)
                .append(text)
                .append(target)
                .append(state)
                .append(rating)
                .append(customer)
                .append(custom)
                .toHashCode();
    }

}
