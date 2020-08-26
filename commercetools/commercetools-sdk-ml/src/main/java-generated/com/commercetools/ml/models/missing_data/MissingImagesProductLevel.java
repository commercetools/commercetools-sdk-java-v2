package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImagesCount;
import com.commercetools.ml.models.missing_data.MissingImagesProductLevelImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MissingImagesProductLevelImpl.class)
public interface MissingImagesProductLevel extends MissingImagesCount {

    /**
    *  <p>Number of products missing images.</p>
    */
    @NotNull
    @JsonProperty("missingImages")
    public Long getMissingImages();
    /**
    *  <p>Number of products scanned.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    public void setMissingImages(final Long missingImages);
    
    public void setTotal(final Long total);

    public static MissingImagesProductLevelImpl of(){
        return new MissingImagesProductLevelImpl();
    }
    

    public static MissingImagesProductLevelImpl of(final MissingImagesProductLevel template) {
        MissingImagesProductLevelImpl instance = new MissingImagesProductLevelImpl();
        instance.setMissingImages(template.getMissingImages());
        instance.setTotal(template.getTotal());
        return instance;
    }

}
