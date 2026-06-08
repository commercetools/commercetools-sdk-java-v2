
package com.commercetools.api.models.product_tailoring;

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
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> that exists.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetImageLabelActionImpl implements ProductTailoringSetImageLabelAction, ModelBase {

    private String action;

    private String sku;

    private Long variantId;

    private String imageUrl;

    private String label;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductTailoringSetImageLabelActionImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("imageUrl") final String imageUrl,
            @JsonProperty("label") final String label, @JsonProperty("staged") final Boolean staged) {
        this.sku = sku;
        this.variantId = variantId;
        this.imageUrl = imageUrl;
        this.label = label;
        this.staged = staged;
        this.action = SET_IMAGE_LABEL;
    }

    /**
     * create empty instance
     */
    public ProductTailoringSetImageLabelActionImpl() {
        this.action = SET_IMAGE_LABEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The URL of the image to set the label.</p>
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getLabel() {
        return this.label;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setImageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLabel(final String label) {
        this.label = label;
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

        ProductTailoringSetImageLabelActionImpl that = (ProductTailoringSetImageLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(sku, that.sku)
                .append(variantId, that.variantId)
                .append(imageUrl, that.imageUrl)
                .append(label, that.label)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(sku, that.sku)
                .append(variantId, that.variantId)
                .append(imageUrl, that.imageUrl)
                .append(label, that.label)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(sku)
                .append(variantId)
                .append(imageUrl)
                .append(label)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("sku", sku)
                .append("variantId", variantId)
                .append("imageUrl", imageUrl)
                .append("label", label)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductTailoringSetImageLabelAction copyDeep() {
        return ProductTailoringSetImageLabelAction.deepCopy(this);
    }
}
