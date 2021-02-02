
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AttributeCoverageImpl.class)
public interface AttributeCoverage {

    /**
    *  <p>The percentage of attributes from the product type defined in the product variant. A value of <code>1.0</code> indicates a product variant contains all attributes defined in the product type.</p>
    */
    @NotNull
    @JsonProperty("names")
    public Double getNames();

    /**
    *  <p>Represents the percentage of attributes in the product variant that contain values.</p>
    */
    @NotNull
    @JsonProperty("values")
    public Double getValues();

    public void setNames(final Double names);

    public void setValues(final Double values);

    public static AttributeCoverage of() {
        return new AttributeCoverageImpl();
    }

    public static AttributeCoverage of(final AttributeCoverage template) {
        AttributeCoverageImpl instance = new AttributeCoverageImpl();
        instance.setNames(template.getNames());
        instance.setValues(template.getValues());
        return instance;
    }

    public static AttributeCoverageBuilder builder() {
        return AttributeCoverageBuilder.of();
    }

    public static AttributeCoverageBuilder builder(final AttributeCoverage template) {
        return AttributeCoverageBuilder.of(template);
    }

    default <T> T withAttributeCoverage(Function<AttributeCoverage, T> helper) {
        return helper.apply(this);
    }
}
