
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
public final class ProductRemoveFromCategoryActionImpl implements ProductRemoveFromCategoryAction {

    private String action;

    private com.commercetools.api.models.category.CategoryResourceIdentifier category;

    private Boolean staged;

    @JsonCreator
    ProductRemoveFromCategoryActionImpl(
            @JsonProperty("category") final com.commercetools.api.models.category.CategoryResourceIdentifier category,
            @JsonProperty("staged") final Boolean staged) {
        this.category = category;
        this.staged = staged;
        this.action = REMOVE_FROM_CATEGORY;
    }

    public ProductRemoveFromCategoryActionImpl() {
        this.action = REMOVE_FROM_CATEGORY;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.category.CategoryResourceIdentifier getCategory() {
        return this.category;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(category).append(staged).toHashCode();
    }

}
