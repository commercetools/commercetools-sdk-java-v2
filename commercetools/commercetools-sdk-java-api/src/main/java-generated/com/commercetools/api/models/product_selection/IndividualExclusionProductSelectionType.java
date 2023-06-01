package com.commercetools.api.models.product_selection;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_selection.ProductSelectionType;
import com.commercetools.api.models.product_selection.ProductSelectionTypeEnum;
import com.commercetools.api.models.product_selection.IndividualExclusionProductSelectionTypeImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * IndividualExclusionProductSelectionType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     IndividualExclusionProductSelectionType individualExclusionProductSelectionType = IndividualExclusionProductSelectionType.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = IndividualExclusionProductSelectionTypeImpl.class)
@Deprecated
public interface IndividualExclusionProductSelectionType extends ProductSelectionType {

    /**
     * discriminator value for IndividualExclusionProductSelectionType
     */
    String INDIVIDUAL_EXCLUSION = "individualExclusion";

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @param name value to be set
     */
    
    public void setName(final LocalizedString name);
    

    /**
     * factory method
     * @return instance of IndividualExclusionProductSelectionType
     */
    public static IndividualExclusionProductSelectionType of(){
        return new IndividualExclusionProductSelectionTypeImpl();
    }
    

    /**
     * factory method to create a shallow copy IndividualExclusionProductSelectionType
     * @param template instance to be copied
     * @return copy instance
     */
    public static IndividualExclusionProductSelectionType of(final IndividualExclusionProductSelectionType template) {
        IndividualExclusionProductSelectionTypeImpl instance = new IndividualExclusionProductSelectionTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of IndividualExclusionProductSelectionType
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static IndividualExclusionProductSelectionType deepCopy(@Nullable final IndividualExclusionProductSelectionType template) {
        if (template == null) {
            return null;
        }
        IndividualExclusionProductSelectionTypeImpl instance = new IndividualExclusionProductSelectionTypeImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for IndividualExclusionProductSelectionType
     * @return builder
     */
    public static IndividualExclusionProductSelectionTypeBuilder builder() {
        return IndividualExclusionProductSelectionTypeBuilder.of();
    }
    
    /**
     * create builder for IndividualExclusionProductSelectionType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static IndividualExclusionProductSelectionTypeBuilder builder(final IndividualExclusionProductSelectionType template) {
        return IndividualExclusionProductSelectionTypeBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withIndividualExclusionProductSelectionType(Function<IndividualExclusionProductSelectionType, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<IndividualExclusionProductSelectionType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<IndividualExclusionProductSelectionType>() {
            @Override
            public String toString() {
                return "TypeReference<IndividualExclusionProductSelectionType>";
            }
        };
    }
}
