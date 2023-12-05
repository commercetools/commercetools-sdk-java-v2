
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
 *  <p>Produces the ProductAddedToCategory Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddToCategoryActionImpl implements ProductAddToCategoryAction, ModelBase {

    private String action;

    private com.commercetools.api.models.category.CategoryResourceIdentifier category;

    private String orderHint;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductAddToCategoryActionImpl(
            @JsonProperty("category") final com.commercetools.api.models.category.CategoryResourceIdentifier category,
            @JsonProperty("orderHint") final String orderHint, @JsonProperty("staged") final Boolean staged) {
        this.category = category;
        this.orderHint = orderHint;
        this.staged = staged;
        this.action = ADD_TO_CATEGORY;
    }

    /**
     * create empty instance
     */
    public ProductAddToCategoryActionImpl() {
        this.action = ADD_TO_CATEGORY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The Category to add.</p>
     */

    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory() {
        return this.category;
    }

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     */

    public String getOrderHint() {
        return this.orderHint;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>categories</code> and <code>categoryOrderHints</code> are updated. If <code>false</code>, both the current and staged <code>categories</code> and <code>categoryOrderHints</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setCategory(final com.commercetools.api.models.category.CategoryResourceIdentifier category) {
        this.category = category;
    }

    public void setOrderHint(final String orderHint) {
        this.orderHint = orderHint;
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

        ProductAddToCategoryActionImpl that = (ProductAddToCategoryActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(category, that.category)
                .append(orderHint, that.orderHint)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(category, that.category)
                .append(orderHint, that.orderHint)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(category)
                .append(orderHint)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("category", category)
                .append("orderHint", orderHint)
                .append("staged", staged)
                .build();
    }

}
