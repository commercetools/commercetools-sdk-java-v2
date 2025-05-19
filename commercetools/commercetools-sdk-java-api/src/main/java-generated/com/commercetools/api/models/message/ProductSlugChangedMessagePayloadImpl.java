
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
 *  <p>Generated after a successful Change Slug update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSlugChangedMessagePayloadImpl implements ProductSlugChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.common.LocalizedString slug;

    private com.commercetools.api.models.common.LocalizedString oldSlug;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSlugChangedMessagePayloadImpl(
            @JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("oldSlug") final com.commercetools.api.models.common.LocalizedString oldSlug) {
        this.slug = slug;
        this.oldSlug = oldSlug;
        this.type = PRODUCT_SLUG_CHANGED;
    }

    /**
     * create empty instance
     */
    public ProductSlugChangedMessagePayloadImpl() {
        this.type = PRODUCT_SLUG_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The slug of the Product after the Change Slug update action.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>The slug of the Product before the Change Slug update action.</p>
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

        ProductSlugChangedMessagePayloadImpl that = (ProductSlugChangedMessagePayloadImpl) o;

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
    public ProductSlugChangedMessagePayload copyDeep() {
        return ProductSlugChangedMessagePayload.deepCopy(this);
    }
}
