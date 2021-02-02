
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetImageLabelActionImpl implements ProductSetImageLabelAction {

    private String action;

    private String sku;

    private Long variantId;

    private String imageUrl;

    private String label;

    private Boolean staged;

    @JsonCreator
    ProductSetImageLabelActionImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("variantId") final Long variantId, @JsonProperty("imageUrl") final String imageUrl,
            @JsonProperty("label") final String label, @JsonProperty("staged") final Boolean staged) {
        this.sku = sku;
        this.variantId = variantId;
        this.imageUrl = imageUrl;
        this.label = label;
        this.staged = staged;
        this.action = SET_IMAGE_LABEL;
    }

    public ProductSetImageLabelActionImpl() {
        this.action = SET_IMAGE_LABEL;
    }

    public String getAction() {
        return this.action;
    }

    public String getSku() {
        return this.sku;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    /**
    *  <p>The URL of the image.</p>
    */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
    *  <p>The new image label.
    *  If left blank or set to null, the label is removed.</p>
    */
    public String getLabel() {
        return this.label;
    }

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

        ProductSetImageLabelActionImpl that = (ProductSetImageLabelActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(sku, that.sku).append(variantId,
            that.variantId).append(imageUrl, that.imageUrl).append(label, that.label).append(staged,
                that.staged).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(sku).append(variantId).append(imageUrl).append(
            label).append(staged).toHashCode();
    }

}
