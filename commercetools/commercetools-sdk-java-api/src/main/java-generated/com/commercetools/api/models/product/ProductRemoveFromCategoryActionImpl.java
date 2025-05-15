
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
 *  <p>Produces the ProductRemovedFromCategory Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveFromCategoryActionImpl implements ProductRemoveFromCategoryAction, ModelBase {

    private String action;

    private com.commercetools.api.models.category.CategoryResourceIdentifier category;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductRemoveFromCategoryActionImpl(
            @JsonProperty("category") final com.commercetools.api.models.category.CategoryResourceIdentifier category,
            @JsonProperty("staged") final Boolean staged) {
        this.category = category;
        this.staged = staged;
        this.action = REMOVE_FROM_CATEGORY;
    }

    /**
     * create empty instance
     */
    public ProductRemoveFromCategoryActionImpl() {
        this.action = REMOVE_FROM_CATEGORY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The Category to remove.</p>
     */

    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory() {
        return this.category;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are removed. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are removed.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setCategory(final com.commercetools.api.models.category.CategoryResourceIdentifier category) {
        this.category = category;
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

        ProductRemoveFromCategoryActionImpl that = (ProductRemoveFromCategoryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(category, that.category)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(category, that.category)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(category).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("category", category)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductRemoveFromCategoryAction copyDeep() {
        return ProductRemoveFromCategoryAction.deepCopy(this);
    }
}
