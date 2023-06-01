package com.commercetools.api.models.common;

import com.commercetools.api.models.common.GeoJsonPoint;
import com.commercetools.api.models.common.GeoJson;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeoJsonBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GeoJsonBuilder {

    public com.commercetools.api.models.common.GeoJsonPointBuilder pointBuilder() {
       return com.commercetools.api.models.common.GeoJsonPointBuilder.of();
    }

    /**
     * factory method for an instance of GeoJsonBuilder
     * @return builder 
     */
    public static GeoJsonBuilder of() {
        return new GeoJsonBuilder();
    }

}
