
package com.commercetools.api.models.product_type;

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
 *  <p>Following this update the Products are reindexed asynchronously to reflect this change on the search endpoint. When enabling search on an existing Attribute type definition, the constraint regarding the maximum size of a searchable Attribute will not be enforced. Instead, AttributeDefinitions exceeding this limit will be treated as not searchable and will not be available for full-text search.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTypeChangeIsSearchableActionImpl implements ProductTypeChangeIsSearchableAction, ModelBase {

    private String action;

    private String attributeName;

    private Boolean isSearchable;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTypeChangeIsSearchableActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("isSearchable") final Boolean isSearchable) {
        this.attributeName = attributeName;
        this.isSearchable = isSearchable;
        this.action = CHANGE_IS_SEARCHABLE;
    }

    /**
     * create empty instance
     */
    public ProductTypeChangeIsSearchableActionImpl() {
        this.action = CHANGE_IS_SEARCHABLE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     */

    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     *  <p>Determines whether the Attribute's values can be used in full-text search queries, filters, and facets. See <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a> for details.</p>
     */

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

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(isSearchable, that.isSearchable)
                .append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(isSearchable, that.isSearchable)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(isSearchable).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("attributeName", attributeName)
                .append("isSearchable", isSearchable)
                .build();
    }

    @Override
    public ProductTypeChangeIsSearchableAction copyDeep() {
        return ProductTypeChangeIsSearchableAction.deepCopy(this);
    }
}
