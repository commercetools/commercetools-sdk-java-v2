
package com.commercetools.importapi.models.productvariants;

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
 *  <p>Represents the data used to update a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantPatchImpl implements ProductVariantPatch, ModelBase {

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    private com.commercetools.importapi.models.productvariants.Attributes attributes;

    private Boolean staged;

    private com.commercetools.importapi.models.common.ProductKeyReference product;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantPatchImpl(
            @JsonProperty("productVariant") final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant,
            @JsonProperty("attributes") final com.commercetools.importapi.models.productvariants.Attributes attributes,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("product") final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.productVariant = productVariant;
        this.attributes = attributes;
        this.staged = staged;
        this.product = product;
    }

    /**
     * create empty instance
     */
    public ProductVariantPatchImpl() {
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> to update.</p>
     */

    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    /**
     *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
     *  <ul>
     *   <li>The referenced Attribute must be defined in an existing <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>, or the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be <code>validationFailed</code>.</li>
     *   <li>Setting the value of a non-required Attribute to <code>null</code> will remove the Attribute.</li>
     *   <li>Attempting to set a <code>null</code> value to a required Attribute will make the import operation fail with an <a href="https://docs.commercetools.com/apis/ctp:import:type:InvalidOperation" rel="nofollow">InvalidOperation</a> error.</li>
     *   <li>Importing <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextAttribute" rel="nofollow">LocalizableTextAttributes</a> or <a href="https://docs.commercetools.com/apis/ctp:import:type:LocalizableTextSetAttribute" rel="nofollow">LocalizableTextSetAttributes</a> follows an override pattern, meaning that omitted localized fields will be deleted, new fields will be created, and existing fields will be updated. You can delete localized fields by setting their value to <code>null</code>.</li>
     *  </ul>
     */

    public com.commercetools.importapi.models.productvariants.Attributes getAttributes() {
        return this.attributes;
    }

    /**
     *  <p>If <code>false</code>, the attribute changes are applied to both <span>current and staged projected representations</span> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Reference to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> that contains the ProductVariant.</p>
     *  <p>We recommend to set this value to minimize concurrency errors. If set, this field is required for every ProductVariantPatch in the <a href="https://docs.commercetools.com/apis/ctp:import:type:ProductVariantPatchRequest" rel="nofollow">ProductVariantPatchRequest</a>.</p>
     *  <p>If the referenced Product does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Product is created.</p>
     */

    public com.commercetools.importapi.models.common.ProductKeyReference getProduct() {
        return this.product;
    }

    public void setProductVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attributes attributes) {
        this.attributes = attributes;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setProduct(final com.commercetools.importapi.models.common.ProductKeyReference product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantPatchImpl that = (ProductVariantPatchImpl) o;

        return new EqualsBuilder().append(productVariant, that.productVariant)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .append(product, that.product)
                .append(productVariant, that.productVariant)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .append(product, that.product)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productVariant)
                .append(attributes)
                .append(staged)
                .append(product)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("productVariant", productVariant)
                .append("attributes", attributes)
                .append("staged", staged)
                .append("product", product)
                .build();
    }

    @Override
    public ProductVariantPatch copyDeep() {
        return ProductVariantPatch.deepCopy(this);
    }
}
