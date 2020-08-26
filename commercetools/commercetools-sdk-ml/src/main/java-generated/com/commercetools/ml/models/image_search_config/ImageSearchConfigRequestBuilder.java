package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImageSearchConfigRequestBuilder {

    
    private java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions;

    public ImageSearchConfigRequestBuilder actions( final java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    
    public java.util.List<com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction> getActions(){
        return this.actions;
    }

    public ImageSearchConfigRequest build() {
        return new ImageSearchConfigRequestImpl(actions);
    }

    public static ImageSearchConfigRequestBuilder of() {
        return new ImageSearchConfigRequestBuilder();
    }

    public static ImageSearchConfigRequestBuilder of(final ImageSearchConfigRequest template) {
        ImageSearchConfigRequestBuilder builder = new ImageSearchConfigRequestBuilder();
        builder.actions = template.getActions();
        return builder;
    }

}
