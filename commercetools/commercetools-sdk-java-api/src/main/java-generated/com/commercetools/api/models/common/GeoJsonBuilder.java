
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class GeoJsonBuilder {

    public com.commercetools.api.models.common.GeoJsonPointBuilder pointBuilder() {
        return com.commercetools.api.models.common.GeoJsonPointBuilder.of();
    }

    public static GeoJsonBuilder of() {
        return new GeoJsonBuilder();
    }
}
