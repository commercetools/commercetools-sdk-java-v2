
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySlugChangedMessagePayloadImpl implements CategorySlugChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.common.LocalizedString oldSlug;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySlugChangedMessagePayloadImpl(
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("oldSlug") final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.slug = slug;
        this.oldSlug = oldSlug;
        this.type = CATEGORY_SLUG_CHANGED;
    }

    /**
     * create empty instance
     */
    public CategorySlugChangedMessagePayloadImpl() {
        this.type = CATEGORY_SLUG_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>The slug of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:CategoryChangeSlugAction" rel="nofollow">Change Slug</a> update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getOldSlug() {
        return this.oldSlug;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setOldSlug(final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.oldSlug = oldSlug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySlugChangedMessagePayloadImpl that = (CategorySlugChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(slug, that.slug)
                .append(oldSlug, that.oldSlug)
                .append(type, that.type)
                .append(slug, that.slug)
                .append(oldSlug, that.oldSlug)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(slug).append(oldSlug).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("slug", slug)
                .append("oldSlug", oldSlug)
                .build();
    }

    @Override
    public CategorySlugChangedMessagePayload copyDeep() {
        return CategorySlugChangedMessagePayload.deepCopy(this);
    }
}
