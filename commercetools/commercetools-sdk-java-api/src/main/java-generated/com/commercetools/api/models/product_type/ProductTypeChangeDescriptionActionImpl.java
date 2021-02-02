
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
public final class ProductTypeChangeDescriptionActionImpl implements ProductTypeChangeDescriptionAction {

    private String action;

    private String description;

    @JsonCreator
    ProductTypeChangeDescriptionActionImpl(@JsonProperty("description") final String description) {
        this.description = description;
        this.action = CHANGE_DESCRIPTION;
    }

    public ProductTypeChangeDescriptionActionImpl() {
        this.action = CHANGE_DESCRIPTION;
    }

    public String getAction() {
        return this.action;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeDescriptionActionImpl that = (ProductTypeChangeDescriptionActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(description, that.description).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(description).toHashCode();
    }

}
