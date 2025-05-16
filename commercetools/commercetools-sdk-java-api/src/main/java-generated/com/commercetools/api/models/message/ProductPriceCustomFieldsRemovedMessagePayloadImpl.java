
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
 *  <p>Generated after removing a Custom Type from a Price using the Set Price Custom Type update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldsRemovedMessagePayloadImpl
        implements ProductPriceCustomFieldsRemovedMessagePayload, ModelBase {

    private String type;

    private String priceId;

    private Long variantId;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceCustomFieldsRemovedMessagePayloadImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("staged") final Boolean staged) {
        this.priceId = priceId;
        this.variantId = variantId;
        this.staged = staged;
        this.type = PRODUCT_PRICE_CUSTOM_FIELDS_REMOVED;
    }

    /**
     * create empty instance
     */
    public ProductPriceCustomFieldsRemovedMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_CUSTOM_FIELDS_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Price from which the Custom Type was removed.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Unique identifier of the ProductVariant to which the Price belongs.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     */

    public Boolean getStaged() {
        return this.staged;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceCustomFieldsRemovedMessagePayloadImpl that = (ProductPriceCustomFieldsRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(priceId).append(variantId).append(staged).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("priceId", priceId)
                .append("variantId", variantId)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductPriceCustomFieldsRemovedMessagePayload copyDeep() {
        return ProductPriceCustomFieldsRemovedMessagePayload.deepCopy(this);
    }
}
