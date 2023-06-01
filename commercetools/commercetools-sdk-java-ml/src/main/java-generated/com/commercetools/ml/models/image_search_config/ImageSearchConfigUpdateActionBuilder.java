package com.commercetools.ml.models.image_search_config;

import com.commercetools.ml.models.image_search_config.ChangeStatusUpdateAction;
import com.commercetools.ml.models.image_search_config.ImageSearchConfigUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageSearchConfigUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ImageSearchConfigUpdateActionBuilder {

    public com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionBuilder changeStatusBuilder() {
       return com.commercetools.ml.models.image_search_config.ChangeStatusUpdateActionBuilder.of();
    }

    /**
     * factory method for an instance of ImageSearchConfigUpdateActionBuilder
     * @return builder 
     */
    public static ImageSearchConfigUpdateActionBuilder of() {
        return new ImageSearchConfigUpdateActionBuilder();
    }

}
