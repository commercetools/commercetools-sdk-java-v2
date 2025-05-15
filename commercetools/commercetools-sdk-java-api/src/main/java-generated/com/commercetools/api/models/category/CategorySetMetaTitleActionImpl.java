
package com.commercetools.api.models.category;

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
 * CategorySetMetaTitleAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetMetaTitleActionImpl implements CategorySetMetaTitleAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySetMetaTitleActionImpl(
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
        this.action = SET_META_TITLE;
    }

    /**
     * create empty instance
     */
    public CategorySetMetaTitleActionImpl() {
        this.action = SET_META_TITLE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetMetaTitleActionImpl that = (CategorySetMetaTitleActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(metaTitle, that.metaTitle)
                .append(action, that.action)
                .append(metaTitle, that.metaTitle)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaTitle).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("metaTitle", metaTitle)
                .build();
    }

    @Override
    public CategorySetMetaTitleAction copyDeep() {
        return CategorySetMetaTitleAction.deepCopy(this);
    }
}
