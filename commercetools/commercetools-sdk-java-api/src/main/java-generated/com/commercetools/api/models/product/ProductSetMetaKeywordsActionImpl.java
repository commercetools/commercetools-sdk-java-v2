
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetMetaKeywordsActionImpl implements ProductSetMetaKeywordsAction {

    private String action;

    private com.commercetools.api.models.common.LocalizedString metaKeywords;

    private Boolean staged;

    @JsonCreator
    ProductSetMetaKeywordsActionImpl(
            @JsonProperty("metaKeywords") final com.commercetools.api.models.common.LocalizedString metaKeywords,
            @JsonProperty("staged") final Boolean staged) {
        this.metaKeywords = metaKeywords;
        this.staged = staged;
        this.action = SET_META_KEYWORDS;
    }

    public ProductSetMetaKeywordsActionImpl() {
        this.action = SET_META_KEYWORDS;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.LocalizedString getMetaKeywords() {
        return this.metaKeywords;
    }

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

        ProductSetMetaKeywordsActionImpl that = (ProductSetMetaKeywordsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(metaKeywords, that.metaKeywords)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(metaKeywords).append(staged).toHashCode();
    }

}
