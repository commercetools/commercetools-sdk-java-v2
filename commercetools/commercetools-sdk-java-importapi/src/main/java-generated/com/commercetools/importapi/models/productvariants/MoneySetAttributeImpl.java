
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is a set of money objects.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MoneySetAttributeImpl implements MoneySetAttribute, ModelBase {

    private String name;

    private String type;

    private java.util.List<com.commercetools.importapi.models.common.TypedMoney> value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MoneySetAttributeImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.util.List<com.commercetools.importapi.models.common.TypedMoney> value) {
        this.name = name;
        this.value = value;
        this.type = MONEY_SET;
    }

    /**
     * create empty instance
     */
    public MoneySetAttributeImpl() {
        this.type = MONEY_SET;
    }

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public java.util.List<com.commercetools.importapi.models.common.TypedMoney> getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final com.commercetools.importapi.models.common.TypedMoney... value) {
        this.value = new ArrayList<>(Arrays.asList(value));
    }

    public void setValue(final java.util.List<com.commercetools.importapi.models.common.TypedMoney> value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MoneySetAttributeImpl that = (MoneySetAttributeImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(type, that.type)
                .append(value, that.value)
                .append(name, that.name)
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(type).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("type", type)
                .append("value", value)
                .build();
    }

}
