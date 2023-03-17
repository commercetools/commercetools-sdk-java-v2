
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = IndividualExclusionProductSelectionTypeImpl.class)
public interface IndividualExclusionProductSelectionType extends ProductSelectionType {

    String INDIVIDUAL_EXCLUSION = "individualExclusion";

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static IndividualExclusionProductSelectionType of() {
        return new IndividualExclusionProductSelectionTypeImpl();
    }

    public static IndividualExclusionProductSelectionType of(final IndividualExclusionProductSelectionType template) {
        IndividualExclusionProductSelectionTypeImpl instance = new IndividualExclusionProductSelectionTypeImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static IndividualExclusionProductSelectionTypeBuilder builder() {
        return IndividualExclusionProductSelectionTypeBuilder.of();
    }

    public static IndividualExclusionProductSelectionTypeBuilder builder(
            final IndividualExclusionProductSelectionType template) {
        return IndividualExclusionProductSelectionTypeBuilder.of(template);
    }

    default <T> T withIndividualExclusionProductSelectionType(
            Function<IndividualExclusionProductSelectionType, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<IndividualExclusionProductSelectionType> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<IndividualExclusionProductSelectionType>() {
            @Override
            public String toString() {
                return "TypeReference<IndividualExclusionProductSelectionType>";
            }
        };
    }
}
