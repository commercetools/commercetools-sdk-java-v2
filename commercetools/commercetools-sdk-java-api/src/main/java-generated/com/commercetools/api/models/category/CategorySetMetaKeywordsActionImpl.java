
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
 * CategorySetMetaKeywordsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetMetaKeywordsActionImpl implements CategorySetMetaKeywordsAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategorySetMetaKeywordsActionImpl(
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
        this.action = SET_META_KEYWORDS;
    }

    /**
     * create empty instance
     */
    public CategorySetMetaKeywordsActionImpl() {
        this.action = SET_META_KEYWORDS;
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

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategorySetMetaKeywordsActionImpl that = (CategorySetMetaKeywordsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(metaKeywords, that.metaKeywords)
                .append(action, that.action)
                .append(metaKeywords, that.metaKeywords)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaKeywords).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("metaKeywords", metaKeywords)
                .build();
    }

    @Override
    public CategorySetMetaKeywordsAction copyDeep() {
        return CategorySetMetaKeywordsAction.deepCopy(this);
    }
}
