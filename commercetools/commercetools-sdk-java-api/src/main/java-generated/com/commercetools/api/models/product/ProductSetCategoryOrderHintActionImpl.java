
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
 * ProductSetCategoryOrderHintAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetCategoryOrderHintActionImpl implements ProductSetCategoryOrderHintAction, ModelBase {

    private String action;

    private String categoryId;

    private String orderHint;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSetCategoryOrderHintActionImpl(@JsonProperty("categoryId") final String categoryId,
            @JsonProperty("orderHint") final String orderHint, @JsonProperty("staged") final Boolean staged) {
        this.categoryId = categoryId;
        this.orderHint = orderHint;
        this.staged = staged;
        this.action = SET_CATEGORY_ORDER_HINT;
    }

    /**
     * create empty instance
     */
    public ProductSetCategoryOrderHintActionImpl() {
        this.action = SET_CATEGORY_ORDER_HINT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the Category to add the <code>orderHint</code>. If this Category is not assigned to the Product, an InvalidOperation error is returned.</p>
     */

    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     *  <p>A string representing a number between 0 and 1. Must start with <code>0.</code> and cannot end with <code>0</code>. If empty, any existing value will be removed.</p>
     */

    public String getOrderHint() {
        return this.orderHint;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>categoryOrderHints</code> is updated. If <code>false</code>, both the current and staged <code>categoryOrderHints</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setCategoryId(final String categoryId) {
        this.categoryId = categoryId;
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

        ProductSetCategoryOrderHintActionImpl that = (ProductSetCategoryOrderHintActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(categoryId, that.categoryId)
                .append(orderHint, that.orderHint)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(categoryId, that.categoryId)
                .append(orderHint, that.orderHint)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(categoryId)
                .append(orderHint)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("categoryId", categoryId)
                .append("orderHint", orderHint)
                .append("staged", staged)
                .build();
    }

}
