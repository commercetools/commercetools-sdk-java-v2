package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImagesProductLevel;
import com.commercetools.ml.models.missing_data.MissingImagesVariantLevel;
import com.commercetools.ml.models.missing_data.MissingImagesMetaImpl;

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
@JsonDeserialize(as = MissingImagesMetaImpl.class)
public interface MissingImagesMeta  {

    
    @NotNull
    @Valid
    @JsonProperty("productLevel")
    public MissingImagesProductLevel getProductLevel();
    
    @NotNull
    @Valid
    @JsonProperty("variantLevel")
    public MissingImagesVariantLevel getVariantLevel();
    /**
    *  <p>The minimum number of images a product variant must have. Anything below this value is considered a product variant with missing images.</p>
    */
    @NotNull
    @JsonProperty("threshold")
    public Long getThreshold();

    public void setProductLevel(final MissingImagesProductLevel productLevel);
    
    public void setVariantLevel(final MissingImagesVariantLevel variantLevel);
    
    public void setThreshold(final Long threshold);

    public static MissingImagesMetaImpl of(){
        return new MissingImagesMetaImpl();
    }
    

    public static MissingImagesMetaImpl of(final MissingImagesMeta template) {
        MissingImagesMetaImpl instance = new MissingImagesMetaImpl();
        instance.setProductLevel(template.getProductLevel());
        instance.setVariantLevel(template.getVariantLevel());
        instance.setThreshold(template.getThreshold());
        return instance;
    }

    default <T> T withMissingImagesMeta(Function<MissingImagesMeta, T> helper) {
        return helper.apply(this);
    }
}
