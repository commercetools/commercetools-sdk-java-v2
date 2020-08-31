package com.commercetools.api.models.common;

import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.GeoJsonPointImpl;

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
@JsonDeserialize(as = GeoJsonPointImpl.class)
public interface GeoJsonPoint extends GeoJson {

    
    @NotNull
    @JsonProperty("coordinates")
    public List<Double> getCoordinates();

    public void setCoordinates(final List<Double> coordinates);

    public static GeoJsonPointImpl of(){
        return new GeoJsonPointImpl();
    }
    

    public static GeoJsonPointImpl of(final GeoJsonPoint template) {
        GeoJsonPointImpl instance = new GeoJsonPointImpl();
        instance.setCoordinates(template.getCoordinates());
        return instance;
    }

}
