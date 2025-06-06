
package com.commercetools.api.models.product_tailoring;

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
 * ProductTailoringSetMetaKeywordsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetMetaKeywordsActionImpl implements ProductTailoringSetMetaKeywordsAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringSetMetaKeywordsActionImpl(
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("staged") final Boolean staged) {
        this.metaKeywords = metaKeywords;
        this.staged = staged;
        this.action = SET_META_KEYWORDS;
    }

    /**
     * create empty instance
     */
    public ProductTailoringSetMetaKeywordsActionImpl() {
        this.action = SET_META_KEYWORDS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>metaKeywords</code> is updated. If <code>false</code>, both the current and staged <code>metaKeywords</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setMetaKeywords(final com.commercetools.api.models.common.LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
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

        ProductTailoringSetMetaKeywordsActionImpl that = (ProductTailoringSetMetaKeywordsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(metaKeywords, that.metaKeywords)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(metaKeywords, that.metaKeywords)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaKeywords).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("metaKeywords", metaKeywords)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductTailoringSetMetaKeywordsAction copyDeep() {
        return ProductTailoringSetMetaKeywordsAction.deepCopy(this);
    }
}
