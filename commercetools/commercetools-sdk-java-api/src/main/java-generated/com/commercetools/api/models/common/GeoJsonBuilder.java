
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeoJsonBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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
