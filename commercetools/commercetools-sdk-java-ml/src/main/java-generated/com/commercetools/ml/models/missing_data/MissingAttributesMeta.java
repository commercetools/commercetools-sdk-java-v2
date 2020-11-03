package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingAttributesDetails;
import com.commercetools.ml.models.missing_data.MissingAttributesMetaImpl;

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
@JsonDeserialize(as = MissingAttributesMetaImpl.class)
public interface MissingAttributesMeta  {

    
    @NotNull
    @Valid
    @JsonProperty("productLevel")
    public MissingAttributesDetails getProductLevel();
    
    @NotNull
    @Valid
    @JsonProperty("variantLevel")
    public MissingAttributesDetails getVariantLevel();
    /**
    *  <p>The IDs of the product types containing the requested <code>attributeName</code>.</p>
    */
    
    @JsonProperty("productTypeIds")
    public List<String> getProductTypeIds();

    public void setProductLevel(final MissingAttributesDetails productLevel);
    
    public void setVariantLevel(final MissingAttributesDetails variantLevel);
    
    @JsonIgnore
    public void setProductTypeIds(final String ...productTypeIds);
    public void setProductTypeIds(final List<String> productTypeIds);

    public static MissingAttributesMetaImpl of(){
        return new MissingAttributesMetaImpl();
    }
    

    public static MissingAttributesMetaImpl of(final MissingAttributesMeta template) {
        MissingAttributesMetaImpl instance = new MissingAttributesMetaImpl();
        instance.setProductLevel(template.getProductLevel());
        instance.setVariantLevel(template.getVariantLevel());
        instance.setProductTypeIds(template.getProductTypeIds());
        return instance;
    }

    default <T> T withMissingAttributesMeta(Function<MissingAttributesMeta, T> helper) {
        return helper.apply(this);
    }
}
