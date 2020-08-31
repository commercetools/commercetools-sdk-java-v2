package com.commercetools.ml.models.missing_data;

import com.commercetools.ml.models.missing_data.MissingImagesCount;
import com.commercetools.ml.models.missing_data.MissingImagesProductLevel;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingImagesProductLevelBuilder {

    
    private Long missingImages;
    
    
    private Long total;

    public MissingImagesProductLevelBuilder missingImages( final Long missingImages) {
        this.missingImages = missingImages;
        return this;
    }
    
    public MissingImagesProductLevelBuilder total( final Long total) {
        this.total = total;
        return this;
    }

    
    public Long getMissingImages(){
        return this.missingImages;
    }
    
    
    public Long getTotal(){
        return this.total;
    }

    public MissingImagesProductLevel build() {
        return new MissingImagesProductLevelImpl(missingImages, total);
    }

    public static MissingImagesProductLevelBuilder of() {
        return new MissingImagesProductLevelBuilder();
    }

    public static MissingImagesProductLevelBuilder of(final MissingImagesProductLevel template) {
        MissingImagesProductLevelBuilder builder = new MissingImagesProductLevelBuilder();
        builder.missingImages = template.getMissingImages();
        builder.total = template.getTotal();
        return builder;
    }

}
