
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Create Category request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryCreatedMessagePayloadImpl implements CategoryCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.category.Category category;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CategoryCreatedMessagePayloadImpl(
            @JsonProperty("category") final com.commercetools.api.models.category.Category category) {
        this.category = category;
        this.type = CATEGORY_CREATED;
    }

    /**
     * create empty instance
     */
    public CategoryCreatedMessagePayloadImpl() {
        this.type = CATEGORY_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Category that was created.</p>
     */

    public com.commercetools.api.models.category.Category getCategory() {
        return this.category;
    }

    public void setCategory(final com.commercetools.api.models.category.Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CategoryCreatedMessagePayloadImpl that = (CategoryCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(category, that.category)
                .append(type, that.type)
                .append(category, that.category)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(category).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("category", category)
                .build();
    }

    @Override
    public CategoryCreatedMessagePayload copyDeep() {
        return CategoryCreatedMessagePayload.deepCopy(this);
    }
}
