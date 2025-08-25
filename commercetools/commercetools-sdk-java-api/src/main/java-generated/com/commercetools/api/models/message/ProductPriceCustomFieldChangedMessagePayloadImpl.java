
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
 *  <p>Generated after changing an existing Custom Field on a Price using the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductPriceCustomFieldAction" rel="nofollow">Set Price CustomField</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldChangedMessagePayloadImpl
        implements ProductPriceCustomFieldChangedMessagePayload, ModelBase {

    private String type;

    private String priceId;

    private Long variantId;

    private Boolean staged;

    private String name;

    private java.lang.Object value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceCustomFieldChangedMessagePayloadImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("name") final String name, @JsonProperty("value") final java.lang.Object value) {
        this.priceId = priceId;
        this.variantId = variantId;
        this.staged = staged;
        this.name = name;
        this.value = value;
        this.type = PRODUCT_PRICE_CUSTOM_FIELD_CHANGED;
    }

    /**
     * create empty instance
     */
    public ProductPriceCustomFieldChangedMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_CUSTOM_FIELD_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> of which the Custom Field was changed.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to which the Price belongs.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Whether the update was only applied to the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projection</a>.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Name of the Custom Field that was changed.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductPriceCustomFieldAction" rel="nofollow">Set Price CustomField</a> update action.</p>
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
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

        ProductPriceCustomFieldChangedMessagePayloadImpl that = (ProductPriceCustomFieldChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(name, that.name)
                .append(value, that.value)
                .append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(name, that.name)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(priceId)
                .append(variantId)
                .append(staged)
                .append(name)
                .append(value)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("priceId", priceId)
                .append("variantId", variantId)
                .append("staged", staged)
                .append("name", name)
                .append("value", value)
                .build();
    }

    @Override
    public ProductPriceCustomFieldChangedMessagePayload copyDeep() {
        return ProductPriceCustomFieldChangedMessagePayload.deepCopy(this);
    }
}
