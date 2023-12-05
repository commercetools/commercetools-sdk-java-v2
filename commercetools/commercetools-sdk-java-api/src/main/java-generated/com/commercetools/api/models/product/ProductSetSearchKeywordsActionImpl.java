
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProductSetSearchKeywordsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetSearchKeywordsActionImpl implements ProductSetSearchKeywordsAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.SearchKeywords searchKeywords;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSetSearchKeywordsActionImpl(
            @JsonProperty("searchKeywords") final com.commercetools.api.models.product.SearchKeywords searchKeywords,
            @JsonProperty("staged") final Boolean staged) {
        this.searchKeywords = searchKeywords;
        this.staged = staged;
        this.action = SET_SEARCH_KEYWORDS;
    }

    /**
     * create empty instance
     */
    public ProductSetSearchKeywordsActionImpl() {
        this.action = SET_SEARCH_KEYWORDS;
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

    public com.commercetools.api.models.product.SearchKeywords getSearchKeywords() {
        return this.searchKeywords;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>searchKeywords</code> is updated. If <code>false</code>, both the current and staged <code>searchKeywords</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setSearchKeywords(final com.commercetools.api.models.product.SearchKeywords searchKeywords) {
        this.searchKeywords = searchKeywords;
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

        ProductSetSearchKeywordsActionImpl that = (ProductSetSearchKeywordsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(searchKeywords, that.searchKeywords)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(searchKeywords, that.searchKeywords)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(searchKeywords).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("searchKeywords", searchKeywords)
                .append("staged", staged)
                .build();
    }

}
