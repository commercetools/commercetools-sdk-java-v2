
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
 *  <p>Updates all meta attributes at the same time.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetMetaAttributesActionImpl implements ProductTailoringSetMetaAttributesAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaTitle;

    private com.commercetools.api.models.common.LocalizedString metaDescription;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringSetMetaAttributesActionImpl(
            @JsonProperty("metaTitle") final com.commercetools.api.models.common.LocalizedString metaTitle,
            @JsonProperty("metaDescription") final com.commercetools.api.models.common.LocalizedString metaDescription,
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("staged") final Boolean staged) {
        this.metaTitle = metaTitle;
        this.metaDescription = metaDescription;
        this.metaKeywords = metaKeywords;
        this.staged = staged;
        this.action = SET_META_ATTRIBUTES;
    }

    /**
     * create empty instance
     */
    public ProductTailoringSetMetaAttributesActionImpl() {
        this.action = SET_META_ATTRIBUTES;
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

    public com.commercetools.api.models.common.LocalizedString getMetaTitle() {
        return this.metaTitle;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaDescription() {
        return this.metaDescription;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setMetaTitle(final com.commercetools.api.models.common.LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(final com.commercetools.api.models.common.LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
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

        ProductTailoringSetMetaAttributesActionImpl that = (ProductTailoringSetMetaAttributesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(metaTitle, that.metaTitle)
                .append(metaDescription, that.metaDescription)
                .append(metaKeywords, that.metaKeywords)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(metaTitle)
                .append(metaDescription)
                .append(metaKeywords)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("metaTitle", metaTitle)
                .append("metaDescription", metaDescription)
                .append("metaKeywords", metaKeywords)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductTailoringSetMetaAttributesAction copyDeep() {
        return ProductTailoringSetMetaAttributesAction.deepCopy(this);
    }
}
