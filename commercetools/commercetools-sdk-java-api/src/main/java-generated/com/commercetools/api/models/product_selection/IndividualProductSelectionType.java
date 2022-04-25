
package com.commercetools.api.models.product_selection;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = IndividualProductSelectionTypeImpl.class)
public interface IndividualProductSelectionType extends ProductSelectionType {

    String INDIVIDUAL = "individual";

    /**
    *  <p>The name of the Product Selection which is recommended to be unique.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static IndividualProductSelectionType of() {
        return new IndividualProductSelectionTypeImpl();
    }

    public static IndividualProductSelectionType of(final IndividualProductSelectionType template) {
        IndividualProductSelectionTypeImpl instance = new IndividualProductSelectionTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static IndividualProductSelectionTypeBuilder builder() {
        return IndividualProductSelectionTypeBuilder.of();
    }

    public static IndividualProductSelectionTypeBuilder builder(final IndividualProductSelectionType template) {
        return IndividualProductSelectionTypeBuilder.of(template);
    }

    default <T> T withIndividualProductSelectionType(Function<IndividualProductSelectionType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<IndividualProductSelectionType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<IndividualProductSelectionType>() {
            @Override
            public String toString() {
                return "TypeReference<IndividualProductSelectionType>";
            }
        };
    }
}
