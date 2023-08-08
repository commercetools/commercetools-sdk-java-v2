
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShoppingListLineItemValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListLineItemValueImpl implements ShoppingListLineItemValue, ModelBase {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private Integer variantId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShoppingListLineItemValueImpl(@JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name,
            @JsonProperty("variantId") final Integer variantId) {
        this.id = id;
        this.name = name;
        this.variantId = variantId;
    }

    /**
     * create empty instance
     */
    public ShoppingListLineItemValueImpl() {
    }

    /**
     *  <p><code>id</code> of the ShoppingListLineItem.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Name of the corresponding Product the Product Variant belongs to.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p><code>id</code> of the ProductVariant the ShoppingListLineItem refers to.</p>
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShoppingListLineItemValueImpl that = (ShoppingListLineItemValueImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(variantId, that.variantId)
                .append(id, that.id)
                .append(name, that.name)
                .append(variantId, that.variantId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(name).append(variantId).toHashCode();
    }

}
