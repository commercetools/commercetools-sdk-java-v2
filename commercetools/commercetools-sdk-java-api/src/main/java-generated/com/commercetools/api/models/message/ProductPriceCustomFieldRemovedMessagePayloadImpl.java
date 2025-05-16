
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
 *  <p>Generated after removing a Custom Field from a Price using the Set Price CustomField update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductPriceCustomFieldRemovedMessagePayloadImpl
        implements ProductPriceCustomFieldRemovedMessagePayload, ModelBase {

    private String type;

    private String priceId;

    private Long variantId;

    private Boolean staged;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductPriceCustomFieldRemovedMessagePayloadImpl(@JsonProperty("priceId") final String priceId,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("name") final String name) {
        this.priceId = priceId;
        this.variantId = variantId;
        this.staged = staged;
        this.name = name;
        this.type = PRODUCT_PRICE_CUSTOM_FIELD_REMOVED;
    }

    /**
     * create empty instance
     */
    public ProductPriceCustomFieldRemovedMessagePayloadImpl() {
        this.type = PRODUCT_PRICE_CUSTOM_FIELD_REMOVED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the Price from which the Custom Field was removed.</p>
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

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     */

    public String getName() {
        return this.name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductPriceCustomFieldRemovedMessagePayloadImpl that = (ProductPriceCustomFieldRemovedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(name, that.name)
                .append(type, that.type)
                .append(priceId, that.priceId)
                .append(variantId, that.variantId)
                .append(staged, that.staged)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(priceId)
                .append(variantId)
                .append(staged)
                .append(name)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("priceId", priceId)
                .append("variantId", variantId)
                .append("staged", staged)
                .append("name", name)
                .build();
    }

    @Override
    public ProductPriceCustomFieldRemovedMessagePayload copyDeep() {
        return ProductPriceCustomFieldRemovedMessagePayload.deepCopy(this);
    }
}
