
package com.commercetools.api.models.product;

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
 *  <p>Produces the ProductSlugChangedMessage.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeSlugActionImpl implements ProductChangeSlugAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString slug;

    private Boolean staged;

    @JsonCreator
    ProductChangeSlugActionImpl(@JsonProperty("slug") final com.commercetools.api.models.common.LocalizedString slug,
            @JsonProperty("staged") final Boolean staged) {
        this.slug = slug;
        this.staged = staged;
        this.action = CHANGE_SLUG;
    }

    public ProductChangeSlugActionImpl() {
        this.action = CHANGE_SLUG;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getSlug() {
        return this.slug;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setSlug(final com.commercetools.api.models.common.LocalizedString slug) {
        this.slug = slug;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductChangeSlugActionImpl that = (ProductChangeSlugActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(slug, that.slug)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(slug).append(staged).toHashCode();
    }

}
