
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.common.ProductTypeReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingAttributesImpl.class)
public interface MissingAttributes {

    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    @NotNull
    @Valid
    @JsonProperty("productType")
    public ProductTypeReference getProductType();

    /**
    *  <p>ID of a ProductVariant.</p>
    */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
    *  <p>The names of the attributes of the product type that the variant is missing, sorted by attribute importance in descending order.</p>
    */
    @NotNull
    @JsonProperty("missingAttributeValues")
    public List<String> getMissingAttributeValues();

    /**
    *  <p>The names of the attributes of the product type that the variant is missing, sorted by attribute importance in descending order.</p>
    */

    @JsonProperty("missingAttributeNames")
    public List<String> getMissingAttributeNames();

    @Valid
    @JsonProperty("attributeCount")
    public AttributeCount getAttributeCount();

    @Valid
    @JsonProperty("attributeCoverage")
    public AttributeCoverage getAttributeCoverage();

    public void setProduct(final ProductReference product);

    public void setProductType(final ProductTypeReference productType);

    public void setVariantId(final Integer variantId);

    @JsonIgnore
    public void setMissingAttributeValues(final String... missingAttributeValues);

    public void setMissingAttributeValues(final List<String> missingAttributeValues);

    @JsonIgnore
    public void setMissingAttributeNames(final String... missingAttributeNames);

    public void setMissingAttributeNames(final List<String> missingAttributeNames);

    public void setAttributeCount(final AttributeCount attributeCount);

    public void setAttributeCoverage(final AttributeCoverage attributeCoverage);

    public static MissingAttributes of() {
        return new MissingAttributesImpl();
    }

    public static MissingAttributes of(final MissingAttributes template) {
        MissingAttributesImpl instance = new MissingAttributesImpl();
        instance.setProduct(template.getProduct());
        instance.setProductType(template.getProductType());
        instance.setVariantId(template.getVariantId());
        instance.setMissingAttributeValues(template.getMissingAttributeValues());
        instance.setMissingAttributeNames(template.getMissingAttributeNames());
        instance.setAttributeCount(template.getAttributeCount());
        instance.setAttributeCoverage(template.getAttributeCoverage());
        return instance;
    }

    public static MissingAttributesBuilder builder() {
        return MissingAttributesBuilder.of();
    }

    public static MissingAttributesBuilder builder(final MissingAttributes template) {
        return MissingAttributesBuilder.of(template);
    }

    default <T> T withMissingAttributes(Function<MissingAttributes, T> helper) {
        return helper.apply(this);
    }
}
