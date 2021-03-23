
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
public final class ProductSetAttributeInAllVariantsActionImpl implements ProductSetAttributeInAllVariantsAction {

    private String action;

    private String name;

    private java.lang.Object value;

    private Boolean staged;

    @JsonCreator
    ProductSetAttributeInAllVariantsActionImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value, @JsonProperty("staged") final Boolean staged) {
        this.name = name;
        this.value = value;
        this.staged = staged;
        this.action = SET_ATTRIBUTE_IN_ALL_VARIANTS;
    }

    public ProductSetAttributeInAllVariantsActionImpl() {
        this.action = SET_ATTRIBUTE_IN_ALL_VARIANTS;
    }

    public String getAction() {
        return this.action;
    }

    public String getName() {
        return this.name;
    }

    /**
    *  <p>The same update behavior as for Set Attribute applies.</p>
    */
    public java.lang.Object getValue() {
        return this.value;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
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

        ProductSetAttributeInAllVariantsActionImpl that = (ProductSetAttributeInAllVariantsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(name, that.name)
                .append(value, that.value)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(name).append(value).append(staged).toHashCode();
    }

}
