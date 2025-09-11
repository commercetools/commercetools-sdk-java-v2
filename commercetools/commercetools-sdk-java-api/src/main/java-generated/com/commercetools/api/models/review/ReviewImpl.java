
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Review
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReviewImpl implements Review, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private String uniquenessValue;

    private String locale;

    private String authorName;

    private String title;

    private String text;

    private com.commercetools.api.models.common.Reference target;

    private Boolean includedInStatistics;

    private Integer rating;

    private com.commercetools.api.models.state.StateReference state;

    private com.commercetools.api.models.customer.CustomerReference customer;

    private com.commercetools.api.models.type.CustomFields custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReviewImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key, @JsonProperty("uniquenessValue") final String uniquenessValue,
            @JsonProperty("locale") final String locale, @JsonProperty("authorName") final String authorName,
            @JsonProperty("title") final String title, @JsonProperty("text") final String text,
            @JsonProperty("target") final com.commercetools.api.models.common.Reference target,
            @JsonProperty("includedInStatistics") final Boolean includedInStatistics,
            @JsonProperty("rating") final Integer rating,
            @JsonProperty("state") final com.commercetools.api.models.state.StateReference state,
            @JsonProperty("customer") final com.commercetools.api.models.customer.CustomerReference customer,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.uniquenessValue = uniquenessValue;
        this.locale = locale;
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.target = target;
        this.includedInStatistics = includedInStatistics;
        this.rating = rating;
        this.state = state;
        this.customer = customer;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public ReviewImpl() {
    }

    /**
     *  <p>Unique identifier of the Review.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Review.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Review was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Review was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Review.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Review.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the Review.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Must be unique among Reviews. For example, if this value is set to Customer <code>id</code>&nbsp;+ Product <code>id</code>, only one Review per Customer and per Product is allowed.</p>
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
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like <a href="https://docs.commercetools.com/apis/ctp:api:type:ChannelReference" rel="nofollow">ChannelReference</a>. A referenced resource can be embedded through <span>Reference Expansion</span>. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public com.commercetools.api.models.common.Reference getTarget() {
        return this.target;
    }

    /**
     *  <p>Indicates if this Review is taken into account in the ratings statistics of the target. A Review is per default used in the statistics, unless the Review is in a state that does not have the <a href="https://docs.commercetools.com/apis/ctp:api:type:StateRoleEnum" rel="nofollow">role</a> <code>ReviewIncludedInStatistics</code>. If the role of a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a> is modified after the calculation of this field, the calculation is not updated.</p>
     */

    public Boolean getIncludedInStatistics() {
        return this.includedInStatistics;
    }

    /**
     *  <p>Rating of the Product or Channel.</p>
     */

    public Integer getRating() {
        return this.rating;
    }

    /**
     *  <p>State of the Review. Used for approval processes, see <span>Review approval process</span> for details.</p>
     */

    public com.commercetools.api.models.state.StateReference getState() {
        return this.state;
    }

    /**
     *  <p>Customer who created the Review.</p>
     */

    public com.commercetools.api.models.customer.CustomerReference getCustomer() {
        return this.customer;
    }

    /**
     *  <p>Custom Fields of the Review.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
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

    public void setTarget(final com.commercetools.api.models.common.Reference target) {
        this.target = target;
    }

    public void setIncludedInStatistics(final Boolean includedInStatistics) {
        this.includedInStatistics = includedInStatistics;
    }

    public void setRating(final Integer rating) {
        this.rating = rating;
    }

    public void setState(final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
    }

    public void setCustomer(final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReviewImpl that = (ReviewImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(uniquenessValue, that.uniquenessValue)
                .append(locale, that.locale)
                .append(authorName, that.authorName)
                .append(title, that.title)
                .append(text, that.text)
                .append(target, that.target)
                .append(includedInStatistics, that.includedInStatistics)
                .append(rating, that.rating)
                .append(state, that.state)
                .append(customer, that.customer)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(uniquenessValue, that.uniquenessValue)
                .append(locale, that.locale)
                .append(authorName, that.authorName)
                .append(title, that.title)
                .append(text, that.text)
                .append(target, that.target)
                .append(includedInStatistics, that.includedInStatistics)
                .append(rating, that.rating)
                .append(state, that.state)
                .append(customer, that.customer)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(uniquenessValue)
                .append(locale)
                .append(authorName)
                .append(title)
                .append(text)
                .append(target)
                .append(includedInStatistics)
                .append(rating)
                .append(state)
                .append(customer)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("key", key)
                .append("uniquenessValue", uniquenessValue)
                .append("locale", locale)
                .append("authorName", authorName)
                .append("title", title)
                .append("text", text)
                .append("target", target)
                .append("includedInStatistics", includedInStatistics)
                .append("rating", rating)
                .append("state", state)
                .append("customer", customer)
                .append("custom", custom)
                .build();
    }

    @Override
    public Review copyDeep() {
        return Review.deepCopy(this);
    }
}
