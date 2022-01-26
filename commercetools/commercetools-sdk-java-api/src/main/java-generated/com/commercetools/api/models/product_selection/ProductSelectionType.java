
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.product_selection.IndividualProductSelectionTypeImpl.class, name = IndividualProductSelectionType.INDIVIDUAL) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ProductSelectionTypeImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ProductSelectionType {

    /**
    *  <p>The following type of Product Selections is supported:</p>
    */
    @NotNull
    @JsonProperty("type")
    public ProductSelectionTypeEnum getType();

    default <T> T withProductSelectionType(Function<ProductSelectionType, T> helper) {
        return helper.apply(this);
    }
}