
package com.commercetools.api.models.product_type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductTypeChangeIsSearchableActionImpl implements ProductTypeChangeIsSearchableAction {

    private String action;

    private String attributeName;

    private Boolean isSearchable;

    @JsonCreator
    ProductTypeChangeIsSearchableActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("isSearchable") final Boolean isSearchable) {
        this.attributeName = attributeName;
        this.isSearchable = isSearchable;
        this.action = CHANGE_IS_SEARCHABLE;
    }

    public ProductTypeChangeIsSearchableActionImpl() {
        this.action = CHANGE_IS_SEARCHABLE;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public Boolean getIsSearchable() {
        return this.isSearchable;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setIsSearchable(final Boolean isSearchable) {
        this.isSearchable = isSearchable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeIsSearchableActionImpl that = (ProductTypeChangeIsSearchableActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(attributeName, that.attributeName).append(
            isSearchable, that.isSearchable).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(isSearchable).toHashCode();
    }

}
