
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
 * ProductSetProductPriceCustomTypeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetProductPriceCustomTypeActionImpl implements ProductSetProductPriceCustomTypeAction, ModelBase {

    private String action;

    private String priceId;

    private Boolean staged;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    ProductSetProductPriceCustomTypeActionImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.priceId = priceId;
        this.staged = staged;
        this.type = type;
        this.fields = fields;
        this.action = SET_PRODUCT_PRICE_CUSTOM_TYPE;
    }

    public ProductSetProductPriceCustomTypeActionImpl() {
        this.action = SET_PRODUCT_PRICE_CUSTOM_TYPE;
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
     *  <p>If <code>true</code>, only the staged Embedded Price is updated. If <code>false</code>, both the current and staged Embedded Price is updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Defines the Type that extends the Price with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Embedded Price.</p>
     */

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
     *  <p>Sets the Custom Fields fields for the Embedded Price.</p>
     */

    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetProductPriceCustomTypeActionImpl that = (ProductSetProductPriceCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceId, that.priceId)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(priceId)
                .append(staged)
                .append(type)
                .append(fields)
                .toHashCode();
    }

}
