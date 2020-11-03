package com.commercetools.ml.models.missing_data;


import com.commercetools.ml.models.missing_data.AttributeCountImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AttributeCountImpl.class)
public interface AttributeCount  {

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

    public static AttributeCountImpl of(){
        return new AttributeCountImpl();
    }
    

    public static AttributeCountImpl of(final AttributeCount template) {
        AttributeCountImpl instance = new AttributeCountImpl();
        instance.setProductTypeAttributes(template.getProductTypeAttributes());
        instance.setVariantAttributes(template.getVariantAttributes());
        instance.setMissingAttributeValues(template.getMissingAttributeValues());
        return instance;
    }

    default <T> T withAttributeCount(Function<AttributeCount, T> helper) {
        return helper.apply(this);
    }
}
