
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
public final class ProductTypeChangeEnumKeyActionImpl implements ProductTypeChangeEnumKeyAction {

    private String action;

    private String attributeName;

    private String key;

    private String newKey;

    @JsonCreator
    ProductTypeChangeEnumKeyActionImpl(@JsonProperty("attributeName") final String attributeName,
            @JsonProperty("key") final String key, @JsonProperty("newKey") final String newKey) {
        this.attributeName = attributeName;
        this.key = key;
        this.newKey = newKey;
        this.action = CHANGE_ENUM_KEY;
    }

    public ProductTypeChangeEnumKeyActionImpl() {
        this.action = CHANGE_ENUM_KEY;
    }

    public String getAction() {
        return this.action;
    }

    public String getAttributeName() {
        return this.attributeName;
    }

    public String getKey() {
        return this.key;
    }

    public String getNewKey() {
        return this.newKey;
    }

    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setNewKey(final String newKey) {
        this.newKey = newKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductTypeChangeEnumKeyActionImpl that = (ProductTypeChangeEnumKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(attributeName, that.attributeName)
                .append(key, that.key)
                .append(newKey, that.newKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(attributeName).append(key).append(newKey).toHashCode();
    }

}
