
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

/**
 * ProductSetProductPriceCustomFieldAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetProductPriceCustomFieldActionImpl implements ProductSetProductPriceCustomFieldAction, ModelBase {

    private String action;

    private String priceId;

    private Boolean staged;

    private String name;

    private java.lang.Object value;

    @JsonCreator
    ProductSetProductPriceCustomFieldActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("name") final String name,
            @JsonProperty("value") final java.lang.Object value) {
        this.priceId = priceId;
        this.staged = staged;
        this.name = name;
        this.value = value;
        this.action = SET_PRODUCT_PRICE_CUSTOM_FIELD;
    }

    public ProductSetProductPriceCustomFieldActionImpl() {
        this.action = SET_PRODUCT_PRICE_CUSTOM_FIELD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price Custom Field is updated. If <code>false</code>, both the current and staged Embedded Price Custom Field are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Name of the Custom Field.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Trying to remove a field that does not exist will fail with an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.lang.Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetProductPriceCustomFieldActionImpl that = (ProductSetProductPriceCustomFieldActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceId, that.priceId)
                .append(staged, that.staged)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(priceId)
                .append(staged)
                .append(name)
                .append(value)
                .toHashCode();
    }

}
