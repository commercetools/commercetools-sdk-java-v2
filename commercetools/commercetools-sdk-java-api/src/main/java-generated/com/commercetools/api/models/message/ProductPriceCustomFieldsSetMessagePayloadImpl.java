
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetProductPriceCustomTypeAction" rel="nofollow">Set Price Custom Type</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldsSetMessagePayloadImpl
        implements ProductPriceCustomFieldsSetMessagePayload, ModelBase {

    private String type;

    private String priceId;

    private Long variantId;

    private Boolean staged;

    private com.commercetools.api.models.type.CustomFields customField;

    private String oldTypeId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceCustomFieldsSetMessagePayloadImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("customField") final com.commercetools.api.models.type.CustomFields customField,
            @JsonProperty("oldTypeId") final String oldTypeId) {
        this.priceId = priceId;
        this.variantId = variantId;
        this.staged = staged;
        this.customField = customField;
        this.oldTypeId = oldTypeId;
        this.type = PRODUCT_PRICE_CUSTOM_FIELDS_SET;
    }

    /**
     * create empty instance
     */
    public ProductPriceCustomFieldsSetMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_CUSTOM_FIELDS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> on which the Custom Type was set.</p>
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
     *  <p>Custom Fields that were set.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustomField() {
        return this.customField;
    }

    /**
     *  <p><code>id</code> of the previous <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a>. Absent if there was no previous Custom Type present.</p>
     */

    public String getOldTypeId() {
        return this.oldTypeId;
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

    public void setCustomField(final com.commercetools.api.models.type.CustomFields customField) {
        this.customField = customField;
    }

    public void setOldTypeId(final String oldTypeId) {
        this.oldTypeId = oldTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceCustomFieldsSetMessagePayloadImpl that = (ProductPriceCustomFieldsSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(customField, that.customField)
                .append(oldTypeId, that.oldTypeId)
                .append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(customField, that.customField)
                .append(oldTypeId, that.oldTypeId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(priceId)
                .append(variantId)
                .append(staged)
                .append(customField)
                .append(oldTypeId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("priceId", priceId)
                .append("variantId", variantId)
                .append("staged", staged)
                .append("customField", customField)
                .append("oldTypeId", oldTypeId)
                .build();
    }

    @Override
    public ProductPriceCustomFieldsSetMessagePayload copyDeep() {
        return ProductPriceCustomFieldsSetMessagePayload.deepCopy(this);
    }
}
