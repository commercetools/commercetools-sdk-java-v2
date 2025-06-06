
package com.commercetools.history.models.common;

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
 * LineItem
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class LineItemImpl implements LineItem, ModelBase {

    private String addedAt;

    private com.commercetools.history.models.common.CustomFields custom;

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private String productId;

    private com.commercetools.history.models.common.LocalizedString productSlug;

    private com.commercetools.history.models.common.Reference productType;

    private Integer quantity;

    private com.commercetools.history.models.common.Variant variant;

    private Integer variantId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    LineItemImpl(@JsonProperty("addedAt") final String addedAt,
            @JsonProperty("custom") final com.commercetools.history.models.common.CustomFields custom,
            @JsonProperty("id") final String id,
            @JsonProperty("name") final com.commercetools.history.models.common.LocalizedString name,
            @JsonProperty("productId") final String productId,
            @JsonProperty("productSlug") final com.commercetools.history.models.common.LocalizedString productSlug,
            @JsonProperty("productType") final com.commercetools.history.models.common.Reference productType,
            @JsonProperty("quantity") final Integer quantity,
            @JsonProperty("variant") final com.commercetools.history.models.common.Variant variant,
            @JsonProperty("variantId") final Integer variantId) {
        this.addedAt = addedAt;
        this.custom = custom;
        this.id = id;
        this.name = name;
        this.productId = productId;
        this.productSlug = productSlug;
        this.productType = productType;
        this.quantity = quantity;
        this.variant = variant;
        this.variantId = variantId;
    }

    /**
     * create empty instance
     */
    public LineItemImpl() {
    }

    /**
     *
     */

    public String getAddedAt() {
        return this.addedAt;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *
     */

    public String getId() {
        return this.id;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *
     */

    public String getProductId() {
        return this.productId;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.LocalizedString getProductSlug() {
        return this.productSlug;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Reference getProductType() {
        return this.productType;
    }

    /**
     *
     */

    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     *
     */

    public com.commercetools.history.models.common.Variant getVariant() {
        return this.variant;
    }

    /**
     *
     */

    public Integer getVariantId() {
        return this.variantId;
    }

    public void setAddedAt(final String addedAt) {
        this.addedAt = addedAt;
    }

    public void setCustom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setName(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setProductId(final String productId) {
        this.productId = productId;
    }

    public void setProductSlug(final com.commercetools.history.models.common.LocalizedString productSlug) {
        this.productSlug = productSlug;
    }

    public void setProductType(final com.commercetools.history.models.common.Reference productType) {
        this.productType = productType;
    }

    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    public void setVariant(final com.commercetools.history.models.common.Variant variant) {
        this.variant = variant;
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

        LineItemImpl that = (LineItemImpl) o;

        return new EqualsBuilder().append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(name, that.name)
                .append(productId, that.productId)
                .append(productSlug, that.productSlug)
                .append(productType, that.productType)
                .append(quantity, that.quantity)
                .append(variant, that.variant)
                .append(variantId, that.variantId)
                .append(addedAt, that.addedAt)
                .append(custom, that.custom)
                .append(id, that.id)
                .append(name, that.name)
                .append(productId, that.productId)
                .append(productSlug, that.productSlug)
                .append(productType, that.productType)
                .append(quantity, that.quantity)
                .append(variant, that.variant)
                .append(variantId, that.variantId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addedAt)
                .append(custom)
                .append(id)
                .append(name)
                .append(productId)
                .append(productSlug)
                .append(productType)
                .append(quantity)
                .append(variant)
                .append(variantId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("addedAt", addedAt)
                .append("custom", custom)
                .append("id", id)
                .append("name", name)
                .append("productId", productId)
                .append("productSlug", productSlug)
                .append("productType", productType)
                .append("quantity", quantity)
                .append("variant", variant)
                .append("variantId", variantId)
                .build();
    }

    @Override
    public LineItem copyDeep() {
        return LineItem.deepCopy(this);
    }
}
