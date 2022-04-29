
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeCountImpl.class)
public interface AttributeCount {

    /**
    *  <p>Number of attributes defined in the product type.</p>
    */
    @NotNull
    @JsonProperty("productTypeAttributes")
    public Integer getProductTypeAttributes();

    /**
    *  <p>Number of attributes defined in the variant.</p>
    */
    @NotNull
    @JsonProperty("variantAttributes")
    public Integer getVariantAttributes();

    /**
    *  <p>Number of attributes missing values in the variant.</p>
    */
    @NotNull
    @JsonProperty("missingAttributeValues")
    public Integer getMissingAttributeValues();

    public void setProductTypeAttributes(final Integer productTypeAttributes);

    public void setVariantAttributes(final Integer variantAttributes);

    public void setMissingAttributeValues(final Integer missingAttributeValues);

    public static AttributeCount of() {
        return new AttributeCountImpl();
    }

    public static AttributeCount of(final AttributeCount template) {
        AttributeCountImpl instance = new AttributeCountImpl();
        instance.setProductTypeAttributes(template.getProductTypeAttributes());
        instance.setVariantAttributes(template.getVariantAttributes());
        instance.setMissingAttributeValues(template.getMissingAttributeValues());
        return instance;
    }

    public static AttributeCountBuilder builder() {
        return AttributeCountBuilder.of();
    }

    public static AttributeCountBuilder builder(final AttributeCount template) {
        return AttributeCountBuilder.of(template);
    }

    default <T> T withAttributeCount(Function<AttributeCount, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeCount> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeCount>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeCount>";
            }
        };
    }
}
