
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

/**
 * IndividualProductSelectionType
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     IndividualProductSelectionType individualProductSelectionType = IndividualProductSelectionType.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = IndividualProductSelectionTypeImpl.class)
public interface IndividualProductSelectionType extends ProductSelectionType {

    /**
     * discriminator value for IndividualProductSelectionType
     */
    String INDIVIDUAL = "individual";

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
     * @return instance of IndividualProductSelectionType
     */
    public static IndividualProductSelectionType of() {
        return new IndividualProductSelectionTypeImpl();
    }

    /**
     * factory method to copy an instance of IndividualProductSelectionType
     * @param template instance to be copied
     * @return copy instance
     */
    public static IndividualProductSelectionType of(final IndividualProductSelectionType template) {
        IndividualProductSelectionTypeImpl instance = new IndividualProductSelectionTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for IndividualProductSelectionType
     * @return builder
     */
    public static IndividualProductSelectionTypeBuilder builder() {
        return IndividualProductSelectionTypeBuilder.of();
    }

    /**
     * create builder for IndividualProductSelectionType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static IndividualProductSelectionTypeBuilder builder(final IndividualProductSelectionType template) {
        return IndividualProductSelectionTypeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withIndividualProductSelectionType(Function<IndividualProductSelectionType, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<IndividualProductSelectionType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<IndividualProductSelectionType>() {
            @Override
            public String toString() {
                return "TypeReference<IndividualProductSelectionType>";
            }
        };
    }
}
